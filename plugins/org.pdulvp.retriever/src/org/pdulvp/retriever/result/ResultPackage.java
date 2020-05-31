/**
 */
package org.pdulvp.retriever.result;

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
 * @see org.pdulvp.retriever.result.ResultFactory
 * @model kind="package"
 * @generated
 */
public interface ResultPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "result";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org.pdulvp/retriever/result";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "result";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ResultPackage eINSTANCE = org.pdulvp.retriever.result.impl.ResultPackageImpl.init();// org.pdulvp.retriever.result.impl.ResultPackageImpl.init();

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.result.impl.ResultImpl <em>Result</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.result.impl.ResultImpl
   * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getResult()
   * @generated
   */
  int RESULT = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT__ID = 0;

  /**
   * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT__OWNED_RESULTS = 1;

  /**
   * The feature id for the '<em><b>Ordered Results</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT__ORDERED_RESULTS = 2;

		/**
   * The number of structural features of the '<em>Result</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Result</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.result.impl.ResultRootImpl <em>Root</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.result.impl.ResultRootImpl
   * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getResultRoot()
   * @generated
   */
  int RESULT_ROOT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_ROOT__ID = RESULT__ID;

  /**
   * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_ROOT__OWNED_RESULTS = RESULT__OWNED_RESULTS;

  /**
   * The feature id for the '<em><b>Ordered Results</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RESULT_ROOT__ORDERED_RESULTS = RESULT__ORDERED_RESULTS;

		/**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_ROOT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Root</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_ROOT_OPERATION_COUNT = RESULT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.result.impl.URIResultImpl <em>URI Result</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.pdulvp.retriever.result.impl.URIResultImpl
   * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getURIResult()
   * @generated
   */
  int URI_RESULT = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_RESULT__ID = RESULT__ID;

  /**
   * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_RESULT__OWNED_RESULTS = RESULT__OWNED_RESULTS;

  /**
   * The feature id for the '<em><b>Ordered Results</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int URI_RESULT__ORDERED_RESULTS = RESULT__ORDERED_RESULTS;

		/**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_RESULT__DEFINITION = RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_RESULT__URI = RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_RESULT__ELEMENT = RESULT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>External Uri</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_RESULT__EXTERNAL_URI = RESULT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>URI Result</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>URI Result</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_RESULT_OPERATION_COUNT = RESULT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.result.impl.ElementResultImpl <em>Element Result</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.result.impl.ElementResultImpl
   * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getElementResult()
   * @generated
   */
  int ELEMENT_RESULT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RESULT__ID = RESULT__ID;

  /**
   * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RESULT__OWNED_RESULTS = RESULT__OWNED_RESULTS;

  /**
   * The feature id for the '<em><b>Ordered Results</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ELEMENT_RESULT__ORDERED_RESULTS = RESULT__ORDERED_RESULTS;

		/**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RESULT__DEFINITION = RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RESULT__ELEMENT = RESULT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Element Result</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ELEMENT_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Element Result</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_RESULT_OPERATION_COUNT = RESULT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.pdulvp.retriever.result.impl.AttributeResultImpl <em>Attribute Result</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.pdulvp.retriever.result.impl.AttributeResultImpl
   * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getAttributeResult()
   * @generated
   */
  int ATTRIBUTE_RESULT = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RESULT__ID = RESULT__ID;

  /**
   * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RESULT__OWNED_RESULTS = RESULT__OWNED_RESULTS;

  /**
   * The feature id for the '<em><b>Ordered Results</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE_RESULT__ORDERED_RESULTS = RESULT__ORDERED_RESULTS;

		/**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RESULT__ELEMENT = RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RESULT__DEFINITION = RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RESULT__VALUE = RESULT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RESULT__NAME = RESULT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Attribute Result</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>Attribute Result</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_RESULT_OPERATION_COUNT = RESULT_OPERATION_COUNT + 0;

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.result.ResultRoot <em>Root</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Root</em>'.
   * @see org.pdulvp.retriever.result.ResultRoot
   * @generated
   */
  EClass getResultRoot();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.result.Result <em>Result</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Result</em>'.
   * @see org.pdulvp.retriever.result.Result
   * @generated
   */
  EClass getResult();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.result.Result#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.pdulvp.retriever.result.Result#getId()
   * @see #getResult()
   * @generated
   */
  EAttribute getResult_Id();

  /**
   * Returns the meta object for the containment reference list '{@link org.pdulvp.retriever.result.Result#getOwnedResults <em>Owned Results</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Results</em>'.
   * @see org.pdulvp.retriever.result.Result#getOwnedResults()
   * @see #getResult()
   * @generated
   */
  EReference getResult_OwnedResults();

  /**
   * Returns the meta object for the reference list '{@link org.pdulvp.retriever.result.Result#getOrderedResults <em>Ordered Results</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ordered Results</em>'.
   * @see org.pdulvp.retriever.result.Result#getOrderedResults()
   * @see #getResult()
   * @generated
   */
	EReference getResult_OrderedResults();

		/**
   * Returns the meta object for class '{@link org.pdulvp.retriever.result.URIResult <em>URI Result</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>URI Result</em>'.
   * @see org.pdulvp.retriever.result.URIResult
   * @generated
   */
  EClass getURIResult();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.result.URIResult#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see org.pdulvp.retriever.result.URIResult#getDefinition()
   * @see #getURIResult()
   * @generated
   */
  EReference getURIResult_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.result.URIResult#getUri <em>Uri</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.pdulvp.retriever.result.URIResult#getUri()
   * @see #getURIResult()
   * @generated
   */
  EAttribute getURIResult_Uri();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.result.URIResult#getElement <em>Element</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see org.pdulvp.retriever.result.URIResult#getElement()
   * @see #getURIResult()
   * @generated
   */
  EAttribute getURIResult_Element();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.result.URIResult#getExternalUri <em>External Uri</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External Uri</em>'.
   * @see org.pdulvp.retriever.result.URIResult#getExternalUri()
   * @see #getURIResult()
   * @generated
   */
  EAttribute getURIResult_ExternalUri();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.result.ElementResult <em>Element Result</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Element Result</em>'.
   * @see org.pdulvp.retriever.result.ElementResult
   * @generated
   */
  EClass getElementResult();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.result.ElementResult#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see org.pdulvp.retriever.result.ElementResult#getDefinition()
   * @see #getElementResult()
   * @generated
   */
  EReference getElementResult_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.result.ElementResult#getElement <em>Element</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see org.pdulvp.retriever.result.ElementResult#getElement()
   * @see #getElementResult()
   * @generated
   */
  EAttribute getElementResult_Element();

  /**
   * Returns the meta object for class '{@link org.pdulvp.retriever.result.AttributeResult <em>Attribute Result</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Result</em>'.
   * @see org.pdulvp.retriever.result.AttributeResult
   * @generated
   */
  EClass getAttributeResult();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.result.AttributeResult#getElement <em>Element</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see org.pdulvp.retriever.result.AttributeResult#getElement()
   * @see #getAttributeResult()
   * @generated
   */
  EAttribute getAttributeResult_Element();

  /**
   * Returns the meta object for the reference '{@link org.pdulvp.retriever.result.AttributeResult#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see org.pdulvp.retriever.result.AttributeResult#getDefinition()
   * @see #getAttributeResult()
   * @generated
   */
  EReference getAttributeResult_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.result.AttributeResult#getValue <em>Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.pdulvp.retriever.result.AttributeResult#getValue()
   * @see #getAttributeResult()
   * @generated
   */
  EAttribute getAttributeResult_Value();

  /**
   * Returns the meta object for the attribute '{@link org.pdulvp.retriever.result.AttributeResult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pdulvp.retriever.result.AttributeResult#getName()
   * @see #getAttributeResult()
   * @generated
   */
  EAttribute getAttributeResult_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ResultFactory getResultFactory();

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
     * The meta object literal for the '{@link org.pdulvp.retriever.result.impl.ResultRootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.result.impl.ResultRootImpl
     * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getResultRoot()
     * @generated
     */
    EClass RESULT_ROOT = eINSTANCE.getResultRoot();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.result.impl.ResultImpl <em>Result</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.pdulvp.retriever.result.impl.ResultImpl
     * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getResult()
     * @generated
     */
    EClass RESULT = eINSTANCE.getResult();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESULT__ID = eINSTANCE.getResult_Id();

    /**
     * The meta object literal for the '<em><b>Owned Results</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RESULT__OWNED_RESULTS = eINSTANCE.getResult_OwnedResults();

    /**
     * The meta object literal for the '<em><b>Ordered Results</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RESULT__ORDERED_RESULTS = eINSTANCE.getResult_OrderedResults();

				/**
     * The meta object literal for the '{@link org.pdulvp.retriever.result.impl.URIResultImpl <em>URI Result</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.result.impl.URIResultImpl
     * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getURIResult()
     * @generated
     */
    EClass URI_RESULT = eINSTANCE.getURIResult();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference URI_RESULT__DEFINITION = eINSTANCE.getURIResult_Definition();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute URI_RESULT__URI = eINSTANCE.getURIResult_Uri();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute URI_RESULT__ELEMENT = eINSTANCE.getURIResult_Element();

    /**
     * The meta object literal for the '<em><b>External Uri</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute URI_RESULT__EXTERNAL_URI = eINSTANCE.getURIResult_ExternalUri();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.result.impl.ElementResultImpl <em>Element Result</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.result.impl.ElementResultImpl
     * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getElementResult()
     * @generated
     */
    EClass ELEMENT_RESULT = eINSTANCE.getElementResult();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference ELEMENT_RESULT__DEFINITION = eINSTANCE.getElementResult_Definition();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_RESULT__ELEMENT = eINSTANCE.getElementResult_Element();

    /**
     * The meta object literal for the '{@link org.pdulvp.retriever.result.impl.AttributeResultImpl <em>Attribute Result</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.pdulvp.retriever.result.impl.AttributeResultImpl
     * @see org.pdulvp.retriever.result.impl.ResultPackageImpl#getAttributeResult()
     * @generated
     */
    EClass ATTRIBUTE_RESULT = eINSTANCE.getAttributeResult();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_RESULT__ELEMENT = eINSTANCE.getAttributeResult_Element();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_RESULT__DEFINITION = eINSTANCE.getAttributeResult_Definition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_RESULT__VALUE = eINSTANCE.getAttributeResult_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_RESULT__NAME = eINSTANCE.getAttributeResult_Name();

  }

} // ResultPackage
