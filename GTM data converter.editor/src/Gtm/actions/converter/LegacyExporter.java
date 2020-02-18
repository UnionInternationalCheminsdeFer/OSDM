package Gtm.actions.converter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.GTMTool;
import Gtm.Legacy108Station;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;
import Gtm.actions.GtmUtils;

public class LegacyExporter {
	
	private GTMTool tool = null;
	private Path exportPath = null;
		
	public LegacyExporter(GTMTool tool, Path path) {
		this.tool = tool;
		this.exportPath = path;
		
		try {
			exportTCVfile();
			exportTCVGfile();
			exportTCVSfile();
			exportFareFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	private void exportFareFile() throws IOException {
		
		String provider = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0).getSupplyingCarrierCode();

				
		BufferedWriter writer = getWriter(exportPath, "0001" + provider);
		
		boolean firstLine = true;
		
		for (LegacyRouteFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
			if (!firstLine) {
				writer.newLine();
				firstLine = false;
			}
			writer.write(getFareLine(fare));
		}
		writer.close();
		
	}


	private void exportTCVSfile() throws IOException {
		
		String provider = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0).getSupplyingCarrierCode();
				
		BufferedWriter writer = getWriter(exportPath, "TCVS" + provider);

		
		boolean firstLine = true;
		
		for (LegacySeries series : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			if (!firstLine) {
				writer.newLine();
				firstLine = false;
			}
			writer.write(getSeriesLine(series));
		}
		writer.close();
		
	}

	private void exportTCVGfile() throws IOException {
		String provider = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0).getSupplyingCarrierCode();
				
		BufferedWriter writer = getWriter(exportPath, "TCVG" + provider);
		
