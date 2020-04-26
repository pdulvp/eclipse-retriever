package org.pdulvp.retriever.result.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.PlatformResourceURIHandlerImpl;

public class ResultURIHandler extends PlatformResourceURIHandlerImpl {

  public static final String RETRIEVER = "retriever";

  @Override
  public boolean canHandle(URI uri) {
    return uri.scheme().equals(RETRIEVER);
  }

}
