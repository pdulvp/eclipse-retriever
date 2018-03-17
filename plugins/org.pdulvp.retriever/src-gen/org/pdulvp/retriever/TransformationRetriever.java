/**
 */
package org.pdulvp.retriever;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Retriever</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.TransformationRetriever#getService <em>Service</em>}</li>
 *   <li>{@link org.pdulvp.retriever.TransformationRetriever#getInput <em>Input</em>}</li>
 *   <li>{@link org.pdulvp.retriever.TransformationRetriever#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getTransformationRetriever()
 * @model
 * @generated
 */
public interface TransformationRetriever extends Retriever, RetrieverContainer {
  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(TransformationService)
   * @see org.pdulvp.retriever.RetrieverPackage#getTransformationRetriever_Service()
   * @model
   * @generated
   */
  TransformationService getService();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.TransformationRetriever#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(TransformationService value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getTransformationRetriever_Input()
   * @model
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.TransformationRetriever#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute.
   * @see #setVariable(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getTransformationRetriever_Variable()
   * @model
   * @generated
   */
  String getVariable();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.TransformationRetriever#getVariable <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' attribute.
   * @see #getVariable()
   * @generated
   */
  void setVariable(String value);

} // TransformationRetriever
