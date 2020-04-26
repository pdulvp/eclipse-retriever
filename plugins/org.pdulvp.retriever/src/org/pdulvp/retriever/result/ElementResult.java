/**
 */
package org.pdulvp.retriever.result;

import org.pdulvp.retriever.ElementRetriever;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.result.ElementResult#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.ElementResult#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.result.ResultPackage#getElementResult()
 * @model
 * @generated
 */
public interface ElementResult extends Result {
	/**
   * Returns the value of the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' reference.
   * @see #setDefinition(ElementRetriever)
   * @see org.pdulvp.retriever.result.ResultPackage#getElementResult_Definition()
   * @model
   * @generated
   */
	ElementRetriever getDefinition();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.ElementResult#getDefinition <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' reference.
   * @see #getDefinition()
   * @generated
   */
	void setDefinition(ElementRetriever value);

	/**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(Object)
   * @see org.pdulvp.retriever.result.ResultPackage#getElementResult_Element()
   * @model transient="true"
   * @generated
   */
	Object getElement();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.ElementResult#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
	void setElement(Object value);

} // ElementResult
