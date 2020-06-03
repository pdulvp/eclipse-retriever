/**
 */
package org.pdulvp.retriever.provider;

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
import org.eclipse.osgi.util.NLS;
import org.pdulvp.retriever.LoadResource;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * This is the item provider adapter for a {@link org.pdulvp.retriever.LoadResource} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class LoadResourceItemProvider extends CreateNotifierItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LoadResourceItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addUriPropertyDescriptor(object);
      addCreatePropertyDescriptor(object);
      addClearContentsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Uri feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addUriPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LoadResource_uri_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LoadResource_uri_feature", "_UI_LoadResource_type"),
         RetrieverPackage.Literals.LOAD_RESOURCE__URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Create feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addCreatePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LoadResource_create_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LoadResource_create_feature", "_UI_LoadResource_type"),
         RetrieverPackage.Literals.LOAD_RESOURCE__CREATE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Clear Contents feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addClearContentsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LoadResource_clearContents_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LoadResource_clearContents_feature", "_UI_LoadResource_type"),
         RetrieverPackage.Literals.LOAD_RESOURCE__CLEAR_CONTENTS,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns LoadResource.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/LoadResource"));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage() {
    return true;
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public String getText(Object object) {
    return NLS.bind("{0} - {1}", ((LoadResource) object).getVariable(), ((LoadResource) object).getUri());
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
    int first = value.indexOf("-");
    result.append(value.substring(0, first), Style.NO_STYLE);
    result.append(value.substring(first), Style.DECORATIONS_STYLER);
    return result;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(LoadResource.class)) {
      case RetrieverPackage.LOAD_RESOURCE__URI:
      case RetrieverPackage.LOAD_RESOURCE__CREATE:
      case RetrieverPackage.LOAD_RESOURCE__CLEAR_CONTENTS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
