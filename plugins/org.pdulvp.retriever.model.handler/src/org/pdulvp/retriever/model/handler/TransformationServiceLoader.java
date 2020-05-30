package org.pdulvp.retriever.model.handler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;
import org.pdulvp.retriever.TransformationService;

public class TransformationServiceLoader {

	HashMap<TransformationService, Bundle> bundles = new HashMap<TransformationService, Bundle>();

	protected Bundle getBundle(TransformationService service) {
		if (!bundles.containsKey(service)) {
			Bundle bundle = Activator.getDefault().getBundle();
			Bundle bun = Platform.getBundle(service.getClassname().substring(0, service.getClassname().lastIndexOf(".")));
			
			// TODO use better way to find a ClassLoader
			for (Bundle b : Activator.getDefault().getBundle().getBundleContext().getBundles()) {
				if (b != null && service.getClassname().startsWith(b.getSymbolicName())) {
					bundle = b;
					break;
				}
			}
			bundles.put(service, bun);
		}

		return bundles.get(service);
	}

	public EObject evaluateService(TransformationService service, EObject context) {
		try {
			Bundle bundle = getBundle(service);
			Class<?> clazz = bundle.loadClass(service.getClassname());
			for (Method method : clazz.getMethods()) {
				if (method.getName().equals(service.getMethod())) {
					method.invoke(clazz.newInstance(), context);
				}
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		return context;
	}
}
