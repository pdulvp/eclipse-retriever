/**
 */
package org.pdulvp.retriever.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.provider.StyledString.Style;
import org.pdulvp.retriever.ReferencedRetriever;
import org.pdulvp.retriever.RetrieverPackage;

/**
 * This is the item provider adapter for a {@link org.pdulvp.retriever.ReferencedRetriever} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class ReferencedRetrieverItemProvider extends RetrieverItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReferencedRetrieverItemProvider(AdapterFactory adapterFactory) {
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

      addReferencedElementPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Referenced Element feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addReferencedElementPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ReferencedRetriever_referencedElement_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ReferencedRetriever_referencedElement_feature", "_UI_ReferencedRetriever_type"),
         RetrieverPackage.Literals.REFERENCED_RETRIEVER__REFERENCED_ELEMENT,
         true,
         false,
         false,
         null,
         null,
         null));
  }

  /**
   * This returns ReferencedRetriever.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public Object getImage(Object object) {

    EObject ref = ((ReferencedRetriever) object).getReferencedElement();
    if (ref != null) {
      return overlayImage(object, new AdapterFactoryItemDelegator(getAdapterFactory()).getImage(ref));
    }
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ReferencedRetriever"));
  }

  @Override
  protected Object overlayImage(Object object, Object image) {

    EObject ref = ((ReferencedRetriever) object).getReferencedElement();
    if (ref != null) {
      List<Object> images = new ArrayList<Object>(2);
      images.add(image);
      images.add(getResourceLocator().getImage("full/ovr16/ReferencedRetriever"));
      image = new ComposedImage(images);
    }

    return image;
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

    EObject ref = ((ReferencedRetriever) object).getReferencedElement();

    return new AdapterFactoryItemDelegator(getAdapterFactory()).getText(ref);
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
    result.append("#", Style.QUALIFIER_STYLER);
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

    switch (notification.getFeatureID(ReferencedRetriever.class)) {
      case RetrieverPackage.REFERENCED_RETRIEVER__REFERENCED_ELEMENT:
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
