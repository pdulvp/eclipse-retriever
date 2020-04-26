package org.pdulvp.retriever.ui.sirius;

import java.util.Collection;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.editor.ISiriusEditor;
import org.eclipse.sirius.ui.business.api.session.EditingSessionEvent;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

public class UIEditingSession implements IEditingSession {

	Session session;
	
	public UIEditingSession(Session session) {
        this.session = session;
	}
	@Override
	public Session getSession() {
		return session;
	}
	
	@Override
	public boolean handleEditor(IEditorPart editor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<DialectEditor> getEditors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLastOpenedEditor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean needToBeSavedOnClose(IEditorPart editor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int promptToSaveOnClose() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close(boolean save) {
		if (save) {
			session.save(new NullProgressMonitor());
		}
	}

	@Override
	public boolean isSessionFor(IEditorInput editorInput) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DialectEditor getEditor(DRepresentation representation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void notify(EditingSessionEvent event) {
		// TODO Auto-generated method stub

	}
	@Override
	public void attachEditor(ISiriusEditor arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void closeEditors(boolean arg0, Collection<? extends ISiriusEditor> arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void closeEditors(boolean arg0, ISiriusEditor... arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void detachEditor(ISiriusEditor arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void detachEditor(ISiriusEditor arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Collection<ISiriusEditor> getSiriusEditors() {
		// TODO Auto-generated method stub
		return null;
	}

}
