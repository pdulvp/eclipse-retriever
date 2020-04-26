/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.AttributeRetriever;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.TransformationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Retriever</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.AttributeRetrieverImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.AttributeRetrieverImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.AttributeRetrieverImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeRetrieverImpl extends RetrieverImpl implements AttributeRetriever {
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
   * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAlternative()
   * @generated
   * @ordered
   */
	protected AttributeRetriever alternative;
	/**
   * The cached value of the '{@link #getService() <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected TransformationService service;
  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AttributeRetrieverImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return RetrieverPackage.Literals.ATTRIBUTE_RETRIEVER;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueExpression() {
    return valueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueExpression(String newValueExpression) {
    String oldValueExpression = valueExpression;
    valueExpression = newValueExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.ATTRIBUTE_RETRIEVER__VALUE_EXPRESSION, oldValueExpression, valueExpression));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AttributeRetriever getAlternative() {
    return alternative;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAlternative(AttributeRetriever newAlternative, NotificationChain msgs) {
    AttributeRetriever oldAlternative = alternative;
    alternative = newAlternative;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE, oldAlternative, newAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAlternative(AttributeRetriever newAlternative) {
    if (newAlternative != alternative) {
      NotificationChain msgs = null;
      if (alternative != null)
        msgs = ((InternalEObject)alternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE, null, msgs);
      if (newAlternative != null)
        msgs = ((InternalEObject)newAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE, null, msgs);
      msgs = basicSetAlternative(newAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE, newAlternative, newAlternative));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationService getService() {
    if (service != null && service.eIsProxy()) {
      InternalEObject oldService = (InternalEObject)service;
      service = (TransformationService)eResolveProxy(oldService);
      if (service != oldService) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.ATTRIBUTE_RETRIEVER__SERVICE, oldService, service));
      }
    }
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationService basicGetService() {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(TransformationService newService) {
    TransformationService oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.ATTRIBUTE_RETRIEVER__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE:
        return basicSetAlternative(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__VALUE_EXPRESSION:
        return getValueExpression();
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE:
        return getAlternative();
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__SERVICE:
        if (resolve) return getService();
        return basicGetService();
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
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__VALUE_EXPRESSION:
        setValueExpression((String)newValue);
        return;
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE:
        setAlternative((AttributeRetriever)newValue);
        return;
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__SERVICE:
        setService((TransformationService)newValue);
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
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__VALUE_EXPRESSION:
        setValueExpression(VALUE_EXPRESSION_EDEFAULT);
        return;
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE:
        setAlternative((AttributeRetriever)null);
        return;
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__SERVICE:
        setService((TransformationService)null);
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
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__VALUE_EXPRESSION:
        return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__ALTERNATIVE:
        return alternative != null;
      case RetrieverPackage.ATTRIBUTE_RETRIEVER__SERVICE:
        return service != null;
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
    result.append(" (valueExpression: ");
    result.append(valueExpression);
    result.append(')');
    return result.toString();
  }

} //AttributeRetrieverImpl
