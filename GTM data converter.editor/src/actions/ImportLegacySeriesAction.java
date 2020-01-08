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
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;



public class ImportLegacySeriesAction extends ImportLegacyAction {
	
	public ImportLegacySeriesAction(IEditingDomainProvider editingDomainProvider) {
		super("Import Legacy series TCVS", editingDomainProvider);
	}

	public ImportLegacySeriesAction(String text, IEditingDomainProvider editingDomainProvider) {
		super(text, editingDomainProvider);
	}

	
	/*
	 * to be implemented by all actions
	 */
	protected void runAction(Legacy108 legacy108) {
		
		BufferedReader br = super.getReader("import series TCVS");
		
		CompoundCommand command =  new CompoundCommand();
		
    	Command cmd =  DeleteCommand.create(editingDomainProvider.getEditingDomain(), legacy108.getSeries());
    	if (cmd.canExecute()) {
    		command.append(cmd);    	
    	}
		
      
        String st; 
        try {
			while ((st = br.readLine()) != null) {
				
			  LegacySeries series = decodeLine(st);
			  if (series != null) {
				  Command cmd2 =  AddCommand.create(editingDomainProvider.getEditingDomain(), legacy108.getSeries(), GtmPackage.LEGACY108__SERIES,series);
				  if (cmd2.canExecute()) {
					  command.append(cmd2);
				  }
			  }
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("TCVS file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
        if (command != null && !command.isEmpty()) {
        	editingDomainProvider.getEditingDomain().getCommandStack().execute(command);
        }
	}



	private LegacySeries decodeLine(String st) {
		
		//String carrier 	= st.substring(0, 4);
		String number  		= st.substring(4, 9);
		String flag  		= st.substring(9,10);
		
		if (flag.equals("2")) return null;
		
		String type 		= st.substring(11,12);
		//String flag2 		= st.substring(12,13);		
		String departure 	= st.substring(13,17);		
		String destination	= st.substring(38,43);		

		String distanceKl2	= st.substring(139,144);
		String distanceKl1	= st.substring(145,150);		
		
		String calculation	= st.substring(151,152);		
		
			
		String via1	= st.substring(176,181);			
		String pos1	= st.substring(181,182);			

		String via2	= st.substring(183,188);			
		String pos2	= st.substring(188,189);	
		
		String via3	= st.substring(190,195);			
		String pos3	= st.substring(195,196);	
		
		String via4	= st.substring(197,202);			
		String pos4	= st.substring(202,203);	
		
		String via5	= st.substring(204,209);			
		String pos5	= st.substring(209,210);	
		
		LegacySeries series = GtmFactory.eINSTANCE.createLegacySeries();
		
		series.setNumber(Integer.parseInt(number));
		
		if (type.equals("1")) series.setType(LegacySeriesType.TRANSIT);
		if (type.equals("2")) series.setType(LegacySeriesType.BORDER_DESTINATION);
		if (type.equals("3")) series.setType(LegacySeriesType.STATION_STATION);

		if (calculation.equals("1")) series.setPricetype(LegacyCalculationType.DISTANCE_BASED);
		if (calculation.equals("2")) series.setPricetype(LegacyCalculationType.ROUTE_BASED);		
		
		series.setFromStation(Integer.parseInt(departure));
		series.setToStation(Integer.parseInt(destination));
		
		series.setDistance1(Integer.parseInt(distanceKl1));
		series.setDistance2(Integer.parseInt(distanceKl2));
		
		
		int viaStation1 = Integer.parseInt(via1); 
		int viaStation2 = Integer.parseInt(via2); 
		int viaStation3 = Integer.parseInt(via3); 
		int viaStation4 = Integer.parseInt(via4); 
		int viaStation5 = Integer.parseInt(via5); 
		
		if (viaStation1 > 0) {
			addViaStation(series, viaStation1, pos1);
		}
			
		if (viaStation2 > 0) {
			addViaStation(series, viaStation2, pos2);
		}
		
		if (viaStation3 > 0) {
			addViaStation(series, viaStation3, pos3);
		}
		
		if (viaStation4 > 0) {
			addViaStation(series, viaStation4, pos4);
		}
		
		if (viaStation5 > 0) {
			addViaStation(series, viaStation5, pos5);
		}

		return series;
	}


	private void addViaStation(LegacySeries series, int via, String pos1) {
		LegacyViastation station = GtmFactory.eINSTANCE.createLegacyViastation();
		
		station.setCode(via);
		station.setPosition(Integer.parseInt(pos1));
		series.getViastations().add(station);
		
	}
		
	
	   	
	
}
