package Gtm.actions;

import java.io.File;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GtmPackage;
import export.ImportFareDelivery;
import gtm.FareDelivery;


public class ImportGTMJsonAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ImportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super("Import GTM data", editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ImportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}


		private GeneralTariffModel convertFareData(FareDelivery fareDelivery) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("Not yet implemented");
			dialog.open(); 
			return null;
		}

    
		protected File getFile(){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText("select import json file");
	        String[] filterExt = { "*.json" };
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return new File(path);
			
		}

		@Override
		protected void runAction(GTMTool tool) {
			
			File file = getFile();
			if (file == null) return;
			
			FareDelivery fareDelivery = ImportFareDelivery.importFareDelivery(file);
					
			if (fareDelivery == null) return;

			GeneralTariffModel model = convertFareData(fareDelivery);
			EditingDomain domain = GtmUtils.getActiveDomain();
			
			SetCommand command = new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__GENERAL_TARIFF_MODEL, model);
				
			if (command.canExecute()) {
				domain.getCommandStack().execute(command);
			}
		}

	

}
