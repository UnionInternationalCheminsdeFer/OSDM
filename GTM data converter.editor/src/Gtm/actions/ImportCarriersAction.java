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
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;

public class ImportCarriersAction extends ImportCsvDataAction {


	public ImportCarriersAction(IEditingDomainProvider editingDomainProvider) {
		super(NationalLanguageSupport.ImportCarriersAction_0, editingDomainProvider);
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
			dialog.setText(NationalLanguageSupport.ImportCarriersAction_1);
			dialog.open(); 
			return;
		}
		
		BufferedReader br = super.getReader(NationalLanguageSupport.ImportCarriersAction_4);

		if (br == null) return;
		
		IRunnableWithProgress operation =	new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.

			public void run(IProgressMonitor monitor) {
				
				try {
					
					monitor.beginTask(NationalLanguageSupport.ImportCarriersAction_5, 4000); 
		
					monitor.subTask(NationalLanguageSupport.ImportCarriersAction_6);
					prepareStructure(tool, domain);
					monitor.worked(10);

					monitor.subTask(NationalLanguageSupport.ImportCarriersAction_7);
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

			        
					monitor.subTask(NationalLanguageSupport.ImportCarriersAction_8);
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
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportCarriersAction_9 + Integer.toString(added)+")" , editor); //$NON-NLS-2$
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportCarriersAction_11 + Integer.toString(updated) + ")" , editor); //$NON-NLS-2$
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
			dialog.setText(NationalLanguageSupport.ImportCarriersAction_13);
			dialog.setMessage(exception.getMessage());
			dialog.open(); 
			GtmEditorPlugin.INSTANCE.log(exception);
		} finally {
		editor.reconnectViews();
		}

		
	}



	private Carrier decodeLine(String st) {
		String[] strings = st.split(";"); //$NON-NLS-1$
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
