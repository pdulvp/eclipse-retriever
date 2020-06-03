package org.pdulvp.retriever.model.handler;

import java.math.BigInteger;

import org.apache.commons.codec.digest.DigestUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.pdulvp.retriever.ElementRetriever;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.RetrieverPackage;
import org.pdulvp.retriever.URLRetriever;
import org.pdulvp.retriever.model.handler.interpreter.IContext;
import org.pdulvp.retriever.result.URIResult;
import org.pdulvp.retriever.result.util.ResultURIHandler;

public class RetrieverScheme {

  public static final String RETRIEVER = ResultURIHandler.RETRIEVER;

  public static URI createURI(Retriever uriElement, IContext context, String uri2) {
    String md5 = MD5(uri2 + uriElement.getName());
    String uri = EcoreUtil.getURI(uriElement).toString();

    URI uriRes = URI
        .createURI(RETRIEVER + "://" + URI.encodeAuthority(uri2, false) + "/" + URI.encodeSegment(uri, false) + "/"
            + URI.encodeAuthority(uriElement.getName() + ".result", false) + "#" + URI.encodeFragment(md5, false));
    return uriRes;
  }

  public static String MD5(String s) {
    byte[] digest = DigestUtils.md5(s);
    BigInteger bigInt = new BigInteger(1, digest);
    String md5 = bigInt.toString(16);
    return md5;
  }

  public static String getFilename(URI filename, TransactionalEditingDomain domain) {
	String project = domain.getResourceSet().getResources().get(0).getURI().segment(1);
    String a = URI.decode(filename.segment(filename.segmentCount() - 1));
    a = a.substring(0, a.lastIndexOf("."));
    return "/"+project+"/.cache/" + a + "/" + filename.fragment() + "." + "result";
  }

  public static String getExternalFilename(URIResult result, TransactionalEditingDomain domain) {
	String project = domain.getResourceSet().getResources().get(0).getURI().segment(1);
    return "/"+project+"/.cache/" + result.getDefinition().getName() + "/"
        + MD5(result.getUri() + result.getDefinition().getName()) + ".external";
  }

  public static String getURI(URI filename) {
    return URI.decode(filename.authority());
  }

  public static Retriever getDefinition(URI filename) {
    String authority = filename.authority();
    if (authority.contains("retrieveElement")) {
      ElementRetriever retriever = (ElementRetriever) EcoreUtil.create(RetrieverPackage.Literals.ELEMENT_RETRIEVER);
      ((InternalEObject) retriever).eSetProxyURI(URI.createURI(URI.decode(filename.segment(0))));
      return retriever;
    }
    
    URLRetriever retriever = (URLRetriever) EcoreUtil.create(RetrieverPackage.Literals.URL_RETRIEVER);
    ((InternalEObject) retriever).eSetProxyURI(URI.createURI(URI.decode(filename.segment(0))));
    return retriever;
  }

}
