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
import org.pdulvp.retriever.CreateEAttribute;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * This is the item provider adapter for a {@link org.pdulvp.retriever.CreateEAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateEAttributeItemProvider extends RetrieverItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CreateEAttributeItemProvider(AdapterFactory adapterFactory) {
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

      addFeaturePropertyDescriptor(object);
      addValueExpressionPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Feature feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addFeaturePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_CreateEAttribute_feature_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_CreateEAttribute_feature_feature", "_UI_CreateEAttribute_type"),
         RetrieverPackage.Literals.CREATE_EATTRIBUTE__FEATURE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Value Expression feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addValueExpressionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_CreateEAttribute_valueExpression_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_CreateEAttribute_valueExpression_feature", "_UI_CreateEAttribute_type"),
         RetrieverPackage.Literals.CREATE_EATTRIBUTE__VALUE_EXPRESSION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns CreateEAttribute.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateEAttribute"));
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
      String label = ((CreateEAttribute) object).getFeature().getName() + " - "
          + ((CreateEAttribute) object).getValueExpression();
      return label;
    } catch (Exception e) {
      String label = "<noname> - " + ((CreateEAttribute) object).getValueExpression();
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

    switch (notification.getFeatureID(CreateEAttribute.class)) {
      case RetrieverPackage.CREATE_EATTRIBUTE__VALUE_EXPRESSION:
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
