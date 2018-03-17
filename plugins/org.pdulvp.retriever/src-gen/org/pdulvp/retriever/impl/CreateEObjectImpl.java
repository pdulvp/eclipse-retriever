/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.CreateEObject;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create EObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.CreateEObjectImpl#getContainerExpression <em>Container Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateEObjectImpl extends CreateDirectEObjectImpl implements CreateEObject {
	/**
   * The default value of the '{@link #getContainerExpression() <em>Container Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerExpression()
   * @generated
   * @ordered
   */
  protected static final String CONTAINER_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContainerExpression() <em>Container Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerExpression()
   * @generated
   * @ordered
   */
  protected String containerExpression = CONTAINER_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CreateEObjectImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return RetrieverPackage.Literals.CREATE_EOBJECT;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContainerExpression() {
    return containerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerExpression(String newContainerExpression) {
    String oldContainerExpression = containerExpression;
    containerExpression = newContainerExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_EOBJECT__CONTAINER_EXPRESSION, oldContainerExpression, containerExpression));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.CREATE_EOBJECT__CONTAINER_EXPRESSION:
        return getContainerExpression();
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
      case RetrieverPackage.CREATE_EOBJECT__CONTAINER_EXPRESSION:
        setContainerExpression((String)newValue);
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
      case RetrieverPackage.CREATE_EOBJECT__CONTAINER_EXPRESSION:
        setContainerExpression(CONTAINER_EXPRESSION_EDEFAULT);
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
      case RetrieverPackage.CREATE_EOBJECT__CONTAINER_EXPRESSION:
        return CONTAINER_EXPRESSION_EDEFAULT == null ? containerExpression != null : !CONTAINER_EXPRESSION_EDEFAULT.equals(containerExpression);
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
    result.append(" (containerExpression: ");
    result.append(containerExpression);
    result.append(')');
    return result.toString();
  }

} //CreateEObjectImpl
