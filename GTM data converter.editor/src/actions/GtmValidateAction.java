package Gtm.actions;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.ui.action.ValidateAction;

import Gtm.problems.GtmProblemView;




public class GtmValidateAction extends ValidateAction {
	
	  protected void handleDiagnostic(Diagnostic diagnostic) {
		  super.handleDiagnostic(diagnostic); 
		  GtmProblemView.getInstance().setRootDiagnostic(diagnostic);
	  }
	  
	  
	  public void run() {
		  GtmProblemView.getInstance().setRootDiagnostic(null);
		  super.run();

	  }

}
