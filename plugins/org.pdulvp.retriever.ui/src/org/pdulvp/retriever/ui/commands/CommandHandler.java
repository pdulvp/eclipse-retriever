package org.pdulvp.retriever.ui.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.commands.ExpressionContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.handlers.HandlerUtil;

public class CommandHandler extends AbstractHandler {

  protected Predicate enablement(IStructuredSelection selection) {
    return ca -> ca instanceof Object;
  }
  
  @Override
  public void setEnabled(Object evaluationContext) {
    ExpressionContext c = (ExpressionContext)evaluationContext;
    IStructuredSelection selection =(IStructuredSelection)c.getVariable("selection");
    Predicate<Object> pa = enablement(selection);
    boolean i = selection.toList().stream().filter(pa).findAny().isPresent();
    if (!i && isEnabled()) {
      setBaseEnabled(i);
    } else if (i && !isEnabled()) {
      setBaseEnabled(i);
    }
  }
  
  protected Collection<EObject> getSelection(ISelection currentSelection) {
    ArrayList<EObject> result = new ArrayList<EObject>();
    for (Object obj : ((IStructuredSelection) currentSelection).toList()) {
      if (obj instanceof DSemanticDecorator) {
        obj = ((DSemanticDecorator) obj).getTarget();
        result.add((EObject) obj);
      } else if (obj instanceof EObject) {
        obj = (obj);
        result.add((EObject) obj);
      }
    }
    return result;
  }

  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    final Collection<Object> selection = (Collection) getSelection(HandlerUtil.getCurrentSelection(event));
    execute(selection, event, new NullProgressMonitor());
    return null;
  }

  protected void execute(Collection<Object> selection2, ExecutionEvent event_p, IProgressMonitor monitor_p) {
    try {
      proceed(selection2, event_p, monitor_p);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void proceed(Collection<Object> selection2, ExecutionEvent event_p, IProgressMonitor monitor_p) {
    // Nothing here
  }
}
