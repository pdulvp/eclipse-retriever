/* AnalysisView.java
 *
 * Copyright (c) 2009 THALES Research & Technology. All rights reserved.
 * THALES Research & Technology PROPRIETARY/CONFIDENTIAL.  
 * Use is subject to license terms.
 *
 * This file, together  with  its accompanying  software product  and
 * documentation, is  protected by the  intellectual  property rights
 * in  France  and  other  countries, any  applicable  copyrights  or
 * patent rights, and international treaty provisions. No part may be
 * reproduced  in  any  form  by  any  mean  without   prior  written
 * authorization of THALES Research & Technology.
 */

package org.pdulvp.retriever.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.ViewPart;
import org.pdulvp.retriever.result.ElementResult;

/**
 */
public class AnalysisView extends ViewPart implements ISelectionListener, IPageListener {

  /** Id of the analysis view */
  static public String ID = "org.pdulvp.retriever.ui.view";

  /** Toolkit for create ui items */
  private FormToolkit toolkit;

  /** Form create on the view */
  private ScrolledForm form;

  /** viewer where results of analysis will be added */
  private TreeViewer viewer;

  /** is true if process change */
  boolean processChange = false;

  /**
   * This method provide a compact creation of GridLayout
   * 
   * @return the gridLayout wanted
   */
  public static GridLayout createGridLayout(int numColumns, int marginBottom, int marginTop, int marginRight,
      int marginLeft, int marginHeight, int marginWidth, Integer verticalSpacing, Integer horizontalSpacing) {
    GridLayout gridLayout = new GridLayout();
    gridLayout.marginBottom = marginBottom;
    gridLayout.marginTop = marginTop;
    gridLayout.marginRight = marginRight;
    gridLayout.marginLeft = marginLeft;
    gridLayout.marginHeight = marginHeight;
    gridLayout.marginWidth = marginWidth;
    if (verticalSpacing != null)
      gridLayout.verticalSpacing = verticalSpacing;
    if (horizontalSpacing != null)
      gridLayout.horizontalSpacing = horizontalSpacing;
    gridLayout.numColumns = numColumns;
    return gridLayout;
  }

  /**
   * This method provide a compact creation of GridData
   * 
   * @return the GridData wanted
   */
  public static GridData createGridData(int horizontalAlignment, int verticalAlignment,
      boolean grabExcessHorizontalSpace, boolean grabExcessVerticalSpace, int horizontalSpan, int verticalSpan,
      Integer widthHint, Integer heightHint) {
    GridData gridData = new GridData(horizontalAlignment, verticalAlignment, grabExcessHorizontalSpace,
        grabExcessVerticalSpace, horizontalSpan, verticalSpan);
    if (widthHint != null)
      gridData.widthHint = widthHint;
    if (heightHint != null)
      gridData.heightHint = heightHint;
    return gridData;
  }

  @Override
  public void createPartControl(Composite parent) {

    Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().addPageListener(this);
    for (IWorkbenchPage page : Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getPages()) {
      page.addSelectionListener(this);
    }

    toolkit = new FormToolkit(parent.getDisplay());
    form = toolkit.createScrolledForm(parent);
    form.setText("Retriever");
    
    parent.setLayoutData(new GridData(GridData.FILL_BOTH));
    parent.setLayout(createGridLayout(1, 0, 0, 0, 0, 0, 0, 0, 0));

    form.setLayoutData(new GridData(GridData.FILL_BOTH));
    form.setLayout(createGridLayout(1, 5, 5, 5, 5, 0, 0, 0, 0));

    form.getBody().setLayoutData(new GridData(GridData.FILL_BOTH));
    form.getBody().setLayout(createGridLayout(1, 5, 5, 5, 5, 0, 0, 0, 0));

    createOtherPart(form.getBody());

    IActionBars actionBars = getViewSite().getActionBars();
    IMenuManager dropDownMenu = actionBars.getMenuManager();
    IToolBarManager toolBar = actionBars.getToolBarManager();
    
    Action refresh = new Action("Refresh") {
      @Override
      public void run() {
        super.run();
        refreshQueries();
      }
    };
    toolBar.add(refresh);

  }

  protected void refreshQueries() {
    ((QueryContentProvider)viewer.getContentProvider()).reload(viewer);
  }

