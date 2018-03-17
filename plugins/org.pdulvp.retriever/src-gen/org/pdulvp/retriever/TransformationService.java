/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.TransformationService#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.pdulvp.retriever.TransformationService#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getTransformationService()
 * @model
 * @generated
 */
public interface TransformationService extends EObject {
	/**
   * Returns the value of the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' attribute.
   * @see #setClassname(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getTransformationService_Classname()
   * @model
   * @generated
   */
	String getClassname();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.TransformationService#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
	void setClassname(String value);

	/**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getTransformationService_Method()
   * @model
   * @generated
   */
	String getMethod();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.TransformationService#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
	void setMethod(String value);

} // TransformationService
