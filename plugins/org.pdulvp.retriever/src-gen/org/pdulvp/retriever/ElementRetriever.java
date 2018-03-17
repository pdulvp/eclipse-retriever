/**
 */
package org.pdulvp.retriever;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Retriever</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.ElementRetriever#getRetrieverExpression <em>Retriever Expression</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getElementRetriever()
 * @model
 * @generated
 */
public interface ElementRetriever extends Retriever, RetrieverContainer, IVariableElement, IVariableResultElement {

	/**
   * Returns the value of the '<em><b>Retriever Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Retriever Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retriever Expression</em>' attribute.
   * @see #setRetrieverExpression(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getElementRetriever_RetrieverExpression()
   * @model
   * @generated
   */
  String getRetrieverExpression();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.ElementRetriever#getRetrieverExpression <em>Retriever Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retriever Expression</em>' attribute.
   * @see #getRetrieverExpression()
   * @generated
   */
  void setRetrieverExpression(String value);

} // ElementRetriever
