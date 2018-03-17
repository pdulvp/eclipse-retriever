/**
 */
package org.pdulvp.retriever;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.LoadResource#getUri <em>Uri</em>}</li>
 *   <li>{@link org.pdulvp.retriever.LoadResource#isCreate <em>Create</em>}</li>
 *   <li>{@link org.pdulvp.retriever.LoadResource#isClearContents <em>Clear Contents</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getLoadResource()
 * @model
 * @generated
 */
public interface LoadResource extends CreateNotifier {
  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getLoadResource_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.LoadResource#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Create</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create</em>' attribute.
   * @see #setCreate(boolean)
   * @see org.pdulvp.retriever.RetrieverPackage#getLoadResource_Create()
   * @model default="true"
   * @generated
   */
  boolean isCreate();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.LoadResource#isCreate <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create</em>' attribute.
   * @see #isCreate()
   * @generated
   */
  void setCreate(boolean value);

  /**
   * Returns the value of the '<em><b>Clear Contents</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clear Contents</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clear Contents</em>' attribute.
   * @see #setClearContents(boolean)
   * @see org.pdulvp.retriever.RetrieverPackage#getLoadResource_ClearContents()
   * @model default="false"
   * @generated
   */
  boolean isClearContents();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.LoadResource#isClearContents <em>Clear Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clear Contents</em>' attribute.
   * @see #isClearContents()
   * @generated
   */
  void setClearContents(boolean value);

} // LoadResource
