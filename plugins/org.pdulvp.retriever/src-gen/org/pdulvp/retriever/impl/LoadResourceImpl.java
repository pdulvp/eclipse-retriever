/**
 */
package org.pdulvp.retriever.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pdulvp.retriever.LoadResource;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pdulvp.retriever.impl.LoadResourceImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.LoadResourceImpl#isCreate <em>Create</em>}</li>
 *   <li>{@link org.pdulvp.retriever.impl.LoadResourceImpl#isClearContents <em>Clear Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadResourceImpl extends CreateNotifierImpl implements LoadResource {
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
   * The default value of the '{@link #isCreate() <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCreate()
   * @generated
   * @ordered
   */
  protected static final boolean CREATE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isCreate() <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCreate()
   * @generated
   * @ordered
   */
  protected boolean create = CREATE_EDEFAULT;

  /**
   * The default value of the '{@link #isClearContents() <em>Clear Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClearContents()
   * @generated
   * @ordered
   */
  protected static final boolean CLEAR_CONTENTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClearContents() <em>Clear Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClearContents()
   * @generated
   * @ordered
   */
  protected boolean clearContents = CLEAR_CONTENTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadResourceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return RetrieverPackage.Literals.LOAD_RESOURCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.LOAD_RESOURCE__URI, oldUri, uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreate() {
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreate(boolean newCreate) {
    boolean oldCreate = create;
    create = newCreate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.LOAD_RESOURCE__CREATE, oldCreate, create));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClearContents() {
    return clearContents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClearContents(boolean newClearContents) {
    boolean oldClearContents = clearContents;
    clearContents = newClearContents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetrieverPackage.LOAD_RESOURCE__CLEAR_CONTENTS, oldClearContents, clearContents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case RetrieverPackage.LOAD_RESOURCE__URI:
        return getUri();
      case RetrieverPackage.LOAD_RESOURCE__CREATE:
        return isCreate();
      case RetrieverPackage.LOAD_RESOURCE__CLEAR_CONTENTS:
        return isClearContents();
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
      case RetrieverPackage.LOAD_RESOURCE__URI:
        setUri((String)newValue);
        return;
      case RetrieverPackage.LOAD_RESOURCE__CREATE:
        setCreate((Boolean)newValue);
        return;
      case RetrieverPackage.LOAD_RESOURCE__CLEAR_CONTENTS:
        setClearContents((Boolean)newValue);
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
      case RetrieverPackage.LOAD_RESOURCE__URI:
        setUri(URI_EDEFAULT);
        return;
      case RetrieverPackage.LOAD_RESOURCE__CREATE:
        setCreate(CREATE_EDEFAULT);
        return;
      case RetrieverPackage.LOAD_RESOURCE__CLEAR_CONTENTS:
        setClearContents(CLEAR_CONTENTS_EDEFAULT);
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
      case RetrieverPackage.LOAD_RESOURCE__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
      case RetrieverPackage.LOAD_RESOURCE__CREATE:
        return create != CREATE_EDEFAULT;
      case RetrieverPackage.LOAD_RESOURCE__CLEAR_CONTENTS:
        return clearContents != CLEAR_CONTENTS_EDEFAULT;
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
    result.append(", create: ");
    result.append(create);
    result.append(", clearContents: ");
    result.append(clearContents);
    result.append(')');
    return result.toString();
  }

} //LoadResourceImpl
