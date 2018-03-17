package org.pdulvp.retriever.model.handler.interpreter;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class IContext {

  EObject source;
  ResourceSet set;
  IContext parent;

  HashMap<String, Object> variables = new HashMap<String, Object>();

  public Collection<String> getVariables() {
    Collection<String> vars = new HashSet<String>();
    vars.addAll(variables.keySet());
    return vars;
  }

  public IContext(EObject source_p, IContext context) {
    source = source_p;
    parent = context;
    for (String key : parent.getVariables()) {
      variables.put(key, parent.getVariable(key));
    }
  }

  public IContext(EObject object) {
    source = object;
    set = source.eResource().getResourceSet();
  }

  public ResourceSet getResourceSet() {
    if (set != null) {
      return set;
    }
    if (parent != null) {
      return parent.getResourceSet();
    }
    return null;
  }

  public Object getVariable(String key) {
    if (variables.containsKey(key)) {
      return variables.get(key);
    }
    return null;
  }

  private void info(String string) {
    // Activator.getDefault().getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, string));
  }

  public void setVariable(String key, Object value) {
   // System.out.println("setVariable:" + key + "=" + value);
    variables.put(key, value);
  }

  public EObject getSource() {
    return source;
  }

}
