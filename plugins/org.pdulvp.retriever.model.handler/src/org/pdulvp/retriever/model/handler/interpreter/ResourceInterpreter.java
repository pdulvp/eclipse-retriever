package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.pdulvp.retriever.URLRetriever;
import org.pdulvp.retriever.model.handler.RetrieverScheme;
import org.pdulvp.retriever.result.URIResult;

public class ResourceInterpreter extends AbstractContextInterpreter {

  /** The Feature interpreter prefix. */
  public static final String PREFIX = "resource:"; // $NON-NLS-0$

  @Override
  public IInterpreter createInterpreter() {
    return new ResourceInterpreter();
  }

  @Override
  public String getPrefix() {
    return PREFIX;
  }

  @Override
  protected void initializeVariables(EObject target, String expression) {
    super.initializeVariables(target, expression);

    if (expression.contains("uri")) {
      if (target instanceof URIResult) {
        setVariable(((URIResult) target).getDefinition().getVariable(), target);
      }
    }
  }

  @Override
  public Object subEvaluate(EObject target, String expression) throws EvaluationException {
    if (expression.contains("uri")) {
      expression = expression.replaceFirst(super.getPrefix(), "");
      String value = expression.split("\\.")[0];
      URIResult result = ((URIResult) getVariable(value));
      URLRetriever ret = result.getDefinition();
      IContext a = (IContext) getVariable("context");
      return RetrieverScheme.createURI(ret, a, result.getUri());

    } else if (expression.contains("root")) {
      expression = expression.replaceFirst(super.getPrefix(), "");
      String value = expression.split("\\.")[0];
      Object variable = (getVariable(value));
      if (variable instanceof Resource && !(((Resource) variable).getContents().isEmpty())) {
        return ((Resource) variable).getContents().get(0);
      }
      return null;

    } else {
        expression = expression.replaceFirst(super.getPrefix(), "");
        String value = expression.split("\\.")[0];
        String id = expression.split("\\.")[1];
        Object variable = (getVariable(value));
         id =(String)(getVariable(id));
         //gamble event direct fill is direct
        if (variable instanceof EObject) {
        	variable = ((EObject) variable).eResource();
        }
        if (variable instanceof Resource && !(((Resource) variable).getContents().isEmpty())) {
          return ((Resource) variable).getEObject(id);
        }
        return super.subEvaluate(target, expression);
    }
  }

}
