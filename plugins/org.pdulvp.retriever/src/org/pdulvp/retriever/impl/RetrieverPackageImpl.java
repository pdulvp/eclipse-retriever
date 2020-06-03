/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pdulvp.retriever.AttributeRetriever;
import org.pdulvp.retriever.CreateEAttribute;
import org.pdulvp.retriever.CreateEObject;
import org.pdulvp.retriever.CreateEReference;
import org.pdulvp.retriever.CreateNotifier;
import org.pdulvp.retriever.ElementRetriever;
import org.pdulvp.retriever.IVariableElement;
import org.pdulvp.retriever.IVariableResultElement;
import org.pdulvp.retriever.If;
import org.pdulvp.retriever.LoadResource;
import org.pdulvp.retriever.ReferencedRetriever;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverContainer;
import org.pdulvp.retriever.RetrieverFactory;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.RetrieverPkg;
import org.pdulvp.retriever.SetVariable;
import org.pdulvp.retriever.TransformationRetriever;
import org.pdulvp.retriever.TransformationService;
import org.pdulvp.retriever.URIVariable;
import org.pdulvp.retriever.URLRetriever;
import org.pdulvp.retriever.result.ResultPackage;
import org.pdulvp.retriever.result.impl.ResultPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RetrieverPackageImpl extends EPackageImpl implements RetrieverPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass retrieverPkgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass retrieverContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass retrieverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlRetrieverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uriVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementRetrieverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeRetrieverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transformationRetrieverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transformationServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referencedRetrieverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createEObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createEReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createEAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createNotifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iVariableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iVariableResultElementEClass = null;

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
   * @see org.pdulvp.retriever.RetrieverPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RetrieverPackageImpl() {
    super(eNS_URI, RetrieverFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link RetrieverPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RetrieverPackage init() {
    if (isInited) return (RetrieverPackage)EPackage.Registry.INSTANCE.getEPackage(RetrieverPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredRetrieverPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    RetrieverPackageImpl theRetrieverPackage = registeredRetrieverPackage instanceof RetrieverPackageImpl ? (RetrieverPackageImpl)registeredRetrieverPackage : new RetrieverPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);
    ResultPackageImpl theResultPackage = (ResultPackageImpl)(registeredPackage instanceof ResultPackageImpl ? registeredPackage : ResultPackage.eINSTANCE);

    // Create package meta-data objects
    theRetrieverPackage.createPackageContents();
    theResultPackage.createPackageContents();

    // Initialize created meta-data
    theRetrieverPackage.initializePackageContents();
    theResultPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRetrieverPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RetrieverPackage.eNS_URI, theRetrieverPackage);
    return theRetrieverPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getRetrieverPkg() {
    return retrieverPkgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getRetrieverContainer() {
    return retrieverContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getRetrieverContainer_OwnedElements() {
    return (EReference)retrieverContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getRetrieverContainer_OwnedServices() {
    return (EReference)retrieverContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getRetriever() {
    return retrieverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getRetriever_Id() {
    return (EAttribute)retrieverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getRetriever_Name() {
    return (EAttribute)retrieverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getRetriever_Description() {
    return (EAttribute)retrieverEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getRetriever_Dynamic() {
    return (EAttribute)retrieverEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EAttribute getRetriever_DynamicPreconditionExpression() {
    return (EAttribute)retrieverEClass.getEStructuralFeatures().get(4);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getURLRetriever() {
    return urlRetrieverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getURLRetriever_OwnedVariables() {
    return (EReference)urlRetrieverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getURLRetriever_UriExpression() {
    return (EAttribute)urlRetrieverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getURLRetriever_CacheControl() {
    return (EAttribute)urlRetrieverEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getURLRetriever_AsSemantic() {
    return (EAttribute)urlRetrieverEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getURIVariable() {
    return uriVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getURIVariable_Name() {
    return (EAttribute)uriVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getElementRetriever() {
    return elementRetrieverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getElementRetriever_RetrieverExpression() {
    return (EAttribute)elementRetrieverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getAttributeRetriever() {
    return attributeRetrieverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getAttributeRetriever_ValueExpression() {
    return (EAttribute)attributeRetrieverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getAttributeRetriever_Alternative() {
    return (EReference)attributeRetrieverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getAttributeRetriever_Service() {
    return (EReference)attributeRetrieverEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getTransformationRetriever() {
    return transformationRetrieverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getTransformationRetriever_Service() {
    return (EReference)transformationRetrieverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getTransformationRetriever_Input() {
    return (EAttribute)transformationRetrieverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getTransformationRetriever_Variable() {
    return (EAttribute)transformationRetrieverEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getTransformationService() {
    return transformationServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getTransformationService_Classname() {
    return (EAttribute)transformationServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getTransformationService_Method() {
    return (EAttribute)transformationServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getReferencedRetriever() {
    return referencedRetrieverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getReferencedRetriever_ReferencedElement() {
    return (EReference)referencedRetrieverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getSetVariable() {
    return setVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getSetVariable_Expression() {
    return (EAttribute)setVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EAttribute getSetVariable_Log() {
    return (EAttribute)setVariableEClass.getEStructuralFeatures().get(1);
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getCreateEObject() {
    return createEObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getCreateEObject_ContainerExpression() {
    return (EAttribute)createEObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCreateEObject_Class() {
    return (EReference)createEObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCreateEObject_ContainingFeature() {
    return (EReference)createEObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getCreateEReference() {
    return createEReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getCreateEReference_Feature() {
    return (EReference)createEReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getCreateEReference_ValueExpression() {
    return (EAttribute)createEReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getCreateEReference_Deferred() {
    return (EAttribute)createEReferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getCreateEAttribute() {
    return createEAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EReference getCreateEAttribute_Feature() {
    return (EReference)createEAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getCreateEAttribute_ValueExpression() {
    return (EAttribute)createEAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getCreateNotifier() {
    return createNotifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getLoadResource() {
    return loadResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getLoadResource_Uri() {
    return (EAttribute)loadResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getLoadResource_Create() {
    return (EAttribute)loadResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getLoadResource_ClearContents() {
    return (EAttribute)loadResourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EClass getIf() {
    return ifEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EAttribute getIf_ConditionExpression() {
    return (EAttribute)ifEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIVariableElement() {
    return iVariableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIVariableElement_Variable() {
    return (EAttribute)iVariableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIVariableResultElement() {
    return iVariableResultElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIVariableResultElement_VariableResult() {
    return (EAttribute)iVariableResultElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public RetrieverFactory getRetrieverFactory() {
    return (RetrieverFactory)getEFactoryInstance();
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
    retrieverPkgEClass = createEClass(RETRIEVER_PKG);

    retrieverContainerEClass = createEClass(RETRIEVER_CONTAINER);
    createEReference(retrieverContainerEClass, RETRIEVER_CONTAINER__OWNED_ELEMENTS);
    createEReference(retrieverContainerEClass, RETRIEVER_CONTAINER__OWNED_SERVICES);

    retrieverEClass = createEClass(RETRIEVER);
    createEAttribute(retrieverEClass, RETRIEVER__ID);
    createEAttribute(retrieverEClass, RETRIEVER__NAME);
    createEAttribute(retrieverEClass, RETRIEVER__DESCRIPTION);
    createEAttribute(retrieverEClass, RETRIEVER__DYNAMIC);
    createEAttribute(retrieverEClass, RETRIEVER__DYNAMIC_PRECONDITION_EXPRESSION);

    urlRetrieverEClass = createEClass(URL_RETRIEVER);
    createEReference(urlRetrieverEClass, URL_RETRIEVER__OWNED_VARIABLES);
    createEAttribute(urlRetrieverEClass, URL_RETRIEVER__URI_EXPRESSION);
    createEAttribute(urlRetrieverEClass, URL_RETRIEVER__CACHE_CONTROL);
    createEAttribute(urlRetrieverEClass, URL_RETRIEVER__AS_SEMANTIC);

    uriVariableEClass = createEClass(URI_VARIABLE);
    createEAttribute(uriVariableEClass, URI_VARIABLE__NAME);

    elementRetrieverEClass = createEClass(ELEMENT_RETRIEVER);
    createEAttribute(elementRetrieverEClass, ELEMENT_RETRIEVER__RETRIEVER_EXPRESSION);

    attributeRetrieverEClass = createEClass(ATTRIBUTE_RETRIEVER);
    createEAttribute(attributeRetrieverEClass, ATTRIBUTE_RETRIEVER__VALUE_EXPRESSION);
    createEReference(attributeRetrieverEClass, ATTRIBUTE_RETRIEVER__ALTERNATIVE);
    createEReference(attributeRetrieverEClass, ATTRIBUTE_RETRIEVER__SERVICE);

    transformationRetrieverEClass = createEClass(TRANSFORMATION_RETRIEVER);
    createEReference(transformationRetrieverEClass, TRANSFORMATION_RETRIEVER__SERVICE);
    createEAttribute(transformationRetrieverEClass, TRANSFORMATION_RETRIEVER__INPUT);
    createEAttribute(transformationRetrieverEClass, TRANSFORMATION_RETRIEVER__VARIABLE);

    transformationServiceEClass = createEClass(TRANSFORMATION_SERVICE);
    createEAttribute(transformationServiceEClass, TRANSFORMATION_SERVICE__CLASSNAME);
    createEAttribute(transformationServiceEClass, TRANSFORMATION_SERVICE__METHOD);

    referencedRetrieverEClass = createEClass(REFERENCED_RETRIEVER);
    createEReference(referencedRetrieverEClass, REFERENCED_RETRIEVER__REFERENCED_ELEMENT);

    setVariableEClass = createEClass(SET_VARIABLE);
    createEAttribute(setVariableEClass, SET_VARIABLE__EXPRESSION);
    createEAttribute(setVariableEClass, SET_VARIABLE__LOG);

    createEObjectEClass = createEClass(CREATE_EOBJECT);
    createEAttribute(createEObjectEClass, CREATE_EOBJECT__CONTAINER_EXPRESSION);
    createEReference(createEObjectEClass, CREATE_EOBJECT__CLASS);
    createEReference(createEObjectEClass, CREATE_EOBJECT__CONTAINING_FEATURE);

    createEReferenceEClass = createEClass(CREATE_EREFERENCE);
    createEReference(createEReferenceEClass, CREATE_EREFERENCE__FEATURE);
    createEAttribute(createEReferenceEClass, CREATE_EREFERENCE__VALUE_EXPRESSION);
    createEAttribute(createEReferenceEClass, CREATE_EREFERENCE__DEFERRED);

    createEAttributeEClass = createEClass(CREATE_EATTRIBUTE);
    createEReference(createEAttributeEClass, CREATE_EATTRIBUTE__FEATURE);
    createEAttribute(createEAttributeEClass, CREATE_EATTRIBUTE__VALUE_EXPRESSION);

    createNotifierEClass = createEClass(CREATE_NOTIFIER);

    loadResourceEClass = createEClass(LOAD_RESOURCE);
    createEAttribute(loadResourceEClass, LOAD_RESOURCE__URI);
    createEAttribute(loadResourceEClass, LOAD_RESOURCE__CREATE);
    createEAttribute(loadResourceEClass, LOAD_RESOURCE__CLEAR_CONTENTS);

    ifEClass = createEClass(IF);
    createEAttribute(ifEClass, IF__CONDITION_EXPRESSION);

    iVariableElementEClass = createEClass(IVARIABLE_ELEMENT);
    createEAttribute(iVariableElementEClass, IVARIABLE_ELEMENT__VARIABLE);

    iVariableResultElementEClass = createEClass(IVARIABLE_RESULT_ELEMENT);
    createEAttribute(iVariableResultElementEClass, IVARIABLE_RESULT_ELEMENT__VARIABLE_RESULT);
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
    ResultPackage theResultPackage = (ResultPackage)EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Add subpackages
    getESubpackages().add(theResultPackage);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    retrieverPkgEClass.getESuperTypes().add(this.getRetrieverContainer());
    retrieverContainerEClass.getESuperTypes().add(this.getRetriever());
    urlRetrieverEClass.getESuperTypes().add(this.getRetriever());
    urlRetrieverEClass.getESuperTypes().add(this.getRetrieverContainer());
    urlRetrieverEClass.getESuperTypes().add(this.getIVariableElement());
    urlRetrieverEClass.getESuperTypes().add(this.getIVariableResultElement());
    elementRetrieverEClass.getESuperTypes().add(this.getRetriever());
    elementRetrieverEClass.getESuperTypes().add(this.getRetrieverContainer());
    elementRetrieverEClass.getESuperTypes().add(this.getIVariableElement());
    elementRetrieverEClass.getESuperTypes().add(this.getIVariableResultElement());
    attributeRetrieverEClass.getESuperTypes().add(this.getRetriever());
    transformationRetrieverEClass.getESuperTypes().add(this.getRetriever());
    transformationRetrieverEClass.getESuperTypes().add(this.getRetrieverContainer());
    referencedRetrieverEClass.getESuperTypes().add(this.getRetriever());
    setVariableEClass.getESuperTypes().add(this.getCreateNotifier());
    createEObjectEClass.getESuperTypes().add(this.getCreateNotifier());
    createEReferenceEClass.getESuperTypes().add(this.getRetriever());
    createEAttributeEClass.getESuperTypes().add(this.getRetriever());
    createNotifierEClass.getESuperTypes().add(this.getRetriever());
    createNotifierEClass.getESuperTypes().add(this.getRetrieverContainer());
    createNotifierEClass.getESuperTypes().add(this.getIVariableElement());
    loadResourceEClass.getESuperTypes().add(this.getCreateNotifier());
    ifEClass.getESuperTypes().add(this.getRetriever());
    ifEClass.getESuperTypes().add(this.getRetrieverContainer());

    // Initialize classes, features, and operations; add parameters
    initEClass(retrieverPkgEClass, RetrieverPkg.class, "RetrieverPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(retrieverContainerEClass, RetrieverContainer.class, "RetrieverContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRetrieverContainer_OwnedElements(), this.getRetriever(), null, "ownedElements", null, 0, -1, RetrieverContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRetrieverContainer_OwnedServices(), this.getTransformationService(), null, "ownedServices", null, 0, -1, RetrieverContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(retrieverEClass, Retriever.class, "Retriever", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRetriever_Id(), ecorePackage.getEString(), "id", null, 0, 1, Retriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRetriever_Name(), ecorePackage.getEString(), "name", null, 0, 1, Retriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRetriever_Description(), ecorePackage.getEString(), "description", null, 0, 1, Retriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRetriever_Dynamic(), ecorePackage.getEBoolean(), "dynamic", "false", 0, 1, Retriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRetriever_DynamicPreconditionExpression(), ecorePackage.getEString(), "dynamicPreconditionExpression", null, 0, 1, Retriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlRetrieverEClass, URLRetriever.class, "URLRetriever", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getURLRetriever_OwnedVariables(), this.getURIVariable(), null, "ownedVariables", null, 0, -1, URLRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURLRetriever_UriExpression(), ecorePackage.getEString(), "uriExpression", null, 0, 1, URLRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURLRetriever_CacheControl(), ecorePackage.getEString(), "cacheControl", null, 0, 1, URLRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURLRetriever_AsSemantic(), ecorePackage.getEBoolean(), "asSemantic", "true", 0, 1, URLRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriVariableEClass, URIVariable.class, "URIVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURIVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, URIVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementRetrieverEClass, ElementRetriever.class, "ElementRetriever", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementRetriever_RetrieverExpression(), ecorePackage.getEString(), "retrieverExpression", null, 0, 1, ElementRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeRetrieverEClass, AttributeRetriever.class, "AttributeRetriever", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeRetriever_ValueExpression(), ecorePackage.getEString(), "valueExpression", null, 0, 1, AttributeRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeRetriever_Alternative(), this.getAttributeRetriever(), null, "alternative", null, 0, 1, AttributeRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeRetriever_Service(), this.getTransformationService(), null, "service", null, 0, 1, AttributeRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transformationRetrieverEClass, TransformationRetriever.class, "TransformationRetriever", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransformationRetriever_Service(), this.getTransformationService(), null, "service", null, 0, 1, TransformationRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransformationRetriever_Input(), ecorePackage.getEString(), "input", null, 0, 1, TransformationRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransformationRetriever_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, TransformationRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transformationServiceEClass, TransformationService.class, "TransformationService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransformationService_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, TransformationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransformationService_Method(), ecorePackage.getEString(), "method", null, 0, 1, TransformationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referencedRetrieverEClass, ReferencedRetriever.class, "ReferencedRetriever", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferencedRetriever_ReferencedElement(), this.getRetriever(), null, "referencedElement", null, 0, 1, ReferencedRetriever.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setVariableEClass, SetVariable.class, "SetVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSetVariable_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, SetVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSetVariable_Log(), ecorePackage.getEBoolean(), "log", null, 0, 1, SetVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createEObjectEClass, CreateEObject.class, "CreateEObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateEObject_ContainerExpression(), ecorePackage.getEString(), "containerExpression", null, 0, 1, CreateEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateEObject_Class(), theEcorePackage.getEClass(), null, "class", null, 0, 1, CreateEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreateEObject_ContainingFeature(), theEcorePackage.getEReference(), null, "containingFeature", null, 0, 1, CreateEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createEReferenceEClass, CreateEReference.class, "CreateEReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateEReference_Feature(), theEcorePackage.getEReference(), null, "feature", null, 0, 1, CreateEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateEReference_ValueExpression(), ecorePackage.getEString(), "valueExpression", null, 0, 1, CreateEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateEReference_Deferred(), ecorePackage.getEBoolean(), "deferred", "false", 0, 1, CreateEReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createEAttributeEClass, CreateEAttribute.class, "CreateEAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreateEAttribute_Feature(), theEcorePackage.getEAttribute(), null, "feature", null, 0, 1, CreateEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateEAttribute_ValueExpression(), ecorePackage.getEString(), "valueExpression", null, 0, 1, CreateEAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createNotifierEClass, CreateNotifier.class, "CreateNotifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(loadResourceEClass, LoadResource.class, "LoadResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadResource_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, LoadResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadResource_Create(), ecorePackage.getEBoolean(), "create", "true", 0, 1, LoadResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadResource_ClearContents(), ecorePackage.getEBoolean(), "clearContents", "false", 0, 1, LoadResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIf_ConditionExpression(), ecorePackage.getEString(), "conditionExpression", null, 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iVariableElementEClass, IVariableElement.class, "IVariableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIVariableElement_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, IVariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iVariableResultElementEClass, IVariableResultElement.class, "IVariableResultElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIVariableResultElement_VariableResult(), ecorePackage.getEString(), "variableResult", null, 0, 1, IVariableResultElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RetrieverPackageImpl
