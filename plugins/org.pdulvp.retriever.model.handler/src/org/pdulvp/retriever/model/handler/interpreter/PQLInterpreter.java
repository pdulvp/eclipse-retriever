package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;

public class PQLInterpreter extends AbstractContextInterpreter implements IInterpreter, IInterpreterProvider {

  /** The Feature interpreter prefix. */
  public static final String PREFIX = "pql:"; // $NON-NLS-0$

  @Override
  public IInterpreter createInterpreter() {
    return new PQLInterpreter();
  }

  @Override
  public String getPrefix() {
    return PREFIX;
  }

  @Override
  public Object subEvaluate(EObject target, String expression) throws EvaluationException {
    if (expression.contains("pages")) {
      Object a = getVariable("pages");
      System.out.println(0);
    }
    return super.subEvaluate(target, expression);
  }
}
