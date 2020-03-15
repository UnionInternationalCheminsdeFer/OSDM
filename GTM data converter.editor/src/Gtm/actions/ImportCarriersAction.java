package Gtm.actions;

import java.io.BufferedReader;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
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
import Gtm.Carriers;
import Gtm.Country;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;

public class ImportCarriersAction extends ImportCsvDataAction {


	public ImportCarriersAction(IEditingDomainProvider editingDomainProvider) {
		super("import carrier codes", editingDomainProvider);
		this.setToolTipText(this.getText());
		setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importCarriers.png")); //$NON-NLS-1$
	}
	
	
	protected void run (IStructuredSelection structuredSelection) {
		
		GTMTool tool = GtmUtils.getGtmTool();
		
		GtmEditor editor = GtmUtils.getActiveEditor(); 
		
		EditingDomain domain = GtmUtils.getActiveDomain();
		if (domain == null) return;
		
		if (tool == null) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("no data found");
			dialog.open(); 
			return;
		}
		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = "the country is missing in the conversion parameter";
			GtmUtils.writeConsoleError(message);
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("the country is missing in the conversion parameter");
			dialog.open(); 
			return;
		}
		
		BufferedReader br = super.getReader("import carrier codes (.csv)");

		IRunnableWithProgress operation =	new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.

			public void run(IProgressMonitor monitor) {
				
				try {
					
					monitor.beginTask("Import carriers", 4000); 
		
					monitor.subTask("Initialize main structure");
					prepareStructure(tool, domain);
					monitor.worked(10);

					monitor.subTask("read carriers");
			    	Carriers newCarriers = GtmFactory.eINSTANCE.createCarriers();

			        String st; 
			        boolean isFirstLine = true;
					CompoundCommand command =  new CompoundCommand();
					
					while ((st = br.readLine()) != null) {
							
							Carrier carrier = decodeLine(st);
							
							if (!isFirstLine) {
								if (carrier != null) {
									newCarriers.getCarriers().add(carrier);	
								}
							} else {
								isFirstLine = false;
							}
							monitor.worked(1);
						}

			        
			        int added = 0;
			        int updated = 0;

			        
					monitor.subTask("Add carriers");
					for (Carrier newCarrier : newCarriers.getCarriers()) {
			       	
			        	Carrier carrier = tool.getCodeLists().getCarriers().findCarrier(newCarrier.getCode());
			        	
			        	if (carrier == null) {
			        		Command cmd2 = new AddCommand(domain, tool.getCodeLists().getCarriers().getCarriers(), newCarrier);
			        		command.append(cmd2);
			        		added++;
			        	} else {
			        		Command cmd2 = new SetCommand(domain, carrier, GtmPackage.Literals.CARRIER__NAME, newCarrier.getName());
			                command.append(cmd2);
			        		Command cmd3 = new SetCommand(domain, carrier, GtmPackage.Literals.CARRIER__SHORT_NAME, newCarrier.getShortName());
			                command.append(cmd3); 
			                updated++;
			           	}
			        			
			        }
			        
			        if (command != null && !command.isEmpty()) {
			        	domain.getCommandStack().execute(command);
						GtmUtils.writeConsoleInfo("carriers added: (" + Integer.toString(added)+")" );
						GtmUtils.writeConsoleInfo("carriers updated: (" + Integer.toString(updated) + ")" );
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
			dialog.setText("carrier file read error");
			dialog.setMessage(exception.getMessage());
			dialog.open(); 
			GtmEditorPlugin.INSTANCE.log(exception);
		} finally {
		editor.reconnectViews();
		}

		
	}



	private Carrier decodeLine(String st) {
		String[] strings = st.split(";");
		if (strings.length < 3) return null;
		
		if (strings[0].length() == 4) {
			Carrier carrier = GtmFactory.eINSTANCE.createCarrier();
			carrier.setCode(strings[0]);
			
			String nameUTF8 = null;
			nameUTF8 = strings[2];//new String(strings[2].getBytes("ISO-8859-1"));
			
			carrier.setName(nameUTF8);
			carrier.setShortName(strings[1]);
			return carrier;
		}
		return null;

	}

}
