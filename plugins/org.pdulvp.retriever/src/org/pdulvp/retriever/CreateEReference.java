/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.CreateEReference#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.pdulvp.retriever.CreateEReference#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.pdulvp.retriever.CreateEReference#isDeferred <em>Deferred</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getCreateEReference()
 * @model
 * @generated
 */
public interface CreateEReference extends Retriever {
	/**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(EReference)
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateEReference_Feature()
   * @model
   * @generated
   */
	EReference getFeature();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateEReference#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
	void setFeature(EReference value);

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
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateEReference_ValueExpression()
   * @model
   * @generated
   */
  String getValueExpression();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateEReference#getValueExpression <em>Value Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Expression</em>' attribute.
   * @see #getValueExpression()
   * @generated
   */
  void setValueExpression(String value);

  /**
   * Returns the value of the '<em><b>Deferred</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deferred</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deferred</em>' attribute.
   * @see #setDeferred(boolean)
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateEReference_Deferred()
   * @model default="false"
   * @generated
   */
  boolean isDeferred();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateEReference#isDeferred <em>Deferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deferred</em>' attribute.
   * @see #isDeferred()
   * @generated
   */
  void setDeferred(boolean value);

} // CreateEReference
