/**
 */
package org.pdulvp.retriever.result.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.provider.StyledString.Style;
import org.pdulvp.retriever.result.ResultPackage;
import org.pdulvp.retriever.result.URIResult;

/**
 * This is the item provider adapter for a {@link org.pdulvp.retriever.result.URIResult} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class URIResultItemProvider extends ResultItemProvider {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public URIResultItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

	/**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addUriPropertyDescriptor(object);
      addElementPropertyDescriptor(object);
      addExternalUriPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Uri feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addUriPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_URIResult_uri_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_URIResult_uri_feature", "_UI_URIResult_type"),
         ResultPackage.Literals.URI_RESULT__URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Element feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addElementPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_URIResult_element_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_URIResult_element_feature", "_UI_URIResult_type"),
         ResultPackage.Literals.URI_RESULT__ELEMENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the External Uri feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addExternalUriPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_URIResult_externalUri_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_URIResult_externalUri_feature", "_UI_URIResult_type"),
         ResultPackage.Literals.URI_RESULT__EXTERNAL_URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This returns URIResult.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/URIResult"));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage() {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated NOT
   */
	@Override
	public String getText(Object object) {
	  String labelValue = "";
    labelValue += ((URIResult)object).getDefinition().getName();
    labelValue += " < ";
    labelValue += ((URIResult)object).getUri();
    return labelValue;
  }
	

	/**
   * This returns the label styled text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public Object getStyledText(Object object) {
    StyledString result = new StyledString();
    String value = getText(object);
    int first = value.indexOf("<");
    result.append(value.substring(0, first), Style.NO_STYLE);
    result.append(value.substring(first), Style.DECORATIONS_STYLER);
    return result;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(URIResult.class)) {
      case ResultPackage.URI_RESULT__URI:
      case ResultPackage.URI_RESULT__ELEMENT:
      case ResultPackage.URI_RESULT__EXTERNAL_URI:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
    }
    super.notifyChanged(notification);
  }

	/**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
