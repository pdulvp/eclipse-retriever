/**
 */
package org.pdulvp.retriever.result;

import org.pdulvp.retriever.AttributeRetriever;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.result.AttributeResult#getElement <em>Element</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.AttributeResult#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.AttributeResult#getValue <em>Value</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.AttributeResult#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.pdulvp.retriever.result.ResultPackage#getAttributeResult()
 * @model
 * @generated
 */
public interface AttributeResult extends Result {
	/**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(Object)
   * @see org.pdulvp.retriever.result.ResultPackage#getAttributeResult_Element()
   * @model transient="true"
   * @generated
   */
	Object getElement();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.AttributeResult#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
	void setElement(Object value);

	/**
   * Returns the value of the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' reference.
   * @see #setDefinition(AttributeRetriever)
   * @see org.pdulvp.retriever.result.ResultPackage#getAttributeResult_Definition()
   * @model
   * @generated
   */
	AttributeRetriever getDefinition();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.AttributeResult#getDefinition <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' reference.
   * @see #getDefinition()
   * @generated
   */
	void setDefinition(AttributeRetriever value);

	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.pdulvp.retriever.result.ResultPackage#getAttributeResult_Value()
   * @model
   * @generated
   */
	String getValue();

	/**
   * Sets the value of the '{@link org.pdulvp.retriever.result.AttributeResult#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
	void setValue(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.pdulvp.retriever.result.ResultPackage#getAttributeResult_Name()
   * @model default="" changeable="false" derived="true"
   * @generated
   */
  String getName();

} // AttributeResult
