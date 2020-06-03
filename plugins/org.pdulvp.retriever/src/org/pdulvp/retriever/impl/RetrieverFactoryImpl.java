/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pdulvp.retriever.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RetrieverFactoryImpl extends EFactoryImpl implements RetrieverFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static RetrieverFactory init() {
    try {
      RetrieverFactory theRetrieverFactory = (RetrieverFactory)EPackage.Registry.INSTANCE.getEFactory(RetrieverPackage.eNS_URI);
      if (theRetrieverFactory != null) {
        return theRetrieverFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RetrieverFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RetrieverFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case RetrieverPackage.RETRIEVER_PKG: return createRetrieverPkg();
      case RetrieverPackage.URL_RETRIEVER: return createURLRetriever();
      case RetrieverPackage.ELEMENT_RETRIEVER: return createElementRetriever();
      case RetrieverPackage.ATTRIBUTE_RETRIEVER: return createAttributeRetriever();
      case RetrieverPackage.TRANSFORMATION_RETRIEVER: return createTransformationRetriever();
      case RetrieverPackage.TRANSFORMATION_SERVICE: return createTransformationService();
      case RetrieverPackage.REFERENCED_RETRIEVER: return createReferencedRetriever();
      case RetrieverPackage.SET_VARIABLE: return createSetVariable();
      case RetrieverPackage.CREATE_EOBJECT: return createCreateEObject();
      case RetrieverPackage.CREATE_EREFERENCE: return createCreateEReference();
      case RetrieverPackage.CREATE_EATTRIBUTE: return createCreateEAttribute();
      case RetrieverPackage.LOAD_RESOURCE: return createLoadResource();
      case RetrieverPackage.IF: return createIf();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public URLRetriever createURLRetriever() {
    URLRetrieverImpl urlRetriever = new URLRetrieverImpl();
    return urlRetriever;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ElementRetriever createElementRetriever() {
    ElementRetrieverImpl elementRetriever = new ElementRetrieverImpl();
    return elementRetriever;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public AttributeRetriever createAttributeRetriever() {
    AttributeRetrieverImpl attributeRetriever = new AttributeRetrieverImpl();
    return attributeRetriever;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public TransformationRetriever createTransformationRetriever() {
    TransformationRetrieverImpl transformationRetriever = new TransformationRetrieverImpl();
    return transformationRetriever;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public RetrieverPkg createRetrieverPkg() {
    RetrieverPkgImpl retrieverPkg = new RetrieverPkgImpl();
    return retrieverPkg;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ReferencedRetriever createReferencedRetriever() {
    ReferencedRetrieverImpl referencedRetriever = new ReferencedRetrieverImpl();
    return referencedRetriever;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public TransformationService createTransformationService() {
    TransformationServiceImpl transformationService = new TransformationServiceImpl();
    return transformationService;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public CreateEObject createCreateEObject() {
    CreateEObjectImpl createEObject = new CreateEObjectImpl();
    return createEObject;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public CreateEReference createCreateEReference() {
    CreateEReferenceImpl createEReference = new CreateEReferenceImpl();
    return createEReference;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public CreateEAttribute createCreateEAttribute() {
    CreateEAttributeImpl createEAttribute = new CreateEAttributeImpl();
    return createEAttribute;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public LoadResource createLoadResource() {
    LoadResourceImpl loadResource = new LoadResourceImpl();
    return loadResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public SetVariable createSetVariable() {
    SetVariableImpl setVariable = new SetVariableImpl();
    return setVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public If createIf() {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public RetrieverPackage getRetrieverPackage() {
    return (RetrieverPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static RetrieverPackage getPackage() {
    return RetrieverPackage.eINSTANCE;
  }

} //RetrieverFactoryImpl
