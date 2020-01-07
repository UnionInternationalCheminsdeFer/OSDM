package export;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gtm.FareDelivery;

public class ExportFareDelivery {
	
	public static void exportFareDelivery (FareDelivery fareDelivery, File file) throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();

		// Java object to JSON file
		mapper.writeValue(file, fareDelivery);
		
	}

}
