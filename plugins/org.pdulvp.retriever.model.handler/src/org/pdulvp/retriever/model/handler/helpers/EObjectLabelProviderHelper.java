package org.pdulvp.retriever.model.handler.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * 
 * @author Olivier Constant
 */
public class EObjectLabelProviderHelper {

  /**
   * Get the generated item provider for given object.
   * 
   * @param object_p
   * @return<code>null</code> if one of parameters is <code>null</code> or if no provider is found.
   */
  protected static IItemLabelProvider getItemLabelProvider(EObject object_p) {
    // Precondition.
    if (null == object_p) {
      return null;
    }
    AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain
        .getEditingDomainFor(object_p);
    // Precondition.
    if (null == editingDomain) {
      return null;
    }
    return (IItemLabelProvider) editingDomain.getAdapterFactory().adapt(object_p, IItemLabelProvider.class);
  }

  /**
   * Get the label for given object based on generated item provider.
   * 
   * @param object_p
   * @return<code>null</code> if one of parameters is <code>null</code> or if no label is found.
   */
  public static String getText(EObject object_p) {
    String label = ""; //$NON-NLS-1$
    IItemLabelProvider provider = getItemLabelProvider(object_p);
    if (null != provider) {
      label = provider.getText(object_p);
    }
    return label;
  }


}
