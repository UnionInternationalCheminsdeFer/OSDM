package export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gtm.FareDelivery;

public class ExportFareDelivery {
	
	private Shell shell = null;
	
	public ExportFareDelivery (Shell shell) {
		this.shell = shell;
	}
	
	public void exportFareDelivery (FareDelivery fares, File file) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {

			if (!file.exists()) {
				file.createNewFile();
			}
		
			Writer writer = new BufferedWriter (new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
			mapper.writeValue(writer, fares);
			writer.close();
		} catch (JsonGenerationException e) {
			MessageBox dialog =  new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
			dialog.setText("json formating error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
		} catch (JsonMappingException e) {
			MessageBox dialog =  new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
			dialog.setText("json mapping error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
			dialog.setText("file error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
		}
		return;
	}

}
