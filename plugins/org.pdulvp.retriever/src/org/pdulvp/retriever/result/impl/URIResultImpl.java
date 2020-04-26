/**
 */
package org.pdulvp.retriever.result.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.URLRetriever;
import org.pdulvp.retriever.result.ResultPackage;
import org.pdulvp.retriever.result.URIResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URI Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.result.impl.URIResultImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.impl.URIResultImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.impl.URIResultImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.pdulvp.retriever.result.impl.URIResultImpl#getExternalUri <em>External Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URIResultImpl extends ResultImpl implements URIResult {
	/**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
	protected URLRetriever definition;

	/**
   * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
	protected static final String URI_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
	protected String uri = URI_EDEFAULT;

	/**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
	protected static final Object ELEMENT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
	protected Object element = ELEMENT_EDEFAULT;

	/**
   * The default value of the '{@link #getExternalUri() <em>External Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExternalUri()
   * @generated
   * @ordered
   */
	protected static final String EXTERNAL_URI_EDEFAULT = "";

	/**
   * The cached value of the '{@link #getExternalUri() <em>External Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExternalUri()
   * @generated
   * @ordered
   */
	protected String externalUri = EXTERNAL_URI_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected URIResultImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ResultPackage.Literals.URI_RESULT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public URLRetriever getDefinition() {
    if (definition != null && definition.eIsProxy()) {
      InternalEObject oldDefinition = (InternalEObject)definition;
      definition = (URLRetriever)eResolveProxy(oldDefinition);
      if (definition != oldDefinition) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.URI_RESULT__DEFINITION, oldDefinition, definition));
      }
    }
    return definition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public URLRetriever basicGetDefinition() {
    return definition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDefinition(URLRetriever newDefinition) {
    URLRetriever oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.URI_RESULT__DEFINITION, oldDefinition, definition));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getUri() {
    return uri;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUri(String newUri) {
    String oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.URI_RESULT__URI, oldUri, uri));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Object getElement() {
    return element;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setElement(Object newElement) {
    Object oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.URI_RESULT__ELEMENT, oldElement, element));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getExternalUri() {
    return externalUri;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setExternalUri(String newExternalUri) {
    String oldExternalUri = externalUri;
    externalUri = newExternalUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.URI_RESULT__EXTERNAL_URI, oldExternalUri, externalUri));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ResultPackage.URI_RESULT__DEFINITION:
        if (resolve) return getDefinition();
        return basicGetDefinition();
      case ResultPackage.URI_RESULT__URI:
        return getUri();
      case ResultPackage.URI_RESULT__ELEMENT:
        return getElement();
      case ResultPackage.URI_RESULT__EXTERNAL_URI:
        return getExternalUri();
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
      case ResultPackage.URI_RESULT__DEFINITION:
        setDefinition((URLRetriever)newValue);
        return;
      case ResultPackage.URI_RESULT__URI:
        setUri((String)newValue);
        return;
      case ResultPackage.URI_RESULT__ELEMENT:
        setElement(newValue);
        return;
      case ResultPackage.URI_RESULT__EXTERNAL_URI:
        setExternalUri((String)newValue);
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
      case ResultPackage.URI_RESULT__DEFINITION:
        setDefinition((URLRetriever)null);
        return;
      case ResultPackage.URI_RESULT__URI:
        setUri(URI_EDEFAULT);
        return;
      case ResultPackage.URI_RESULT__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case ResultPackage.URI_RESULT__EXTERNAL_URI:
        setExternalUri(EXTERNAL_URI_EDEFAULT);
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
      case ResultPackage.URI_RESULT__DEFINITION:
        return definition != null;
      case ResultPackage.URI_RESULT__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
      case ResultPackage.URI_RESULT__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case ResultPackage.URI_RESULT__EXTERNAL_URI:
        return EXTERNAL_URI_EDEFAULT == null ? externalUri != null : !EXTERNAL_URI_EDEFAULT.equals(externalUri);
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
    result.append(" (uri: ");
    result.append(uri);
    result.append(", element: ");
    result.append(element);
    result.append(", externalUri: ");
    result.append(externalUri);
    result.append(')');
    return result.toString();
  }

} //URIResultImpl
