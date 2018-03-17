/**
 */
package org.pdulvp.retriever;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.CreateFile#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getCreateFile()
 * @model
 * @generated
 */
public interface CreateFile extends CreateNotifier {
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
   * @see org.pdulvp.retriever.RetrieverPackage#getCreateFile_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.CreateFile#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

} // CreateFile
