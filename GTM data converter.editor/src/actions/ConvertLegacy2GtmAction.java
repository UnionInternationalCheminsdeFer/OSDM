package Gtm.actions;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.Country;
import Gtm.GTMTool;
import Gtm.actions.converter.ConverterUtil;


public class ConvertLegacy2GtmAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ConvertLegacy2GtmAction(IEditingDomainProvider editingDomainProvider) {
			super("Convert Legacy 108 to GTM", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
			
		
		public ConvertLegacy2GtmAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}

		

		@Override
		protected void runAction(GTMTool tool) {
			

			EditingDomain domain = GtmUtils.getActiveDomain();
			
			Country country = tool.getConversionFromLegacy().getParams().getCountry();
			if (country == null) {
				String message = "the country is missing in the conversion parameter";
				GtmUtils.writeConsoleError(message);
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("the country is missing in the conversion parameter");
				dialog.open(); 
				return;
			}
			
			ConverterUtil converter = new ConverterUtil();
			
			converter.prepare(tool);
			
			int deleted = ConverterUtil.deleteOldConversionResults(tool, domain);
			GtmUtils.writeConsoleInfog("old series conversions deleted: " + Integer.toString(deleted));
			
			int added = converter.convertBorderPoints(tool,  domain);
			GtmUtils.writeConsoleInfog("border points converted: " + Integer.toString(added));			
			
			added = converter.convertSalesAvailabilities(tool,  domain);
			GtmUtils.writeConsoleInfog("sales avialabiliy ranges converted: " + Integer.toString(added));					
			
			
			added = converter.convert(tool,  domain);
			GtmUtils.writeConsoleInfog("series converted: " + Integer.toString(added));

		}

	

}
