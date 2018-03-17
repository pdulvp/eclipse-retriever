package org.pdulvp.retriever.model.handler.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.jxpath.JXPathContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterContext;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;
import org.eclipse.sirius.common.tools.api.interpreter.ValidationResult;
import org.eclipse.sirius.common.tools.internal.interpreter.AbstractInterpreter;
import org.pdulvp.retriever.result.ElementResult;
import org.pdulvp.retriever.result.URIResult;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XPathInterpreter extends AbstractInterpreter
    implements org.eclipse.sirius.common.tools.api.interpreter.IInterpreter, IInterpreterProvider {

  /** The Feature interpreter prefix. */
  public static final String PREFIX = "xpath:"; //$NON-NLS-1$
  
  private static final String DTM_MANAGER_NAME = "com.sun.org.apache.xml.internal.dtm.DTMManager";
  private static final String DTM_MANAGER_VALUE = "com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault";
  static
  {
      // performance improvement: https://issues.apache.org/jira/browse/XALANJ-2540
	  //http://leakfromjavaheap.blogspot.fr/2014/12/xpath-evaluation-performance-tweaks.html
      System.setProperty(DTM_MANAGER_NAME, DTM_MANAGER_VALUE);
  }
  
  private static final ThreadLocal<XPathFactory> XPATH_FACTORY = new ThreadLocal<XPathFactory>()
  {
      @Override
      protected XPathFactory initialValue()
      {
          return XPathFactory.newInstance();
      }
  }; 
  @Override
  public IInterpreter createInterpreter() {
    return new XPathInterpreter();
  }

  @Override
  public String getPrefix() {
    return PREFIX;
  }

  @Override
  public Object evaluate(EObject target, String expression) throws EvaluationException {
    expression = expression.replaceFirst(PREFIX, "");
    Collection<Object> e = new ArrayList<Object>();

    Object xmlElement = null;
    if (target instanceof URIResult) {
      xmlElement = (Object) ((URIResult) target).getElement();

    } else if (target instanceof ElementResult) {
      xmlElement = (Object) ((ElementResult) target).getElement();
    }

    // IContext context = (IContext) getVariable("context");
    // Resource res = (Resource) context.getVariable("res");

    if (xmlElement != null) {
      if (xmlElement instanceof Element) {
    	  JXPathContext context = JXPathContext.newContext(xmlElement);

        // Evaluate XPath against Document itself
        //XPath xPath = XPATH_FACTORY.get().newXPath();
        
        try {
            List nodes = context.selectNodes(expression);
            e.addAll(nodes);
          //NodeList nodes = (NodeList) xPath.evaluate(expression, xmlElement, XPathConstants.NODESET);
          //for (int i = 0; i < nodes.getLength(); i++) {
          //  e.add(nodes.item(i));
          //}

        } catch (Exception e1) {
          e1.printStackTrace();
          //try {
            //String node = (String) xPath.evaluate(expression, xmlElement, XPathConstants.STRING);
            //e.add(node);
          //} catch (XPathExpressionException e2) {
          //  e2.printStackTrace();
          //}

        }
      }
    }

    return e;
  }

  @Override
  public boolean supportsValidation() {
    return false;
  }

  @Override
  public ValidationResult analyzeExpression(IInterpreterContext context, String expression) {
    return null;
  }

}
