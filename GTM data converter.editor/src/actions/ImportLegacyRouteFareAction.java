package actions;

import java.io.BufferedReader;
import java.io.IOException;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108;
import Gtm.LegacyRouteFare;



public class ImportLegacyRouteFareAction extends ImportLegacyAction {

	
	public ImportLegacyRouteFareAction(IEditingDomainProvider editingDomainProvider) {
		super("Import legacy route fares TCVI", editingDomainProvider);
	}
	
	public ImportLegacyRouteFareAction(String text, IEditingDomainProvider editingDomainProvider) {
		super(text, editingDomainProvider);
	}

	
	protected void runAction(Legacy108 legacy108) {
		
		BufferedReader br = super.getReader("import route prices TCVI");
		       
        String st; 
        
		CompoundCommand command =  new CompoundCommand();
		
    	Command cmd =  DeleteCommand.create(editingDomainProvider.getEditingDomain(), legacy108.getRouteFare());
    	if (cmd.canExecute()) {
    		command.append(cmd);    	
    	}
        
        try {
			while ((st = br.readLine()) != null) {
				
			  LegacyRouteFare fare = decodeLine(st);
			  
			  if (fare != null) {
				  Command cmd2 =  AddCommand.create(editingDomainProvider.getEditingDomain(), legacy108.getRouteFare(), GtmPackage.LEGACY108__ROUTE_FARE,fare);
				  if (cmd2.canExecute()) {
					  command.append(cmd2);
				  }
			  }
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("TCVI file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
        if (command != null && !command.isEmpty()) {
        	editingDomainProvider.getEditingDomain().getCommandStack().execute(command);
        }
		
	}


	private LegacyRouteFare decodeLine(String st) {
		
		//String carrier 		= st.substring(0, 4);
		String number  			= st.substring(4, 9);
		String series    		= st.substring(9,14);

		String fare1st 	 		= st.substring(133,140);	
		String fare2nd 	 		= st.substring(125,132);	
		
		LegacyRouteFare fare = GtmFactory.eINSTANCE.createLegacyRouteFare();
		
		fare.setFareTableNumber(Integer.parseInt(number));
		fare.setSeriesNumber(Integer.parseInt(series));
		
		fare.setFare1st(Integer.parseInt(fare1st));
		fare.setFare1st(Integer.parseInt(fare2nd));
		
		return fare;
	}


	   	
	
}
