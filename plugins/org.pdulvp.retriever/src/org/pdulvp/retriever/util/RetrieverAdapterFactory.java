/**
 */
package org.pdulvp.retriever.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.pdulvp.retriever.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.pdulvp.retriever.RetrieverPackage
 * @generated
 */
public class RetrieverAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static RetrieverPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RetrieverAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = RetrieverPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RetrieverSwitch<Adapter> modelSwitch =
		new RetrieverSwitch<Adapter>() {
      @Override
      public Adapter caseRetrieverPkg(RetrieverPkg object) {
        return createRetrieverPkgAdapter();
      }
      @Override
      public Adapter caseRetrieverContainer(RetrieverContainer object) {
        return createRetrieverContainerAdapter();
      }
      @Override
      public Adapter caseRetriever(Retriever object) {
        return createRetrieverAdapter();
      }
      @Override
      public Adapter caseURLRetriever(URLRetriever object) {
        return createURLRetrieverAdapter();
      }
      @Override
      public Adapter caseURIVariable(URIVariable object) {
        return createURIVariableAdapter();
      }
      @Override
      public Adapter caseElementRetriever(ElementRetriever object) {
        return createElementRetrieverAdapter();
      }
      @Override
      public Adapter caseAttributeRetriever(AttributeRetriever object) {
        return createAttributeRetrieverAdapter();
      }
      @Override
      public Adapter caseTransformationRetriever(TransformationRetriever object) {
        return createTransformationRetrieverAdapter();
      }
      @Override
      public Adapter caseTransformationService(TransformationService object) {
        return createTransformationServiceAdapter();
      }
      @Override
      public Adapter caseReferencedRetriever(ReferencedRetriever object) {
        return createReferencedRetrieverAdapter();
      }
      @Override
      public Adapter caseSetVariable(SetVariable object) {
        return createSetVariableAdapter();
      }
      @Override
      public Adapter caseCreateEObject(CreateEObject object) {
        return createCreateEObjectAdapter();
      }
      @Override
      public Adapter caseCreateEReference(CreateEReference object) {
        return createCreateEReferenceAdapter();
      }
      @Override
      public Adapter caseCreateEAttribute(CreateEAttribute object) {
        return createCreateEAttributeAdapter();
      }
      @Override
      public Adapter caseCreateNotifier(CreateNotifier object) {
        return createCreateNotifierAdapter();
      }
      @Override
      public Adapter caseLoadResource(LoadResource object) {
        return createLoadResourceAdapter();
      }
      @Override
      public Adapter caseIf(If object) {
        return createIfAdapter();
      }
      @Override
      public Adapter caseIVariableElement(IVariableElement object) {
        return createIVariableElementAdapter();
      }
      @Override
      public Adapter caseIVariableResultElement(IVariableResultElement object) {
        return createIVariableResultElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.Retriever <em>Retriever</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.Retriever
   * @generated
   */
	public Adapter createRetrieverAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.URLRetriever <em>URL Retriever</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.URLRetriever
   * @generated
   */
	public Adapter createURLRetrieverAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.URIVariable <em>URI Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.URIVariable
   * @generated
   */
  public Adapter createURIVariableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.ElementRetriever <em>Element Retriever</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.ElementRetriever
   * @generated
   */
	public Adapter createElementRetrieverAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.AttributeRetriever <em>Attribute Retriever</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.AttributeRetriever
   * @generated
   */
	public Adapter createAttributeRetrieverAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.TransformationRetriever <em>Transformation Retriever</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.TransformationRetriever
   * @generated
   */
  public Adapter createTransformationRetrieverAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.RetrieverContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.RetrieverContainer
   * @generated
   */
	public Adapter createRetrieverContainerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.RetrieverPkg <em>Pkg</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.RetrieverPkg
   * @generated
   */
	public Adapter createRetrieverPkgAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.ReferencedRetriever <em>Referenced Retriever</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.ReferencedRetriever
   * @generated
   */
	public Adapter createReferencedRetrieverAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.TransformationService <em>Transformation Service</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.TransformationService
   * @generated
   */
	public Adapter createTransformationServiceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.CreateEObject <em>Create EObject</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.CreateEObject
   * @generated
   */
	public Adapter createCreateEObjectAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.CreateEReference <em>Create EReference</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.CreateEReference
   * @generated
   */
	public Adapter createCreateEReferenceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.CreateEAttribute <em>Create EAttribute</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.CreateEAttribute
   * @generated
   */
	public Adapter createCreateEAttributeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.LoadResource <em>Load Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.LoadResource
   * @generated
   */
  public Adapter createLoadResourceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.SetVariable <em>Set Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.SetVariable
   * @generated
   */
  public Adapter createSetVariableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.CreateNotifier <em>Create Notifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.CreateNotifier
   * @generated
   */
  public Adapter createCreateNotifierAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.If
   * @generated
   */
  public Adapter createIfAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.IVariableElement <em>IVariable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.IVariableElement
   * @generated
   */
  public Adapter createIVariableElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.pdulvp.retriever.IVariableResultElement <em>IVariable Result Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.pdulvp.retriever.IVariableResultElement
   * @generated
   */
  public Adapter createIVariableResultElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //RetrieverAdapterFactory
