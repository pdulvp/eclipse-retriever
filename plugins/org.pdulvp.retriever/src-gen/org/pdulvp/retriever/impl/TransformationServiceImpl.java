/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.TransformationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.TransformationServiceImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.TransformationServiceImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationServiceImpl extends MinimalEObjectImpl.Container implements TransformationService {
	/**
   * The default value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
	protected static final String CLASSNAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
	protected String classname = CLASSNAME_EDEFAULT;

	/**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
	protected static final String METHOD_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
	protected String method = METHOD_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TransformationServiceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return RetrieverPackage.Literals.TRANSFORMATION_SERVICE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getClassname() {
    return classname;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setClassname(String newClassname) {
    String oldClassname = classname;
    classname = newClassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.TRANSFORMATION_SERVICE__CLASSNAME, oldClassname, classname));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getMethod() {
    return method;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMethod(String newMethod) {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.TRANSFORMATION_SERVICE__METHOD, oldMethod, method));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.TRANSFORMATION_SERVICE__CLASSNAME:
        return getClassname();
      case RetrieverPackage.TRANSFORMATION_SERVICE__METHOD:
        return getMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case RetrieverPackage.TRANSFORMATION_SERVICE__CLASSNAME:
        setClassname((String)newValue);
        return;
      case RetrieverPackage.TRANSFORMATION_SERVICE__METHOD:
        setMethod((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case RetrieverPackage.TRANSFORMATION_SERVICE__CLASSNAME:
        setClassname(CLASSNAME_EDEFAULT);
        return;
      case RetrieverPackage.TRANSFORMATION_SERVICE__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case RetrieverPackage.TRANSFORMATION_SERVICE__CLASSNAME:
        return CLASSNAME_EDEFAULT == null ? classname != null : !CLASSNAME_EDEFAULT.equals(classname);
      case RetrieverPackage.TRANSFORMATION_SERVICE__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (classname: ");
    result.append(classname);
    result.append(", method: ");
    result.append(method);
    result.append(')');
    return result.toString();
  }

} //TransformationServiceImpl
