/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create EObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.CreateEObject#getContainerExpression <em>Container Expression</em>}</li>
 *   <li>{@link org.pdulvp.retriever.CreateEObject#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.pdulvp.retriever.CreateEObject#getContainingFeature <em>Containing Feature</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getCreateEObject()
 * @model
 * @generated
 */
public interface CreateEObject extends CreateNotifier {
	/**
   * Returns the value of the '<em><b>Container Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Expression</em>' attribute.
   * @see #setContainerExpression(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateEObject_ContainerExpression()
   * @model
   * @generated
   */
  String getContainerExpression();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateEObject#getContainerExpression <em>Container Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container Expression</em>' attribute.
   * @see #getContainerExpression()
   * @generated
   */
  void setContainerExpression(String value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(EClass)
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateEObject_Class()
   * @model
   * @generated
   */
  EClass getClass_();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateEObject#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(EClass value);

  /**
   * Returns the value of the '<em><b>Containing Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containing Feature</em>' reference.
   * @see #setContainingFeature(EReference)
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateEObject_ContainingFeature()
   * @model
   * @generated
   */
  EReference getContainingFeature();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateEObject#getContainingFeature <em>Containing Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Containing Feature</em>' reference.
   * @see #getContainingFeature()
   * @generated
   */
  void setContainingFeature(EReference value);

} // CreateEObject
