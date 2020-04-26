/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.SetVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.SetVariableImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.SetVariableImpl#isLog <em>Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetVariableImpl extends CreateNotifierImpl implements SetVariable {
  /**
   * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected static final String EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected String expression = EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #isLog() <em>Log</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isLog()
   * @generated
   * @ordered
   */
	protected static final boolean LOG_EDEFAULT = false;

		/**
   * The cached value of the '{@link #isLog() <em>Log</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isLog()
   * @generated
   * @ordered
   */
	protected boolean log = LOG_EDEFAULT;

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetVariableImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RetrieverPackage.Literals.SET_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpression() {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(String newExpression) {
    String oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.SET_VARIABLE__EXPRESSION, oldExpression, expression));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isLog() {
    return log;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLog(boolean newLog) {
    boolean oldLog = log;
    log = newLog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.SET_VARIABLE__LOG, oldLog, log));
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.SET_VARIABLE__EXPRESSION:
        return getExpression();
      case RetrieverPackage.SET_VARIABLE__LOG:
        return isLog();
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
      case RetrieverPackage.SET_VARIABLE__EXPRESSION:
        setExpression((String)newValue);
        return;
      case RetrieverPackage.SET_VARIABLE__LOG:
        setLog((Boolean)newValue);
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
      case RetrieverPackage.SET_VARIABLE__EXPRESSION:
        setExpression(EXPRESSION_EDEFAULT);
        return;
      case RetrieverPackage.SET_VARIABLE__LOG:
        setLog(LOG_EDEFAULT);
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
      case RetrieverPackage.SET_VARIABLE__EXPRESSION:
        return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
      case RetrieverPackage.SET_VARIABLE__LOG:
        return log != LOG_EDEFAULT;
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
    result.append(" (expression: ");
    result.append(expression);
    result.append(", log: ");
    result.append(log);
    result.append(')');
    return result.toString();
  }

} //SetVariableImpl
