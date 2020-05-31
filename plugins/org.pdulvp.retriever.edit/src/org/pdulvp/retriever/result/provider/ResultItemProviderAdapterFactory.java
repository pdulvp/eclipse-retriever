/**
 */
package org.pdulvp.retriever.result.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.pdulvp.retriever.result.util.ResultAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultItemProviderAdapterFactory extends ResultAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
   * This constructs an instance.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

	/**
   * This keeps track of the one adapter used for all {@link org.pdulvp.retriever.result.ResultRoot} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResultRootItemProvider resultRootItemProvider;

	/**
   * This creates an adapter for a {@link org.pdulvp.retriever.result.ResultRoot}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createResultRootAdapter() {
    if (resultRootItemProvider == null) {
      resultRootItemProvider = new ResultRootItemProvider(this);
    }

    return resultRootItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.pdulvp.retriever.result.Result} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResultItemProvider resultItemProvider;

	/**
   * This creates an adapter for a {@link org.pdulvp.retriever.result.Result}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createResultAdapter() {
    if (resultItemProvider == null) {
      resultItemProvider = new ResultItemProvider(this);
    }

    return resultItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.pdulvp.retriever.result.URIResult} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected URIResultItemProvider uriResultItemProvider;

	/**
   * This creates an adapter for a {@link org.pdulvp.retriever.result.URIResult}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createURIResultAdapter() {
    if (uriResultItemProvider == null) {
      uriResultItemProvider = new URIResultItemProvider(this);
    }

    return uriResultItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.pdulvp.retriever.result.ElementResult} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ElementResultItemProvider elementResultItemProvider;

	/**
   * This creates an adapter for a {@link org.pdulvp.retriever.result.ElementResult}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createElementResultAdapter() {
    if (elementResultItemProvider == null) {
      elementResultItemProvider = new ElementResultItemProvider(this);
    }

    return elementResultItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.pdulvp.retriever.result.AttributeResult} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AttributeResultItemProvider attributeResultItemProvider;

	/**
   * This creates an adapter for a {@link org.pdulvp.retriever.result.AttributeResult}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createAttributeResultAdapter() {
    if (attributeResultItemProvider == null) {
      attributeResultItemProvider = new AttributeResultItemProvider(this);
    }

    return attributeResultItemProvider;
  }

	/**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

	/**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

	/**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object adapt(Object object, Object type) {
    if (isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

	/**
   * This adds a listener.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

	/**
   * This removes a listener.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

	/**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

	/**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void dispose() {
    if (resultRootItemProvider != null) resultRootItemProvider.dispose();
    if (resultItemProvider != null) resultItemProvider.dispose();
    if (uriResultItemProvider != null) uriResultItemProvider.dispose();
    if (elementResultItemProvider != null) elementResultItemProvider.dispose();
    if (attributeResultItemProvider != null) attributeResultItemProvider.dispose();
  }

}
