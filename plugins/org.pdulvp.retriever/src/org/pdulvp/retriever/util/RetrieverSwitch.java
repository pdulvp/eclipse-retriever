/**
 */
package org.pdulvp.retriever.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.pdulvp.retriever.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.pdulvp.retriever.RetrieverPackage
 * @generated
 */
public class RetrieverSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static RetrieverPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RetrieverSwitch() {
    if (modelPackage == null) {
      modelPackage = RetrieverPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case RetrieverPackage.RETRIEVER_PKG: {
        RetrieverPkg retrieverPkg = (RetrieverPkg)theEObject;
        T result = caseRetrieverPkg(retrieverPkg);
        if (result == null) result = caseRetrieverContainer(retrieverPkg);
        if (result == null) result = caseRetriever(retrieverPkg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.RETRIEVER_CONTAINER: {
        RetrieverContainer retrieverContainer = (RetrieverContainer)theEObject;
        T result = caseRetrieverContainer(retrieverContainer);
        if (result == null) result = caseRetriever(retrieverContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.RETRIEVER: {
        Retriever retriever = (Retriever)theEObject;
        T result = caseRetriever(retriever);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.URL_RETRIEVER: {
        URLRetriever urlRetriever = (URLRetriever)theEObject;
        T result = caseURLRetriever(urlRetriever);
        if (result == null) result = caseRetrieverContainer(urlRetriever);
        if (result == null) result = caseIVariableElement(urlRetriever);
        if (result == null) result = caseIVariableResultElement(urlRetriever);
        if (result == null) result = caseRetriever(urlRetriever);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.URI_VARIABLE: {
        URIVariable uriVariable = (URIVariable)theEObject;
        T result = caseURIVariable(uriVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.ELEMENT_RETRIEVER: {
        ElementRetriever elementRetriever = (ElementRetriever)theEObject;
        T result = caseElementRetriever(elementRetriever);
        if (result == null) result = caseRetrieverContainer(elementRetriever);
        if (result == null) result = caseIVariableElement(elementRetriever);
        if (result == null) result = caseIVariableResultElement(elementRetriever);
        if (result == null) result = caseRetriever(elementRetriever);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.ATTRIBUTE_RETRIEVER: {
        AttributeRetriever attributeRetriever = (AttributeRetriever)theEObject;
        T result = caseAttributeRetriever(attributeRetriever);
        if (result == null) result = caseRetriever(attributeRetriever);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.TRANSFORMATION_RETRIEVER: {
        TransformationRetriever transformationRetriever = (TransformationRetriever)theEObject;
        T result = caseTransformationRetriever(transformationRetriever);
        if (result == null) result = caseRetrieverContainer(transformationRetriever);
        if (result == null) result = caseRetriever(transformationRetriever);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.TRANSFORMATION_SERVICE: {
        TransformationService transformationService = (TransformationService)theEObject;
        T result = caseTransformationService(transformationService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.REFERENCED_RETRIEVER: {
        ReferencedRetriever referencedRetriever = (ReferencedRetriever)theEObject;
        T result = caseReferencedRetriever(referencedRetriever);
        if (result == null) result = caseRetriever(referencedRetriever);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.SET_VARIABLE: {
        SetVariable setVariable = (SetVariable)theEObject;
        T result = caseSetVariable(setVariable);
        if (result == null) result = caseCreateNotifier(setVariable);
        if (result == null) result = caseRetrieverContainer(setVariable);
        if (result == null) result = caseIVariableElement(setVariable);
        if (result == null) result = caseRetriever(setVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.CREATE_EOBJECT: {
        CreateEObject createEObject = (CreateEObject)theEObject;
        T result = caseCreateEObject(createEObject);
        if (result == null) result = caseCreateNotifier(createEObject);
        if (result == null) result = caseRetrieverContainer(createEObject);
        if (result == null) result = caseIVariableElement(createEObject);
        if (result == null) result = caseRetriever(createEObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.CREATE_EREFERENCE: {
        CreateEReference createEReference = (CreateEReference)theEObject;
        T result = caseCreateEReference(createEReference);
        if (result == null) result = caseRetriever(createEReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.CREATE_EATTRIBUTE: {
        CreateEAttribute createEAttribute = (CreateEAttribute)theEObject;
        T result = caseCreateEAttribute(createEAttribute);
        if (result == null) result = caseRetriever(createEAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.CREATE_NOTIFIER: {
        CreateNotifier createNotifier = (CreateNotifier)theEObject;
        T result = caseCreateNotifier(createNotifier);
        if (result == null) result = caseRetrieverContainer(createNotifier);
        if (result == null) result = caseIVariableElement(createNotifier);
        if (result == null) result = caseRetriever(createNotifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.LOAD_RESOURCE: {
        LoadResource loadResource = (LoadResource)theEObject;
        T result = caseLoadResource(loadResource);
        if (result == null) result = caseCreateNotifier(loadResource);
        if (result == null) result = caseRetrieverContainer(loadResource);
        if (result == null) result = caseIVariableElement(loadResource);
        if (result == null) result = caseRetriever(loadResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.IF: {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = caseRetrieverContainer(if_);
        if (result == null) result = caseRetriever(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.IVARIABLE_ELEMENT: {
        IVariableElement iVariableElement = (IVariableElement)theEObject;
        T result = caseIVariableElement(iVariableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RetrieverPackage.IVARIABLE_RESULT_ELEMENT: {
        IVariableResultElement iVariableResultElement = (IVariableResultElement)theEObject;
        T result = caseIVariableResultElement(iVariableResultElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Retriever</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Retriever</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRetriever(Retriever object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>URL Retriever</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URL Retriever</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseURLRetriever(URLRetriever object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>URI Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URI Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURIVariable(URIVariable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Retriever</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Retriever</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseElementRetriever(ElementRetriever object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Retriever</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Retriever</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAttributeRetriever(AttributeRetriever object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Transformation Retriever</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transformation Retriever</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransformationRetriever(TransformationRetriever object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRetrieverContainer(RetrieverContainer object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Pkg</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pkg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRetrieverPkg(RetrieverPkg object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Retriever</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Retriever</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseReferencedRetriever(ReferencedRetriever object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Transformation Service</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transformation Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTransformationService(TransformationService object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Create EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCreateEObject(CreateEObject object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Create EReference</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create EReference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCreateEReference(CreateEReference object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Create EAttribute</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create EAttribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCreateEAttribute(CreateEAttribute object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Load Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadResource(LoadResource object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetVariable(SetVariable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Notifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Notifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateNotifier(CreateNotifier object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IVariable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IVariable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIVariableElement(IVariableElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IVariable Result Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IVariable Result Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIVariableResultElement(IVariableResultElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
	public T defaultCase(EObject object) {
    return null;
  }

} //RetrieverSwitch
