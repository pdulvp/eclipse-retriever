/**
 */
package org.pdulvp.retriever.util;

import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.pdulvp.retriever.Retriever;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package. <!-- end-user-doc -->
 * @see org.pdulvp.retriever.util.RetrieverResourceFactoryImpl
 * @generated
 */
public class RetrieverResourceImpl extends XMIResourceImpl {
  /**
   * Creates an instance of the resource.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param uri the URI of the new resource.
   * @generated
   */
  public RetrieverResourceImpl(URI uri) {
    super(uri);
  }

  @Override
  public void attached(EObject eObject) {
    super.attached(eObject);

    if (eObject instanceof Retriever) {
      Retriever i = (Retriever) eObject;
      if (i.getId() == null || !(i.equals(getEObject(i.getId())))) {
        i.setId(UUID.randomUUID().toString());
      }
    }
  }
} // RetrieverResourceImpl
