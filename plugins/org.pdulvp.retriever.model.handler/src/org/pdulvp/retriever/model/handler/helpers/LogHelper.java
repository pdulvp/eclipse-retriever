package org.pdulvp.retriever.model.handler.helpers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.pdulvp.retriever.model.handler.Activator;

public class LogHelper {

  public static void info(String string) {
    Activator.getDefault().getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, string));
  }

  public static void error(String string) {
    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, string));
  }

  public static void warning(String string) {
    // Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, string));
  }

}
