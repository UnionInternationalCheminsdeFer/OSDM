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
		super("Import border points", editingDomainProvider);
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
			dialog.setText("Carriers have to be loaded before border points");
			dialog.setMessage(dialog.getText());
			dialog.open(); 
			return;
		}

		if (tool.getCodeLists() == null || tool.getCodeLists().getStations() == null || tool.getCodeLists().getStations().getStations().isEmpty() ) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("Stations have to be loaded before border points");
			dialog.setMessage(dialog.getText());
			dialog.open(); 
			return;
		}		
		
		BufferedReader br = super.getReader(NationalLanguageSupport.ImportServiceBrandsAction_4);

		IRunnableWithProgress operation =	new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.

			public void run(IProgressMonitor monitor) {
				
				try {
					
					monitor.beginTask("Import border points", 250); 
		
					monitor.subTask(NationalLanguageSupport.ImportServiceBrandsAction_6);
					prepareStructure(tool, domain);
					monitor.worked(10);

					monitor.subTask("Import border points");
					
					
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

					monitor.subTask("Add border points to data");
					Command command = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108() , GtmPackage.Literals.LEGACY108__LEGACY_BORDER_POINTS, borderPoints);
			        if (command != null && command.canExecute()) {
			        	domain.getCommandStack().execute(command);
						writeConsoleInfo("Border points imported: " + Integer.toString(borderPoints.getLegacyBorderPoints().size()), editor);
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
			dialog.setText(NationalLanguageSupport.ImportServiceBrandsAction_13);
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
		 * column 3: carrier 2
		 * column 5: fake merits stations
		 * column 6: stations on border or on carrier 1 side
		 * column 7: stations on border or on carrier 2 side
		 */
		
		
		String[] strings = st.split(";"); //$NON-NLS-1$
		
		if (strings.length < 8) return null;
		
		try {
			
				LegacyBorderPoint p = GtmFactory.eINSTANCE.createLegacyBorderPoint();
				p.setBorderPointCode(Integer.parseInt(strings[0]));
				
				if (p.getBorderPointCode() == 0) return null;
				
				while (strings[1].length() < 4) {
					strings[1] = "0" + strings[1];
				}

				while (strings[3].length() < 4) {
					strings[3] = "0" + strings[3];
				}
				
				Carrier carrier1 = findCarrier(tool, strings[1]);
				
				if (carrier1 == null) {
					String message = "Carrier not found: " + strings[1];
					writeConsoleError(message,editor);
				}
				
				Carrier carrier2 = findCarrier(tool, strings[3]);
				
				if (carrier2 == null) {
					String message = "Carrier not found: " + strings[3];
					writeConsoleError(message,editor);
				}
				
				if (carrier1 == null || carrier2 == null) return null;
				
				LegacyBorderSide bps1 = GtmFactory.eINSTANCE.createLegacyBorderSide();
				bps1.setCarrier(carrier1);
				StationSet set = GtmFactory.eINSTANCE.createStationSet();
				bps1.setStations(set);
				
				LegacyBorderSide bps2 = GtmFactory.eINSTANCE.createLegacyBorderSide();
				bps2.setCarrier(carrier2);		
				StationSet set2 = GtmFactory.eINSTANCE.createStationSet();
				bps2.setStations(set2);
				
				LegacyFakeBorderStations fakeStations = GtmFactory.eINSTANCE.createLegacyFakeBorderStations();
				StationSet set3 = GtmFactory.eINSTANCE.createStationSet();
				fakeStations.setStations(set3);
				
				OnBorderStations onBorderStations = GtmFactory.eINSTANCE.createOnBorderStations();
				StationSet set4 = GtmFactory.eINSTANCE.createStationSet();
				onBorderStations.setStations(set4);				
				
				addStationSet(fakeStations.getStations(),strings[5],stationMap, editor);				
				
				addStationSet(bps1.getStations(),strings[6],stationMap, editor);
				
				addStationSet(bps2.getStations(),strings[7],stationMap, editor);
				
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
	
	private void addStationSet(StationSet set , String s, HashMap<Integer, Station> stationMap, GtmEditor editor) {
		
		if (s == null || s.length() == 0) return;
		
		String[] strings = s.split("/"); //$NON-NLS-1$
		
		for (String s1 : strings) {
			
			int codei = 0;
			try {
				codei = Integer.parseInt(s1);
			} catch (NumberFormatException e) {
				return;
			}
			
			Integer code = Integer.valueOf(codei);
			
			Station station = stationMap.get(code);
			
			if (station == null) {
				String message = "Station not found: " + code;
				writeConsoleError(message,editor);
			} else {
				set.getStations().add(station);
			}

		}
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
