package Gtm.presentation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

public class GtmProblemView extends ViewPart {
	
	// the ID needs to match the id set in the view's properties
	public static final String ID = "org.uic.gtm.GtmProblemView"; //$NON-NLS-1$
	private static TreeViewer contentTreeViewer;
	
	private static ArrayList<Diagnostic> errors = new ArrayList<Diagnostic>();
	private static ArrayList<Diagnostic> warnings = new ArrayList<Diagnostic>();
	private static ArrayList<Diagnostic> infos = new ArrayList<Diagnostic>();
	
	protected static ArrayList<Diagnostic>[] content = null;


	public GtmProblemView(){
		super();
		this.setPartName("Problems");
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
				
		contentTreeViewer.setLabelProvider(new ProblemViewTreeTableLabelProvider());

	}

	
	 public class ProblemViewTreeTableContentProvider implements ITreeContentProvider {
			
			public Object[] getChildren(Object arg0) {
				return content;
			}

			public Object[] getElements(Object arg) {
				if(arg instanceof  ArrayList<?>){
					return (( ArrayList<?>) arg).toArray();
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
				} else if(arg instanceof Diagnostic){
					return ((Diagnostic) arg).getChildren().size() > 0;
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
			if(o instanceof ArrayList<?> && column == 0)
				
				if (o == errors) {
					return errors.size() + " " + "Errors";
				} else if (o == warnings) {
					return warnings.size() + " " + "Warnings";
				} else if (o == infos) {
					return infos.size() + " " + "Infos";
				} else if (o instanceof Diagnostic){
					Diagnostic diagnostic = ((Diagnostic) o);
					if(column == 0){
						return diagnostic.getMessage(); 
					} else if(column == 1){
						return diagnostic.getSource();
					}
				}
				return null;
			}
		
	}


	@Override
	public void setFocus() {
	}
	 

}
