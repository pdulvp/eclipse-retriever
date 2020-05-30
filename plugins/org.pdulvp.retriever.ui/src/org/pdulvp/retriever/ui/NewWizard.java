package org.pdulvp.retriever.ui;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.factory.SessionFactory;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.pdulvp.retriever.RetrieverFactory;
import org.pdulvp.retriever.model.handler.RetrieverResourceFactoryRegistry;

public class NewWizard extends Wizard implements INewWizard {

	WizardNewProjectCreationPage page;

	public NewWizard() {
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}

	@Override
	public void addPages() {
		super.addPages();
		page = new WizardNewProjectCreationPage("Project");
		this.addPage(page);
	}

	public static URI getURI(IFile file) {
		return URI.createPlatformResourceURI(file.getFullPath().toOSString(), true);
	}

	@Override
	public boolean performFinish() {
		IProject project = page.getProjectHandle();
		try {
			project.create(new NullProgressMonitor());
			project.open(new NullProgressMonitor());
			IProjectDescription description = project.getDescription();

			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = RetrieverNature.NATURE_ID;

			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IStatus status = workspace.validateNatureSet(newNatures);

			IFile retriever = project.getFile("scraper.retriever");
			URI uri = getURI(retriever);

			Resource resource = RetrieverResourceFactoryRegistry.INSTANCE.getFactory(uri).createResource(uri);
			resource.getContents().add(RetrieverFactory.eINSTANCE.createRetrieverRoot());
			resource.save(new HashMap<>());

			URI airduri = getURI(retriever).trimFileExtension().appendFileExtension("aird");
			Session _session = SessionFactory.INSTANCE.createSession(airduri, new NullProgressMonitor());
			_session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(_session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							_session.addSemanticResource(uri, new NullProgressMonitor());
						}
					});
			_session.open(new NullProgressMonitor());
			_session.save(new NullProgressMonitor());
			_session.getTransactionalEditingDomain().getResourceSet().getResource(airduri, false).save(new HashMap<>());
			
			if (status.getCode() == IStatus.OK) {
				description.setNatureIds(newNatures);
				project.setDescription(description, null);
			}
			
			IEditorPart part = IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), retriever);
			System.out.println();
		} catch (CoreException | IOException e) {
			e.printStackTrace();
		}
		return true;
	}

}
