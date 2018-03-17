/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.ReferencedRetriever;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Retriever</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.ReferencedRetrieverImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencedRetrieverImpl extends RetrieverImpl implements ReferencedRetriever {
	/**
   * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReferencedElement()
   * @generated
   * @ordered
   */
	protected Retriever referencedElement;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ReferencedRetrieverImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return RetrieverPackage.Literals.REFERENCED_RETRIEVER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Retriever getReferencedElement() {
    if (referencedElement != null && referencedElement.eIsProxy()) {
      InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
      referencedElement = (Retriever)eResolveProxy(oldReferencedElement);
      if (referencedElement != oldReferencedElement) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.REFERENCED_RETRIEVER__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
      }
    }
    return referencedElement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Retriever basicGetReferencedElement() {
    return referencedElement;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReferencedElement(Retriever newReferencedElement) {
    Retriever oldReferencedElement = referencedElement;
    referencedElement = newReferencedElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.REFERENCED_RETRIEVER__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.REFERENCED_RETRIEVER__REFERENCED_ELEMENT:
        if (resolve) return getReferencedElement();
        return basicGetReferencedElement();
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
      case RetrieverPackage.REFERENCED_RETRIEVER__REFERENCED_ELEMENT:
        setReferencedElement((Retriever)newValue);
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
      case RetrieverPackage.REFERENCED_RETRIEVER__REFERENCED_ELEMENT:
        setReferencedElement((Retriever)null);
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
      case RetrieverPackage.REFERENCED_RETRIEVER__REFERENCED_ELEMENT:
        return referencedElement != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferencedRetrieverImpl
