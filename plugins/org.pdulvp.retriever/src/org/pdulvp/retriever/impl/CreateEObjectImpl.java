/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.pdulvp.retriever.impl.CreateEObjectImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.CreateEObjectImpl#getContainingFeature <em>Containing Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateEObjectImpl extends CreateNotifierImpl implements CreateEObject {
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
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EClass class_;

  /**
   * The cached value of the '{@link #getContainingFeature() <em>Containing Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainingFeature()
   * @generated
   * @ordered
   */
  protected EReference containingFeature;

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
  @Override
		public String getContainerExpression() {
    return containerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  public EClass getClass_() {
    if (class_ != null && class_.eIsProxy()) {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (EClass)eResolveProxy(oldClass);
      if (class_ != oldClass) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.CREATE_EOBJECT__CLASS, oldClass, class_));
      }
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetClass() {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClass(EClass newClass) {
    EClass oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_EOBJECT__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContainingFeature() {
    if (containingFeature != null && containingFeature.eIsProxy()) {
      InternalEObject oldContainingFeature = (InternalEObject)containingFeature;
      containingFeature = (EReference)eResolveProxy(oldContainingFeature);
      if (containingFeature != oldContainingFeature) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.CREATE_EOBJECT__CONTAINING_FEATURE, oldContainingFeature, containingFeature));
      }
    }
    return containingFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetContainingFeature() {
    return containingFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContainingFeature(EReference newContainingFeature) {
    EReference oldContainingFeature = containingFeature;
    containingFeature = newContainingFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_EOBJECT__CONTAINING_FEATURE, oldContainingFeature, containingFeature));
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
      case RetrieverPackage.CREATE_EOBJECT__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
      case RetrieverPackage.CREATE_EOBJECT__CONTAINING_FEATURE:
        if (resolve) return getContainingFeature();
        return basicGetContainingFeature();
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
      case RetrieverPackage.CREATE_EOBJECT__CLASS:
        setClass((EClass)newValue);
        return;
      case RetrieverPackage.CREATE_EOBJECT__CONTAINING_FEATURE:
        setContainingFeature((EReference)newValue);
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
      case RetrieverPackage.CREATE_EOBJECT__CLASS:
        setClass((EClass)null);
        return;
      case RetrieverPackage.CREATE_EOBJECT__CONTAINING_FEATURE:
        setContainingFeature((EReference)null);
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
      case RetrieverPackage.CREATE_EOBJECT__CLASS:
        return class_ != null;
      case RetrieverPackage.CREATE_EOBJECT__CONTAINING_FEATURE:
        return containingFeature != null;
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
    result.append(" (containerExpression: ");
    result.append(containerExpression);
    result.append(')');
    return result.toString();
  }

} //CreateEObjectImpl
