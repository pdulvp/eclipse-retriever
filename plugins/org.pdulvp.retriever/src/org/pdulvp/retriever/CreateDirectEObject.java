/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Direct EObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.CreateDirectEObject#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.pdulvp.retriever.CreateDirectEObject#getContainingFeature <em>Containing Feature</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getCreateDirectEObject()
 * @model
 * @generated
 */
public interface CreateDirectEObject extends CreateNotifier {
  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(EClass)
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateDirectEObject_Class()
   * @model
   * @generated
   */
  EClass getClass_();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateDirectEObject#getClass_ <em>Class</em>}' reference.
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
   * <p>
   * If the meaning of the '<em>Containing Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containing Feature</em>' reference.
   * @see #setContainingFeature(EReference)
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateDirectEObject_ContainingFeature()
   * @model
   * @generated
   */
  EReference getContainingFeature();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateDirectEObject#getContainingFeature <em>Containing Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Containing Feature</em>' reference.
   * @see #getContainingFeature()
   * @generated
   */
  void setContainingFeature(EReference value);

} // CreateDirectEObject
