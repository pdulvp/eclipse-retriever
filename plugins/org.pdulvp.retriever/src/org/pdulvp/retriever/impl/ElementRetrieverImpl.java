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
import org.pdulvp.retriever.ElementRetriever;
import org.pdulvp.retriever.IVariableElement;
import org.pdulvp.retriever.IVariableResultElement;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverContainer;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.TransformationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Retriever</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.ElementRetrieverImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.ElementRetrieverImpl#getOwnedServices <em>Owned Services</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.ElementRetrieverImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.ElementRetrieverImpl#getVariableResult <em>Variable Result</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.ElementRetrieverImpl#getRetrieverExpression <em>Retriever Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementRetrieverImpl extends RetrieverImpl implements ElementRetriever {
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
   * The default value of the '{@link #getVariableResult() <em>Variable Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableResult()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_RESULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableResult() <em>Variable Result</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableResult()
   * @generated
   * @ordered
   */
  protected String variableResult = VARIABLE_RESULT_EDEFAULT;

  /**
   * The default value of the '{@link #getRetrieverExpression() <em>Retriever Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetrieverExpression()
   * @generated
   * @ordered
   */
  protected static final String RETRIEVER_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRetrieverExpression() <em>Retriever Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetrieverExpression()
   * @generated
   * @ordered
   */
  protected String retrieverExpression = RETRIEVER_EXPRESSION_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ElementRetrieverImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return RetrieverPackage.Literals.ELEMENT_RETRIEVER;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EList<Retriever> getOwnedElements() {
    if (ownedElements == null) {
      ownedElements = new EObjectContainmentEList<Retriever>(Retriever.class, this, RetrieverPackage.ELEMENT_RETRIEVER__OWNED_ELEMENTS);
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
      ownedServices = new EObjectContainmentEList<TransformationService>(TransformationService.class, this, RetrieverPackage.ELEMENT_RETRIEVER__OWNED_SERVICES);
    }
    return ownedServices;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVariableResult() {
    return variableResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariableResult(String newVariableResult) {
    String oldVariableResult = variableResult;
    variableResult = newVariableResult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE_RESULT, oldVariableResult, variableResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public String getRetrieverExpression() {
    return retrieverExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
		public void setRetrieverExpression(String newRetrieverExpression) {
    String oldRetrieverExpression = retrieverExpression;
    retrieverExpression = newRetrieverExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.ELEMENT_RETRIEVER__RETRIEVER_EXPRESSION, oldRetrieverExpression, retrieverExpression));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_ELEMENTS:
        return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_SERVICES:
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
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_ELEMENTS:
        return getOwnedElements();
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_SERVICES:
        return getOwnedServices();
      case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE:
        return getVariable();
      case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE_RESULT:
        return getVariableResult();
      case RetrieverPackage.ELEMENT_RETRIEVER__RETRIEVER_EXPRESSION:
        return getRetrieverExpression();
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
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_ELEMENTS:
        getOwnedElements().clear();
        getOwnedElements().addAll((Collection<? extends Retriever>)newValue);
        return;
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_SERVICES:
        getOwnedServices().clear();
        getOwnedServices().addAll((Collection<? extends TransformationService>)newValue);
        return;
      case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE:
        setVariable((String)newValue);
        return;
      case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE_RESULT:
        setVariableResult((String)newValue);
        return;
      case RetrieverPackage.ELEMENT_RETRIEVER__RETRIEVER_EXPRESSION:
        setRetrieverExpression((String)newValue);
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
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_ELEMENTS:
        getOwnedElements().clear();
        return;
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_SERVICES:
        getOwnedServices().clear();
        return;
      case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE_RESULT:
        setVariableResult(VARIABLE_RESULT_EDEFAULT);
        return;
      case RetrieverPackage.ELEMENT_RETRIEVER__RETRIEVER_EXPRESSION:
        setRetrieverExpression(RETRIEVER_EXPRESSION_EDEFAULT);
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
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_ELEMENTS:
        return ownedElements != null && !ownedElements.isEmpty();
      case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_SERVICES:
        return ownedServices != null && !ownedServices.isEmpty();
      case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE_RESULT:
        return VARIABLE_RESULT_EDEFAULT == null ? variableResult != null : !VARIABLE_RESULT_EDEFAULT.equals(variableResult);
      case RetrieverPackage.ELEMENT_RETRIEVER__RETRIEVER_EXPRESSION:
        return RETRIEVER_EXPRESSION_EDEFAULT == null ? retrieverExpression != null : !RETRIEVER_EXPRESSION_EDEFAULT.equals(retrieverExpression);
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
        case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_ELEMENTS: return RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS;
        case RetrieverPackage.ELEMENT_RETRIEVER__OWNED_SERVICES: return RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES;
        default: return -1;
      }
    }
    if (baseClass == IVariableElement.class) {
      switch (derivedFeatureID) {
        case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE: return RetrieverPackage.IVARIABLE_ELEMENT__VARIABLE;
        default: return -1;
      }
    }
    if (baseClass == IVariableResultElement.class) {
      switch (derivedFeatureID) {
        case RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE_RESULT: return RetrieverPackage.IVARIABLE_RESULT_ELEMENT__VARIABLE_RESULT;
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
        case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_ELEMENTS: return RetrieverPackage.ELEMENT_RETRIEVER__OWNED_ELEMENTS;
        case RetrieverPackage.RETRIEVER_CONTAINER__OWNED_SERVICES: return RetrieverPackage.ELEMENT_RETRIEVER__OWNED_SERVICES;
        default: return -1;
      }
    }
    if (baseClass == IVariableElement.class) {
      switch (baseFeatureID) {
        case RetrieverPackage.IVARIABLE_ELEMENT__VARIABLE: return RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE;
        default: return -1;
      }
    }
    if (baseClass == IVariableResultElement.class) {
      switch (baseFeatureID) {
        case RetrieverPackage.IVARIABLE_RESULT_ELEMENT__VARIABLE_RESULT: return RetrieverPackage.ELEMENT_RETRIEVER__VARIABLE_RESULT;
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
    result.append(" (variable: ");
    result.append(variable);
    result.append(", variableResult: ");
    result.append(variableResult);
    result.append(", retrieverExpression: ");
    result.append(retrieverExpression);
    result.append(')');
    return result.toString();
  }

} //ElementRetrieverImpl
