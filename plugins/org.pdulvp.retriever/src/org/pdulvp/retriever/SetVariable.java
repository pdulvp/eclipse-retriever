/**
 */
package org.pdulvp.retriever;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.SetVariable#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.pdulvp.retriever.SetVariable#isLog <em>Log</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getSetVariable()
 * @model
 * @generated
 */
public interface SetVariable extends CreateNotifier {
  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getSetVariable_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.SetVariable#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

		/**
   * Returns the value of the '<em><b>Log</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Log</em>' attribute.
   * @see #setLog(boolean)
   * @see org.pdulvp.retriever.RetrieverPackage#getSetVariable_Log()
   * @model
   * @generated
   */
	boolean isLog();

		/**
   * Sets the value of the '{@link org.pdulvp.retriever.SetVariable#isLog <em>Log</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Log</em>' attribute.
   * @see #isLog()
   * @generated
   */
	void setLog(boolean value);

} // SetVariable
