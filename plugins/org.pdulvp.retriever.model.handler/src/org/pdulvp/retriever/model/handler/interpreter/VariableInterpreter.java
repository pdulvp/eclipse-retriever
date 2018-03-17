package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.w3c.dom.Text;

public class VariableInterpreter extends AbstractContextInterpreter {

  /** The Feature interpreter prefix. */
  public static final String PREFIX = "variable:"; // $NON-NLS-0$

  @Override
  public IInterpreter createInterpreter() {
    return new VariableInterpreter();
  }

  @Override
  public String getPrefix() {
    return PREFIX;
  }

  @Override
  protected void initializeVariables(EObject target, String expression) {
    super.initializeVariables(target, expression);

  }

  @Override
  public Object subEvaluate(EObject target, String expression) throws EvaluationException {
    if (expression.contains("isNull")) {
      expression = expression.replaceFirst(super.getPrefix(), "");
      String value = expression.split("\\.")[0];
      Object variable = (getVariable(value));
      if (variable == null) {
        return true;
      }
      return false;

    } else if (expression.contains("exist")) {
      expression = expression.replaceFirst(super.getPrefix(), "");
      String value = expression.split("\\.")[0];
      Object variable = (getVariable(value));
      if (variable != null) {
        return true;
      }
      return false;
    } else if (expression.contains("text")) {
      expression = expression.replaceFirst(super.getPrefix(), "");
      String value = expression.split("\\.")[0];
      Object variable = (getVariable(value));
      if (variable != null && variable instanceof Text) {
        return ((Text) variable).getTextContent();
      }
      return false;
    }
    return super.subEvaluate(target, expression);
  }

}
