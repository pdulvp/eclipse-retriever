package org.pdulvp.retriever.model.handler;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class RetrieverResourceFactoryRegistry implements Resource.Factory.Registry {

  TransactionalEditingDomain domain;
  Resource.Factory.Registry delegated;

  public RetrieverResourceFactoryRegistry(TransactionalEditingDomain domain) {
    this.domain = domain;
    this.delegated = domain.getResourceSet().getResourceFactoryRegistry();
  }

  @Override
  public Map<String, Object> getProtocolToFactoryMap() {
    return delegated.getProtocolToFactoryMap();
  }

  @Override
  public org.eclipse.emf.ecore.resource.Resource.Factory getFactory(URI uri, String contentType) {
    if (uri.scheme().equals(RetrieverScheme.RETRIEVER)) {
      return new RetrieverSchemeResourceFactory(domain);
    }
    if (uri.fileExtension().equals("ecore")) {
      return new EcoreFileResourceFactory(domain);
    }
    return delegated.getFactory(uri, contentType);
  }

  @Override
  public org.eclipse.emf.ecore.resource.Resource.Factory getFactory(URI uri) {
    return delegated.getFactory(uri);
  }

  @Override
  public Map<String, Object> getExtensionToFactoryMap() {
    return delegated.getExtensionToFactoryMap();
  }

  @Override
  public Map<String, Object> getContentTypeToFactoryMap() {
    return delegated.getContentTypeToFactoryMap();
  }
}
