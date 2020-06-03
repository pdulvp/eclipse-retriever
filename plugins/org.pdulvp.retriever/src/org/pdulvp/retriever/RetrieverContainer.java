/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.RetrieverContainer#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.pdulvp.retriever.RetrieverContainer#getOwnedServices <em>Owned Services</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getRetrieverContainer()
 * @model abstract="true"
 * @generated
 */
public interface RetrieverContainer extends Retriever {
	/**
   * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.retriever.Retriever}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Elements</em>' containment reference list.
   * @see org.pdulvp.retriever.RetrieverPackage#getRetrieverContainer_OwnedElements()
   * @model containment="true"
   * @generated
   */
	EList<Retriever> getOwnedElements();

	/**
   * Returns the value of the '<em><b>Owned Services</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.retriever.TransformationService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Services</em>' containment reference list.
   * @see org.pdulvp.retriever.RetrieverPackage#getRetrieverContainer_OwnedServices()
   * @model containment="true"
   * @generated
   */
  EList<TransformationService> getOwnedServices();

} // RetrieverContainer
