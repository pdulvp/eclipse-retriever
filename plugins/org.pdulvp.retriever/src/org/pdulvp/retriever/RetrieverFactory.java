/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.pdulvp.retriever.RetrieverPackage
 * @generated
 */
public interface RetrieverFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	RetrieverFactory eINSTANCE = org.pdulvp.retriever.impl.RetrieverFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
	RetrieverRoot createRetrieverRoot();

	/**
   * Returns a new object of class '<em>URL Retriever</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>URL Retriever</em>'.
   * @generated
   */
	URLRetriever createURLRetriever();

	/**
   * Returns a new object of class '<em>Element Retriever</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Retriever</em>'.
   * @generated
   */
	ElementRetriever createElementRetriever();

	/**
   * Returns a new object of class '<em>Attribute Retriever</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Retriever</em>'.
   * @generated
   */
	AttributeRetriever createAttributeRetriever();

	/**
   * Returns a new object of class '<em>URI Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URI Variable</em>'.
   * @generated
   */
  URIVariable createURIVariable();

  /**
   * Returns a new object of class '<em>Transformation Retriever</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation Retriever</em>'.
   * @generated
   */
  TransformationRetriever createTransformationRetriever();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
	RetrieverContainer createRetrieverContainer();

	/**
   * Returns a new object of class '<em>Pkg</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Pkg</em>'.
   * @generated
   */
	RetrieverPkg createRetrieverPkg();

	/**
   * Returns a new object of class '<em>Referenced Retriever</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Referenced Retriever</em>'.
   * @generated
   */
	ReferencedRetriever createReferencedRetriever();

	/**
   * Returns a new object of class '<em>Transformation Service</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation Service</em>'.
   * @generated
   */
	TransformationService createTransformationService();

	/**
   * Returns a new object of class '<em>Create EObject</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Create EObject</em>'.
   * @generated
   */
	CreateEObject createCreateEObject();

	/**
   * Returns a new object of class '<em>Create Direct EObject</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Direct EObject</em>'.
   * @generated
   */
  CreateDirectEObject createCreateDirectEObject();

  /**
   * Returns a new object of class '<em>Create EReference</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Create EReference</em>'.
   * @generated
   */
	CreateEReference createCreateEReference();

	/**
   * Returns a new object of class '<em>Create EAttribute</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Create EAttribute</em>'.
   * @generated
   */
	CreateEAttribute createCreateEAttribute();

	/**
   * Returns a new object of class '<em>Load Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Resource</em>'.
   * @generated
   */
  LoadResource createLoadResource();

  /**
   * Returns a new object of class '<em>Set Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Variable</em>'.
   * @generated
   */
  SetVariable createSetVariable();

  /**
   * Returns a new object of class '<em>Create File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create File</em>'.
   * @generated
   */
  CreateFile createCreateFile();

  /**
   * Returns a new object of class '<em>If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If</em>'.
   * @generated
   */
  If createIf();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	RetrieverPackage getRetrieverPackage();

} //RetrieverFactory
