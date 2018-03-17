/**
 */
package org.pdulvp.retriever.result;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pdulvp.retriever.result.ResultPackage
 * @generated
 */
public interface ResultFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	ResultFactory eINSTANCE = org.pdulvp.retriever.result.impl.ResultFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
	ResultRoot createResultRoot();

	/**
   * Returns a new object of class '<em>Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Result</em>'.
   * @generated
   */
	Result createResult();

	/**
   * Returns a new object of class '<em>URI Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>URI Result</em>'.
   * @generated
   */
	URIResult createURIResult();

	/**
   * Returns a new object of class '<em>Element Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Result</em>'.
   * @generated
   */
	ElementResult createElementResult();

	/**
   * Returns a new object of class '<em>Attribute Result</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Result</em>'.
   * @generated
   */
	AttributeResult createAttributeResult();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	ResultPackage getResultPackage();

} //ResultFactory
