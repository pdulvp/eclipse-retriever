/**
 */
package org.pdulvp.retriever.result.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.AttributeRetriever;
import org.pdulvp.retriever.result.AttributeResult;
import org.pdulvp.retriever.result.ResultPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Attribute Result</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.pdulvp.retriever.result.impl.AttributeResultImpl#getElement <em>Element</em>}</li>
 * <li>{@link org.pdulvp.retriever.result.impl.AttributeResultImpl#getDefinition <em>Definition</em>}</li>
 * <li>{@link org.pdulvp.retriever.result.impl.AttributeResultImpl#getValue <em>Value</em>}</li>
 * <li>{@link org.pdulvp.retriever.result.impl.AttributeResultImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeResultImpl extends ResultImpl implements AttributeResult {
  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final Object ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected Object element = ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected AttributeRetriever definition;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AttributeResultImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ResultPackage.Literals.ATTRIBUTE_RESULT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Object getElement() {
    return element;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setElement(Object newElement) {
    Object oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ATTRIBUTE_RESULT__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AttributeRetriever getDefinition() {
    if (definition != null && definition.eIsProxy()) {
      InternalEObject oldDefinition = (InternalEObject)definition;
      definition = (AttributeRetriever)eResolveProxy(oldDefinition);
      if (definition != oldDefinition) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.ATTRIBUTE_RESULT__DEFINITION, oldDefinition, definition));
      }
    }
    return definition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AttributeRetriever basicGetDefinition() {
    return definition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDefinition(AttributeRetriever newDefinition) {
    AttributeRetriever oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ATTRIBUTE_RESULT__DEFINITION, oldDefinition, definition));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ATTRIBUTE_RESULT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public String getName() {
    if (getDefinition() != null) {
      return getDefinition().getName();
    }
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ResultPackage.ATTRIBUTE_RESULT__ELEMENT:
        return getElement();
      case ResultPackage.ATTRIBUTE_RESULT__DEFINITION:
        if (resolve) return getDefinition();
        return basicGetDefinition();
      case ResultPackage.ATTRIBUTE_RESULT__VALUE:
        return getValue();
      case ResultPackage.ATTRIBUTE_RESULT__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ResultPackage.ATTRIBUTE_RESULT__ELEMENT:
        setElement(newValue);
        return;
      case ResultPackage.ATTRIBUTE_RESULT__DEFINITION:
        setDefinition((AttributeRetriever)newValue);
        return;
      case ResultPackage.ATTRIBUTE_RESULT__VALUE:
        setValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case ResultPackage.ATTRIBUTE_RESULT__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case ResultPackage.ATTRIBUTE_RESULT__DEFINITION:
        setDefinition((AttributeRetriever)null);
        return;
      case ResultPackage.ATTRIBUTE_RESULT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case ResultPackage.ATTRIBUTE_RESULT__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case ResultPackage.ATTRIBUTE_RESULT__DEFINITION:
        return definition != null;
      case ResultPackage.ATTRIBUTE_RESULT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ResultPackage.ATTRIBUTE_RESULT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (element: ");
    result.append(element);
    result.append(", value: ");
    result.append(value);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} // AttributeResultImpl
