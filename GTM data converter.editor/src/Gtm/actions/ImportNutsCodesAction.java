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

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.NUTSCodes;
import Gtm.NutsCode;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;

public class ImportNutsCodesAction extends ImportCsvDataAction {


	public ImportNutsCodesAction(IEditingDomainProvider editingDomainProvider) {
		super(NationalLanguageSupport.ImportNutsCodesAction_0, editingDomainProvider);
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
			dialog.setText(NationalLanguageSupport.ImportNutsCodesAction_1);
			dialog.open(); 
			return;
		}
		
		BufferedReader br = super.getReader(NationalLanguageSupport.ImportNutsCodesAction_4);
		
		if (br == null) return;

		IRunnableWithProgress operation =	new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.

			public void run(IProgressMonitor monitor) {
				
				try {
					
					monitor.beginTask(NationalLanguageSupport.ImportNutsCodesAction_5, 10000); 
		
					monitor.subTask(NationalLanguageSupport.ImportNutsCodesAction_6);
					prepareStructure(tool, domain);
					monitor.worked(10);

					monitor.subTask(NationalLanguageSupport.ImportNutsCodesAction_7);
					NUTSCodes newNuts = GtmFactory.eINSTANCE.createNUTSCodes();

			        String st; 
					CompoundCommand command =  new CompoundCommand();
					
					while ((st = br.readLine()) != null) {
						
						NutsCode nuts = decodeLine(st);

						if (nuts != null) {
							newNuts.getNutsCodes().add(nuts);	
						}
					}
			        
					monitor.subTask(NationalLanguageSupport.ImportNutsCodesAction_8);
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
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportNutsCodesAction_9 + Integer.toString(added)+")" ); //$NON-NLS-2$
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportNutsCodesAction_11 + Integer.toString(updated) + ")" ); //$NON-NLS-2$
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
			dialog.setText(NationalLanguageSupport.ImportNutsCodesAction_13);
			dialog.setMessage(exception.getMessage());
			dialog.open(); 
			GtmEditorPlugin.INSTANCE.log(exception);
		} finally {
		editor.reconnectViews();
		}

		
	}


	private NutsCode decodeLine(String st) {
		String[] strings = st.split(";"); //$NON-NLS-1$
		if (strings.length < 2) return null;
		
		NutsCode nuts = GtmFactory.eINSTANCE.createNutsCode();
		nuts.setCode(strings[0]);
			
		String nameUTF8 = null;
		nameUTF8 = strings[1];//new String(strings[2].getBytes("ISO-8859-1"));
			
		nuts.setName(nameUTF8);
		return nuts;

	}

}
