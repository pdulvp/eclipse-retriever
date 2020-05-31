/**
 */
package org.pdulvp.retriever.result.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pdulvp.retriever.result.Result;
import org.pdulvp.retriever.result.ResultPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.result.impl.ResultImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.impl.ResultImpl#getOwnedResults <em>Owned Results</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.impl.ResultImpl#getOrderedResults <em>Ordered Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
	/**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;
  /**
   * The cached value of the '{@link #getOwnedResults() <em>Owned Results</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOwnedResults()
   * @generated
   * @ordered
   */
	protected EList<Result> ownedResults;

	/**
   * The cached value of the '{@link #getOrderedResults() <em>Ordered Results</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOrderedResults()
   * @generated
   * @ordered
   */
	protected EList<Result> orderedResults;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResultImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ResultPackage.Literals.RESULT;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public String getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<Result> getOwnedResults() {
    if (ownedResults == null) {
      ownedResults = new EObjectContainmentEList<Result>(Result.class, this, ResultPackage.RESULT__OWNED_RESULTS);
    }
    return ownedResults;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<Result> getOrderedResults() {
    if (orderedResults == null) {
      orderedResults = new EObjectResolvingEList<Result>(Result.class, this, ResultPackage.RESULT__ORDERED_RESULTS);
    }
    return orderedResults;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ResultPackage.RESULT__OWNED_RESULTS:
        return ((InternalEList<?>)getOwnedResults()).basicRemove(otherEnd, msgs);
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
      case ResultPackage.RESULT__ID:
        return getId();
      case ResultPackage.RESULT__OWNED_RESULTS:
        return getOwnedResults();
      case ResultPackage.RESULT__ORDERED_RESULTS:
        return getOrderedResults();
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
      case ResultPackage.RESULT__ID:
        setId((String)newValue);
        return;
      case ResultPackage.RESULT__OWNED_RESULTS:
        getOwnedResults().clear();
        getOwnedResults().addAll((Collection<? extends Result>)newValue);
        return;
      case ResultPackage.RESULT__ORDERED_RESULTS:
        getOrderedResults().clear();
        getOrderedResults().addAll((Collection<? extends Result>)newValue);
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
      case ResultPackage.RESULT__ID:
        setId(ID_EDEFAULT);
        return;
      case ResultPackage.RESULT__OWNED_RESULTS:
        getOwnedResults().clear();
        return;
      case ResultPackage.RESULT__ORDERED_RESULTS:
        getOrderedResults().clear();
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
      case ResultPackage.RESULT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ResultPackage.RESULT__OWNED_RESULTS:
        return ownedResults != null && !ownedResults.isEmpty();
      case ResultPackage.RESULT__ORDERED_RESULTS:
        return orderedResults != null && !orderedResults.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ResultImpl
