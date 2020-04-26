/**
 */
package org.pdulvp.retriever.result.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.ElementRetriever;
import org.pdulvp.retriever.result.ElementResult;
import org.pdulvp.retriever.result.ResultPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.result.impl.ElementResultImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.impl.ElementResultImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementResultImpl extends ResultImpl implements ElementResult {
	/**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
	protected ElementRetriever definition;

	/**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
	protected static final Object ELEMENT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
	protected Object element = ELEMENT_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ElementResultImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ResultPackage.Literals.ELEMENT_RESULT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ElementRetriever getDefinition() {
    if (definition != null && definition.eIsProxy()) {
      InternalEObject oldDefinition = (InternalEObject)definition;
      definition = (ElementRetriever)eResolveProxy(oldDefinition);
      if (definition != oldDefinition) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.ELEMENT_RESULT__DEFINITION, oldDefinition, definition));
      }
    }
    return definition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ElementRetriever basicGetDefinition() {
    return definition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDefinition(ElementRetriever newDefinition) {
    ElementRetriever oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ELEMENT_RESULT__DEFINITION, oldDefinition, definition));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Object getElement() {
    return element;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setElement(Object newElement) {
    Object oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ELEMENT_RESULT__ELEMENT, oldElement, element));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ResultPackage.ELEMENT_RESULT__DEFINITION:
        if (resolve) return getDefinition();
        return basicGetDefinition();
      case ResultPackage.ELEMENT_RESULT__ELEMENT:
        return getElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ResultPackage.ELEMENT_RESULT__DEFINITION:
        setDefinition((ElementRetriever)newValue);
        return;
      case ResultPackage.ELEMENT_RESULT__ELEMENT:
        setElement(newValue);
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
      case ResultPackage.ELEMENT_RESULT__DEFINITION:
        setDefinition((ElementRetriever)null);
        return;
      case ResultPackage.ELEMENT_RESULT__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
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
      case ResultPackage.ELEMENT_RESULT__DEFINITION:
        return definition != null;
      case ResultPackage.ELEMENT_RESULT__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
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
    result.append(" (element: ");
    result.append(element);
    result.append(')');
    return result.toString();
  }

} //ElementResultImpl
