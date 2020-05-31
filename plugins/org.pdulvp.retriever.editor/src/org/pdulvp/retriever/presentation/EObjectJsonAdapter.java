package org.pdulvp.retriever.presentation;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.commands.ICategory;
import org.pdulvp.retriever.model.handler.helpers.EObjectLabelProviderHelper;
import org.pdulvp.retriever.result.AttributeResult;
import org.pdulvp.retriever.result.ElementResult;
import org.pdulvp.retriever.result.Result;
import org.pdulvp.retriever.result.URIResult;
import org.w3c.dom.Attr;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class EObjectJsonAdapter {

  public JsonObject toJsonElement(Result source2) {
    JsonObject object2 = new JsonObject();
    for (AttributeResult item : source2.getOwnedResults().stream().filter(x -> x instanceof AttributeResult).map(x -> (AttributeResult)x).collect(Collectors.toList())) {
        object2.addProperty(item.getName(), item.getValue());
    }
    if (source2 instanceof URIResult) {
    //  object2.addProperty("url", ((URIResult) source2).getUri());
    } 
    
    Collection<Result> items = source2.getOwnedResults().stream().filter(x -> !(x instanceof AttributeResult)).map(x -> (Result)x).collect(Collectors.toList());
    items.addAll(source2.getOrderedResults().stream().filter(x -> !(x instanceof AttributeResult)).map(x -> (Result)x).collect(Collectors.toList()));
    JsonArray array = new JsonArray();
    for (Result item : items) {
      String definition = "";
      if (item instanceof ElementResult) {
        definition = ((ElementResult) item).getDefinition().getName();
      } else if (item instanceof URIResult) {
        definition = ((URIResult) item).getDefinition().getName();
      }
      object2.add(definition, array);
      break;
    }
    
    for (Result item : items) {
      JsonObject object3 = toJsonElement(item);
      array.add(object3);
    }
    
    return object2;
  }
  
  public Collection<Object> getLevel(EObject source, int level) {
    Collection<Object> result = new LinkedHashSet<Object>();
        
    for (EReference reference : source.eClass().getEAllReferences()) {
      if (reference.isMany()) {
        EList<Object> values = (EList) source.eGet(reference);
        if (!values.isEmpty()) {
          for (Object value : values) {
            if (value instanceof EObject) {
              result.add((EObject)value);
            }
          }
        }
      } else {
        if (source.eGet(reference) != null) {
          result.add((EObject)source.eGet(reference));
        }
      }
    }
    return result;
  }

}