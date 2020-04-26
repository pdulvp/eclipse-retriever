/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI Variable Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.URIVariableContainer#getOwnedVariables <em>Owned Variables</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getURIVariableContainer()
 * @model
 * @generated
 */
public interface URIVariableContainer extends EObject {
  /**
   * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.retriever.URIVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Variables</em>' containment reference list.
   * @see org.pdulvp.retriever.RetrieverPackage#getURIVariableContainer_OwnedVariables()
   * @model containment="true"
   * @generated
   */
  EList<URIVariable> getOwnedVariables();

} // URIVariableContainer
