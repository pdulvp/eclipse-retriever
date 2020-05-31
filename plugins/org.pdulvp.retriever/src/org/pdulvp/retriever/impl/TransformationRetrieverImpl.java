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
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverContainer;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.TransformationRetriever;
import org.pdulvp.retriever.TransformationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Retriever</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.TransformationRetrieverImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.TransformationRetrieverImpl#getOwnedServices <em>Owned Services</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.TransformationRetrieverImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.TransformationRetrieverImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.TransformationRetrieverImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationRetrieverImpl extends RetrieverImpl implements TransformationRetriever {
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
   * The cached value of the '{@link #getService() <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getService()
   * @generated
   * @ordered
   */
  protected TransformationService service;

  /**
   * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected static final String INPUT_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected String input = INPUT_EDEFAULT;
  /**
   * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected String variable = VARIABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransformationRetrieverImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RetrieverPackage.Literals.TRANSFORMATION_RETRIEVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public EList<Retriever> getOwnedElements() {
    if (ownedElements == null) {
      ownedElements = new EObjectContainmentEList<Retriever>(Retriever.class, this, RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS);
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
      ownedServices = new EObjectContainmentEList<TransformationService>(TransformationService.class, this, RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES);
    }
    return ownedServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public TransformationService getService() {
    if (service != null && service.eIsProxy()) {
      InternalEObject oldService = (InternalEObject)service;
      service = (TransformationService)eResolveProxy(oldService);
      if (service != oldService) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetrieverPackage.TRANSFORMATION_RETRIEVER__SERVICE, oldService, service));
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
  @Override
		public void setService(TransformationService newService) {
    TransformationService oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.TRANSFORMATION_RETRIEVER__SERVICE, oldService, service));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public String getInput() {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setInput(String newInput) {
    String oldInput = input;
    input = newInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.TRANSFORMATION_RETRIEVER__INPUT, oldInput, input));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public String getVariable() {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setVariable(String newVariable) {
    String oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.TRANSFORMATION_RETRIEVER__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS:
        return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES:
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
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS:
        return getOwnedElements();
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES:
        return getOwnedServices();
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__SERVICE:
        if (resolve) return getService();
        return basicGetService();
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__INPUT:
        return getInput();
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__VARIABLE:
        return getVariable();
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
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS:
        getOwnedElements().clear();
        getOwnedElements().addAll((Collection<? extends Retriever>)newValue);
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES:
        getOwnedServices().clear();
        getOwnedServices().addAll((Collection<? extends TransformationService>)newValue);
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__SERVICE:
        setService((TransformationService)newValue);
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__INPUT:
        setInput((String)newValue);
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__VARIABLE:
        setVariable((String)newValue);
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
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS:
        getOwnedElements().clear();
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES:
        getOwnedServices().clear();
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__SERVICE:
        setService((TransformationService)null);
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__INPUT:
        setInput(INPUT_EDEFAULT);
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
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
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS:
        return ownedElements != null && !ownedElements.isEmpty();
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES:
        return ownedServices != null && !ownedServices.isEmpty();
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__SERVICE:
        return service != null;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__INPUT:
        return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
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
        case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS: return RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS;
        case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES: return RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES;
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
        case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS: return RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS;
        case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES: return RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (input: ");
    result.append(input);
    result.append(", variable: ");
    result.append(variable);
    result.append(')');
    return result.toString();
  }

} //TransformationRetrieverImpl
