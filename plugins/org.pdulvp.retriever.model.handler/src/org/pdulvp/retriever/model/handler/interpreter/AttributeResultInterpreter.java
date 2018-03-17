package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;
import org.pdulvp.retriever.result.AttributeResult;
import org.pdulvp.retriever.result.ElementResult;
import org.pdulvp.retriever.result.Result;

public class AttributeResultInterpreter extends AbstractContextInterpreter implements IInterpreter, IInterpreterProvider {

  /** The Feature interpreter prefix. */
  public static final String PREFIX = "attribute:"; // $NON-NLS-0$

  @Override
  public IInterpreter createInterpreter() {
    return new AttributeResultInterpreter();
  }

  @Override
  public String getPrefix() {
    return PREFIX;
  }

  @Override
  public Object subEvaluate(EObject target, String expression) throws EvaluationException {

    String uri2 = expression.substring(super.getPrefix().length());
    
    String variableName = uri2.split("\\.")[0];
    String attributeName = uri2.split("\\.")[1];
	Object variable = (getVariable(variableName));
	
	if (variable != null && variable instanceof ElementResult) {
		ElementResult result = (ElementResult)variable;
		for (Result att : result.getOwnedResults()) {
			if (att instanceof AttributeResult) {
				if (((AttributeResult) att).getName().equals(attributeName)) {
					return ((AttributeResult) att).getValue();
				}
			}
		}
	}
	

    return uri2;
  }

}
