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
import Gtm.LegacyDistanceFare;



public class ImportLegacyDistanceFareAction extends ImportLegacyAction {

	public ImportLegacyDistanceFareAction(IEditingDomainProvider editingDomainProvider) {
		super("Import legacy distance fares TCVH", editingDomainProvider);
	}
	
	/*
	 * to be implemented by all actions
	 */
	protected void runAction(Legacy108 legacy108) {
		
		BufferedReader br = super.getReader("import prices TCVP");
		
		CompoundCommand command =  new CompoundCommand();
		
    	Command cmd =  DeleteCommand.create(editingDomainProvider.getEditingDomain(), legacy108.getDistanceFare());
    	if (cmd.canExecute()) {
    		command.append(cmd);    	
    	}
       
        String st; 
        try {
			while ((st = br.readLine()) != null) {
				
				LegacyDistanceFare fare = decodeLine(st);
			  
				if (fare != null) {
				  Command cmd2 =  AddCommand.create(editingDomainProvider.getEditingDomain(), legacy108.getDistanceFare(), GtmPackage.LEGACY108__DISTANCE_FARE,fare);
				  if (cmd2.canExecute()) {
					  command.append(cmd2);
				  }
				}
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("series file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
        if (command != null && !command.isEmpty()) {
        	editingDomainProvider.getEditingDomain().getCommandStack().execute(command);
        }
		
	}



	private LegacyDistanceFare decodeLine(String st) {
		
		//String carrier 		= st.substring(0, 4);
		String number  			= st.substring(4, 9);
		String distance  		= st.substring(9,14);
		String flag 			= st.substring(14,15);	 
				
		if (flag.equals("2")) return null;

		String fare2nd 	 		= st.substring(15,22);	
		String fare1st 	 		= st.substring(23,30);	
		

		
		LegacyDistanceFare fare = GtmFactory.eINSTANCE.createLegacyDistanceFare();
		
		fare.setFareTableNumber(Integer.parseInt(number));
		fare.setDistance(Integer.parseInt(distance));
		
		
		fare.setFare1st(Integer.parseInt(fare1st));
		fare.setFare1st(Integer.parseInt(fare2nd));
		
		return fare;
	}


	   	
	
}
