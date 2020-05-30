package org.pdulvp.retriever.model.handler;

import org.eclipse.emf.ecore.EObject;
import org.pdulvp.retriever.CreateEReference;
import org.pdulvp.retriever.model.handler.interpreter.IContext;
import org.pdulvp.retriever.result.Result;

public class ReferenceCreate {
  public EObject created;
  public CreateEReference child;
  public Result result;
  public IContext context;

  public ReferenceCreate(EObject created, CreateEReference child, Result container2, IContext context) {
    super();
    this.created = created;
    this.child = child;
    this.context = context;
    this.result = container2;
  }

}