  /** create the tab part */
  private void createOtherPart(Composite body) {
    Composite composite = toolkit.createComposite(body);

    composite.setLayout(createGridLayout(1, 5, 5, 5, 5, 0, 0, 10, 0));
    composite.setLayoutData(createGridData(SWT.FILL, SWT.FILL, true, true, 1, 0, null, null));

    CTabFolder tabFolder = new CTabFolder(composite, SWT.BORDER);
    tabFolder.setTabPosition(SWT.BOTTOM);
    tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
    tabFolder.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
    tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
    CTabItem tabItem = new CTabItem(tabFolder, SWT.NULL);
    tabItem.setImage(Activator.getDefault().getImageRegistry().get("RESULT"));
    tabItem.setText("Results");

    Composite composite2 = toolkit.createComposite(tabFolder);
    composite2.setLayout(createGridLayout(2, 5, 5, 5, 5, 0, 0, 10, 0));
    composite2.setLayoutData(createGridData(SWT.FILL, SWT.FILL, true, true, 1, 0, null, null));

    Menu menuResults = new Menu(composite2);
    final MenuItem log = new MenuItem(menuResults, SWT.NONE);
    log.setImage(Activator.getDefault().getImageRegistry().get("RESULTS"));
    log.setText("Log all results");
    log.addSelectionListener(new SelectionListener() {
      public void widgetDefaultSelected(SelectionEvent event) {

      }

      public void widgetSelected(SelectionEvent event) {
        logResults(true);
      }
    });

    final MenuItem logInvalid = new MenuItem(menuResults, SWT.NONE);
    logInvalid.setImage(Activator.getDefault().getImageRegistry().get("RESULTS_INVALID"));
    logInvalid.setText("Log invalid results");
    logInvalid.addSelectionListener(new SelectionListener() {
      public void widgetDefaultSelected(SelectionEvent event) {

      }

      public void widgetSelected(SelectionEvent event) {
        logResults(false);
      }
    });

    ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
        ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

    AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(composedAdapterFactory)  {
      @Override
      public Image getImage(Object object) {
        if (object instanceof ElementResult) {
          return getImage(((ElementResult) object).getElement());
        }
        return super.getImage(object);
      }
      
      @Override
      public String getText(Object object) {
        if (object instanceof ElementResult) {
          return getText(((ElementResult) object).getElement());
        }
        return super.getText(object);
      }
      
    };
    AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(composedAdapterFactory);
    viewer = new TreeViewer(composite2, SWT.FULL_SELECTION);
    IContentProvider provider = new QueryContentProvider();
    viewer.setContentProvider(provider);
    viewer.setLabelProvider(labelProvider);

    viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
    viewer.getTree().setLayout(createGridLayout(1, 0, 0, 0, 0, 0, 0, 0, 0));
    //TableLayout layout2 = new TableLayout();
    //viewer.getTree().setLayout(layout2);
    // composite2.setBackground(body.getShell().getDisplay().getSystemColor(SWT.COLOR_CYAN));
   // viewer.getTree().setLayoutData(createGridData(SWT.NULL, SWT.NULL, true, true, 10, 10, 600, 400));
    viewer.getTree().setHeaderVisible(false);
    viewer.getTree().setLinesVisible(true);
    viewer.getTree().setMenu(menuResults);
    viewer.setAutoExpandLevel(3);

//    AdapterFactoryLabelProvider labelProvider2 = new AdapterFactoryLabelProvider(composedAdapterFactory);
//    AdapterFactoryContentProvider contentProvider2 = new AdapterFactoryContentProvider(composedAdapterFactory);
//    TreeViewer viewer2 = new TreeViewer(composite2, SWT.FULL_SELECTION);
//    IContentProvider provider = new QueryContentProvider();
//    viewer2.setContentProvider(contentProvider2);
//    viewer2.setLabelProvider(labelProvider2);
//
//    TableLayout layout = new TableLayout();
//    viewer2.getTree().setLayout(layout);
//    viewer2.getTree().setLayoutData(createGridData(SWT.NULL, SWT.NULL, false, false, 10, 10, 200, 200));
//    viewer2.getTree().setHeaderVisible(false);
//    viewer2.getTree().setLinesVisible(true);

    tabItem.setControl(composite2);

    tabFolder.setSelection(0);
  }

  protected void logResults(boolean logAll) {

  }

  @Override
  public void setFocus() {
    form.setFocus();
  }

  /** Update the analysis view */
  public void updateView() {

    try {
      this.getSite().getShell().getDisplay().asyncExec(new Runnable() {
        public void run() {
          try {
            if (viewer != null)
              viewer.refresh();
            
          } catch (Exception e) {
          }
        }
      });
    } catch (Exception e) {
    }
  }

  @Override
  public void dispose() {
    toolkit.dispose();
    Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().removePageListener(this);
    super.dispose();
  }

  public void pageActivated(IWorkbenchPage page) {
    // Nothing
  }

  public void pageClosed(IWorkbenchPage page) {
    page.removeSelectionListener(this);
  }

  public void pageOpened(IWorkbenchPage page) {
    page.addSelectionListener(this);
  }

  public void selectionChanged(IWorkbenchPart part, ISelection selection) {
    if (selection instanceof IStructuredSelection) {
      if (viewer != null && viewer.getControl() != null && !viewer.getControl().isDisposed() ) {
        viewer.setInput(((IStructuredSelection) selection).toList());
      }
      
      
      if (((IStructuredSelection) selection).getFirstElement() instanceof EObject) {
        if (!form.isDisposed()) {
          form.setText("Retriever");
        }

        
        // try {

        // Resource res = ((EObject) (((IStructuredSelection) selection).getFirstElement())).eResource()
        // .getResourceSet().getResource(URI.createPlatformResourceURI("/gamble/gamble.query"), true);
        /// if (viewer != null && res.getContents().size()>0) {
        // viewer.setInput(res.getContents().get(0));
        // }
        // } catch(Exception e) {

        // }
      }
    }
  }

}