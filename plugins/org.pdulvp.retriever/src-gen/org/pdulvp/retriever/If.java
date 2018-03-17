/**
 */
package org.pdulvp.retriever;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.If#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Retriever, RetrieverContainer {
  /**
   * Returns the value of the '<em><b>Condition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Expression</em>' attribute.
   * @see #setConditionExpression(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getIf_ConditionExpression()
   * @model
   * @generated
   */
  String getConditionExpression();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.If#getConditionExpression <em>Condition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Expression</em>' attribute.
   * @see #getConditionExpression()
   * @generated
   */
  void setConditionExpression(String value);

} // If
