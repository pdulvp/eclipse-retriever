/**
 */
package org.pdulvp.retriever.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.retriever.If;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverContainer;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.TransformationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.IfImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.IfImpl#getOwnedServices <em>Owned Services</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.IfImpl#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends RetrieverImpl implements If {
  /**
   * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedElements()
   * @generated
   * @ordered
   */
  protected EList<Retriever> ownedElements;

  /**
   * The cached value of the '{@link #getOwnedServices() <em>Owned Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedServices()
   * @generated
   * @ordered
   */
  protected EList<TransformationService> ownedServices;

  /**
   * The default value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionExpression()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionExpression()
   * @generated
   * @ordered
   */
  protected String conditionExpression = CONDITION_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RetrieverPackage.Literals.IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Retriever> getOwnedElements() {
    if (ownedElements == null) {
      ownedElements = new EObjectContainmentEList<Retriever>(Retriever.class, this, RetrieverPackage.IF__OWNED_ELEMENTS);
    }
    return ownedElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransformationService> getOwnedServices() {
    if (ownedServices == null) {
      ownedServices = new EObjectContainmentEList<TransformationService>(TransformationService.class, this, RetrieverPackage.IF__OWNED_SERVICES);
    }
    return ownedServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConditionExpression() {
    return conditionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionExpression(String newConditionExpression) {
    String oldConditionExpression = conditionExpression;
    conditionExpression = newConditionExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.IF__CONDITION_EXPRESSION, oldConditionExpression, conditionExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RetrieverPackage.IF__OWNED_ELEMENTS:
        return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
      case RetrieverPackage.IF__OWNED_SERVICES:
        return ((InternalEList<?>)getOwnedServices()).basicRemove(otherEnd, msgs);
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
      case RetrieverPackage.IF__OWNED_ELEMENTS:
        return getOwnedElements();
      case RetrieverPackage.IF__OWNED_SERVICES:
        return getOwnedServices();
      case RetrieverPackage.IF__CONDITION_EXPRESSION:
        return getConditionExpression();
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
      case RetrieverPackage.IF__OWNED_ELEMENTS:
        getOwnedElements().clear();
        getOwnedElements().addAll((Collection<? extends Retriever>)newValue);
        return;
      case RetrieverPackage.IF__OWNED_SERVICES:
        getOwnedServices().clear();
        getOwnedServices().addAll((Collection<? extends TransformationService>)newValue);
        return;
      case RetrieverPackage.IF__CONDITION_EXPRESSION:
        setConditionExpression((String)newValue);
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
      case RetrieverPackage.IF__OWNED_ELEMENTS:
        getOwnedElements().clear();
        return;
      case RetrieverPackage.IF__OWNED_SERVICES:
        getOwnedServices().clear();
        return;
      case RetrieverPackage.IF__CONDITION_EXPRESSION:
        setConditionExpression(CONDITION_EXPRESSION_EDEFAULT);
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
      case RetrieverPackage.IF__OWNED_ELEMENTS:
        return ownedElements != null && !ownedElements.isEmpty();
      case RetrieverPackage.IF__OWNED_SERVICES:
        return ownedServices != null && !ownedServices.isEmpty();
      case RetrieverPackage.IF__CONDITION_EXPRESSION:
        return CONDITION_EXPRESSION_EDEFAULT == null ? conditionExpression != null : !CONDITION_EXPRESSION_EDEFAULT.equals(conditionExpression);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == RetrieverContainer.class) {
      switch (derivedFeatureID) {
        case RetrieverPackage.IF__OWNED_ELEMENTS: return RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS;
        case RetrieverPackage.IF__OWNED_SERVICES: return RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == RetrieverContainer.class) {
      switch (baseFeatureID) {
        case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS: return RetrieverPackage.IF__OWNED_ELEMENTS;
        case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES: return RetrieverPackage.IF__OWNED_SERVICES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (conditionExpression: ");
    result.append(conditionExpression);
    result.append(')');
    return result.toString();
  }

} //IfImpl
