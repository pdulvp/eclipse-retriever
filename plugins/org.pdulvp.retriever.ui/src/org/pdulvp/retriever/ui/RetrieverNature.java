package org.pdulvp.retriever.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class RetrieverNature implements IProjectNature {

	public static String NATURE_ID = "org.pdulvp.retriever.ui.RetrieverNature";
	IProject project = null;
	
	@Override
	public void configure() throws CoreException {

	}

	@Override
	public void deconfigure() throws CoreException {

	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

}
