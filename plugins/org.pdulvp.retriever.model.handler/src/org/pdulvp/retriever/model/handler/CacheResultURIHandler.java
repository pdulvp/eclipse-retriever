package org.pdulvp.retriever.model.handler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.pdulvp.retriever.ElementRetriever;
import org.pdulvp.retriever.Retriever;
import org.pdulvp.retriever.URLRetriever;
import org.pdulvp.retriever.result.ElementResult;
import org.pdulvp.retriever.result.ResultFactory;
import org.pdulvp.retriever.result.URIResult;
import org.pdulvp.retriever.result.util.ResultURIHandler;

public class CacheResultURIHandler extends ResultURIHandler {
  TransactionalEditingDomain domain;

  public CacheResultURIHandler(TransactionalEditingDomain domain) {
    this.domain = domain;
  }

  @Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
	    URI a = URI.createPlatformResourceURI(RetrieverScheme.getFilename(uri, domain), true);
		return super.getAttributes(a, options);
	}
  
  @Override
  public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
    URI a = URI.createPlatformResourceURI(RetrieverScheme.getFilename(uri, domain), true);
    return super.createOutputStream(a, options);
  }

  @Override
  public InputStream createInputStream(final URI uri, Map<?, ?> options) throws IOException {
    URI a = URI.createPlatformResourceURI(RetrieverScheme.getFilename(uri, domain), true);
    try {
      return super.createInputStream(a, options);

    } catch (IOException e) {
      createEmptyResource(domain, uri);
      return super.createInputStream(a, options);
    }
  }

  public static void createEmptyResource(final TransactionalEditingDomain domain, final URI uri) {

    TransactionUtil.getEditingDomain(domain.getResourceSet()).getCommandStack()
        .execute(new RecordingCommand(TransactionUtil.getEditingDomain(domain.getResourceSet())) {

          @Override
          protected void doExecute() {
            Resource res = domain.getResourceSet().getResource(uri, false);
            Retriever retriever = RetrieverScheme.getDefinition(uri);
            if (res.getContents().isEmpty()) {
              if (retriever instanceof URLRetriever) {
                URIResult container = ResultFactory.eINSTANCE.createURIResult();
                container.setDefinition((URLRetriever)retriever);
                container.setUri(RetrieverScheme.getURI(uri));
                ((InternalEObject) container).eResolveProxy((InternalEObject) retriever);
                res.getContents().add(container);
              } else {
                ElementResult container = ResultFactory.eINSTANCE.createElementResult();
                container.setDefinition((ElementRetriever)retriever);
                //container.setUri(RetrieverScheme.getURI(uri));
                ((InternalEObject) container).eResolveProxy((InternalEObject) retriever);
                res.getContents().add(container);
              }
            }
            try {
              res.save(null);
            } catch (IOException e) {
              e.printStackTrace();
            }
          }
        });
  }
}
