package org.pdulvp.retriever.ui.sirius;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;

public class UISessionFactory implements org.eclipse.sirius.ui.business.api.session.factory.UISessionFactory {

	public UISessionFactory() {
		//Override the default session factory
	}

	@Override
	public IEditingSession createUISession(Session session) {
		return new UIEditingSession(session);
	}

}
