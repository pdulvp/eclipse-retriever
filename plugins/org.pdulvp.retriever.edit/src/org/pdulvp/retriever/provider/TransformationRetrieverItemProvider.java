/**
 */
package org.pdulvp.retriever.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.pdulvp.retriever.RetrieverFactory;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.TransformationRetriever;

/**
 * This is the item provider adapter for a {@link org.pdulvp.retriever.TransformationRetriever} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationRetrieverItemProvider extends RetrieverItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationRetrieverItemProvider(AdapterFactory adapterFactory) {
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

      addServicePropertyDescriptor(object);
      addInputPropertyDescriptor(object);
      addVariablePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Service feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addServicePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TransformationRetriever_service_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TransformationRetriever_service_feature", "_UI_TransformationRetriever_type"),
         RetrieverPackage.Literals.TRANSFORMATION_RETRIEVER__SERVICE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Input feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addInputPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TransformationRetriever_input_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TransformationRetriever_input_feature", "_UI_TransformationRetriever_type"),
         RetrieverPackage.Literals.TRANSFORMATION_RETRIEVER__INPUT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Variable feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addVariablePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TransformationRetriever_variable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TransformationRetriever_variable_feature", "_UI_TransformationRetriever_type"),
         RetrieverPackage.Literals.TRANSFORMATION_RETRIEVER__VARIABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS);
      childrenFeatures.add(RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_SERVICES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns TransformationRetriever.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/TransformationRetriever"));
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
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((TransformationRetriever)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_TransformationRetriever_type") :
      getString("_UI_TransformationRetriever_type") + " " + label;
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

    switch (notification.getFeatureID(TransformationRetriever.class)) {
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__INPUT:
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__VARIABLE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_ELEMENTS:
      case RetrieverPackage.TRANSFORMATION_RETRIEVER__OWNED_SERVICES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createRetrieverContainer()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createRetrieverRoot()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createRetrieverPkg()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createURLRetriever()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createElementRetriever()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createAttributeRetriever()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createTransformationRetriever()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createReferencedRetriever()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createSetVariable()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createCreateDirectEObject()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createCreateEObject()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createCreateEReference()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createCreateEAttribute()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createCreateFile()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createLoadResource()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS,
         RetrieverFactory.eINSTANCE.createIf()));

    newChildDescriptors.add
      (createChildParameter
        (RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_SERVICES,
         RetrieverFactory.eINSTANCE.createTransformationService()));
  }

}
