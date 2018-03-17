package org.pdulvp.retriever.model.handler.sirius;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.SavingPolicy;

public class DataSavingPolicy implements SavingPolicy {

  @Override
  public Collection<Resource> save(Iterable<Resource> arg0, Map<?, ?> arg1, IProgressMonitor arg2) {
    Collection<Resource> resources = new ArrayList<Resource>();
    for (Resource res : arg0) {
      if (res.getURI() != null && "data".equals(res.getURI().fileExtension())) {
        resources.add(res);
        try {
          res.save(null);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return resources;
  }
}
