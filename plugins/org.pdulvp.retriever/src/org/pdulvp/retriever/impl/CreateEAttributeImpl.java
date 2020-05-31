/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.CreateEAttribute;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.CreateEAttributeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.CreateEAttributeImpl#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateEAttributeImpl extends RetrieverImpl implements CreateEAttribute {
	/**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
	protected EAttribute feature;

	/**
   * The default value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueExpression()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueExpression()
   * @generated
   * @ordered
   */
  protected String valueExpression = VALUE_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CreateEAttributeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return RetrieverPackage.Literals.CREATE_EATTRIBUTE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EAttribute getFeature() {
    if (feature != null && feature.eIsProxy()) {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (EAttribute)eResolveProxy(oldFeature);
      if (feature != oldFeature) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.CREATE_EATTRIBUTE__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute basicGetFeature() {
    return feature;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void setFeature(EAttribute newFeature) {
    EAttribute oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_EATTRIBUTE__FEATURE, oldFeature, feature));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public String getValueExpression() {
    return valueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setValueExpression(String newValueExpression) {
    String oldValueExpression = valueExpression;
    valueExpression = newValueExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_EATTRIBUTE__VALUE_EXPRESSION, oldValueExpression, valueExpression));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.CREATE_EATTRIBUTE__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case RetrieverPackage.CREATE_EATTRIBUTE__VALUE_EXPRESSION:
        return getValueExpression();
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
      case RetrieverPackage.CREATE_EATTRIBUTE__FEATURE:
        setFeature((EAttribute)newValue);
        return;
      case RetrieverPackage.CREATE_EATTRIBUTE__VALUE_EXPRESSION:
        setValueExpression((String)newValue);
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
      case RetrieverPackage.CREATE_EATTRIBUTE__FEATURE:
        setFeature((EAttribute)null);
        return;
      case RetrieverPackage.CREATE_EATTRIBUTE__VALUE_EXPRESSION:
        setValueExpression(VALUE_EXPRESSION_EDEFAULT);
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
      case RetrieverPackage.CREATE_EATTRIBUTE__FEATURE:
        return feature != null;
      case RetrieverPackage.CREATE_EATTRIBUTE__VALUE_EXPRESSION:
        return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (valueExpression: ");
    result.append(valueExpression);
    result.append(')');
    return result.toString();
  }

} //CreateEAttributeImpl
