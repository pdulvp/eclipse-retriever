/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Retriever</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.URLRetriever#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link org.pdulvp.retriever.URLRetriever#getUriExpression <em>Uri Expression</em>}</li>
 *   <li>{@link org.pdulvp.retriever.URLRetriever#getCacheControl <em>Cache Control</em>}</li>
 *   <li>{@link org.pdulvp.retriever.URLRetriever#isAsSemantic <em>As Semantic</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getURLRetriever()
 * @model
 * @generated
 */
public interface URLRetriever extends Retriever, RetrieverContainer, IVariableElement, IVariableResultElement {
	/**
   * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.pdulvp.retriever.URIVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Variables</em>' containment reference list.
   * @see org.pdulvp.retriever.RetrieverPackage#getURLRetriever_OwnedVariables()
   * @model containment="true"
   * @generated
   */
  EList<URIVariable> getOwnedVariables();

  /**
   * Returns the value of the '<em><b>Uri Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri Expression</em>' attribute.
   * @see #setUriExpression(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getURLRetriever_UriExpression()
   * @model
   * @generated
   */
  String getUriExpression();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.URLRetriever#getUriExpression <em>Uri Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri Expression</em>' attribute.
   * @see #getUriExpression()
   * @generated
   */
  void setUriExpression(String value);

  /**
   * Returns the value of the '<em><b>Cache Control</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache Control</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache Control</em>' attribute.
   * @see #setCacheControl(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getURLRetriever_CacheControl()
   * @model
   * @generated
   */
  String getCacheControl();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.URLRetriever#getCacheControl <em>Cache Control</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache Control</em>' attribute.
   * @see #getCacheControl()
   * @generated
   */
  void setCacheControl(String value);

  /**
   * Returns the value of the '<em><b>As Semantic</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>As Semantic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>As Semantic</em>' attribute.
   * @see #setAsSemantic(boolean)
   * @see org.pdulvp.retriever.RetrieverPackage#getURLRetriever_AsSemantic()
   * @model default="true"
   * @generated
   */
  boolean isAsSemantic();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.URLRetriever#isAsSemantic <em>As Semantic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>As Semantic</em>' attribute.
   * @see #isAsSemantic()
   * @generated
   */
  void setAsSemantic(boolean value);

} // URLRetriever
