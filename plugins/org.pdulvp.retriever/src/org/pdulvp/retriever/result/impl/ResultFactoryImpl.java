/**
 */
package org.pdulvp.retriever.result.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.pdulvp.retriever.result.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultFactoryImpl extends EFactoryImpl implements ResultFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ResultFactory init() {
    try {
      ResultFactory theResultFactory = (ResultFactory)EPackage.Registry.INSTANCE.getEFactory(ResultPackage.eNS_URI);
      if (theResultFactory != null) {
        return theResultFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ResultFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultFactoryImpl() {
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
      case ResultPackage.RESULT_ROOT: return createResultRoot();
      case ResultPackage.RESULT: return createResult();
      case ResultPackage.URI_RESULT: return createURIResult();
      case ResultPackage.ELEMENT_RESULT: return createElementResult();
      case ResultPackage.ATTRIBUTE_RESULT: return createAttributeResult();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultRoot createResultRoot() {
    ResultRootImpl resultRoot = new ResultRootImpl();
    return resultRoot;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Result createResult() {
    ResultImpl result = new ResultImpl();
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public URIResult createURIResult() {
    URIResultImpl uriResult = new URIResultImpl();
    return uriResult;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ElementResult createElementResult() {
    ElementResultImpl elementResult = new ElementResultImpl();
    return elementResult;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AttributeResult createAttributeResult() {
    AttributeResultImpl attributeResult = new AttributeResultImpl();
    return attributeResult;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultPackage getResultPackage() {
    return (ResultPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static ResultPackage getPackage() {
    return ResultPackage.eINSTANCE;
  }

} //ResultFactoryImpl
