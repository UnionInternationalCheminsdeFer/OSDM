package Gtm.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

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

import Gtm.Country;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.NUTSCodes;
import Gtm.NutsCode;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;

public class ImportNutsCodesAction extends ImportCsvDataAction {


	public ImportNutsCodesAction(IEditingDomainProvider editingDomainProvider) {
		super("import NUTS codes", editingDomainProvider);
		this.setToolTipText(this.getText());
		setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importNuts.png")); //$NON-NLS-1$
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
					
					monitor.beginTask("Import NUTs codes", 10000); 
		
					monitor.subTask("Initialize main structure");
					prepareStructure(tool, domain);
					monitor.worked(10);

					monitor.subTask("read codes");
					NUTSCodes newNuts = GtmFactory.eINSTANCE.createNUTSCodes();

			        String st; 
					CompoundCommand command =  new CompoundCommand();
					
					while ((st = br.readLine()) != null) {
						
						NutsCode nuts = decodeLine(st);

						if (nuts != null) {
							newNuts.getNutsCodes().add(nuts);	
						}
					}
			        
					monitor.subTask("Add codes");
			        int added = 0;
			        int updated = 0;
			        
			        HashMap<String, NutsCode> oldNuts = new HashMap<String,NutsCode>();
					for (NutsCode code : tool.getCodeLists().getNutsCodes().getNutsCodes()) {
				       	oldNuts.put(code.getCode(),code);       			
			        }
			        

					for (NutsCode nuts : newNuts.getNutsCodes()) {
			       	
						NutsCode oldCode = oldNuts.get(nuts.getCode());
			        	
			        	if (oldCode == null) {
			        		Command cmd2 = new AddCommand(domain, tool.getCodeLists().getNutsCodes().getNutsCodes(), nuts);
			        		command.append(cmd2);
			        		added++;
			        	} else {
			        		Command cmd2 = new SetCommand(domain, oldCode, GtmPackage.Literals.NUTS_CODE__NAME, nuts.getName());
			                command.append(cmd2);
			                updated++;
			           	}
			        			
			        }
			        
			        if (command != null && !command.isEmpty()) {
			        	domain.getCommandStack().execute(command);
						GtmUtils.writeConsoleInfo("nuts codes added: (" + Integer.toString(added)+")" );
						GtmUtils.writeConsoleInfo("nuts codes updated: (" + Integer.toString(updated) + ")" );
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


	private NutsCode decodeLine(String st) {
		String[] strings = st.split(";");
		if (strings.length < 2) return null;
		
		NutsCode nuts = GtmFactory.eINSTANCE.createNutsCode();
		nuts.setCode(strings[0]);
			
		String nameUTF8 = null;
		nameUTF8 = strings[1];//new String(strings[2].getBytes("ISO-8859-1"));
			
		nuts.setName(nameUTF8);
		return nuts;

	}

}
