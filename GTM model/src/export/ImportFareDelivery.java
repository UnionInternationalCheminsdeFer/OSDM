package export;

import java.io.File;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gtm.FareDelivery;

public class ImportFareDelivery {
	
	
	public static FareDelivery importFareDelivery(File file) {
	
		ObjectMapper mapper = new ObjectMapper();

		
		FareDelivery fareDelivery = null;

		//JSON file to Java object
		try {
			fareDelivery  = mapper.readValue(file, FareDelivery.class);
		} catch (JsonParseException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("json parsing error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return null;
		} catch (JsonMappingException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("json mapping error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("file error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return null;
		}
		
		return fareDelivery;
		
	}

}
