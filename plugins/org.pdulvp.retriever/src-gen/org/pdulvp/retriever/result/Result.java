/**
 */
package org.pdulvp.retriever.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.result.Result#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.Result#getOwnedResults <em>Owned Results</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.result.ResultPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
	/**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.pdulvp.retriever.result.ResultPackage#getResult_Id()
   * @model id="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.result.Result#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Owned Results</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.retriever.result.Result}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Results</em>' containment reference list.
   * @see org.pdulvp.retriever.result.ResultPackage#getResult_OwnedResults()
   * @model containment="true"
   * @generated
   */
	EList<Result> getOwnedResults();

} // Result
