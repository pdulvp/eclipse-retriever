package org.pdulvp.retriever.model.handler;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.pdulvp.retriever.result.util.ResultResourceFactoryImpl;
import org.pdulvp.retriever.result.util.ResultResourceImpl;

public class RetrieverSchemeResourceFactory extends ResultResourceFactoryImpl {

  TransactionalEditingDomain domain;

  public RetrieverSchemeResourceFactory(TransactionalEditingDomain domain) {
    this.domain = domain;
  }

  @Override
  public Resource createResource(URI uri) {
    Resource res = new ResultResourceImpl(uri);

    return res;
  }

}
