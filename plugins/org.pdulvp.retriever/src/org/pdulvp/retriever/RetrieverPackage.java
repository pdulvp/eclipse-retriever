/**
 */
package org.pdulvp.retriever;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pdulvp.retriever.RetrieverFactory
 * @model kind="package"
 * @generated
 */
public interface RetrieverPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "retriever";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org.pdulvp/retriever";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "retriever";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  RetrieverPackage eINSTANCE = org.pdulvp.retriever.impl.RetrieverPackageImpl.init();// org.pdulvp.retriever.impl.RetrieverPackageImpl.init();

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.RetrieverContainerImpl <em>Container</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.impl.RetrieverContainerImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getRetrieverContainer()
   * @generated
   */
  int RETRIEVER_CONTAINER = 1;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.RetrieverPkgImpl <em>Pkg</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.impl.RetrieverPkgImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getRetrieverPkg()
   * @generated
   */
  int RETRIEVER_PKG = 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.RetrieverImpl <em>Retriever</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.impl.RetrieverImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getRetriever()
   * @generated
   */
  int RETRIEVER = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER__ID = 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.URLRetrieverImpl <em>URL Retriever</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.impl.URLRetrieverImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getURLRetriever()
   * @generated
   */
  int URL_RETRIEVER = 3;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.ElementRetrieverImpl <em>Element Retriever</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.ElementRetrieverImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getElementRetriever()
   * @generated
   */
  int ELEMENT_RETRIEVER = 5;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.AttributeRetrieverImpl <em>Attribute Retriever</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.AttributeRetrieverImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getAttributeRetriever()
   * @generated
   */
  int ATTRIBUTE_RETRIEVER = 6;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.ReferencedRetrieverImpl <em>Referenced Retriever</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.ReferencedRetrieverImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getReferencedRetriever()
   * @generated
   */
  int REFERENCED_RETRIEVER = 9;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.TransformationServiceImpl <em>Transformation Service</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.TransformationServiceImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getTransformationService()
   * @generated
   */
  int TRANSFORMATION_SERVICE = 8;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.CreateEObjectImpl <em>Create EObject</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.impl.CreateEObjectImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getCreateEObject()
   * @generated
   */
  int CREATE_EOBJECT = 11;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.CreateEReferenceImpl <em>Create EReference</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.CreateEReferenceImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getCreateEReference()
   * @generated
   */
  int CREATE_EREFERENCE = 12;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.CreateEAttributeImpl <em>Create EAttribute</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.CreateEAttributeImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getCreateEAttribute()
   * @generated
   */
  int CREATE_EATTRIBUTE = 13;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.TransformationRetrieverImpl <em>Transformation Retriever</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.TransformationRetrieverImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getTransformationRetriever()
   * @generated
   */
  int TRANSFORMATION_RETRIEVER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER__DYNAMIC = 3;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION = 4;

		/**
   * The number of structural features of the '<em>Retriever</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Retriever</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_CONTAINER__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_CONTAINER__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_CONTAINER__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_CONTAINER__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RETRIEVER_CONTAINER__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_CONTAINER__OWNED_ELEMENTS = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_CONTAINER__OWNED_SERVICES = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_CONTAINER_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Container</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_CONTAINER_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_PKG__ID = RETRIEVER_CONTAINER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_PKG__NAME = RETRIEVER_CONTAINER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_PKG__DESCRIPTION = RETRIEVER_CONTAINER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_PKG__DYNAMIC = RETRIEVER_CONTAINER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RETRIEVER_PKG__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER_CONTAINER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_PKG__OWNED_ELEMENTS = RETRIEVER_CONTAINER__OWNED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_PKG__OWNED_SERVICES = RETRIEVER_CONTAINER__OWNED_SERVICES;

  /**
   * The number of structural features of the '<em>Pkg</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_PKG_FEATURE_COUNT = RETRIEVER_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Pkg</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETRIEVER_PKG_OPERATION_COUNT = RETRIEVER_CONTAINER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int URL_RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__OWNED_ELEMENTS = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__OWNED_SERVICES = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__VARIABLE = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Variable Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__VARIABLE_RESULT = RETRIEVER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__OWNED_VARIABLES = RETRIEVER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Uri Expression</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__URI_EXPRESSION = RETRIEVER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Cache Control</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__CACHE_CONTROL = RETRIEVER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>As Semantic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER__AS_SEMANTIC = RETRIEVER_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>URL Retriever</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int URL_RETRIEVER_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 8;

  /**
   * The number of operations of the '<em>URL Retriever</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_RETRIEVER_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.URIVariableImpl <em>URI Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.URIVariableImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getURIVariable()
   * @generated
   */
  int URI_VARIABLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>URI Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>URI Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_VARIABLE_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ELEMENT_RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__OWNED_ELEMENTS = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__OWNED_SERVICES = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__VARIABLE = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Variable Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__VARIABLE_RESULT = RETRIEVER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Retriever Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER__RETRIEVER_EXPRESSION = RETRIEVER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Element Retriever</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Element Retriever</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RETRIEVER_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE_RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Value Expression</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER__VALUE_EXPRESSION = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER__ALTERNATIVE = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER__SERVICE = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute Retriever</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Attribute Retriever</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RETRIEVER_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TRANSFORMATION_RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__OWNED_SERVICES = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__SERVICE = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__INPUT = RETRIEVER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER__VARIABLE = RETRIEVER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Transformation Retriever</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Transformation Retriever</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_RETRIEVER_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_SERVICE__CLASSNAME = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_SERVICE__METHOD = 1;

  /**
   * The number of structural features of the '<em>Transformation Service</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_SERVICE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Transformation Service</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int TRANSFORMATION_SERVICE_OPERATION_COUNT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_RETRIEVER__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_RETRIEVER__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_RETRIEVER__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_RETRIEVER__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REFERENCED_RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Referenced Element</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int REFERENCED_RETRIEVER__REFERENCED_ELEMENT = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Referenced Retriever</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_RETRIEVER_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Referenced Retriever</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int REFERENCED_RETRIEVER_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.CreateNotifierImpl <em>Create Notifier</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.CreateNotifierImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getCreateNotifier()
   * @generated
   */
  int CREATE_NOTIFIER = 14;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CREATE_NOTIFIER__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER__OWNED_ELEMENTS = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER__OWNED_SERVICES = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER__VARIABLE = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Create Notifier</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Create Notifier</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_NOTIFIER_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.LoadResourceImpl <em>Load Resource</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.impl.LoadResourceImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getLoadResource()
   * @generated
   */
  int LOAD_RESOURCE = 15;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.SetVariableImpl <em>Set Variable</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.impl.SetVariableImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getSetVariable()
   * @generated
   */
  int SET_VARIABLE = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE__ID = CREATE_NOTIFIER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE__NAME = CREATE_NOTIFIER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE__DESCRIPTION = CREATE_NOTIFIER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE__DYNAMIC = CREATE_NOTIFIER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SET_VARIABLE__DYNAMIC_PRECONDITION_EXPRESSION = CREATE_NOTIFIER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE__OWNED_ELEMENTS = CREATE_NOTIFIER__OWNED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE__OWNED_SERVICES = CREATE_NOTIFIER__OWNED_SERVICES;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE__VARIABLE = CREATE_NOTIFIER__VARIABLE;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE__EXPRESSION = CREATE_NOTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Log</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SET_VARIABLE__LOG = CREATE_NOTIFIER_FEATURE_COUNT + 1;

		/**
   * The number of structural features of the '<em>Set Variable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int SET_VARIABLE_FEATURE_COUNT = CREATE_NOTIFIER_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Set Variable</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VARIABLE_OPERATION_COUNT = CREATE_NOTIFIER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__ID = CREATE_NOTIFIER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__NAME = CREATE_NOTIFIER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__DESCRIPTION = CREATE_NOTIFIER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__DYNAMIC = CREATE_NOTIFIER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CREATE_EOBJECT__DYNAMIC_PRECONDITION_EXPRESSION = CREATE_NOTIFIER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__OWNED_ELEMENTS = CREATE_NOTIFIER__OWNED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__OWNED_SERVICES = CREATE_NOTIFIER__OWNED_SERVICES;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__VARIABLE = CREATE_NOTIFIER__VARIABLE;

  /**
   * The feature id for the '<em><b>Container Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__CONTAINER_EXPRESSION = CREATE_NOTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__CLASS = CREATE_NOTIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Containing Feature</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT__CONTAINING_FEATURE = CREATE_NOTIFIER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Create EObject</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT_FEATURE_COUNT = CREATE_NOTIFIER_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Create EObject</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EOBJECT_OPERATION_COUNT = CREATE_NOTIFIER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CREATE_EREFERENCE__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE__FEATURE = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Expression</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE__VALUE_EXPRESSION = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Deferred</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE__DEFERRED = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Create EReference</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Create EReference</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EREFERENCE_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EATTRIBUTE__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EATTRIBUTE__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EATTRIBUTE__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EATTRIBUTE__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CREATE_EATTRIBUTE__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EATTRIBUTE__FEATURE = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Expression</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EATTRIBUTE__VALUE_EXPRESSION = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create EAttribute</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EATTRIBUTE_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Create EAttribute</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_EATTRIBUTE_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__ID = CREATE_NOTIFIER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__NAME = CREATE_NOTIFIER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__DESCRIPTION = CREATE_NOTIFIER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__DYNAMIC = CREATE_NOTIFIER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LOAD_RESOURCE__DYNAMIC_PRECONDITION_EXPRESSION = CREATE_NOTIFIER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__OWNED_ELEMENTS = CREATE_NOTIFIER__OWNED_ELEMENTS;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__OWNED_SERVICES = CREATE_NOTIFIER__OWNED_SERVICES;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__VARIABLE = CREATE_NOTIFIER__VARIABLE;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__URI = CREATE_NOTIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__CREATE = CREATE_NOTIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Clear Contents</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE__CLEAR_CONTENTS = CREATE_NOTIFIER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Load Resource</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE_FEATURE_COUNT = CREATE_NOTIFIER_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Load Resource</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_RESOURCE_OPERATION_COUNT = CREATE_NOTIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.retriever.impl.IfImpl
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getIf()
   * @generated
   */
  int IF = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__ID = RETRIEVER__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__NAME = RETRIEVER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__DESCRIPTION = RETRIEVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__DYNAMIC = RETRIEVER__DYNAMIC;

  /**
   * The feature id for the '<em><b>Dynamic Precondition Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IF__DYNAMIC_PRECONDITION_EXPRESSION = RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION;

		/**
   * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__OWNED_ELEMENTS = RETRIEVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owned Services</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__OWNED_SERVICES = RETRIEVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Condition Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int IF__CONDITION_EXPRESSION = RETRIEVER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = RETRIEVER_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>If</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_OPERATION_COUNT = RETRIEVER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.IVariableElement <em>IVariable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.retriever.IVariableElement
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getIVariableElement()
   * @generated
   */
  int IVARIABLE_ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE_ELEMENT__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>IVariable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>IVariable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.IVariableResultElement <em>IVariable Result Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pdulvp.retriever.IVariableResultElement
   * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getIVariableResultElement()
   * @generated
   */
  int IVARIABLE_RESULT_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Variable Result</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE_RESULT_ELEMENT__VARIABLE_RESULT = 0;

  /**
   * The number of structural features of the '<em>IVariable Result Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE_RESULT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>IVariable Result Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVARIABLE_RESULT_ELEMENT_OPERATION_COUNT = 0;

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.Retriever <em>Retriever</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Retriever</em>'.
   * @see org.pdulvp.retriever.Retriever
   * @generated
   */
  EClass getRetriever();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.Retriever#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.pdulvp.retriever.Retriever#getId()
   * @see #getRetriever()
   * @generated
   */
  EAttribute getRetriever_Id();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.Retriever#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pdulvp.retriever.Retriever#getName()
   * @see #getRetriever()
   * @generated
   */
  EAttribute getRetriever_Name();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.Retriever#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.pdulvp.retriever.Retriever#getDescription()
   * @see #getRetriever()
   * @generated
   */
  EAttribute getRetriever_Description();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.Retriever#isDynamic <em>Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dynamic</em>'.
   * @see org.pdulvp.retriever.Retriever#isDynamic()
   * @see #getRetriever()
   * @generated
   */
  EAttribute getRetriever_Dynamic();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.Retriever#getDynamicPreconditionExpression <em>Dynamic Precondition Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dynamic Precondition Expression</em>'.
   * @see org.pdulvp.retriever.Retriever#getDynamicPreconditionExpression()
   * @see #getRetriever()
   * @generated
   */
	EAttribute getRetriever_DynamicPreconditionExpression();

		/**
   * Returns the meta object for class '{@link org.pdulvp.retriever.URLRetriever <em>URL Retriever</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>URL Retriever</em>'.
   * @see org.pdulvp.retriever.URLRetriever
   * @generated
   */
  EClass getURLRetriever();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.retriever.URLRetriever#getOwnedVariables <em>Owned Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
   * @see org.pdulvp.retriever.URLRetriever#getOwnedVariables()
   * @see #getURLRetriever()
   * @generated
   */
  EReference getURLRetriever_OwnedVariables();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.URLRetriever#getUriExpression <em>Uri Expression</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri Expression</em>'.
   * @see org.pdulvp.retriever.URLRetriever#getUriExpression()
   * @see #getURLRetriever()
   * @generated
   */
  EAttribute getURLRetriever_UriExpression();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.URLRetriever#getCacheControl <em>Cache Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cache Control</em>'.
   * @see org.pdulvp.retriever.URLRetriever#getCacheControl()
   * @see #getURLRetriever()
   * @generated
   */
  EAttribute getURLRetriever_CacheControl();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.URLRetriever#isAsSemantic <em>As Semantic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>As Semantic</em>'.
   * @see org.pdulvp.retriever.URLRetriever#isAsSemantic()
   * @see #getURLRetriever()
   * @generated
   */
  EAttribute getURLRetriever_AsSemantic();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.URIVariable <em>URI Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI Variable</em>'.
   * @see org.pdulvp.retriever.URIVariable
   * @generated
   */
  EClass getURIVariable();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.URIVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pdulvp.retriever.URIVariable#getName()
   * @see #getURIVariable()
   * @generated
   */
  EAttribute getURIVariable_Name();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.ElementRetriever <em>Element Retriever</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Element Retriever</em>'.
   * @see org.pdulvp.retriever.ElementRetriever
   * @generated
   */
  EClass getElementRetriever();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.ElementRetriever#getRetrieverExpression <em>Retriever Expression</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Retriever Expression</em>'.
   * @see org.pdulvp.retriever.ElementRetriever#getRetrieverExpression()
   * @see #getElementRetriever()
   * @generated
   */
  EAttribute getElementRetriever_RetrieverExpression();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.AttributeRetriever <em>Attribute Retriever</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Retriever</em>'.
   * @see org.pdulvp.retriever.AttributeRetriever
   * @generated
   */
  EClass getAttributeRetriever();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.AttributeRetriever#getValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Expression</em>'.
   * @see org.pdulvp.retriever.AttributeRetriever#getValueExpression()
   * @see #getAttributeRetriever()
   * @generated
   */
  EAttribute getAttributeRetriever_ValueExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.pdulvp.retriever.AttributeRetriever#getAlternative <em>Alternative</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alternative</em>'.
   * @see org.pdulvp.retriever.AttributeRetriever#getAlternative()
   * @see #getAttributeRetriever()
   * @generated
   */
  EReference getAttributeRetriever_Alternative();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.AttributeRetriever#getService <em>Service</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service</em>'.
   * @see org.pdulvp.retriever.AttributeRetriever#getService()
   * @see #getAttributeRetriever()
   * @generated
   */
  EReference getAttributeRetriever_Service();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.TransformationRetriever <em>Transformation Retriever</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation Retriever</em>'.
   * @see org.pdulvp.retriever.TransformationRetriever
   * @generated
   */
  EClass getTransformationRetriever();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.TransformationRetriever#getService <em>Service</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service</em>'.
   * @see org.pdulvp.retriever.TransformationRetriever#getService()
   * @see #getTransformationRetriever()
   * @generated
   */
  EReference getTransformationRetriever_Service();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.TransformationRetriever#getInput <em>Input</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see org.pdulvp.retriever.TransformationRetriever#getInput()
   * @see #getTransformationRetriever()
   * @generated
   */
  EAttribute getTransformationRetriever_Input();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.TransformationRetriever#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.pdulvp.retriever.TransformationRetriever#getVariable()
   * @see #getTransformationRetriever()
   * @generated
   */
  EAttribute getTransformationRetriever_Variable();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.RetrieverContainer <em>Container</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Container</em>'.
   * @see org.pdulvp.retriever.RetrieverContainer
   * @generated
   */
  EClass getRetrieverContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.retriever.RetrieverContainer#getOwnedElements <em>Owned Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
   * @see org.pdulvp.retriever.RetrieverContainer#getOwnedElements()
   * @see #getRetrieverContainer()
   * @generated
   */
  EReference getRetrieverContainer_OwnedElements();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.retriever.RetrieverContainer#getOwnedServices <em>Owned Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Services</em>'.
   * @see org.pdulvp.retriever.RetrieverContainer#getOwnedServices()
   * @see #getRetrieverContainer()
   * @generated
   */
  EReference getRetrieverContainer_OwnedServices();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.RetrieverPkg <em>Pkg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pkg</em>'.
   * @see org.pdulvp.retriever.RetrieverPkg
   * @generated
   */
  EClass getRetrieverPkg();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.ReferencedRetriever <em>Referenced Retriever</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Retriever</em>'.
   * @see org.pdulvp.retriever.ReferencedRetriever
   * @generated
   */
  EClass getReferencedRetriever();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.ReferencedRetriever#getReferencedElement <em>Referenced Element</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced Element</em>'.
   * @see org.pdulvp.retriever.ReferencedRetriever#getReferencedElement()
   * @see #getReferencedRetriever()
   * @generated
   */
  EReference getReferencedRetriever_ReferencedElement();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.TransformationService <em>Transformation Service</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation Service</em>'.
   * @see org.pdulvp.retriever.TransformationService
   * @generated
   */
  EClass getTransformationService();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.TransformationService#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see org.pdulvp.retriever.TransformationService#getClassname()
   * @see #getTransformationService()
   * @generated
   */
  EAttribute getTransformationService_Classname();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.TransformationService#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.pdulvp.retriever.TransformationService#getMethod()
   * @see #getTransformationService()
   * @generated
   */
  EAttribute getTransformationService_Method();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.CreateEObject <em>Create EObject</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Create EObject</em>'.
   * @see org.pdulvp.retriever.CreateEObject
   * @generated
   */
  EClass getCreateEObject();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.CreateEObject#getContainerExpression <em>Container Expression</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container Expression</em>'.
   * @see org.pdulvp.retriever.CreateEObject#getContainerExpression()
   * @see #getCreateEObject()
   * @generated
   */
  EAttribute getCreateEObject_ContainerExpression();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.CreateEObject#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class</em>'.
   * @see org.pdulvp.retriever.CreateEObject#getClass_()
   * @see #getCreateEObject()
   * @generated
   */
  EReference getCreateEObject_Class();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.CreateEObject#getContainingFeature <em>Containing Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Containing Feature</em>'.
   * @see org.pdulvp.retriever.CreateEObject#getContainingFeature()
   * @see #getCreateEObject()
   * @generated
   */
  EReference getCreateEObject_ContainingFeature();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.CreateEReference <em>Create EReference</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Create EReference</em>'.
   * @see org.pdulvp.retriever.CreateEReference
   * @generated
   */
  EClass getCreateEReference();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.CreateEReference#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.pdulvp.retriever.CreateEReference#getFeature()
   * @see #getCreateEReference()
   * @generated
   */
  EReference getCreateEReference_Feature();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.CreateEReference#getValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Expression</em>'.
   * @see org.pdulvp.retriever.CreateEReference#getValueExpression()
   * @see #getCreateEReference()
   * @generated
   */
  EAttribute getCreateEReference_ValueExpression();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.CreateEReference#isDeferred <em>Deferred</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deferred</em>'.
   * @see org.pdulvp.retriever.CreateEReference#isDeferred()
   * @see #getCreateEReference()
   * @generated
   */
  EAttribute getCreateEReference_Deferred();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.CreateEAttribute <em>Create EAttribute</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Create EAttribute</em>'.
   * @see org.pdulvp.retriever.CreateEAttribute
   * @generated
   */
  EClass getCreateEAttribute();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.CreateEAttribute#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.pdulvp.retriever.CreateEAttribute#getFeature()
   * @see #getCreateEAttribute()
   * @generated
   */
  EReference getCreateEAttribute_Feature();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.CreateEAttribute#getValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Expression</em>'.
   * @see org.pdulvp.retriever.CreateEAttribute#getValueExpression()
   * @see #getCreateEAttribute()
   * @generated
   */
  EAttribute getCreateEAttribute_ValueExpression();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.LoadResource <em>Load Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Load Resource</em>'.
   * @see org.pdulvp.retriever.LoadResource
   * @generated
   */
  EClass getLoadResource();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.LoadResource#getUri <em>Uri</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.pdulvp.retriever.LoadResource#getUri()
   * @see #getLoadResource()
   * @generated
   */
  EAttribute getLoadResource_Uri();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.LoadResource#isCreate <em>Create</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Create</em>'.
   * @see org.pdulvp.retriever.LoadResource#isCreate()
   * @see #getLoadResource()
   * @generated
   */
  EAttribute getLoadResource_Create();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.LoadResource#isClearContents <em>Clear Contents</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clear Contents</em>'.
   * @see org.pdulvp.retriever.LoadResource#isClearContents()
   * @see #getLoadResource()
   * @generated
   */
  EAttribute getLoadResource_ClearContents();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.SetVariable <em>Set Variable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Set Variable</em>'.
   * @see org.pdulvp.retriever.SetVariable
   * @generated
   */
  EClass getSetVariable();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.SetVariable#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.pdulvp.retriever.SetVariable#getExpression()
   * @see #getSetVariable()
   * @generated
   */
  EAttribute getSetVariable_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.SetVariable#isLog <em>Log</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Log</em>'.
   * @see org.pdulvp.retriever.SetVariable#isLog()
   * @see #getSetVariable()
   * @generated
   */
	EAttribute getSetVariable_Log();

		/**
   * Returns the meta object for class '{@link org.pdulvp.retriever.CreateNotifier <em>Create Notifier</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Create Notifier</em>'.
   * @see org.pdulvp.retriever.CreateNotifier
   * @generated
   */
  EClass getCreateNotifier();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.If <em>If</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.pdulvp.retriever.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.If#getConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition Expression</em>'.
   * @see org.pdulvp.retriever.If#getConditionExpression()
   * @see #getIf()
   * @generated
   */
  EAttribute getIf_ConditionExpression();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.IVariableElement <em>IVariable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IVariable Element</em>'.
   * @see org.pdulvp.retriever.IVariableElement
   * @generated
   */
  EClass getIVariableElement();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.IVariableElement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.pdulvp.retriever.IVariableElement#getVariable()
   * @see #getIVariableElement()
   * @generated
   */
  EAttribute getIVariableElement_Variable();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.IVariableResultElement <em>IVariable Result Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IVariable Result Element</em>'.
   * @see org.pdulvp.retriever.IVariableResultElement
   * @generated
   */
  EClass getIVariableResultElement();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.IVariableResultElement#getVariableResult <em>Variable Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Result</em>'.
   * @see org.pdulvp.retriever.IVariableResultElement#getVariableResult()
   * @see #getIVariableResultElement()
   * @generated
   */
  EAttribute getIVariableResultElement_VariableResult();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RetrieverFactory getRetrieverFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each operation of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.RetrieverImpl <em>Retriever</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.pdulvp.retriever.impl.RetrieverImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getRetriever()
     * @generated
     */
    EClass RETRIEVER = eINSTANCE.getRetriever();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETRIEVER__ID = eINSTANCE.getRetriever_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RETRIEVER__NAME = eINSTANCE.getRetriever_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RETRIEVER__DESCRIPTION = eINSTANCE.getRetriever_Description();

    /**
     * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETRIEVER__DYNAMIC = eINSTANCE.getRetriever_Dynamic();

    /**
     * The meta object literal for the '<em><b>Dynamic Precondition Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION = eINSTANCE.getRetriever_DynamicPreconditionExpression();

				/**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.URLRetrieverImpl <em>URL Retriever</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.URLRetrieverImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getURLRetriever()
     * @generated
     */
    EClass URL_RETRIEVER = eINSTANCE.getURLRetriever();

    /**
     * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL_RETRIEVER__OWNED_VARIABLES = eINSTANCE.getURLRetriever_OwnedVariables();

    /**
     * The meta object literal for the '<em><b>Uri Expression</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute URL_RETRIEVER__URI_EXPRESSION = eINSTANCE.getURLRetriever_UriExpression();

    /**
     * The meta object literal for the '<em><b>Cache Control</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_RETRIEVER__CACHE_CONTROL = eINSTANCE.getURLRetriever_CacheControl();

    /**
     * The meta object literal for the '<em><b>As Semantic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_RETRIEVER__AS_SEMANTIC = eINSTANCE.getURLRetriever_AsSemantic();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.URIVariableImpl <em>URI Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.URIVariableImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getURIVariable()
     * @generated
     */
    EClass URI_VARIABLE = eINSTANCE.getURIVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI_VARIABLE__NAME = eINSTANCE.getURIVariable_Name();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.ElementRetrieverImpl <em>Element Retriever</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.ElementRetrieverImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getElementRetriever()
     * @generated
     */
    EClass ELEMENT_RETRIEVER = eINSTANCE.getElementRetriever();

    /**
     * The meta object literal for the '<em><b>Retriever Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_RETRIEVER__RETRIEVER_EXPRESSION = eINSTANCE.getElementRetriever_RetrieverExpression();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.AttributeRetrieverImpl <em>Attribute Retriever</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.AttributeRetrieverImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getAttributeRetriever()
     * @generated
     */
    EClass ATTRIBUTE_RETRIEVER = eINSTANCE.getAttributeRetriever();

    /**
     * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_RETRIEVER__VALUE_EXPRESSION = eINSTANCE.getAttributeRetriever_ValueExpression();

    /**
     * The meta object literal for the '<em><b>Alternative</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_RETRIEVER__ALTERNATIVE = eINSTANCE.getAttributeRetriever_Alternative();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_RETRIEVER__SERVICE = eINSTANCE.getAttributeRetriever_Service();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.TransformationRetrieverImpl <em>Transformation Retriever</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.TransformationRetrieverImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getTransformationRetriever()
     * @generated
     */
    EClass TRANSFORMATION_RETRIEVER = eINSTANCE.getTransformationRetriever();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION_RETRIEVER__SERVICE = eINSTANCE.getTransformationRetriever_Service();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TRANSFORMATION_RETRIEVER__INPUT = eINSTANCE.getTransformationRetriever_Input();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TRANSFORMATION_RETRIEVER__VARIABLE = eINSTANCE.getTransformationRetriever_Variable();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.RetrieverContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.RetrieverContainerImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getRetrieverContainer()
     * @generated
     */
    EClass RETRIEVER_CONTAINER = eINSTANCE.getRetrieverContainer();

    /**
     * The meta object literal for the '<em><b>Owned Elements</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RETRIEVER_CONTAINER__OWNED_ELEMENTS = eINSTANCE.getRetrieverContainer_OwnedElements();

    /**
     * The meta object literal for the '<em><b>Owned Services</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RETRIEVER_CONTAINER__OWNED_SERVICES = eINSTANCE.getRetrieverContainer_OwnedServices();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.RetrieverPkgImpl <em>Pkg</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.pdulvp.retriever.impl.RetrieverPkgImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getRetrieverPkg()
     * @generated
     */
    EClass RETRIEVER_PKG = eINSTANCE.getRetrieverPkg();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.ReferencedRetrieverImpl <em>Referenced Retriever</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.ReferencedRetrieverImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getReferencedRetriever()
     * @generated
     */
    EClass REFERENCED_RETRIEVER = eINSTANCE.getReferencedRetriever();

    /**
     * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCED_RETRIEVER__REFERENCED_ELEMENT = eINSTANCE.getReferencedRetriever_ReferencedElement();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.TransformationServiceImpl <em>Transformation Service</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.TransformationServiceImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getTransformationService()
     * @generated
     */
    EClass TRANSFORMATION_SERVICE = eINSTANCE.getTransformationService();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TRANSFORMATION_SERVICE__CLASSNAME = eINSTANCE.getTransformationService_Classname();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TRANSFORMATION_SERVICE__METHOD = eINSTANCE.getTransformationService_Method();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.CreateEObjectImpl <em>Create EObject</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.CreateEObjectImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getCreateEObject()
     * @generated
     */
    EClass CREATE_EOBJECT = eINSTANCE.getCreateEObject();

    /**
     * The meta object literal for the '<em><b>Container Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EOBJECT__CONTAINER_EXPRESSION = eINSTANCE.getCreateEObject_ContainerExpression();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_EOBJECT__CLASS = eINSTANCE.getCreateEObject_Class();

    /**
     * The meta object literal for the '<em><b>Containing Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_EOBJECT__CONTAINING_FEATURE = eINSTANCE.getCreateEObject_ContainingFeature();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.CreateEReferenceImpl <em>Create EReference</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.CreateEReferenceImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getCreateEReference()
     * @generated
     */
    EClass CREATE_EREFERENCE = eINSTANCE.getCreateEReference();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference CREATE_EREFERENCE__FEATURE = eINSTANCE.getCreateEReference_Feature();

    /**
     * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EREFERENCE__VALUE_EXPRESSION = eINSTANCE.getCreateEReference_ValueExpression();

    /**
     * The meta object literal for the '<em><b>Deferred</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EREFERENCE__DEFERRED = eINSTANCE.getCreateEReference_Deferred();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.CreateEAttributeImpl <em>Create EAttribute</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.CreateEAttributeImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getCreateEAttribute()
     * @generated
     */
    EClass CREATE_EATTRIBUTE = eINSTANCE.getCreateEAttribute();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference CREATE_EATTRIBUTE__FEATURE = eINSTANCE.getCreateEAttribute_Feature();

    /**
     * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_EATTRIBUTE__VALUE_EXPRESSION = eINSTANCE.getCreateEAttribute_ValueExpression();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.LoadResourceImpl <em>Load Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.LoadResourceImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getLoadResource()
     * @generated
     */
    EClass LOAD_RESOURCE = eINSTANCE.getLoadResource();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RESOURCE__URI = eINSTANCE.getLoadResource_Uri();

    /**
     * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RESOURCE__CREATE = eINSTANCE.getLoadResource_Create();

    /**
     * The meta object literal for the '<em><b>Clear Contents</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LOAD_RESOURCE__CLEAR_CONTENTS = eINSTANCE.getLoadResource_ClearContents();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.SetVariableImpl <em>Set Variable</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.SetVariableImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getSetVariable()
     * @generated
     */
    EClass SET_VARIABLE = eINSTANCE.getSetVariable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SET_VARIABLE__EXPRESSION = eINSTANCE.getSetVariable_Expression();

    /**
     * The meta object literal for the '<em><b>Log</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute SET_VARIABLE__LOG = eINSTANCE.getSetVariable_Log();

				/**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.CreateNotifierImpl <em>Create Notifier</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.CreateNotifierImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getCreateNotifier()
     * @generated
     */
    EClass CREATE_NOTIFIER = eINSTANCE.getCreateNotifier();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.impl.IfImpl
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Condition Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF__CONDITION_EXPRESSION = eINSTANCE.getIf_ConditionExpression();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.IVariableElement <em>IVariable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.retriever.IVariableElement
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getIVariableElement()
     * @generated
     */
    EClass IVARIABLE_ELEMENT = eINSTANCE.getIVariableElement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IVARIABLE_ELEMENT__VARIABLE = eINSTANCE.getIVariableElement_Variable();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.IVariableResultElement <em>IVariable Result Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pdulvp.retriever.IVariableResultElement
     * @see org.pdulvp.retriever.impl.RetrieverPackageImpl#getIVariableResultElement()
     * @generated
     */
    EClass IVARIABLE_RESULT_ELEMENT = eINSTANCE.getIVariableResultElement();

    /**
     * The meta object literal for the '<em><b>Variable Result</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IVARIABLE_RESULT_ELEMENT__VARIABLE_RESULT = eINSTANCE.getIVariableResultElement_VariableResult();

  }

} // RetrieverPackage
