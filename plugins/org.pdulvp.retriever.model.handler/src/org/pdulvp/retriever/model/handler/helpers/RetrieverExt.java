package org.pdulvp.retriever.model.handler.helpers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.pdulvp.retriever.ElementRetriever;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverContainer;
import org.pdulvp.retriever.URLRetriever;
import org.pdulvp.retriever.model.handler.FetchRetriever;
import org.pdulvp.retriever.model.handler.interpreter.IContext;

public class RetrieverExt {
  public static URLRetriever getRetriever(RetrieverContainer root, String name) {
    URLRetriever urlRetriever = null;
    for (Retriever retriever : root.getOwnedElements()) {
      if (retriever.getName().equals(name)) {
        urlRetriever = (URLRetriever) retriever;
        break;
      }
    }
    return urlRetriever;
  }

  public static FetchRetriever createFetcher(ElementRetriever urlRetriever, IContext context) {
    FetchRetriever fetch = new FetchRetriever();
    fetch.init(context);
    try {
      InterpreterUtil.getInterpreter(context.getSource()).clearVariables();
    } catch(RuntimeException e) {
   }
    return fetch;
  }
  
  public static FetchRetriever createFetcher(URLRetriever urlRetriever, IContext context) {
    FetchRetriever fetch = new FetchRetriever();
    fetch.init(context);
    try {
      InterpreterUtil.getInterpreter(urlRetriever).clearVariables();
    } catch(Exception e) {
    }
    return fetch;
  }

  public static Session getMatchSession(IProgressMonitor monitor) {
    final URI uri = URI.createPlatformResourceURI("/gamble/matches.aird", true);

    Session session = SessionManager.INSTANCE.getExistingSession(uri);
    if (session == null) {
      session = SessionManager.INSTANCE.getSession(uri, monitor);
      LogHelper.info("Opening session");
      session.open(monitor);
      LogHelper.info("Opened session");
    }
    return session;
  }
}
