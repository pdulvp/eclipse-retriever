/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVariable Result Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.IVariableResultElement#getVariableResult <em>Variable Result</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getIVariableResultElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IVariableResultElement extends EObject {
  /**
   * Returns the value of the '<em><b>Variable Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Result</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Result</em>' attribute.
   * @see #setVariableResult(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getIVariableResultElement_VariableResult()
   * @model
   * @generated
   */
  String getVariableResult();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.IVariableResultElement#getVariableResult <em>Variable Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Result</em>' attribute.
   * @see #getVariableResult()
   * @generated
   */
  void setVariableResult(String value);

} // IVariableResultElement
