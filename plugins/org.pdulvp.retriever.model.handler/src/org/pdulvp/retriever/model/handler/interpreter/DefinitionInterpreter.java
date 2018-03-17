package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;
import org.pdulvp.retriever.result.URIResult;

public class DefinitionInterpreter extends AbstractContextInterpreter implements IInterpreter, IInterpreterProvider {

  /** The Feature interpreter prefix. */
  public static final String PREFIX = "def:"; // $NON-NLS-0$

  @Override
  public IInterpreter createInterpreter() {
    return new DefinitionInterpreter();
  }

  @Override
  public String getPrefix() {
    return PREFIX;
  }

  @Override
  protected void initializeVariables(EObject target, String expression) {

    IContext a = (IContext) getVariable("context");
    clearVariables();
    for (String var : a.getVariables()) {
      unSetVariable(var);
      setVariable(var, a.getVariable(var));
    }

  }

  @Override
  public Object subEvaluate(EObject target, String expression) throws EvaluationException {

    if (expression.contains("uri")) {
      expression = expression.replaceFirst(super.getPrefix(), "");
      String value = expression.split("\\.")[0];
      URIResult result = ((URIResult) getVariable(value));
      return result.getUri();
    }

    return super.subEvaluate(target, expression);
  }

}
