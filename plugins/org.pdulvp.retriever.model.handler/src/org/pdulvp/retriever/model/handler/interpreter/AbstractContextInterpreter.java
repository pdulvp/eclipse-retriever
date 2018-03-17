package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.acceleo.aql.business.internal.AQLSiriusInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterContext;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;
import org.eclipse.sirius.common.tools.api.interpreter.ValidationResult;
import org.pdulvp.retriever.model.handler.helpers.LogHelper;

public abstract class AbstractContextInterpreter extends AQLSiriusInterpreter
    implements IInterpreter, IInterpreterProvider {

  @Override
  public boolean provides(String expression) {
    return expression != null && expression.startsWith(getPrefix());
  }

  @SuppressWarnings("restriction")
  protected void initializeVariables(EObject target, String expression) {

    IContext a = (IContext) getVariable("context");
    if (a != null) {
      
    // clearVariables();
    for (String var : a.getVariables()) {
      unSetVariable(var);
      setVariable(var, a.getVariable(var));
    }
    }

  }

  @SuppressWarnings("restriction")
  @Override
  public Object evaluate(EObject target, String expression) throws EvaluationException {
    expression = expression.replaceFirst(getPrefix(), super.getPrefix());
    initializeVariables(target, expression);
    return subEvaluate(target, expression);
  }

  public Object subEvaluate(EObject target, String expression) throws EvaluationException {
	  long time = System.currentTimeMillis();
    Object a = super.evaluate(target, expression);
	  long time2 = System.currentTimeMillis();
	  if (time2 - time > 50) {
		  LogHelper.error("too long:"+"("+(time2 - time)+"ms)"+expression);
	  }
    return a;
  }

  @Override
  public boolean supportsValidation() {
    return false;
  }

  @Override
  public ValidationResult analyzeExpression(IInterpreterContext context, String expression) {
    return null;
  }

}
