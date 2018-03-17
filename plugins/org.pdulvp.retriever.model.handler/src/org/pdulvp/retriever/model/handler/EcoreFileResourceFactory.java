package org.pdulvp.retriever.model.handler;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
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
    EPackage correspondingPackage = null;
    String a = uri.lastSegment().substring(0, uri.fileExtension().length() - 1);
    for (Object pkg : EPackage.Registry.INSTANCE.values()) {
      if (pkg instanceof EPackage && ((EPackage) pkg).getNsPrefix().equals(a)) {
        correspondingPackage = (EPackage) pkg;
        break;
      }
    }
    if (correspondingPackage != null) {
      Resource existingResource = correspondingPackage.eResource();
      if (existingResource != null) {
        return existingResource;
      }
    }
    return super.createResource(uri);
  }

}
