/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.CreateEAttribute#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.pdulvp.retriever.CreateEAttribute#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getCreateEAttribute()
 * @model
 * @generated
 */
public interface CreateEAttribute extends Retriever {
	/**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(EAttribute)
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateEAttribute_Feature()
   * @model
   * @generated
   */
	EAttribute getFeature();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateEAttribute#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
	void setFeature(EAttribute value);

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
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateEAttribute_ValueExpression()
   * @model
   * @generated
   */
  String getValueExpression();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateEAttribute#getValueExpression <em>Value Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Expression</em>' attribute.
   * @see #getValueExpression()
   * @generated
   */
  void setValueExpression(String value);

} // CreateEAttribute
