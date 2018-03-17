package org.pdulvp.retriever.ui.commands;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

public class TransactionalCommandHandler extends CommandHandler {

  protected TransactionalEditingDomain getDomain(Collection<EObject> selection) {
    Session session = SessionManager.INSTANCE.getSession(selection.iterator().next());
    TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
    return domain;
  }

  protected void execute(final Collection<Object> selection, final ExecutionEvent event,
      final IProgressMonitor monitor) {

    TransactionalEditingDomain domain = getDomain((Collection) selection);
    domain.getCommandStack().execute(new RecordingCommand(domain) {

      @Override
      protected void doExecute() {
        try {
          proceed((List) selection, event, monitor);
        } catch (Exception e) {
          e.printStackTrace();
          throw new RuntimeException(e);
        }
      }
    });
  }

}
