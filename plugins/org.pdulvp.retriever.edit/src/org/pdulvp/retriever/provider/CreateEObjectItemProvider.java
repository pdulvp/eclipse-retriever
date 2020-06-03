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
import org.pdulvp.retriever.CreateEObject;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * This is the item provider adapter for a {@link org.pdulvp.retriever.CreateEObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateEObjectItemProvider extends CreateNotifierItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CreateEObjectItemProvider(AdapterFactory adapterFactory) {
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

      addContainerExpressionPropertyDescriptor(object);
      addClassPropertyDescriptor(object);
      addContainingFeaturePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Container Expression feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addContainerExpressionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_CreateEObject_containerExpression_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_CreateEObject_containerExpression_feature", "_UI_CreateEObject_type"),
         RetrieverPackage.Literals.CREATE_EOBJECT__CONTAINER_EXPRESSION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addClassPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_CreateEObject_class_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_CreateEObject_class_feature", "_UI_CreateEObject_type"),
         RetrieverPackage.Literals.CREATE_EOBJECT__CLASS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Containing Feature feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addContainingFeaturePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_CreateEObject_containingFeature_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_CreateEObject_containingFeature_feature", "_UI_CreateEObject_type"),
         RetrieverPackage.Literals.CREATE_EOBJECT__CONTAINING_FEATURE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This returns CreateEObject.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateEObject"));
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
    try {
      String label = ((CreateEObject) object).getVariable() + " = new " + ((CreateEObject) object).getClass_().getName();
      return label;
    } catch (Exception e) {
      String label = ((CreateEObject) object).getVariable() + " " + "<unset>";
      return label;
    }
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
    int first = value.indexOf("=");
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

    switch (notification.getFeatureID(CreateEObject.class)) {
      case RetrieverPackage.CREATE_EOBJECT__CONTAINER_EXPRESSION:
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
