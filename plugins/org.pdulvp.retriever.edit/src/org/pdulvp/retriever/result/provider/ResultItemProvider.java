/**
 */
package org.pdulvp.retriever.result.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.pdulvp.retriever.provider.RetrieverEditPlugin;
import org.pdulvp.retriever.result.Result;
import org.pdulvp.retriever.result.ResultFactory;
import org.pdulvp.retriever.result.ResultPackage;

/**
 * This is the item provider adapter for a {@link org.pdulvp.retriever.result.Result} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemStyledLabelProvider {
	/**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultItemProvider(AdapterFactory adapterFactory) {
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

      addIdPropertyDescriptor(object);
      addOrderedResultsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Id feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIdPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Result_id_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Result_id_feature", "_UI_Result_type"),
         ResultPackage.Literals.RESULT__ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Ordered Results feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addOrderedResultsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Result_orderedResults_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Result_orderedResults_feature", "_UI_Result_type"),
         ResultPackage.Literals.RESULT__ORDERED_RESULTS,
         true,
         false,
         true,
         null,
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
      childrenFeatures.add(ResultPackage.Literals.RESULT__OWNED_RESULTS);
      childrenFeatures.add(ResultPackage.Literals.RESULT__ORDERED_RESULTS);
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
   * This returns Result.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Result"));
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
    return ((StyledString)getStyledText(object)).getString();
  }
	

	/**
   * This returns the label styled text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public Object getStyledText(Object object) {
    String label = ((Result)object).getId();
    	StyledString styledLabel = new StyledString();
    if (label == null || label.length() == 0) {
      styledLabel.append(getString("_UI_Result_type"), StyledString.Style.QUALIFIER_STYLER); 
    } else {
      styledLabel.append(getString("_UI_Result_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
    }
    return styledLabel;
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

    switch (notification.getFeatureID(Result.class)) {
      case ResultPackage.RESULT__ID:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case ResultPackage.RESULT__OWNED_RESULTS:
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
        (ResultPackage.Literals.RESULT__OWNED_RESULTS,
         ResultFactory.eINSTANCE.createResultRoot()));

    newChildDescriptors.add
      (createChildParameter
        (ResultPackage.Literals.RESULT__OWNED_RESULTS,
         ResultFactory.eINSTANCE.createURIResult()));

    newChildDescriptors.add
      (createChildParameter
        (ResultPackage.Literals.RESULT__OWNED_RESULTS,
         ResultFactory.eINSTANCE.createElementResult()));

    newChildDescriptors.add
      (createChildParameter
        (ResultPackage.Literals.RESULT__OWNED_RESULTS,
         ResultFactory.eINSTANCE.createAttributeResult()));
  }

	/**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    return RetrieverEditPlugin.INSTANCE;
  }

}
