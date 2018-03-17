/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.CreateDirectEObject;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Direct EObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.CreateDirectEObjectImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.CreateDirectEObjectImpl#getContainingFeature <em>Containing Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateDirectEObjectImpl extends CreateNotifierImpl implements CreateDirectEObject {
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
  protected CreateDirectEObjectImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RetrieverPackage.Literals.CREATE_DIRECT_EOBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_() {
    if (class_ != null && class_.eIsProxy()) {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (EClass)eResolveProxy(oldClass);
      if (class_ != oldClass) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.CREATE_DIRECT_EOBJECT__CLASS, oldClass, class_));
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
  public void setClass(EClass newClass) {
    EClass oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_DIRECT_EOBJECT__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainingFeature() {
    if (containingFeature != null && containingFeature.eIsProxy()) {
      InternalEObject oldContainingFeature = (InternalEObject)containingFeature;
      containingFeature = (EReference)eResolveProxy(oldContainingFeature);
      if (containingFeature != oldContainingFeature) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.CREATE_DIRECT_EOBJECT__CONTAINING_FEATURE, oldContainingFeature, containingFeature));
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
  public void setContainingFeature(EReference newContainingFeature) {
    EReference oldContainingFeature = containingFeature;
    containingFeature = newContainingFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.CREATE_DIRECT_EOBJECT__CONTAINING_FEATURE, oldContainingFeature, containingFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.CREATE_DIRECT_EOBJECT__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
      case RetrieverPackage.CREATE_DIRECT_EOBJECT__CONTAINING_FEATURE:
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
      case RetrieverPackage.CREATE_DIRECT_EOBJECT__CLASS:
        setClass((EClass)newValue);
        return;
      case RetrieverPackage.CREATE_DIRECT_EOBJECT__CONTAINING_FEATURE:
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
      case RetrieverPackage.CREATE_DIRECT_EOBJECT__CLASS:
        setClass((EClass)null);
        return;
      case RetrieverPackage.CREATE_DIRECT_EOBJECT__CONTAINING_FEATURE:
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
      case RetrieverPackage.CREATE_DIRECT_EOBJECT__CLASS:
        return class_ != null;
      case RetrieverPackage.CREATE_DIRECT_EOBJECT__CONTAINING_FEATURE:
        return containingFeature != null;
    }
    return super.eIsSet(featureID);
  }

} //CreateDirectEObjectImpl
