/**
 */
package org.pdulvp.retriever;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Retriever</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.AttributeRetriever#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.pdulvp.retriever.AttributeRetriever#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.pdulvp.retriever.AttributeRetriever#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getAttributeRetriever()
 * @model
 * @generated
 */
public interface AttributeRetriever extends Retriever {

	/**
   * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Expression</em>' attribute.
   * @see #setValueExpression(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getAttributeRetriever_ValueExpression()
   * @model
   * @generated
   */
  String getValueExpression();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.AttributeRetriever#getValueExpression <em>Value Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Expression</em>' attribute.
   * @see #getValueExpression()
   * @generated
   */
  void setValueExpression(String value);

  /**
   * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Alternative</em>' containment reference.
   * @see #setAlternative(AttributeRetriever)
   * @see org.pdulvp.retriever.RetrieverPackage#getAttributeRetriever_Alternative()
   * @model containment="true"
   * @generated
   */
	AttributeRetriever getAlternative();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.AttributeRetriever#getAlternative <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alternative</em>' containment reference.
   * @see #getAlternative()
   * @generated
   */
	void setAlternative(AttributeRetriever value);

  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(TransformationService)
   * @see org.pdulvp.retriever.RetrieverPackage#getAttributeRetriever_Service()
   * @model
   * @generated
   */
  TransformationService getService();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.AttributeRetriever#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(TransformationService value);

} // AttributeRetriever
