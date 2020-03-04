package Gtm.problems;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

import Gtm.actions.GtmUtils;
import Gtm.presentation.GtmEditor;

public class GtmProblemView extends ViewPart {
	
	// the ID needs to match the id set in the view's properties
	public static final String ID = "org.uic.gtm.GtmProblemView"; //$NON-NLS-1$
	private TreeViewer contentTreeViewer;
	
	private static GtmProblemView me = null;
	
	private ArrayList<ProblemCategory> content = null;
	

	public GtmProblemView(){
		super();
		this.setPartName("Problems");
		me = this;
		
		ProblemCategory errors = new ProblemCategory(Diagnostic.ERROR, "Error");
		 
		ProblemCategory warnings = new ProblemCategory(Diagnostic.WARNING, "Warning");
		 
		ProblemCategory infos = new ProblemCategory(Diagnostic.INFO, "Info");
		
		content = new ArrayList<ProblemCategory>();
		content.add(0,errors);
		content.add(1,warnings);
		content.add(2,infos);
	}
	
	@Override
	public void createPartControl(Composite parent) {

		// Create TreeViewer

		final Tree contentTree = new Tree(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		contentTree.setHeaderVisible(true);
		contentTreeViewer = new TreeViewer(contentTree);
		
		final TreeColumn column1 = new TreeColumn(contentTree, SWT.LEFT);
		contentTree.setLinesVisible(true);
		column1.setAlignment(SWT.LEFT);
		column1.setText("Description");
		column1.setWidth(500);
		TreeColumn column2 = new TreeColumn(contentTree, SWT.RIGHT);
		column2.setAlignment(SWT.LEFT);
		column2.setText("Object");
		column2.setWidth(300);
		
		contentTreeViewer.setContentProvider(new ProblemViewTreeTableContentProvider());
		
		contentTreeViewer.addDoubleClickListener(new IDoubleClickListener(){
			public void doubleClick(DoubleClickEvent event){
				TreeSelection ts = (TreeSelection) event.getSelection();
				Object firstElement = ts.getFirstElement();
				if(firstElement instanceof Diagnostic){
					Diagnostic diagnostic = (Diagnostic) firstElement;
					List<?> data = diagnostic.getData();
					if(data != null && data.size() > 0 ){
						Object object = (EObject) data.get(0);												
						// Select eObject in navigation
						GtmEditor editor = GtmUtils.getActiveEditor();
						ISelection selection = new StructuredSelection(object);
						editor.setSelection(selection);
						
						editor.getContentOutlinePage().setSelection(selection);
						//editor.expandTreeViews(object);
					}
				}
			}
		});

				
		contentTreeViewer.setLabelProvider(new ProblemViewTreeTableLabelProvider());

		
		contentTreeViewer.setInput(content);
		contentTreeViewer.expandAll();
	}

	
	 public class ProblemViewTreeTableContentProvider implements ITreeContentProvider {
		 
	 
		 public Object[] getChildren(Object arg) {
			 	if (arg instanceof ProblemCategory) {
			 		return ((ProblemCategory)arg).getChildren().toArray();
			 	}
				return null;
		 }

		 public Object[] getElements(Object arg) {
			if(arg instanceof  ArrayList<?>){
				return ((ArrayList<?>) arg).toArray();
			} else if(arg instanceof  ProblemCategory){
				return ((ProblemCategory) arg).getChildren().toArray();
			} else if(arg instanceof Diagnostic){
				return ((Diagnostic) arg).getChildren().toArray();
			}
			return null;
		}

		public Object getParent(Object arg) {
			return null;
		}

		public boolean hasChildren(Object arg) {
			if(arg instanceof ArrayList<?>){
				return ((ArrayList<?>) arg).size() > 0;
			} 
			if(arg instanceof ProblemCategory){
				return ((ProblemCategory) arg).getChildren().size() > 0;
			} 
			return false;
		}
			
	}
	 
	public class ProblemViewTreeTableLabelProvider  implements ITableLabelProvider {

		public void addListener(ILabelProviderListener arg0) {
		}


		public void dispose() {
		}


		public boolean isLabelProperty(Object arg0, String arg1) {
			return false;
		}


		public void removeListener(ILabelProviderListener arg0) {
		}


		public Image getColumnImage(Object arg0, int arg1) {
			return null;
		}

		public String getColumnText(Object o, int column) {
			if(o instanceof ProblemCategory && column == 0) {
				if (((ProblemCategory)o).getSeverity() == Diagnostic.ERROR) return "Errors";
				if (((ProblemCategory)o).getSeverity() == Diagnostic.WARNING) return "Warnings";
				if (((ProblemCategory)o).getSeverity() == Diagnostic.INFO) return "Infos";			
			} else if (o instanceof Diagnostic){
				Diagnostic diagnostic = ((Diagnostic) o);
				if(column == 0){
					return diagnostic.getMessage(); 
				} else if(column == 1){
					if (diagnostic.getData()!= null && !diagnostic.getData().isEmpty()) {
						if (diagnostic.getData().get(0) instanceof EObject) {
							return GtmUtils.getTypedDescription((EObject)diagnostic.getData().get(0));
						}
					}
				}
			}
			return null;
		}
		
	}


	@Override
	public void setFocus() {
		contentTreeViewer.getControl().setFocus();
	}


	public static GtmProblemView getInstance() {
		if (me == null) {
			me = new GtmProblemView();
		}
		return me;
	}
	
	public void setRootDiagnostic(Diagnostic diagnostic) {
		

		if(diagnostic == null){
			return;
		}
		
		List<Diagnostic> diagnostics = diagnostic.getChildren();
		for (Diagnostic childDiagnostic : diagnostics) {

			switch (childDiagnostic.getSeverity()){
			case Diagnostic.ERROR:
				content.get(0).addChild(childDiagnostic);
				break;
			case Diagnostic.WARNING:
				content.get(1).addChild(childDiagnostic);
				break;
			case Diagnostic.INFO:
				content.get(2).addChild(childDiagnostic);
				break;
			}
		}
		
		// Refresh Viewer
		Display.getDefault().asyncExec(new Runnable(){

			public void run() {
				if(contentTreeViewer != null){
				   contentTreeViewer.refresh();
				   contentTreeViewer.expandAll();
				}
			}

		});
	}

	public void clearContent() {
		for (ProblemCategory list : content) {
			list.clear();
		}		
	}
	

}
