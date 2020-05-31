/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retriever</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.Retriever#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.retriever.Retriever#getName <em>Name</em>}</li>
 *   <li>{@link org.pdulvp.retriever.Retriever#getDescription <em>Description</em>}</li>
 *   <li>{@link org.pdulvp.retriever.Retriever#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.pdulvp.retriever.Retriever#getDynamicPreconditionExpression <em>Dynamic Precondition Expression</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.RetrieverPackage#getRetriever()
 * @model abstract="true"
 * @generated
 */
public interface Retriever extends EObject {
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
   * @see org.pdulvp.retriever.RetrieverPackage#getRetriever_Id()
   * @model id="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.Retriever#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getRetriever_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.Retriever#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getRetriever_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.Retriever#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic</em>' attribute.
   * @see #setDynamic(boolean)
   * @see org.pdulvp.retriever.RetrieverPackage#getRetriever_Dynamic()
   * @model default="false"
   * @generated
   */
  boolean isDynamic();

  /**
   * Sets the value of the '{@link org.pdulvp.retriever.Retriever#isDynamic <em>Dynamic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic</em>' attribute.
   * @see #isDynamic()
   * @generated
   */
  void setDynamic(boolean value);

		/**
   * Returns the value of the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic Precondition Expression</em>' attribute.
   * @see #setDynamicPreconditionExpression(String)
   * @see org.pdulvp.retriever.RetrieverPackage#getRetriever_DynamicPreconditionExpression()
   * @model
   * @generated
   */
	String getDynamicPreconditionExpression();

		/**
   * Sets the value of the '{@link org.pdulvp.retriever.Retriever#getDynamicPreconditionExpression <em>Dynamic Precondition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic Precondition Expression</em>' attribute.
   * @see #getDynamicPreconditionExpression()
   * @generated
   */
	void setDynamicPreconditionExpression(String value);

} // Retriever
