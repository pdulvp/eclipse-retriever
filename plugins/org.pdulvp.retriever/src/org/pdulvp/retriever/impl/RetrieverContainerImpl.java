/**
 */
package org.pdulvp.retriever.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverContainer;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.TransformationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.RetrieverContainerImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.RetrieverContainerImpl#getOwnedServices <em>Owned Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetrieverContainerImpl extends RetrieverImpl implements RetrieverContainer {
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RetrieverContainerImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return RetrieverPackage.Literals.RETRIEVER_CONTAINER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<Retriever> getOwnedElements() {
    if (ownedElements == null) {
      ownedElements = new EObjectContainmentEList<Retriever>(Retriever.class, this, RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS);
    }
    return ownedElements;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<TransformationService> getOwnedServices() {
    if (ownedServices == null) {
      ownedServices = new EObjectContainmentEList<TransformationService>(TransformationService.class, this, RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES);
    }
    return ownedServices;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS:
        return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES:
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
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS:
        return getOwnedElements();
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES:
        return getOwnedServices();
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
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS:
        getOwnedElements().clear();
        getOwnedElements().addAll((Collection<? extends Retriever>)newValue);
        return;
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES:
        getOwnedServices().clear();
        getOwnedServices().addAll((Collection<? extends TransformationService>)newValue);
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
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS:
        getOwnedElements().clear();
        return;
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES:
        getOwnedServices().clear();
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
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS:
        return ownedElements != null && !ownedElements.isEmpty();
      case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES:
        return ownedServices != null && !ownedServices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RetrieverContainerImpl
