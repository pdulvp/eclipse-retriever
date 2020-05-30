package org.pdulvp.retriever.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.pdulvp.retriever.ElementRetriever;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverPkg;
import org.pdulvp.retriever.RetrieverRoot;
import org.pdulvp.retriever.model.handler.FetchRetriever;
import org.pdulvp.retriever.model.handler.RetrieverScheme;
import org.pdulvp.retriever.model.handler.helpers.RetrieverExt;
import org.pdulvp.retriever.model.handler.interpreter.IContext;
import org.pdulvp.retriever.result.ElementResult;
import org.pdulvp.retriever.result.Result;

public class QueryContentProvider implements ITreeContentProvider {

  Resource root = null;
  TransactionalEditingDomain domain = null;

  private static Object[] empty = new Object[0];

  Object input = null;

  /**
   * Create a new <code>SemanticContentProvider</code> with the specified session.
   */
  public QueryContentProvider() {
    // domain = new RetrieverEditingDomainFactory().createEditingDomain();
    // aird = URI.createPlatformResourceURI("/base/query_analysis.aird", true);
    // Session a = SessionManager.INSTANCE.getSession(aird, new NullProgressMonitor());
    // domain = a.getTransactionalEditingDomain();
  }

  protected boolean isVisible(EObject object) {
    if (object instanceof RetrieverRoot) {
      return true;
    }
    if (object instanceof RetrieverPkg) {
      return true;
    }
    if (object instanceof Retriever && ((Retriever) object).isDynamic()) {
      return true;
    }
    return false;
  }

  @Override
  public Object[] getChildren(final Object parentElement) {
    Object[] children = QueryContentProvider.empty;

    if (parentElement instanceof ResourceSet) {
      Collection<Object> res = new ArrayList<Object>();
      for (Resource re : ((ResourceSet) parentElement).getResources()) {
        if (hasChildren(re)) {
          res.addAll(Arrays.asList(getChildren(re)));
        }
      }
      return res.toArray();
    }
    if (parentElement instanceof Resource) {
      Collection<Object> res = new ArrayList<Object>();
      for (EObject a : ((Resource) parentElement).getContents()) {
        if (isVisible(a) && (isLeaf(a) || getChildren(a).length > 0)) {
          res.add(a);
        }
      }
      children = res.toArray();
    }

    if (parentElement instanceof ElementResult) {
      Collection<Object> res = new ArrayList<Object>();
      Object a = ((ElementResult) parentElement).getElement();
      // res.add(a);
      for (Result o : ((ElementResult) parentElement).getOwnedResults()) {
        res.add(o);
      }

      children = res.toArray();
      return children;
    }

    if (parentElement instanceof EObject) {
      Collection<Object> res = new ArrayList<Object>();
      for (EObject a : ((EObject) parentElement).eContents()) {
        if (isVisible(a) && (isLeaf(a) || getChildren(a).length > 0)) {
          res.add(a);
        }
      }
      children = res.toArray();
    }
    if (parentElement instanceof ElementRetriever) {
      Collection<Object> result = new ArrayList<Object>();
      if (!((Collection) input).isEmpty()) {
      Object aaa = ((Collection) input).iterator().next();
      if (aaa instanceof EObject) {
        domain.getCommandStack().execute(new RecordingCommand(domain) {

          @Override
          protected void doExecute() {
            EObject aaa = (EObject) ((Collection) input).iterator().next();
            ElementRetriever retriever = (ElementRetriever) parentElement;
            IContext context = new IContext(aaa);
            FetchRetriever fetcher = RetrieverExt.createFetcher(retriever, context);
            context.setVariable("source", aaa);
            Result res = fetcher.retrieveElement(retriever, context);
            for (Result o : res.getOwnedResults()) {
              result.add(o);
            }
          }
        });
      }
      }
      children = result.toArray();

    }

    if (parentElement instanceof DynamicEObjectImpl) {
      Collection<Object> result = new ArrayList<Object>();
      for (EStructuralFeature f : ((DynamicEObjectImpl) parentElement).eClass().getEAllAttributes()) {
        result.add(((DynamicEObjectImpl) parentElement).eGet(f));
      }
      children = result.toArray();

    }

    return children;
  }

  private boolean isLeaf(EObject a) {
    // TODO Auto-generated method stub
    return !(a instanceof RetrieverPkg) && !(a instanceof RetrieverRoot);
  }

  @Override
  public Object getParent(final Object element) {
    return null;
  }

  @Override
  public boolean hasChildren(final Object element) {
    return getChildren(element).length > 0;
  }

  @Override
  public Object[] getElements(final Object inputElement) {
    if (domain != null) {
      return getChildren(domain.getResourceSet());
    }
    return empty;
  }

  @Override
  public void dispose() {
  }

  @Override
  public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
    input = newInput;
    if (input instanceof Collection && !((Collection) input).isEmpty()) {
      Object i = ((Collection) input).iterator().next();
      domain = TransactionUtil.getEditingDomain(i);
      reload(viewer);
    }

  }

  public void reload(Viewer viewer) {
    if (domain == null) {
      return;
    }

    final Collection<IFile> queries = new ArrayList<IFile>();
    try {
      ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {
        @Override
        public boolean visit(IResource resource) throws CoreException {
          if (resource instanceof IFile) {
            if (RetrieverScheme.RETRIEVER.equals(resource.getFileExtension())) {
              queries.add((IFile) resource);
            }
          }
          return true;
        }
      });
    } catch (CoreException e) {
      e.printStackTrace();
    }

    if (!queries.isEmpty()) {
      domain.getCommandStack().execute(new RecordingCommand(domain) {
        @Override
        protected void doExecute() {
          for (IFile file : queries) {
            domain.getResourceSet().getResource(URI.createPlatformResourceURI(file.getFullPath().toOSString(), true),
                true);
          }
        }
      });
    }
  }
}