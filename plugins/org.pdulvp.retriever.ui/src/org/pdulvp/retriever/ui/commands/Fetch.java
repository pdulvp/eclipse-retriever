package org.pdulvp.retriever.ui.commands;

import java.util.Collection;
import java.util.function.Predicate;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.eclipse.ui.handlers.HandlerUtil;
import org.pdulvp.retriever.RetrieverPkg;
import org.pdulvp.retriever.URLRetriever;
import org.pdulvp.retriever.model.handler.FetchRetriever;
import org.pdulvp.retriever.model.handler.interpreter.IContext;
import org.pdulvp.retriever.result.URIResult;

public class Fetch extends TransactionalProgressCommandHandler {

  protected Predicate enablement(IStructuredSelection selection) {
    return ca -> ca instanceof URLRetriever || ca instanceof RetrieverPkg || ca instanceof URIResult ;
  }
  
  @Override
  protected void proceed(Collection<Object> selection2, ExecutionEvent event_p, IProgressMonitor monitor_p) {
    ISelection selection = HandlerUtil.getCurrentSelection(event_p);
    EObject object = (EObject) ((IStructuredSelection) selection).getFirstElement();
    IContext context = new IContext(object);

    FetchRetriever retriever = new FetchRetriever();
    retriever.init(context);
    InterpreterUtil.getInterpreter(object).clearVariables();

    if (object instanceof org.pdulvp.retriever.URLRetriever) {
      org.pdulvp.retriever.URLRetriever uriElement = (org.pdulvp.retriever.URLRetriever) object;
      retriever.retrieveUrl(uriElement, context, uriElement.getUriExpression());

    } else if (object instanceof URIResult) {
      retriever.retrieveUrl(((URIResult) object).getDefinition(), context, ((URIResult) object).getUri());

    } else if (object instanceof RetrieverPkg) {
      retriever.retrievePkg(((RetrieverPkg) object), context);
    }

    retriever.saveResources(context);
    System.out.println(0);

  }

}
