package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.acceleo.aql.business.internal.AQLSiriusInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterContext;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;
import org.eclipse.sirius.common.tools.api.interpreter.ValidationResult;
import org.pdulvp.retriever.model.handler.helpers.LogHelper;
import org.w3c.dom.Text;

public class IncrementInterpreter extends AbstractContextInterpreter implements IInterpreter, IInterpreterProvider {

	/** The Feature interpreter prefix. */
	public static final String PREFIX = "increment:"; // $NON-NLS-0$

	@Override
	public IInterpreter createInterpreter() {
		return new IncrementInterpreter();
	}

	@Override
	public String getPrefix() {
		return PREFIX;
	}

	public Object subEvaluate(EObject target, String expression) throws EvaluationException {
		if (expression.contains("0")) {
			return Integer.valueOf(0);
		}
		expression = expression.replaceFirst(super.getPrefix(), "");
		String value = expression.split("\\.")[0];
		Object variable = (getVariable(value));
		if (variable != null && variable instanceof Integer) {
			return Integer.valueOf(((Integer)variable).intValue()+1);
		}
		return Integer.valueOf(-1);
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
