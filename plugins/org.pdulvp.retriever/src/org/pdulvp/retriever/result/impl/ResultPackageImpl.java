/**
 */
package org.pdulvp.retriever.result.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.impl.RetrieverPackageImpl;
import org.pdulvp.retriever.result.AttributeResult;
import org.pdulvp.retriever.result.ElementResult;
import org.pdulvp.retriever.result.Result;
import org.pdulvp.retriever.result.ResultFactory;
import org.pdulvp.retriever.result.ResultPackage;
import org.pdulvp.retriever.result.ResultRoot;
import org.pdulvp.retriever.result.URIResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultPackageImpl extends EPackageImpl implements ResultPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uriResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeResultEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.pdulvp.retriever.result.ResultPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ResultPackageImpl() {
    super(eNS_URI, ResultFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link ResultPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ResultPackage init() {
    if (isInited) return (ResultPackage)EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredResultPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ResultPackageImpl theResultPackage = registeredResultPackage instanceof ResultPackageImpl ? (ResultPackageImpl)registeredResultPackage : new ResultPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RetrieverPackage.eNS_URI);
    RetrieverPackageImpl theRetrieverPackage = (RetrieverPackageImpl)(registeredPackage instanceof RetrieverPackageImpl ? registeredPackage : RetrieverPackage.eINSTANCE);

    // Create package meta-data objects
    theResultPackage.createPackageContents();
    theRetrieverPackage.createPackageContents();

    // Initialize created meta-data
    theResultPackage.initializePackageContents();
    theRetrieverPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theResultPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ResultPackage.eNS_URI, theResultPackage);
    return theResultPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getResultRoot() {
    return resultRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getResult() {
    return resultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getResult_Id() {
    return (EAttribute)resultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getResult_OwnedResults() {
    return (EReference)resultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EReference getResult_OrderedResults() {
    return (EReference)resultEClass.getEStructuralFeatures().get(2);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getURIResult() {
    return uriResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getURIResult_Definition() {
    return (EReference)uriResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getURIResult_Uri() {
    return (EAttribute)uriResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getURIResult_Element() {
    return (EAttribute)uriResultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getURIResult_ExternalUri() {
    return (EAttribute)uriResultEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getElementResult() {
    return elementResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getElementResult_Definition() {
    return (EReference)elementResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getElementResult_Element() {
    return (EAttribute)elementResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getAttributeResult() {
    return attributeResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getAttributeResult_Element() {
    return (EAttribute)attributeResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getAttributeResult_Definition() {
    return (EReference)attributeResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getAttributeResult_Value() {
    return (EAttribute)attributeResultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getAttributeResult_Name() {
    return (EAttribute)attributeResultEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public ResultFactory getResultFactory() {
    return (ResultFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    resultRootEClass = createEClass(RESULT_ROOT);

    resultEClass = createEClass(RESULT);
    createEAttribute(resultEClass, RESULT__ID);
    createEReference(resultEClass, RESULT__OWNED_RESULTS);
    createEReference(resultEClass, RESULT__ORDERED_RESULTS);

    uriResultEClass = createEClass(URI_RESULT);
    createEReference(uriResultEClass, URI_RESULT__DEFINITION);
    createEAttribute(uriResultEClass, URI_RESULT__URI);
    createEAttribute(uriResultEClass, URI_RESULT__ELEMENT);
    createEAttribute(uriResultEClass, URI_RESULT__EXTERNAL_URI);

    elementResultEClass = createEClass(ELEMENT_RESULT);
    createEReference(elementResultEClass, ELEMENT_RESULT__DEFINITION);
    createEAttribute(elementResultEClass, ELEMENT_RESULT__ELEMENT);

    attributeResultEClass = createEClass(ATTRIBUTE_RESULT);
    createEAttribute(attributeResultEClass, ATTRIBUTE_RESULT__ELEMENT);
    createEReference(attributeResultEClass, ATTRIBUTE_RESULT__DEFINITION);
    createEAttribute(attributeResultEClass, ATTRIBUTE_RESULT__VALUE);
    createEAttribute(attributeResultEClass, ATTRIBUTE_RESULT__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    RetrieverPackage theRetrieverPackage = (RetrieverPackage)EPackage.Registry.INSTANCE.getEPackage(RetrieverPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    resultRootEClass.getESuperTypes().add(this.getResult());
    uriResultEClass.getESuperTypes().add(this.getResult());
    elementResultEClass.getESuperTypes().add(this.getResult());
    attributeResultEClass.getESuperTypes().add(this.getResult());

    // Initialize classes, features, and operations; add parameters
    initEClass(resultRootEClass, ResultRoot.class, "ResultRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResult_Id(), ecorePackage.getEString(), "id", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResult_OwnedResults(), this.getResult(), null, "ownedResults", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResult_OrderedResults(), this.getResult(), null, "orderedResults", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriResultEClass, URIResult.class, "URIResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getURIResult_Definition(), theRetrieverPackage.getURLRetriever(), null, "definition", null, 0, 1, URIResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURIResult_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, URIResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURIResult_Element(), ecorePackage.getEJavaObject(), "element", null, 0, 1, URIResult.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURIResult_ExternalUri(), ecorePackage.getEString(), "externalUri", "", 0, 1, URIResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementResultEClass, ElementResult.class, "ElementResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementResult_Definition(), theRetrieverPackage.getElementRetriever(), null, "definition", null, 0, 1, ElementResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementResult_Element(), ecorePackage.getEJavaObject(), "element", null, 0, 1, ElementResult.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeResultEClass, AttributeResult.class, "AttributeResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeResult_Element(), ecorePackage.getEJavaObject(), "element", null, 0, 1, AttributeResult.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeResult_Definition(), theRetrieverPackage.getAttributeRetriever(), null, "definition", null, 0, 1, AttributeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeResult_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeResult_Name(), ecorePackage.getEString(), "name", "", 0, 1, AttributeResult.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
  }

} //ResultPackageImpl
