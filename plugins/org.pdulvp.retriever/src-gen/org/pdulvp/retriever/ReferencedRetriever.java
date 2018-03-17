/**
 */
package org.pdulvp.retriever;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Retriever</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.ReferencedRetriever#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getReferencedRetriever()
 * @model
 * @generated
 */
public interface ReferencedRetriever extends Retriever {
	/**
   * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Element</em>' reference.
   * @see #setReferencedElement(Retriever)
   * @see org.pdulvp.retriever.RetrieverPackage#getReferencedRetriever_ReferencedElement()
   * @model
   * @generated
   */
	Retriever getReferencedElement();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.ReferencedRetriever#getReferencedElement <em>Referenced Element</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced Element</em>' reference.
   * @see #getReferencedElement()
   * @generated
   */
	void setReferencedElement(Retriever value);

} // ReferencedRetriever
