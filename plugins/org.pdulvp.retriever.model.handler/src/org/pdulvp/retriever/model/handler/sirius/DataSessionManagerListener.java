package org.pdulvp.retriever.model.handler.sirius;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.SavingPolicy;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.business.internal.session.danalysis.DAnalysisSessionImpl;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetSync;
import org.eclipse.sirius.common.tools.api.resource.ResourceSyncClient;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

public class DataSessionManagerListener extends SessionManagerListener.Stub {

  @Override
  public void notifyAddSession(Session newSession) {
    ((Session) newSession).setSavingPolicy(new DataSavingPolicy());
    ((DAnalysisSessionImpl) newSession).setSaveInExclusiveTransaction(false);
    ((DAnalysisSessionImpl) newSession).setDeferSaveToPostCommit(false);
  }

  @Override
  public void notify(Session updated, int notification) {
    if (notification == SessionListener.OPENING) {
      ((DAnalysisSessionImpl) updated).setResourceCollector(null);
    }
  }

}
