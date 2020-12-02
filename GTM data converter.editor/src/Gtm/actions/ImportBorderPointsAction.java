package Gtm.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.Carrier;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.LegacyBorderPoint;
import Gtm.LegacyBorderPoints;
import Gtm.LegacyBorderSide;
import Gtm.LegacyFakeBorderStations;
import Gtm.OnBorderStations;
import Gtm.Station;
import Gtm.StationSet;
import Gtm.console.ConsoleUtil;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;

public class ImportBorderPointsAction extends ImportCsvDataAction {


	public ImportBorderPointsAction(IEditingDomainProvider editingDomainProvider) {
		super(NationalLanguageSupport.ImportBorderPointsAction_0, editingDomainProvider);
		this.setToolTipText(this.getText());
		setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importBorderpoints.png")); //$NON-NLS-1$
	}

	protected void run (IStructuredSelection structuredSelection) {
		
		GTMTool tool = GtmUtils.getGtmTool();
		
		GtmEditor editor = GtmUtils.getActiveEditor(); 
		
		EditingDomain domain = GtmUtils.getActiveDomain();
		if (domain == null) return;
		
		if (tool == null) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ImportServiceBrandsAction_1);
			dialog.setMessage(dialog.getText());
			dialog.open(); 
			return;
		}

		if (tool.getCodeLists() == null || tool.getCodeLists().getCarriers() == null || tool.getCodeLists().getCarriers().getCarriers().isEmpty() ) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ImportBorderPointsAction_2);
			dialog.setMessage(dialog.getText());
			dialog.open(); 
			return;
		}

		if (tool.getCodeLists() == null || tool.getCodeLists().getStations() == null || tool.getCodeLists().getStations().getStations().isEmpty() ) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ImportBorderPointsAction_3);
			dialog.setMessage(dialog.getText());
			dialog.open(); 
			return;
		}		
		
		BufferedReader br = super.getReader(NationalLanguageSupport.ImportBorderPointsAction_4);
		
		if (br == null) return;

		IRunnableWithProgress operation =	new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.

			public void run(IProgressMonitor monitor) {
				
				try {
					
					monitor.beginTask(NationalLanguageSupport.ImportBorderPointsAction_0, 250); 
		
					monitor.subTask(NationalLanguageSupport.ImportServiceBrandsAction_6);
					prepareStructure(tool, domain);
					monitor.worked(10);

					monitor.subTask(NationalLanguageSupport.ImportBorderPointsAction_0);
					
					
					HashMap<Integer,Station> stationMap = GtmUtils.getStationMap(tool);
			    	
			    	LegacyBorderPoints borderPoints = GtmFactory.eINSTANCE.createLegacyBorderPoints();

			        String st; 
			        boolean isFirstLine = true;
					
					while ((st = br.readLine()) != null) {

						if (!isFirstLine) {
							LegacyBorderPoint bp = decodeLine(st, tool, stationMap, editor);
							if (bp != null) {
								borderPoints.getLegacyBorderPoints().add(bp);	
							}
						} else {
							isFirstLine = false;
						}
					}

					monitor.subTask(NationalLanguageSupport.ImportBorderPointsAction_14);
					Command command = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108() , GtmPackage.Literals.LEGACY108__LEGACY_BORDER_POINTS, borderPoints);
			        if (command != null && command.canExecute()) {
			        	domain.getCommandStack().execute(command);
						writeConsoleInfo(NationalLanguageSupport.ImportBorderPointsAction_12 + Integer.toString(borderPoints.getLegacyBorderPoints().size()), editor);
			        }	
					monitor.worked(10);
					monitor.done();
					
				} catch (IOException e) {

					return;			
				} finally {
					monitor.done();
				}
			}
		};
		try {
			// This runs the operation, and shows progress.
			editor.disconnectViews();
			new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
		} catch (Exception exception) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ImportBorderPointsAction_13);
			dialog.setMessage(exception.getMessage());
			dialog.open(); 
			GtmEditorPlugin.INSTANCE.log(exception);
		} finally {
		editor.reconnectViews();
		}

		
	}


	private LegacyBorderPoint decodeLine(String st, GTMTool tool, HashMap<Integer, Station> stationMap, GtmEditor editor) {
		
		/*
		 * column 0: border point code
		 * column 1: carrier 1
		 * column 2: legacy station code carrier 1
		 * column 3: carrier 2
		 * column 4: legacy station code carrier 2
		 * column 5: fake merits stations
		 * column 6: stations on border or on carrier 1 side
		 * column 7: stations on border or on carrier 2 side
		 * column 8: name (for documentation only)
		 */
		
		
		String[] strings = st.split(";"); //$NON-NLS-1$
		
		if (strings.length < 9) return null;
		
		try {
			   
			    String name = "no name";
				if (strings.length > 8) {
					name = strings[8];
				}
				String errorId = strings[0] + " - " + name;
				String carrierString1 = strings[1];
				String carrierString2 = strings[3];				
			
				LegacyBorderPoint p = GtmFactory.eINSTANCE.createLegacyBorderPoint();
				
				try {
					p.setBorderPointCode(Integer.parseInt(strings[0]));
				} catch (Exception e) {
					writeConsoleError("border point import: invalid border point code: " + errorId,editor);
					return null;
				}
				
				if (p.getBorderPointCode() == 0) return null;
				
				int legacyStationCode1 = 0;
				int legacyStationCode2 = 0;			
				try {
					legacyStationCode1 = Integer.parseInt(strings[2]);
					legacyStationCode2 = Integer.parseInt(strings[4]);					
				} catch (Exception e) {
					writeConsoleError("border point import: legacy station code missing in border point: " + errorId,editor);
					return null;
				}

				while (strings[1].length() < 4) {
					strings[1] = "0" + strings[1];
				}
				Carrier carrier1 = findCarrier(tool, strings[1]);
				if (carrier1 == null) {
					String message = "border point import: first carrier " + carrierString1 + " not found in border point: " + errorId;
					writeConsoleError(message,editor);
					return null;
				}
				
				while (strings[3].length() < 4) {
					strings[3] = "0" + strings[3];
				}
				Carrier carrier2 = findCarrier(tool, strings[3]);
				if (carrier2 == null) {
					String message = "border point import: second carrier " + carrierString2 + " not found in border point: " + errorId;
					writeConsoleError(message,editor);
					return null;
				}

	
				
				StationSet setfake = addStationSet(strings[5],stationMap,editor,strings[0]);				
				LegacyFakeBorderStations fakeStations = GtmFactory.eINSTANCE.createLegacyFakeBorderStations();
				fakeStations.setStations(setfake);
				
				StationSet set1 = addStationSet(strings[6],stationMap, editor,strings[0]);
				if (set1 == null || set1.getStations() == null || set1.getStations().isEmpty()) {
					String message = "border point import: border stations for first carrier  " + carrierString1 + " missing in border point: " + errorId;
					writeConsoleError(message,editor);
					return null;
				}
				LegacyBorderSide bps1 = GtmFactory.eINSTANCE.createLegacyBorderSide();
				bps1.setCarrier(carrier1);
				bps1.setStations(set1);
				bps1.setLegacyStationCode(legacyStationCode1);				
				
				StationSet set2 = addStationSet(strings[7],stationMap, editor, strings[0]);
				if (set2 == null || set2.getStations() == null || set2.getStations().isEmpty()) {
					String message = "border point import: border stations for second carrier " + carrierString2 + " missing in border point: " + errorId;
					writeConsoleError(message,editor);
					return null;
				}				
				LegacyBorderSide bps2 = GtmFactory.eINSTANCE.createLegacyBorderSide();
				bps2.setCarrier(carrier2);		
				bps2.setStations(set2);
				bps2.setLegacyStationCode(legacyStationCode2);

				//on border stations are stations that are in both columns
				OnBorderStations onBorderStations = GtmFactory.eINSTANCE.createOnBorderStations();
				StationSet set4 = GtmFactory.eINSTANCE.createStationSet();
				onBorderStations.setStations(set4);			
				for (Station station : bps1.getStations().getStations()) {
					if (bps2.getStations().getStations().contains(station)) {
						onBorderStations.getStations().getStations().add(station);
						bps2.getStations().getStations().remove(station);
					}
				}
				for (Station station : onBorderStations.getStations().getStations()) {
					if (bps1.getStations().getStations().contains(station)) {
						bps1.getStations().getStations().remove(station);
					}
				}

				
				if (bps1.getCarrier() != null || (bps1.getStations() != null && !bps1.getStations().getStations().isEmpty())) {
					p.getBorderSides().add(bps1);
				}
				if (bps2.getCarrier() != null || (bps2.getStations() != null && !bps2.getStations().getStations().isEmpty())) {				
					p.getBorderSides().add(bps2);
				}
				if (fakeStations.getStations() != null && !fakeStations.getStations().getStations().isEmpty()) {
					p.setFakeBorderStations(fakeStations);
				}
				if (onBorderStations.getStations() != null && !onBorderStations.getStations().getStations().isEmpty()) {				
					p.setOnBorderStations(onBorderStations);
				}
				
				return p;
				
		} catch (NumberFormatException e1) {
			// ignore				
			return null;
		} catch (Exception e){
			e.printStackTrace();
			return null;
		}

	}

	private Carrier findCarrier(GTMTool tool, String code) {
		
		for (Carrier c : tool.getCodeLists().getCarriers().getCarriers()) {
			if (c.getCode().equals(code)) {
				return c;
			}
		}
		return null;
		
	}
	
	private StationSet addStationSet(String s, HashMap<Integer, Station> stationMap, GtmEditor editor, String borderPointCode) {
		
		if (s == null || s.length() == 0) return null;
		
		StationSet set = GtmFactory.eINSTANCE.createStationSet();
		
		String[] strings = s.split("/"); //$NON-NLS-1$
		
		for (String s1 : strings) {
			
			int codei = 0;
			try {
				codei = Integer.parseInt(s1);
			} catch (NumberFormatException e) {
				return null;
			}
			
			Integer code = Integer.valueOf(codei);
			
			Station station = stationMap.get(code);
			
			if (station == null) {
				String message = "border point import: station " + code + " not found in MERITS for border point " + borderPointCode;
				writeConsoleError(message,editor);
			} else {
				set.getStations().add(station);
			}

		}
		
		return set;
	}

	private void writeConsoleInfo(String message, GtmEditor editor) {
		try {
			if (editor == null || message == null || message.length() == 0) return;
			editor.getSite().getShell().getDisplay().asyncExec(() -> {
				ConsoleUtil.printInfo("Errors", message);
			});
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
	
	private void writeConsoleError(String message, GtmEditor editor) {
		try {
			if (editor == null || message == null || message.length() == 0) return;
			editor.getSite().getShell().getDisplay().asyncExec(() -> {
				ConsoleUtil.printError("Errors", message);
			});
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
}
