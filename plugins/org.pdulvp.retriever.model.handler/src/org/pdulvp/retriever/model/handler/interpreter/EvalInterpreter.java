package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;
import org.pdulvp.retriever.model.handler.helpers.LogHelper;

public class EvalInterpreter extends AbstractContextInterpreter implements IInterpreter, IInterpreterProvider {

  /** The Feature interpreter prefix. */
  public static final String PREFIX = "eval:"; // $NON-NLS-0$

  @Override
  public IInterpreter createInterpreter() {
    return new EvalInterpreter();
  }

  @Override
  public String getPrefix() {
    return PREFIX;
  }

  @Override
  public Object subEvaluate(EObject target, String expression) throws EvaluationException {

    String uri2 = expression.substring(getPrefix().length() - 1);
    // some variable can overrides others..
    for (String result : getVariables().keySet()) {
      if (getVariable(result) != null) {
        uri2 = uri2.replaceAll("@" + result, getVariable(result).toString());
      }
    }

    if (uri2.contains("@")) {
      LogHelper.warning("evaluation not complete: " + uri2);
    }

    return uri2;
  }

}
