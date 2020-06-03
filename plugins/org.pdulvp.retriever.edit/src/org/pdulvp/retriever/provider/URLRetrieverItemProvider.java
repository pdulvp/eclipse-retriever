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
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.provider.StyledString.Style;
import org.eclipse.osgi.util.NLS;
import org.pdulvp.retriever.RetrieverFactory;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.URLRetriever;

/**
 * This is the item provider adapter for a {@link org.pdulvp.retriever.URLRetriever} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class URLRetrieverItemProvider extends RetrieverItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public URLRetrieverItemProvider(AdapterFactory adapterFactory) {
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

      addVariablePropertyDescriptor(object);
      addVariableResultPropertyDescriptor(object);
      addUriExpressionPropertyDescriptor(object);
      addCacheControlPropertyDescriptor(object);
      addAsSemanticPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
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
         getString("_UI_IVariableElement_variable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_IVariableElement_variable_feature", "_UI_IVariableElement_type"),
         RetrieverPackage.Literals.IVARIABLE_ELEMENT__VARIABLE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Variable Result feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addVariableResultPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_IVariableResultElement_variableResult_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_IVariableResultElement_variableResult_feature", "_UI_IVariableResultElement_type"),
         RetrieverPackage.Literals.IVARIABLE_RESULT_ELEMENT__VARIABLE_RESULT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Uri Expression feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addUriExpressionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_URLRetriever_uriExpression_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_URLRetriever_uriExpression_feature", "_UI_URLRetriever_type"),
         RetrieverPackage.Literals.URL_RETRIEVER__URI_EXPRESSION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Cache Control feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCacheControlPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_URLRetriever_cacheControl_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_URLRetriever_cacheControl_feature", "_UI_URLRetriever_type"),
         RetrieverPackage.Literals.URL_RETRIEVER__CACHE_CONTROL,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the As Semantic feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAsSemanticPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_URLRetriever_asSemantic_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_URLRetriever_asSemantic_feature", "_UI_URLRetriever_type"),
         RetrieverPackage.Literals.URL_RETRIEVER__AS_SEMANTIC,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_ELEMENTS);
      childrenFeatures.add(RetrieverPackage.Literals.RETRIEVER_CONTAINER__OWNED_SERVICES);
      childrenFeatures.add(RetrieverPackage.Literals.URL_RETRIEVER__OWNED_VARIABLES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns URLRetriever.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/URLRetriever"));
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
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public String getText(Object object) {
    return NLS.bind("{0} - {1}", ((URLRetriever) object).getName(), ((URLRetriever) object).getUriExpression());
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

    switch (notification.getFeatureID(URLRetriever.class)) {
      case RetrieverPackage.URL_RETRIEVER__VARIABLE:
      case RetrieverPackage.URL_RETRIEVER__VARIABLE_RESULT:
      case RetrieverPackage.URL_RETRIEVER__URI_EXPRESSION:
      case RetrieverPackage.URL_RETRIEVER__CACHE_CONTROL:
      case RetrieverPackage.URL_RETRIEVER__AS_SEMANTIC:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case RetrieverPackage.URL_RETRIEVER__OWNED_ELEMENTS:
      case RetrieverPackage.URL_RETRIEVER__OWNED_SERVICES:
      case RetrieverPackage.URL_RETRIEVER__OWNED_VARIABLES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
