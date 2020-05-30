/**
 */
package org.pdulvp.retriever.result.util;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.pdulvp.retriever.result.Result;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package. <!-- end-user-doc -->
 * @see org.pdulvp.retriever.result.util.ResultResourceFactoryImpl
 * @generated
 */
public class ResultResourceImpl extends XMIResourceImpl {
  /**
   * Creates an instance of the resource.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param uri the URI of the new resource.
   * @generated
   */
  public ResultResourceImpl(URI uri) {
    super(uri);
  }

  @Override
  public EObject getEObject(String uriFragment) {
    if (uriFragment == null) {
      return getContents().get(0);
    }
    return super.getEObject(uriFragment);
  }

  @Override
  public void save(Map<?, ?> options) throws IOException {
    super.save(options);
  }

  @Override
  public void attached(EObject eObject) {
    super.attached(eObject);

    if (eObject instanceof Result) {
      Result i = (Result) eObject;
      if (i.getId() == null) {
        i.setId(UUID.randomUUID().toString());
      }
    }
  }
} // ResultResourceImpl
