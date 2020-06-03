package org.pdulvp.retriever.model.handler;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class EcoreFileResourceFactory extends EcoreResourceFactoryImpl {

  TransactionalEditingDomain domain;

  public EcoreFileResourceFactory(TransactionalEditingDomain domain) {
    this.domain = domain;
  }

  @Override
  public Resource createResource(URI uri) {
    // If URI is already loaded in the EPackage.Registry,
    // we retrieve this resource instead of loading a new one
    // For Ecore.ecore, it will allow to create real EClass
    
    ResourceSet set = new ResourceSetImpl();
    Resource first = set.getResource(uri, true);
    String nsUri = ((EPackage)first.getContents().get(0)).getNsURI();
    EPackage current = EPackage.Registry.INSTANCE.getEPackage(nsUri);
    if (current != null) {
      Resource existingResource = current.eResource();
      if (existingResource != null) {
        return existingResource;
      }
    }
    return super.createResource(uri);
  }

}
