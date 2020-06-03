package org.pdulvp.retriever.model.handler;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.pdulvp.retriever.AttributeRetriever;
import org.pdulvp.retriever.CreateDirectEObject;
import org.pdulvp.retriever.CreateEAttribute;
import org.pdulvp.retriever.CreateEObject;
import org.pdulvp.retriever.CreateEReference;
import org.pdulvp.retriever.CreateFile;
import org.pdulvp.retriever.CreateNotifier;
import org.pdulvp.retriever.ElementRetriever;
import org.pdulvp.retriever.IVariableElement;
import org.pdulvp.retriever.If;
import org.pdulvp.retriever.LoadResource;
import org.pdulvp.retriever.ReferencedRetriever;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverContainer;
import org.pdulvp.retriever.RetrieverPkg;
import org.pdulvp.retriever.SetVariable;
import org.pdulvp.retriever.TransformationRetriever;
import org.pdulvp.retriever.TransformationService;
import org.pdulvp.retriever.URLRetriever;
import org.pdulvp.retriever.model.handler.helpers.HttpExt;
import org.pdulvp.retriever.model.handler.helpers.HttpResult;
import org.pdulvp.retriever.model.handler.helpers.LogHelper;
import org.pdulvp.retriever.model.handler.helpers.XMLExt;
import org.pdulvp.retriever.model.handler.interpreter.IContext;
import org.pdulvp.retriever.result.AttributeResult;
import org.pdulvp.retriever.result.ElementResult;
import org.pdulvp.retriever.result.Result;
import org.pdulvp.retriever.result.ResultFactory;
import org.pdulvp.retriever.result.URIResult;
import org.pdulvp.retriever.result.util.ResultResourceImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class FetchRetriever {

  public Collection<ReferenceCreate> refs = new ArrayList<ReferenceCreate>();

  protected TransformationServiceLoader transformationLoader = new TransformationServiceLoader();

  public void attach(Result container, Result result) {
    if (result == null) {
      return;
    }
    Resource originalResource = result.eResource();
     container.getOrderedResults().add(result);
    originalResource.getContents().add(result);
    if (!container.getOwnedResults().isEmpty()) {

      ((InternalEObject) container)
          .eResolveProxy((InternalEObject) container.getOwnedResults().get(container.getOwnedResults().size() - 1));
    } else {
      // error("may be an error here");
    }
  }

  public void saveFile(CreateFile create, URIResult result, IContext context) throws Exception {

    InputStream stream = null;

    if (result.getElement() instanceof byte[]) {
      stream = new ByteArrayInputStream((byte[]) result.getElement());

    } else if (result.getElement() instanceof InputStream) {
      stream = (InputStream) result.getElement();

    } else if (result.getElement() instanceof Element) {
      Document doc = ((Element) result.getElement()).getOwnerDocument();
      stream = new ByteArrayInputStream(XMLExt.domToByteArray(doc));

    } else if (result.getElement() != null) {

      ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(result.getExternalUri())).getContents();
    }

    String uri = evaluateURI(create.getUri(), result, context);
    IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri));
    IContainer folder = file.getProject();

    for (String split : uri.split("/")) {
      if (split.isEmpty() || split.equals(file.getProject().getName()) || split.equals(file.getName())) {
        continue;
      }
      folder = folder.getFolder(new Path(split));
      if (!folder.exists()) {
        ((IFolder) folder).create(true, true, new NullProgressMonitor());
      }
      System.out.println(0);
    }
    if (file.exists()) {
      file.setContents(stream, true, true, null);

    } else {
      file.create(stream, true, null);
    }
  }

  private String evaluateURI(String uri, URIResult result, IContext context) {
    Collection<Object> a = evaluateExpression(result, uri, context);
    if (a != null && !a.isEmpty()) {
      return (String) a.iterator().next();
    }
    return uri;
  }

  public Object evaluateUri(String uri, String cache, ResourceSet set, String cacheControl) {

    try {
      InputStream in = null;
      Resource res = null;
      String encoding = "UTF-8";

      IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(cache));
      long time = System.currentTimeMillis();

      if (uri.contains("/base") || uri.contains("/gamble")) {
        res = set.getResource(URI.createURI(uri, true), true);
        if (!res.getErrors().isEmpty()) {
          res.unload();
          res = set.getResource(URI.createURI(uri, true), true);
        }
        return res.getContents().get(0);

      }

      // if (definition.isExternal()) {
      if (!"no-cache".equals(cacheControl) && file.exists()) {
        in = file.getContents();
        // encoding = file.getCharset();
      } else {
        HttpResult couple = HttpExt.get(uri);
        in = couple.getStream();
        encoding = couple.getEncoding();
      }
      // }

      if (in != null) {
        String body = IOUtils.toString(in, encoding);
        long time2 = System.currentTimeMillis();
        System.out.println("Fetched : " + (time2 - time));
        if (body != null && !body.isEmpty()) {

          InputStream stream = new ByteArrayInputStream(body.getBytes("UTF-8"));
          // if (definition.isExternal()) {

          try {
            if (!"no-cache".equals(cacheControl)) {

              if (file.exists()) {
                file.setContents(stream, true, true, new NullProgressMonitor());
              } else {
                file.create(stream, true, new NullProgressMonitor());
              }
            }
          } catch (Exception e) {
            System.out.println();
          }
          // }
          try {
            if (body.charAt(0) == '\"') {
              return body;
            }
            if (body.length() > 0 && body.charAt(0) == '[') {
              JSONArray json = new JSONArray(body);
              body = XML.toString(json);
            }
            if (body.length() > 0 && body.charAt(0) == '{') {
              JSONObject json = new JSONObject(body);
              body = XML.toString(json);
            }
            return XMLExt.xml2dom(body).getDocumentElement();

          } catch (Error e) {
            e.printStackTrace();
            System.out.println();
          } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println();
          } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
          }
        }

      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public EObject transform(TransformationRetriever transformation, EObject result) {
    TransformationService service = transformation.getService();
    return transform(service, result);
  }

  public EObject transform(TransformationService service, EObject context) {
    return transformationLoader.evaluateService(service, context);
  }

  public URIResult retrieveUrl(URLRetriever retriever, IContext context, String uri) {
    LogHelper.info("retrieve:" + uri);
    // String uri2 = ((URLRetriever) retriever).getUriExpression();
    // for (Result result1 : newElement.getOwnedResults()) {
    // if (result1 instanceof AttributeResult) {
    // uri2 = uri2.replaceAll("@" + ((AttributeResult) result1).getDefinition().getName(),
    // ((AttributeResult) result1).getValue());
    // }
    // }
    Object rees = evaluateExpression(retriever, uri, context).iterator().next();

    URI uriRes = null;
    if (rees instanceof URI) {
      uriRes = (URI) rees;
    } else if (!rees.toString().contains("@")) {
      uriRes = RetrieverScheme.createURI(retriever, context, (String) rees);
    } else {
      LogHelper.error("uri is " + uri);
      return null;
    }
    // URI uriRes = RetrieverScheme.createURI(retriever, context, ur222);
    Resource res = context.getResourceSet().getResource(uriRes, true);

    Session session = getSession(context);
    session.addSemanticResource(((ResultResourceImpl) res).getURI(), new NullProgressMonitor());

    URIResult result = (URIResult) res.getContents().get(0);
    retrieveUrl(result, new IContext(result, context));

    if (!retriever.isAsSemantic()) {
      result.setElement(null);
      removeResourceFromSession(session , context , res);
    }
    return result;
  }

  private void removeResourceFromSession(Session session, IContext context, Resource res) {
    session.removeSemanticResource(res, new NullProgressMonitor(), false);
    Iterator<EObject> it = res.getAllContents();
    while (it.hasNext()) {
      EObject object = it.next();
      if (object instanceof ElementResult) {
        ((ElementResult) object).setElement(null);
      } else if (object instanceof AttributeResult) {
        ((AttributeResult) object).setElement(null);
      } else if (object instanceof URIResult) {
        ((URIResult) object).setElement(null);
      }
      session.getSemanticCrossReferencer().unsetTarget(object);
    }
    session.getSemanticCrossReferencer().unsetTarget(res);
    res.unload();
    context.getResourceSet().getResources().remove(res);
  }

  public Result retrieveElement(ElementRetriever retriever, IContext context) {
    LogHelper.info("retrieve:");

    URI uriRes = RetrieverScheme.createURI(retriever, context, (String) "/base/retrieveElement.retriever");
    Resource res = context.getResourceSet().getResource(uriRes, true);

    Session session = getSession(context);
    session.addSemanticResource(((ResultResourceImpl) res).getURI(), new NullProgressMonitor());

    Result result = (Result) res.getContents().get(0);
    result.getOwnedResults().clear();
    retrieveElement(retriever, result, context);
    
    return result;
  }

  private Session getSession(IContext context) {
    for (Resource res : context.getResourceSet().getResources()) {
      if (res.getURI().fileExtension().equals("aird")) {
        return SessionManager.INSTANCE.getExistingSession(res.getURI());
      }
    }
    
    return null;
  }

  public void retrievePkg(RetrieverPkg retrieverPkg, IContext context) {
    for (Retriever retriever : retrieverPkg.getOwnedElements()) {
      if (retriever instanceof ReferencedRetriever) {
        retriever = ((ReferencedRetriever) retriever).getReferencedElement();
      }
      if (retriever instanceof org.pdulvp.retriever.URLRetriever) {
        org.pdulvp.retriever.URLRetriever uriElement = (org.pdulvp.retriever.URLRetriever) retriever;
        retrieveUrl(uriElement, context, uriElement.getUriExpression());
      }
    }
  }

  public void retrieveUrl(URIResult result, IContext context) {
    LogHelper.info("retrieve:" + result.getUri());

    result.getOwnedResults().clear();

    URLRetriever definition = result.getDefinition();
    ((InternalEObject) result).eResolveProxy((InternalEObject) definition);

    if (result.getDefinition().eIsProxy()) {
      LogHelper.error("proxy");
      throw new RuntimeException("proxy");
    }

    result.setExternalUri(RetrieverScheme.getExternalFilename(result, TransactionUtil.getEditingDomain(result)));
    Object uriValue = evaluateUri(result.getUri(), result.getExternalUri(), result.eResource().getResourceSet(),
        definition.getCacheControl());
    result.setElement(uriValue);
    context.setVariable(definition.getVariable(), uriValue);
    context.setVariable(definition.getVariableResult(), result);

    __retrievers(definition, result, context);
    for (ReferenceCreate create : refs) {
      createEReference(create.created, create.child, create.result, create.context);
    }
  }

  private void __retrievers(RetrieverContainer retriever, Result result, IContext context) {
    __retrievers(retriever, result, result, context);
  }

  private void __retrievers(RetrieverContainer object, Notifier container, Result result, IContext context) {
    // System.out.println(object.getOwnedElements().size());
    for (Retriever retriever : object.getOwnedElements()) {
      if (retriever instanceof If) {
        ifRetriever((If) retriever, container, result, context);

      } else if (retriever instanceof ReferencedRetriever) {
        retriever = ((ReferencedRetriever) retriever).getReferencedElement();
      }
      if (retriever instanceof CreateNotifier) {
        createNotifierFromResult((CreateNotifier) retriever, container, result, context);

      } else if (retriever instanceof CreateEAttribute) {
        createEAttribute((EObject) container, (CreateEAttribute) retriever, result, context);

      } else if (retriever instanceof CreateEReference) {
        if (((CreateEReference) retriever).isDeferred()) {
          refs.add(new ReferenceCreate((EObject) container, (CreateEReference) retriever, result, context));
        } else {
          createEReference((EObject) container, (CreateEReference) retriever, result, context);
        }

      } else if (retriever instanceof URLRetriever) {
        attach(result, retrieveUrl((URLRetriever) retriever, context, ((URLRetriever) retriever).getUriExpression()));

      } else if (retriever instanceof ElementRetriever) {
        retrieveElement((ElementRetriever) retriever, result, context);

      } else if (retriever instanceof AttributeRetriever) {
        retrieveAttribute((AttributeRetriever) retriever, result, context);

      } else if (retriever instanceof TransformationRetriever) {
        retrieveTransformation((TransformationRetriever) retriever, result, context);
      }
    }

  }

  public void retrieveElement(ElementRetriever definition, Result result, IContext context) {

    Collection<Object> nodes = evaluateExpression(result, definition.getRetrieverExpression(), context);

    for (Object node : nodes) {
      Object e = node;
      ElementResult newElement = ResultFactory.eINSTANCE.createElementResult();
      newElement.setElement(e);
      newElement.setDefinition(definition);
      context.setVariable(definition.getVariable(), e);
      context.setVariable(definition.getVariableResult(), newElement);
      if (result != null) {
        result.getOwnedResults().add(newElement);
      }
      __retrievers(definition, newElement, context);
    }

  }

  public void retrieveTransformation(TransformationRetriever definition, Result result, IContext context) {
    EObject source = result;
    if (definition.getInput() != null) {
      Collection<Object> nodes = evaluateExpression(result, definition.getInput(), context);
      if (nodes != null && nodes.iterator().next() instanceof EObject) {
        source = (EObject) nodes.iterator().next();
      }
    }

    transform(definition.getService(), source);
    __retrievers(definition, result, context);
  }

  public void retrieveAttribute(AttributeRetriever definition, Result result, IContext context) {
    Collection<Object> nodes = evaluateExpression(result, definition.getValueExpression(), context);

    if (nodes.isEmpty() && definition.getAlternative() != null) {
      nodes = evaluateExpression(result, definition.getAlternative().getValueExpression(), context);
    }

    if (!nodes.isEmpty()) {
      String value = nodes.stream().map(x -> x instanceof Node ? ((Node) x).getTextContent() : x).map(x -> x.toString()).collect(Collectors.joining("\n"));
      AttributeResult attribute = ResultFactory.eINSTANCE.createAttributeResult();
      attribute.setDefinition(definition);
      attribute.setValue(value);
      
      result.getOwnedResults().add(attribute);
      if (definition.getService() != null) {
        transform(definition.getService(), attribute);
      }
    } else {
      LogHelper.warning("attribute " + definition.getName() + " not set");
    }
  }

  public Collection<Object> evaluateExpression(EObject result, String expression, IContext context) {
    LogHelper.info("evaluateXPath:" + expression);
    Collection<Object> e = new ArrayList<Object>();
    try {
      IInterpreter it = InterpreterUtil.getInterpreter(result);
      it.setVariable("context", context);
      Object a = it.evaluate(result, expression);
      if (a != null) {
        if (a instanceof Collection) {
          e.addAll((Collection) a);
        } else {
          e.add(a);
        }
      }
    } catch (Exception e1) {
      e1.printStackTrace();
      LogHelper.error(e1.getClass().getCanonicalName());
    }
    if (e.isEmpty()) {
      LogHelper.warning("evaluateXPath:" + expression + " is empty");
    }
    return e;
  }

  public void createResource(LoadResource res, Result result, IContext context) {
    Resource resource = context.getResourceSet().getResource(URI.createURI(res.getUri()), false);

    if (resource == null && (res.isCreate())) {
      resource = context.getResourceSet().createResource(URI.createURI(res.getUri()));
    } else if (resource == null) {
      resource = context.getResourceSet().getResource(URI.createURI(res.getUri()), true);
    }
    if (res.isClearContents()) {
      resource.getContents().clear();
    }
    context.setVariable(res.getVariable(), resource);
    __retrievers(res, result, context);

    Session session = SessionManager.INSTANCE.getSessions().iterator().next();
    session.addSemanticResource(resource.getURI(), new NullProgressMonitor());
  }

  public void createFile(CreateFile create, URIResult result, IContext context) {
    context.setVariable(create.getVariable(), result);
    try {
      saveFile(create, result, context);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void createEObject(CreateEObject object, Notifier container2, Result container, IContext context) {
    try {
      Notifier parent = container2;
      String containerValue = object.getContainerExpression();
      if (containerValue != null && containerValue.length()>0) {
        Collection<Object> aaa = evaluateExpression(container, containerValue, context);
        if (aaa.isEmpty()) {
          LogHelper.error("no parent found");
        }
        parent = (Notifier) aaa.iterator().next();
      }
      createDirectEObject(object, parent, container, context);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void createDirectEObject(CreateEObject object, Notifier container, Result container2, IContext context) {
    EClass clazz = object.getClass_();
    EPackage pkg = (EPackage) clazz.eContainer();
    EObject created = pkg.getEFactoryInstance().create(clazz);
    if (created.eClass().getEIDAttribute() != null) {
      created.eSet(created.eClass().getEIDAttribute(), UUID.randomUUID().toString());
    }
    LogHelper.info("createDirectEObject:" + object.getVariable() + "=" + created);
    context.setVariable(object.getVariable(), created);

    IContext childContext = context; // new IContext(created, context);

    if (container instanceof Resource) {
      ((Resource) container).getContents().add(created);

    } else if (container instanceof EObject) {
      if (object.getContainingFeature() == null) {
        LogHelper.error("object.getContainingFeature() is null");
      } else {
        if (object.getContainingFeature().isMany()) {
          ((EList) ((EObject) container).eGet(object.getContainingFeature())).add(created);
        } else {
          ((EObject) container).eSet(object.getContainingFeature(), created);
        }
      }
    }
    __retrievers(object, created, container2, childContext);
  }

  public void setVariable(SetVariable object, Notifier retriever, Result result, IContext context) {
    Collection<Object> a = evaluateExpression(result, object.getExpression(), context);
    if (a != null && !(a.isEmpty())) {
      if (a.iterator().next() instanceof Notifier) {
        retriever = (EObject) a.iterator().next();
      }
      if (a.iterator().next() instanceof Result) {
        result = (Result) a.iterator().next();
      }
      context.setVariable(object.getVariable(), a.iterator().next());
      if (object.isLog()) {
        LogHelper.info("Set variable:"+object.getName() + " " + object.getVariable() + "=" + a.iterator().next());
      }
    } else {
      context.setVariable(object.getVariable(), null);
      if (object.isLog()) {
        LogHelper.info("Set variable:"+object.getName() + " " + object.getVariable() + "=null");
      }
    }

    __retrievers(object, retriever, result, context);
  }

  public void ifRetriever(If object, Notifier container, Result container2, IContext context) {

    Collection<Object> a = evaluateExpression(container2, object.getConditionExpression(), context);
    if (a != null && !(a.isEmpty())) {
      if (a.iterator().next() instanceof Boolean) {
        // System.out.println("if:" + object.getConditionExpression() + "=" + a.iterator().next());
        if ((Boolean) a.iterator().next()) {
          __retrievers(object, container, container2, context);
        }
      }
    }
  }

  public void createNotifierFromResult(CreateNotifier create, Notifier containe2r, Result container, IContext context) {
    if (create instanceof LoadResource) {
      createResource((LoadResource) create, container, context);

    } else if (create instanceof CreateFile && container instanceof URIResult) {
      createFile((CreateFile) create, (URIResult) container, context);

    } else if (create instanceof CreateEObject) {
      createEObject((CreateEObject) create, containe2r, container, context);

    } else if (create instanceof SetVariable) {
      setVariable((SetVariable) create, containe2r, container, context);

    }
  }

  public void createEReference(EObject created, CreateEReference child, Result result, IContext context) {
    String exp = child.getValueExpression();
    Collection<Object> a = evaluateExpression(result, exp, context);
    if (a != null && !a.isEmpty()) {

      EObject object = (EObject) context.getVariable(((IVariableElement) child.eContainer()).getVariable());
      for (Object item : (Collection) a) {
        if (child.getFeature().getEType().isInstance(item)) {

          if (child.getFeature().isMany()) {
            ((EList) object.eGet(child.getFeature())).add(item);

          } else {
            object.eSet(child.getFeature(), item);

          }
        }
      }
    }

  }

  public void createEAttribute(EObject created, CreateEAttribute child, Result result, IContext context) {
    Collection<Object> a = evaluateExpression(result, child.getValueExpression(), context);
    if (a != null && !a.isEmpty()) {
      // EObject object = (EObject) context.getVariable(((IVariableElement) child.eContainer()).getVariable());
      if (created == null) {
        LogHelper.warning("attribute " + child.getFeature().getName() + " not set");
      } else {
        Object parent = a.iterator().next();
        if (parent instanceof String) {
          if ("true".equals(parent)) {
            parent = Boolean.TRUE;
          }
          if ("false".equals(parent)) {
            parent = Boolean.FALSE;
          }
          created.eSet(child.getFeature(), parent);
          return;
        }
        created.eSet(child.getFeature(), child.getValueExpression());
        LogHelper.info("attribute " + child.getFeature().getName() + " set ");
      }
    } else {
      LogHelper.warning("attribute " + child.getFeature().getName() + " not set");
    }

  }

  public void saveResources(IContext context) {
	  Session session = SessionManager.INSTANCE.getSessions().iterator().next();
	  session.save(new NullProgressMonitor());	  
	  /*
    for (Resource res : new ArrayList<Resource>(context.getResourceSet().getResources())) {
      try {
        if (res.getURI().isPlatformResource() || res instanceof ResultResourceImpl) {
          ((ResourceImpl) res).save(null);
          // Session session = SessionManager.INSTANCE.getSessions().iterator().next();
          // session.addSemanticResource(((ResourceImpl) res).getURI(), new NullProgressMonitor());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }//*/
  }

  public void init(IContext context) {
    refs.clear();
    
    for (Resource res : new ArrayList<Resource>(context.getResourceSet().getResources())) {
             Session session = SessionManager.INSTANCE.getSessions().iterator().next();
             if (res instanceof ResultResourceImpl) {
            	session.removeSemanticResource(res, new NullProgressMonitor(), true); 
             }
      }
  }

}
