package org.pdulvp.retriever.ui.commands;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ProgressCommandHandler extends CommandHandler {

  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {

    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);

    try {
      dialog.run(true, true, new IRunnableWithProgress() {

        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
          Collection<Object> selection = Collections.emptyList();
          ISelection selection2 = HandlerUtil.getCurrentSelection(event);
          if (selection2 instanceof IStructuredSelection)  { 
            selection = ((IStructuredSelection) selection2).toList();
          }
          IWorkbenchPart part = HandlerUtil.getActivePart(event);
          
          if (part != null) {
            ISelectionProvider provider = part.getSite().getSelectionProvider();
            selection = (Collection) getSelection(provider.getSelection());
          }
          execute(selection, event, monitor);
        }
      });

    } catch (Exception e) {

    }
    return null;
  }

}
