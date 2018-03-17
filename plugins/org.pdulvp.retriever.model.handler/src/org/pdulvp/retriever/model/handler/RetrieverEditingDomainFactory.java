package org.pdulvp.retriever.model.handler;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;;

public class RetrieverEditingDomainFactory
    implements org.eclipse.sirius.common.tools.api.editing.IEditingDomainFactory {

  public RetrieverEditingDomainFactory() {
  }

  @Override
  public TransactionalEditingDomain createEditingDomain() {
    return createEditingDomain(null);
  }

  @Override
  public TransactionalEditingDomain createEditingDomain(ResourceSet rset) {
    TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();

    // Register the custom ResourceFactory
    domain.getResourceSet().setResourceFactoryRegistry(new RetrieverResourceFactoryRegistry(domain));

    // Register the custom URI converter
    URIConverter converter = domain.getResourceSet().getURIConverter();
    converter.getURIHandlers().add(converter.getURIHandlers().size() - 2, new CacheResultURIHandler(domain));

    return domain;
  }

  @Override
  public TransactionalEditingDomain getEditingDomain(ResourceSet rset) {
    return TransactionUtil.getEditingDomain(rset);
  }

}
