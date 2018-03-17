package org.pdulvp.retriever.model.handler.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;

public class JavaInterpreter extends AbstractContextInterpreter implements IInterpreter, IInterpreterProvider {

  /** The Feature interpreter prefix. */
  public static final String PREFIX = "ja:"; // $NON-NLS-0$

  @Override
  public IInterpreter createInterpreter() {
    return new JavaInterpreter();
  }

  @Override
  public String getPrefix() {
    return PREFIX;
  }

  @Override
  public Object subEvaluate(EObject target, String expression) throws EvaluationException {
    String value = expression.substring(super.getPrefix().length());
    String[] vars = value.split("\\.");
    if (vars.length > 1) {
      Object var = getVariable(vars[0]);

      if (vars[1].equals("toMetadata")) {
        if (var instanceof String) {
          String var2 = (String) var;
          String[] split = var2.split("/");
          String file = split[split.length - 1];
          var = "https://commons.wikimedia.org/w/api.php?action=query&format=xml&prop=imageinfo&iiprop=extmetadata&titles=Image:"
              + file;
          return var;
        }
      }
      System.out.println(var);
    }

    return target;
  }

}
