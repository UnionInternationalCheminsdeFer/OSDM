package Gtm.actions;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.ui.action.ValidateAction;

import Gtm.problems.GtmProblemView;




public class GtmValidateAction extends ValidateAction {
	
	
	  public GtmValidateAction() {
		  super();
		  this.setToolTipText(super.getText());
		  setImageDescriptor(GtmUtils.getImageDescriptor("/icons/validate.png")); //$NON-NLS-1$
	  }
	
	  protected void handleDiagnostic(Diagnostic diagnostic) {
		  super.handleDiagnostic(diagnostic); 
		  GtmProblemView.getInstance().setRootDiagnostic(diagnostic);
	  }
	  
	  
	  public void run() {
		  GtmProblemView.getInstance().setRootDiagnostic(null);
		  super.run();
	  }

}
