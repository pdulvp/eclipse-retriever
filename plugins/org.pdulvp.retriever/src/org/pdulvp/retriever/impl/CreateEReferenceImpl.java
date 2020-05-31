/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.CreateEReference;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.CreateEReferenceImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.CreateEReferenceImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.CreateEReferenceImpl#isDeferred <em>Deferred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateEReferenceImpl extends RetrieverImpl implements CreateEReference {
	/**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
	protected EReference feature;

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
   * The default value of the '{@link #isDeferred() <em>Deferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeferred()
   * @generated
   * @ordered
   */
  protected static final boolean DEFERRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeferred() <em>Deferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeferred()
   * @generated
   * @ordered
   */
  protected boolean deferred = DEFERRED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CreateEReferenceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return RetrieverPackage.Literals.CREATE_EREFERENCE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EReference getFeature() {
    if (feature != null && feature.eIsProxy()) {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (EReference)eResolveProxy(oldFeature);
      if (feature != oldFeature) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.CREATE_EREFERENCE__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference basicGetFeature() {
    return feature;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void setFeature(EReference newFeature) {
    EReference oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_EREFERENCE__FEATURE, oldFeature, feature));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_EREFERENCE__VALUE_EXPRESSION, oldValueExpression, valueExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public boolean isDeferred() {
    return deferred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setDeferred(boolean newDeferred) {
    boolean oldDeferred = deferred;
    deferred = newDeferred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_EREFERENCE__DEFERRED, oldDeferred, deferred));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.CREATE_EREFERENCE__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case RetrieverPackage.CREATE_EREFERENCE__VALUE_EXPRESSION:
        return getValueExpression();
      case RetrieverPackage.CREATE_EREFERENCE__DEFERRED:
        return isDeferred();
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
      case RetrieverPackage.CREATE_EREFERENCE__FEATURE:
        setFeature((EReference)newValue);
        return;
      case RetrieverPackage.CREATE_EREFERENCE__VALUE_EXPRESSION:
        setValueExpression((String)newValue);
        return;
      case RetrieverPackage.CREATE_EREFERENCE__DEFERRED:
        setDeferred((Boolean)newValue);
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
      case RetrieverPackage.CREATE_EREFERENCE__FEATURE:
        setFeature((EReference)null);
        return;
      case RetrieverPackage.CREATE_EREFERENCE__VALUE_EXPRESSION:
        setValueExpression(VALUE_EXPRESSION_EDEFAULT);
        return;
      case RetrieverPackage.CREATE_EREFERENCE__DEFERRED:
        setDeferred(DEFERRED_EDEFAULT);
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
      case RetrieverPackage.CREATE_EREFERENCE__FEATURE:
        return feature != null;
      case RetrieverPackage.CREATE_EREFERENCE__VALUE_EXPRESSION:
        return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
      case RetrieverPackage.CREATE_EREFERENCE__DEFERRED:
        return deferred != DEFERRED_EDEFAULT;
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
    result.append(", deferred: ");
    result.append(deferred);
    result.append(')');
    return result.toString();
  }

} //CreateEReferenceImpl
