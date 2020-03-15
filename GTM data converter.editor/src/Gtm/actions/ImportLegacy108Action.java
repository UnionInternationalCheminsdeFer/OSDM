package Gtm.actions;

import java.io.File;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import Gtm.GTMTool;
import Gtm.actions.converter.LegacyImporter;
import Gtm.nls.NationalLanguageSupport;




public class ImportLegacy108Action extends BasicGtmAction {
	
	public ImportLegacy108Action(IEditingDomainProvider editingDomainProvider) {
		super(NationalLanguageSupport.ImportLegacy108Action_0, editingDomainProvider);
		this.setToolTipText(this.getText());
		setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importLegacy.png")); //$NON-NLS-1$
	}

	public ImportLegacy108Action(String text, IEditingDomainProvider editingDomainProvider) {
		super(text, editingDomainProvider);
		this.setToolTipText(this.getText());
		setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importLegacy.png")); //$NON-NLS-1$
	}

	
	@Override
	protected void runAction(GTMTool tool) {
        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
        fd.setText(NationalLanguageSupport.ImportLegacy108Action_1);
        String[] filterExt = { "*.txt" }; //$NON-NLS-1$
        fd.setFilterExtensions(filterExt);
        String path = fd.open();
        
        if (path == null || path.length() < 7 ) return;
        
        File file = new File(path);
		
		LegacyImporter importer = new LegacyImporter(GtmUtils.getGtmTool(), file.toPath());
		
		importer.importAll();
	}

}