		boolean firstLine = true;
		
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			if (!firstLine) {
				writer.newLine();
				firstLine = false;
			}
			writer.write(getStationLine(station));
		}
		writer.close();
		
	}

	private void exportTCVfile() {
		
		String provider = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0).getSupplyingCarrierCode();
		String providerName = tool.getCodeLists().getCarriers().findCarrier(provider).getShortName();
				
		BufferedWriter writer = getWriter(exportPath, "TCV" + provider);
		
		String line0 = getHeaderLine("0001"+provider, provider, providerName,
				tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare().size(),
				tool.getConversionFromLegacy().getLegacy108().getStartDate(),
				tool.getConversionFromLegacy().getLegacy108().getEndDate());
			
		String line1 = getHeaderLine("TCVS" + provider, provider, providerName,
				tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size(),
				tool.getConversionFromLegacy().getLegacy108().getStartDate(),
				tool.getConversionFromLegacy().getLegacy108().getEndDate());
		
		String line2 = getHeaderLine("TCVG" + provider, provider, providerName,
				tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().size(),
				tool.getConversionFromLegacy().getLegacy108().getStartDate(),
				tool.getConversionFromLegacy().getLegacy108().getEndDate());
		
		try {
			writer.write(line0);
			writer.newLine();
			writer.write(line1);
			writer.newLine();
			writer.write(line2);
		} catch (IOException e) {
			String message = "could not write TCV file in: " + exportPath.toString();
			GtmUtils.writeConsoleError(message);
		}


	}

	private String getHeaderLine(String fileName, String provider, String providerName, int size, Date startDate, Date endDate) {

		
		String start = startDate.toString();
		String end = endDate.toString();
		
		/*
		 * 
		 * 	1 Code of the supplier RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
			2 Shortened name of the supplier RU alpha numeric 30 M  5-34 e.g. ÖBB 
			3 File name alpha numeric 8 M  35-42 e.g. TCVG0081 The file is to be made available in ascending order of this field 
			4 Number of records numeric 6 M  43-48  5 Number of new records numeric 6 O  49-54  
			6 Number of deleted records numeric 6 O  55-60  
			7 Number of amendments to Flag 1 numeric 6 O  61-66  
			8 Number of amendments to Flag 2 numeric 6 O  67-72  
			9 Number of amendments to Flag 3 numeric 6 O  73-78  
			10 Number of amendments to Flag 4 numeric 6 O  79-84  
			11 Number of amendments to Flag 5 numeric 6 O  85-90  
			12 Number of amendments to Flag 6 numeric 6 O  91-96  
			13 Number of amendments to Flag 7 numeric 6 O  97-102  
			14 Number of amendments to Flag 8 numeric 6 O  103-108  
			15 Number of amendments to Flag 9 numeric 6 O  109-114  
			16 Number of amendments to Flag 10 numeric 6 O  115-120  
			17 Number of amendments to Flag 11 numeric 6 O  121-126  
			18 Number of amendments to Flag 12 numeric 6 O  127-1 32  
			19 Number of amendments to Flag 13 numeric 6 O  133-1 38  
			20 Number of amendments to Flag 14 numeric 6 O  139-144  
			21 First day of validity of fare numeric 8 M  145-152 Expressed as: 'YYYYMMDD' 
			22 Version number numeric 2 M  153-154 Sequential version number related to the fare date; '01' for the first issue, '02' for the second etc. 
			23 Last day of validity of fare numeric 8 M  155-162 Expressed as: 'YYYYMMDD' 
 		 * 
		 */
		
		String.format("%4s%30s%8s%06d%084d%8s%2d%8s", provider, providerName, fileName,size, 0, start, 1, end);

		return null;
	}


	private String getFareLine(LegacyRouteFare fare) {
		/*
		 * 
		 * 	1 code of the supplying RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
			2 Fare table number numeric 4 M  5-8 The fare table number can be used to locate key information about this fare table in the 'Fare table description' file 
			3 Series numeric 5 M  9-13 Serves to assign fares to a specific series. 
			4 code for departure station numeric 5 M TAP TSI Technical Document B.9 14-18  
			5 17-character designation for departure station alpha numeric 17 M  19-35 1st sorting criterion, ascending 
			6 Flag 1 for departure station designation numeric 1 M  36 0 or 3 (see point 2.2) 
			7 code for destination station numeric 5 M  37-41  
			8 17-character designation for destination station alpha numeric 17 M  42-58 2nd sorting criterion, ascending 
			9 Flag 2 for destination station designation numeric 1 M  59 0 or 3 (see point 2.2) 
			10 Carrier code separator 1 '<' 1 M  60 This field always contains the symbol '<' 
			11 Carrier code numeric 4 M  61-64 Coding for contractual carrier on this line 
			12 Carrier code separator 2 '>' 1 M  65 This field always contains the symbol '>'. 
			13 Route alpha numeric 58 O TAP TSI Technical Document B.5 66-123  
			14 Flag 3 for combination of carrier code and route numeric 1 M  124 Relates to Fields 11 and 13; 0 or 3 (see point 2.2) 
			15 2nd Class single fare numeric 7 M  125-131 5 digits before the decimal point, 2 digits after the decimal point, 3rd sorting criterion, ascending 
			16 Flag 4 for 2nd Class single fare numeric 1 M  132 0 or 3 (see point 2.2) 
			17 1st Class single fare numeric 7 M  133-139 5 digits before the decimal point, 2 digits after the decimal point 
			18 Flag 5 for 1st Class single fare numeric 1 M  140 0 or 3 (see point 2.2) 
			19 2nd Class return fare numeric 7 O  141-147 5 digits before the decimal point, 2 digits after the decimal point 
			20 Flag 6 for 2nd Class return fare numeric 1 M  148 0 or 3 (see point 2.2) 
			21 1st Class return fare numeric 7 O  149-155 5 digits before the decimal point, 2 digits after the decimal point 
			22 Flag 7 for 1st Class return fare numeric 1 M  156 0 or 3 (see point 2.2) 
			23 First day of validity of fare numeric 8 M  157-164 Expressed as: 'YYYYMMDD' 
			24 Version number numeric 2 M  165-166 Sequential version number related to the fare date; '01' for the first issue, '02' for the second etc. 
			25 Last day of validity of fare numeric 8 M  167-174 Expressed as: 'YYYYMMDD' 
 
		 * 
		 */
		
		//TODO create line
		
		return null;
	}




	private String getStationLine(Legacy108Station station) {
		
		/*
		 * 
		 * 
		 *	1 code of the supplying RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
			2 station code numeric 5 M TAP TSI Technical Document B.9 5-9  
			3 Key flag for station code numeric 1 M  10 0, 1 or 2 (see point 2.2) 
			4 Old railway code numeric 5 O TAP TSI Technical Document B.9 11-15 This field is only used when stations are first introduced. 
			5 35-character station designation alpha numeric 35 M  16-50 Station designation in the national language including accents and in upper and lower case. 
			6 Flag 1 for the 35- character station designation numeric 1 M  51 0 or 3 (see point 2.2) 
			7 17-character station designation alpha numeric 17 M  52-68 Computer notation with no accents but in upper and lower case. The file is to be transferred in the ascending alphanumeric order of this field. 
			8 Flag 2 for the 17- character station designation numeric 1 M  69 0 or 3 (see point 2.2) 
			9 17-character route description of station alpha numeric 17 O  70-86 Field 7 notation for route instruction purposes. 
			10 Flag 3 for the 17- character route description of the station numeric 1 M  87 0 or 3 (see point 2.2) 
			11 Zone numeric 4 O  88-91  
			12 Flag 4 for zone numeric 1 O  92 0 or 3 (see point 2.2) 
			13 border-point code numeric 4 O Code List  B.1.3 93-96 Where a station has the status of a border station, the border point code shall be entered in this field and may not be omitted. 
			14 Flag 5 for border- point code numeric 1 M  97 0 or 3 (see point 2.2) 
			15 reserved alpha numeric 2 M  98-99  
			16 reserved alpha numeric 1 M  100  
			17 reserved numeric 2 M  101-102  
			18 reserved numeric 1 M  103  
			19 1st pictogram code numeric 4 O  104-107 numeric pictogram code as listed in Appendix L. 
			20 2nd pictogram code numeric 4 O  108-111  
			21 3rd pictogram code numeric 4 O  112-115  
			22 Flag 7 of pictogram codes numeric 1 O  116 This field relates to fields 19-21; 0 or 3 (see point 2.2). 
			23 Font numeric 1 M  117 Determines font for printing of fare only 1 = normal 2 = bold 3 = italics 
			24 Flag 8 for font numeric 1 M  118 0 or 3 (see point 2.2) 
			25 Designation for third party RU  alpha numeric 10 O  119-128 Details of private transport undertaking to which the station applies. 
			26 Flag 9 for third party RU numeric 1 M  129 0 or 3 (see point 2.2) 
			27  code for fare reference station numeric 5 O TAP TSI Technical Document B.9 130-134  code for station setting fare/price in respect of field 2. 
			28 Flag 10 for fare reference station numeric 1 M  135 0 or 3 (see point 2.2) 
			29  code for accounting station numeric 5 O TAP TSI Technical Document B.9 136-140 This field is only used if there is a separate accounting station. 
			30 Flag 11 for accounting station numeric 1 M  141 0 or 3 (see point 2.2) 
			31 Station latitude numeric 10 O  142-1 51 Latitude using Gauss-Krüger coordinate system 10-digit figure with 6 decimal places 
			32 Station’s longitude numeric 10 O  152-161 Longitude using Gauss-Krüger coordinate system 10-digit figure with 6 decimal places 
			33 Flag 12 for geographic details numeric 1 M  162 This field relates to fields 31-32;  0 or 3 (see point 2.2) 
			34 First day of validity of fare numeric 8 M  163-170 Expressed as: 'YYYYMMDD' 
			35 Version number numeric 2 M  171-172 Sequential version number related to the fare date; '01' for the first issue, '02' for the second, etc. 
 			36 Last day of validity of fare numeric 8 M  173-180 Expressed as: 'YYYYMMDD' 

		 * 	
		 */
		
		//TODO create line
		
		return null;
	}

	private String getSeriesLine(LegacySeries series) {
		
		/*
		 * 
		 * 	1  code of the supplying RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
			2 Series number numeric 5 M TAP TSI Technical Document B.8 5-9 Coding for distance and routing between two stations or two fare points within a given country. 
			3 Key flag for series numeric 1 M  10 0, 1 or 2 (see point 2.2) 
			4 Type of series numeric 1 M  11 1 = transit 2 = border - destination station 3 = station - station 1st sorting criterion 
			5 Flag 1 for series type numeric 1 M  12 0 or 3 (see point 2.2) 
			6 code for departure station numeric 5 M TAP TSI Technical Document B.9 13-17  
			7 Connecting code for departure station numeric 2 O  18-19 cf. Notes to Appendix B, point B.2. 			
			8 17-character designation for departure station alpha numeric 17 M  20-36 17-character designation in station list (17-character route description in case of fare reference stations) 2nd sorting criterion 
			9 Flag 2 for departure station designation numeric 1 M  37 0 or 3 (see point 2.2) 
			10  code for destination station numeric 5 M TAP TSI Technical Document B.9 38-42  
			11 Connecting code for destination station numeric 2 O  43-44 cf. Notes to Appendix B, point B.2. 
			12 17-character designation for destination station alpha numeric 17 M  45-61 17-character designation in station list (17-character route description in case of fare reference stations) 3rd sorting criterion 			
			13 Flag 3 for destination station designation numeric 1 M  62 0 or 3 (see point 2.2) 
			14 Route number numeric 1 M  63 4th sorting criterion 
			15 Product code numeric 2 O  64-65 cf. Notes to Appendix B, point B.2. 
			16 Product offer code numeric 2 O  66-67 cf. Notes to Appendix B, point B.2. 
			17 Symbol marking usual route alpha numeric 1 O  68 Usual route indicated by means of '+' if applicable 
			18 Flag 4 for usual route numeric 1 M  69 0 or 3 (see point 2.2) 
			19 Bus code alpha numeric 1 O  70 'B' entered here in the case of bus services 
			20 Flag 5 for bus code numeric 1 M  71 0 or 3 (see point 2.2) 
			21 Ferry code alpha numeric 1 O  72 'S' entered here in the case of ferry services 
			22 Flag 6 for ferry code numeric 1 M  73 0 or 3 (see point 2.2) 
			23 Carrier code separator 1 '<' 1 M  74 This field always contains the symbol '<'. 
			24 Carrier code numeric 4 M TAP TSI Technical Document B.8 75-78 4-character -code for the contractual carrier on this route 
			25 Carrier code separator 2 '>' 1 M  79 This field always contains the symbol '>'’ 
			26 Itinerary alpha numeric 58 O TAP TSI Technical Document B.5 80-1 37  
			27 Flag 7 for combination of carrier code and itinerary numeric 1 M  138 Indicates combination of fields 24 and 26; 0 or 3 (see point 2.2) 
			28 Kilometres in 2nd Class numeric 5 M  139-1 43  
			29 Flag 8 for kilometres in 2nd Class numeric 1 M  144 0 or 3 (see point 2.2) 
			30 Kilometres in 1st Class numeric 5 M  145-1 49  
			31 Flag 9 for kilometres in 1st Class numeric 1 M  150 0 or 3 (see point 2.2) 
			32 Standard fare calculation numeric 1 M  151 1 = Kilometre-based 2 = route-based 
			33 Flag 10 for standard fare calculation numeric 1 M  152 0 or 3 (see point 2.2) 
			34 Standard fare table number numeric 4 M  153-1 56  
			35 Flag 11 for standard fare table number numeric 1 M  157 0 or 3 (see point 2.2) 
			36 Ferry link code numeric 2 O  158-159  37 Flag 12 for ferry link code numeric 1 M  160 0 or 3 (see point 2.2) 
			38 Info code numeric 4 O  161-164 Completed if the info file contains specific references to the series 
			39 Flag 13 for info code numeric 1 M  165 0 or 3 (see point 2.2) 
			40 1st replaced series numeric 5 O  166-1 70  
			41 2nd replaced series numeric 5 O  171 -1 75  
			42  code for 1st station in route description numeric 5 O TAP TSI Technical Document B.9 176-1 80  
			43 Position of 1st station numeric 1 O  181 1 = centre 2 = left 3 = right 
			44 Abridging code for 1st station numeric 1 O  182  
			45  code for 2nd station in route description numeric 5 O TAP TSI Technical Document B.9 183-187  
			46 Position of 2nd station numeric 1 O  188 1 = centre 2 = left 3 = right 
			47 Abridging code for 2nd station numeric 1 O  189  
			48  code for 3rd station in route description numeric 5 O TAP TSI Technical Document B.9 190-1 94  
			49 Position of 3rd station numeric 1 O  195 1 = centre 2 = left 3 = right 
			50 Abridging code for 3rd station numeric 1 O  196  
			51  code for 4th station in route description numeric 5 O TAP TSI Technical Document B.9 197-201  
			52 Position of 4th station numeric 1 O  202 1 = centre 2 = left 3 = right 
			53 Abridging code for 4th station numeric 1 O  203  
			54  code for 5th station in route description numeric 5 O TAP TSI Technical Document B.9 204-208  
			55 Position of 5th station numeric 1 O  209 1 = centre 2 = left 3 = right 
			56 Abridging code for 5th station numeric 1 O  210  
			57 Flag 14 for computerised route numeric 1 M  211 Relates to Fields 40-54 or 3 (see point 2.2) 
			58 First day of validity of fare numeric 8 M  212-219 Expressed as: 'YYYYMMDD' 
			59 Version number numeric 2 M  220-221 Sequential version number related to the fare date; '01' for the first issue, '02' for the second etc. 
			60 Last day of validity of fare numeric 8 M  222-229 Expressed as: 'YYYYMMDD' 
		 * 
		 */
		
		//TODO create line
		
		return null;
	}


	private BufferedWriter getWriter(Path path, String fileName)  {
		
		Path file = Paths.get(path + fileName);
		
        BufferedWriter br;
		try {
			br = new BufferedWriter(new FileWriter(file.toFile()));
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("file write error: " + file.toString());
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return null;
		} 
        
        return br;

		
	}

}
