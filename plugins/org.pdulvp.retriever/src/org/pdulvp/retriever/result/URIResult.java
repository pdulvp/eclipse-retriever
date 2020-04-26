/**
 */
package org.pdulvp.retriever.result;

import org.pdulvp.retriever.URLRetriever;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.result.URIResult#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.URIResult#getUri <em>Uri</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.URIResult#getElement <em>Element</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.URIResult#getExternalUri <em>External Uri</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.result.ResultPackage#getURIResult()
 * @model
 * @generated
 */
public interface URIResult extends Result {
	/**
   * Returns the value of the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' reference.
   * @see #setDefinition(URLRetriever)
   * @see org.pdulvp.retriever.result.ResultPackage#getURIResult_Definition()
   * @model
   * @generated
   */
	URLRetriever getDefinition();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.URIResult#getDefinition <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' reference.
   * @see #getDefinition()
   * @generated
   */
	void setDefinition(URLRetriever value);

	/**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see org.pdulvp.retriever.result.ResultPackage#getURIResult_Uri()
   * @model
   * @generated
   */
	String getUri();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.URIResult#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
	void setUri(String value);

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
   * @see org.pdulvp.retriever.result.ResultPackage#getURIResult_Element()
   * @model transient="true"
   * @generated
   */
	Object getElement();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.URIResult#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
	void setElement(Object value);

	/**
   * Returns the value of the '<em><b>External Uri</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>External Uri</em>' attribute.
   * @see #setExternalUri(String)
   * @see org.pdulvp.retriever.result.ResultPackage#getURIResult_ExternalUri()
   * @model default=""
   * @generated
   */
	String getExternalUri();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.URIResult#getExternalUri <em>External Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>External Uri</em>' attribute.
   * @see #getExternalUri()
   * @generated
   */
	void setExternalUri(String value);

} // URIResult
