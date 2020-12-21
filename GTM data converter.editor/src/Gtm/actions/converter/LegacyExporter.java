package Gtm.actions.converter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.GTMTool;
import Gtm.Legacy108FareDescription;
import Gtm.Legacy108Station;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeries;
import Gtm.actions.GtmUtils;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;

public class LegacyExporter {
	
	private GTMTool tool = null;
	private GtmEditor editor = null;
	private Path exportPath = null;
	private DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	private String provider = null;
	private Date fromDate = null;
	private Date untilDate = null;	
	
	private boolean writeL = false;
	private boolean writeP = false;
	
		
	public LegacyExporter(GTMTool tool, Path path, GtmEditor editor) {
		this.tool = tool;
		this.exportPath = path;
		this.editor = editor;
		
		if (tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().isEmpty()) return;
		
		this.provider = tool.getConversionFromLegacy().getLegacy108().getCarrier().getCode();
		this.fromDate = tool.getConversionFromLegacy().getLegacy108().getStartDate();
		this.untilDate = tool.getConversionFromLegacy().getLegacy108().getEndDate();
		
		writeL = false;
		writeP = false;

	}
	

	public int getMonitorTasks() {
		int fareTables = 1;
		if (tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions() != null &&
			!tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().isEmpty()) {
			fareTables = tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().size();
		}
		
		return 5 + fareTables;
		
	}
	
	
	public void export(IProgressMonitor monitor) {
		try {
			
			writeL = false;
			writeP = false;
			
			if (tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries() != null && 
				!tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries().isEmpty()) {
				writeL = true;
			}
				
			if (tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions() != null &&
				!tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().isEmpty()) {
				writeP = true;	
			}
						

			
			monitor.subTask(NationalLanguageSupport.LegacyExporter_1);
			exportTCVfile();
			monitor.worked(1);
			
			monitor.subTask(NationalLanguageSupport.LegacyExporter_2);
			exportTCVGfile();
			monitor.worked(1);
			
			monitor.subTask(NationalLanguageSupport.LegacyExporter_3);
			exportTCVSfile();
			monitor.worked(1);
			
			monitor.subTask(NationalLanguageSupport.LegacyExporter_4);
			if (writeP) {
				exportTCVPfile();
			}
			monitor.worked(1);
			
			monitor.subTask(NationalLanguageSupport.LegacyExporter_5);
			if (writeL) {
				exportTCVLfile();
			}
			monitor.worked(1);
			
			
			for (Legacy108FareDescription fare : tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares()) {
						
				monitor.subTask(NationalLanguageSupport.LegacyExporter_6);
				exportFareFile(fare.getTableId());
				monitor.worked(1);
			
			}
			
			if (tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions() == null || tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().isEmpty()  ) {
				monitor.subTask(NationalLanguageSupport.LegacyExporter_6);
				exportFareFile(0);
				monitor.worked(1);
			}
			
			
		} catch (IOException e) {
			
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			String message = NationalLanguageSupport.LegacyExporter_7 + e.getLocalizedMessage();
			dialog.setText(message);
			dialog.open(); 
			writeConsoleError(message);
			e.printStackTrace();
			return;

		}
	}
	

	private void exportTCVLfile() throws IOException {
		
		String provider = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0).getSupplyingCarrierCode();
		
		BufferedWriter writer = getWriter(exportPath, "TCVL" + provider); //$NON-NLS-1$
		
		boolean firstLine = true;
		
		for (LegacySeparateContractSeries ticket : tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries()) {
			if (!firstLine) {
				writer.newLine();
			}
			firstLine = false;
			writer.write(getSeparateTicketLine(ticket));
		}
 		writer.close();
	}


	private String getSeparateTicketLine(LegacySeparateContractSeries ticket) {
		
		StringBuilder sb = new StringBuilder();
		
		// 	1 Code of the supplier RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
		sb.append(String.format("%4s", provider));   //$NON-NLS-1$
		// 2 Series numeric 5 M  5-9 Serves to assign fares to a specific series 
		sb.append(String.format("%05d",ticket.getSeriesNumber())); //$NON-NLS-1$
		// 3 Flag for series numeric 5 M  10-14 0, 1 or 2 (cf. Subsection 2.2) 
		sb.append("00000"); //$NON-NLS-1$
		// 4 First day of validity of fare numeric 8 M  15-22 Expressed as: "YYYYMMDD" 
		sb.append(dateFormat.format(fromDate)); 		
		// 5 version number numeric 2 M  23-24 Serial numbering for versions on the fare date; "01" for the first issue; "02" for the second 
		sb.append("01"); //$NON-NLS-1$
		// 6 Last day of validity of fare numeric 8 M  25-32 Expressed as: "YYYYMMDD
		sb.append(dateFormat.format(untilDate)); 
		
		return sb.toString();
	}


	private void exportTCVPfile() throws IOException {
		

		
		String provider = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0).getSupplyingCarrierCode();
		
		BufferedWriter writer = getWriter(exportPath, "TCVP" + provider); //$NON-NLS-1$
		
		boolean firstLine = true;
		
		for (Legacy108FareDescription fare : tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares()) {
			if (!firstLine) {
				writer.newLine();
			}
			firstLine = false;
			writer.write(getFareLine(fare));
		}
 		writer.close();
	}


	private String getFareLine(Legacy108FareDescription fare) {
		
		
		StringBuilder sb = new StringBuilder();

		// 	1 Code of the supplier RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
		sb.append(String.format("%4s", provider));   //$NON-NLS-1$
		//	2 Fare table number numeric 4 M  5-8 The file is to be made available in ascending order of this field. 
		sb.append(String.format("%04d", fare.getTableId()));   //$NON-NLS-1$
		//	3 Key flag for fare table number numeric 1 M  9 0,1 or 2 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	4 Type of table numeric 1 M  10 1 = distance-based 2 = route-based 3 = set fare 
		sb.append("3"); //$NON-NLS-1$
		//	5 Description in country's official language(s) alpha numeric 30 M  11-40  
		sb.append(String.format("%-30s",GtmUtils.limitStringLengthWithConsoleEntry(fare.getDescriptionLocal(),30,editor,NationalLanguageSupport.LegacyExporter_19))); //$NON-NLS-1$
		//	6 Description in French alpha numeric 30 O  41-70  	
		sb.append(String.format("%-30s",GtmUtils.limitStringLengthWithConsoleEntry(fare.getDescriptionFr(),30,editor,NationalLanguageSupport.LegacyExporter_21))); //$NON-NLS-1$
		//	7 Description in German alpha numeric 30 O  71 -1 00  
		sb.append(String.format(NationalLanguageSupport.LegacyExporter_22,GtmUtils.limitStringLengthWithConsoleEntry(fare.getDescriptionGe(),30,editor,NationalLanguageSupport.LegacyExporter_23)));
		//	8 Description in English alpha numeric 30 O  101 -1 30  
		sb.append(String.format("%-30s",GtmUtils.limitStringLengthWithConsoleEntry(fare.getDescriptionEn(),30,editor,NationalLanguageSupport.LegacyExporter_25))); //$NON-NLS-1$
		//	9 Reserved alpha numeric 30 M  131 -1 60  
		sb.append("          ").append("          ").append(NationalLanguageSupport.LegacyExporter_28); //$NON-NLS-1$ //$NON-NLS-2$
		//	10 Flag 1 for fare table description  numeric 1 M  161 0 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	11 Currency acronym alpha numeric 3 M ISO 4217 162-164 'EUR' 
		sb.append("EUR"); //$NON-NLS-1$
		//	12 Flag 2 for currency acronym numeric 1 M  165 0 or 3 (see point 2.2)
		sb.append("0"); //$NON-NLS-1$
		//	13 Fare type numeric 2 O code list B.1.1 166-167  
		sb.append("01"); //$NON-NLS-1$
		//	14 Code indicating whether return fare is twice the single fare numeric 1 M  168 '1' if it is, otherwise '0'. 
		sb.append("1"); //$NON-NLS-1$
		//	15 Flag 3 for code indicating whether return fare is twice the single fare numeric 1 M  169 0 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	16 Number of adults numeric 2 O  170-171 Not to be completed if '3' is entered in Field 4. 
		sb.append("01"); //$NON-NLS-1$
		//  17 Number of children numeric 2 O  172-173 Not to be completed if '3' is entered in Field 4. 
		sb.append("00"); //$NON-NLS-1$
		//	18 Discount on standard fare numeric 3 O  174-176 2 digits before the decimal point and one after; e.g. 125 for 12.5% discount 
		sb.append("000"); //$NON-NLS-1$
		//	19 Flag 4 for discount numeric 1 O  177  
		sb.append("0"); //$NON-NLS-1$
		//	20 File name alpha numeric 8 M  178-1 85  
		sb.append(String.format("%04d", fare.getTableId())).append(String.format("%4s", provider));   //$NON-NLS-1$ //$NON-NLS-2$
		//	21 Fare table replaced numeric 4 O  186-189 Number of fare table being replaced. 
		sb.append("0000"); //$NON-NLS-1$
		//	22 First day of validity of fare numeric 8 M  190-197 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(fromDate)); 	
		//	23 Version number numeric 2 M  198-199 Sequential version number related to the fare date; '01' for the first issue, '02' for the second etc. 
		sb.append("01"); //$NON-NLS-1$
		//	24 Last day of validity of fare numeric 8 M  200-207 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(untilDate)); 

		return sb.toString();
	}

	private void exportFareFile(int fareTableNumber) throws IOException {
		
		String fileName = null;
		if (fareTableNumber == 0 || fareTableNumber > 9998) {
			fileName = 9999 + provider;  
		} else {
			fileName = String.format("%04d", fareTableNumber) + provider;   //$NON-NLS-1$
		}
		
		BufferedWriter writer = getWriter(exportPath,fileName);
		
		boolean firstLine = true;
		
		for (LegacyRouteFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
			if (fareTableNumber == 9999 || fare.getSeries().getFareTableNumber() == fareTableNumber) {
				
				if (!firstLine) {
					writer.newLine();
				}
				firstLine = false;
				writer.write(getFareLine(fare));
			}
		}
		writer.close();
		
	}


	private void exportTCVSfile() throws IOException {
		
		String provider = tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().get(0).getSupplyingCarrierCode();
				
		BufferedWriter writer = getWriter(exportPath, "TCVS" + provider); //$NON-NLS-1$

		
		boolean firstLine = true;
		
		for (LegacySeries series : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			if (!firstLine) {
				writer.newLine();
			}
			firstLine = false;
			writer.write(getSeriesLine(series));
		}
		writer.close();
		
	}

	private void exportTCVGfile() throws IOException {
				
		BufferedWriter writer = getWriter(exportPath, "TCVG" + provider); //$NON-NLS-1$
		
		boolean firstLine = true;
		
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			if (!firstLine) {
				writer.newLine();
			}
			firstLine = false;
			writer.write(getStationLine(station));
		}
		writer.close();
		
	}

	private void exportTCVfile() {
		
		String providerName = tool.getCodeLists().getCarriers().findCarrier(provider).getShortName();
				
		BufferedWriter writer = getWriter(exportPath, "TCV" + provider); //$NON-NLS-1$
		
		try {
			
			if (tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions() != null && !tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares().isEmpty()) {
		
				for (Legacy108FareDescription fare : tool.getConversionFromLegacy().getLegacy108().getLegacyFareDescriptions().getLegacyFares()) {
			
					String fileName = String.format("%04d", fare.getTableId())+provider;   //$NON-NLS-1$
				
					String line0 = getHeaderLine(fileName, provider, providerName,
							tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare().size(),
							tool.getConversionFromLegacy().getLegacy108().getStartDate(),
							tool.getConversionFromLegacy().getLegacy108().getEndDate());
				
					writer.write(line0);
					writer.newLine();
				}
			} else {
	
				String fileName = String.format("%04d", 9999 )+provider;   //$NON-NLS-1$
				
				String line0 = getHeaderLine(fileName, provider, providerName,
					tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare().size(),
					tool.getConversionFromLegacy().getLegacy108().getStartDate(),
					tool.getConversionFromLegacy().getLegacy108().getEndDate());
				
				writer.write(line0);
				writer.newLine();
			}
			
			

			String line1 = getHeaderLine("TCVS" + provider, provider, providerName, //$NON-NLS-1$
				tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size(),
				tool.getConversionFromLegacy().getLegacy108().getStartDate(),
				tool.getConversionFromLegacy().getLegacy108().getEndDate());
		
			String line2 = getHeaderLine("TCVG" + provider, provider, providerName, //$NON-NLS-1$
				tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().size(),
				tool.getConversionFromLegacy().getLegacy108().getStartDate(),
				tool.getConversionFromLegacy().getLegacy108().getEndDate());
		
			writer.write(line1);
			
			writer.newLine();
			writer.write(line2);
			
			if (writeP) {
				String line3 = getHeaderLine("TCVP" + provider, provider, providerName, //$NON-NLS-1$
				tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().size(),
				tool.getConversionFromLegacy().getLegacy108().getStartDate(),
				tool.getConversionFromLegacy().getLegacy108().getEndDate());
				writer.newLine();					
				writer.write(line3);
			}
			
			if (writeL) {
				String line3 = getHeaderLine("TCVL" + provider, provider, providerName, //$NON-NLS-1$
				tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations().size(),
				tool.getConversionFromLegacy().getLegacy108().getStartDate(),
				tool.getConversionFromLegacy().getLegacy108().getEndDate());
				writer.newLine();					
				writer.write(line3);
			}			
			
			writer.close();
			
			
			
			
		} catch (IOException e) {
			String message = "could not write TCV file in: " + exportPath.toString();
			writeConsoleError(message);
			e.printStackTrace();
		}


	}

	private String getHeaderLine(String fileName, String provider, String providerName, int size, Date startDate, Date endDate) {

		
		StringBuilder sb = new StringBuilder();

		// 	1 Code of the supplier RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
		sb.append(String.format("%4s", provider));   //$NON-NLS-1$
		//	2 Shortened name of the supplier RU alpha numeric 30 M  5-34 e.g. ÖBB
		sb.append(String.format("%-30s", providerName)); //$NON-NLS-1$
		//	3 File name alpha numeric 8 M  35-42 e.g. TCVG0081 The file is to be made available in ascending order of this field 
		sb.append(String.format("%-8s", fileName)); //$NON-NLS-1$
		//	4 Number of records numeric 6 M  43-48 4 Number of records numeric 6 O  43-48
		sb.append(String.format("%06d", size)); //$NON-NLS-1$
		//	5 Number of new records numeric 6 M  5 Number of new records numeric 6 O  49-54
		sb.append(String.format("%06d", size));		 //$NON-NLS-1$
		//	6 Number of deleted records numeric 6 O  55-60
		sb.append("000000"); //$NON-NLS-1$
		//	7 Number of amendments to Flag 1 numeric 6 O  61-66  
		sb.append("000000"); //$NON-NLS-1$
		//	8 Number of amendments to Flag 2 numeric 6 O  67-72  
		sb.append("000000"); //$NON-NLS-1$
		//	9 Number of amendments to Flag 3 numeric 6 O  73-78  
		sb.append("000000"); //$NON-NLS-1$
		//	10 Number of amendments to Flag 4 numeric 6 O  79-84  
		sb.append("000000"); //$NON-NLS-1$
		//	11 Number of amendments to Flag 5 numeric 6 O  85-90  
		sb.append("000000"); //$NON-NLS-1$
		//	12 Number of amendments to Flag 6 numeric 6 O  91-96  
		sb.append("000000"); //$NON-NLS-1$
		//	13 Number of amendments to Flag 7 numeric 6 O  97-102  
		sb.append("000000"); //$NON-NLS-1$
		//	14 Number of amendments to Flag 8 numeric 6 O  103-108  
		sb.append("000000"); //$NON-NLS-1$
		//	15 Number of amendments to Flag 9 numeric 6 O  109-114  
		sb.append("000000");		 //$NON-NLS-1$
		//	16 Number of amendments to Flag 10 numeric 6 O  115-120  
		sb.append("000000"); //$NON-NLS-1$
		//	17 Number of amendments to Flag 11 numeric 6 O  121-126  
		sb.append("000000"); //$NON-NLS-1$
		//	18 Number of amendments to Flag 12 numeric 6 O  127-1 32  
		sb.append("000000"); //$NON-NLS-1$
		//	19 Number of amendments to Flag 13 numeric 6 O  133-1 38  
		sb.append("000000"); //$NON-NLS-1$
		//	20 Number of amendments to Flag 14 numeric 6 O  139-144  
		sb.append("000000"); //$NON-NLS-1$
		//	21 First day of validity of fare numeric 8 M  145-152 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(startDate));
		//	22 Version number numeric 2 M  153-154 Sequential version number related to the fare date; '01' for the first issue, '02' for the second etc. 
		sb.append("01"); //$NON-NLS-1$
		//	23 Last day of validity of fare numeric 8 M  155-162 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(endDate)); 

		return sb.toString();
	}

	private String getFareLine(LegacyRouteFare fare) {
		
		
		StringBuilder sb = new StringBuilder();
		
		int table = fare.getFareTableNumber();
		if (table == 0 || table > 9999){
			table = 9999;
		}
		
		//  1 code of the supplying RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
		sb.append(String.format("%4s", provider));   //$NON-NLS-1$
		//	2 Fare table number numeric 4 M  5-8 The fare table number can be used to locate key information about this fare table in the 'Fare table description' file 
		sb.append(String.format("%04d",table)); //$NON-NLS-1$
		//	3 Series numeric 5 M  9-13 Serves to assign fares to a specific series. 
		sb.append(String.format("%05d",fare.getSeries().getNumber())); //$NON-NLS-1$
		//	4 code for departure station numeric 5 M TAP TSI Technical Document B.9 14-18  
		sb.append(String.format("%05d",fare.getSeries().getFromStation())); //$NON-NLS-1$
		//	5 17-character designation for departure station alpha numeric 17 M  19-35 1st sorting criterion, ascending
		sb.append(String.format("%-17s",GtmUtils.limitStringLengthWithConsoleEntry(fare.getSeries().getFromStationName(),17,editor,NationalLanguageSupport.LegacyExporter_77))); //$NON-NLS-1$
		//	6 Flag 1 for departure station designation numeric 1 M  36 0 or 3 (see point 2.2)
		sb.append("1"); //$NON-NLS-1$
		//	7 code for destination station numeric 5 M  37-41
		sb.append(String.format("%05d",fare.getSeries().getToStation()));		 //$NON-NLS-1$
		//	8 17-character designation for destination station alpha numeric 17 M  42-58 2nd sorting criterion, ascending 
		sb.append(String.format("%-17s",GtmUtils.limitStringLengthWithConsoleEntry(fare.getSeries().getToStationName(),17,editor,NationalLanguageSupport.LegacyExporter_81)));		 //$NON-NLS-1$
		//	9 Flag 2 for destination station designation numeric 1 M  59 0 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	10 Carrier code separator 1 '<' 1 M  60 This field always contains the symbol '<' 
		sb.append("<");		 //$NON-NLS-1$
		//	11 Carrier code numeric 4 M  61-64 Coding for contractual carrier on this line 
		sb.append(String.format("%4s", fare.getSeries().getCarrierCode()));   //$NON-NLS-1$
		//  12 Carrier code separator 2 '>' 1 M  65 This field always contains the symbol '>'. 
		sb.append(">"); //$NON-NLS-1$
		//	13 Route alpha numeric 58 O TAP TSI Technical Document B.5 66-123  
		sb.append(String.format("%-58s", GtmUtils.limitStringLengthWithConsoleEntry(fare.getSeries().getRouteDescription(),58,editor,NationalLanguageSupport.LegacyExporter_87)));		 //$NON-NLS-1$
		//	14 Flag 3 for combination of carrier code and route numeric 1 M  124 Relates to Fields 11 and 13; 0 or 3 (see point 2.2) 
		sb.append("0");		 //$NON-NLS-1$
		//	15 2nd Class single fare numeric 7 M  125-131 5 digits before the decimal point, 2 digits after the decimal point, 3rd sorting criterion, ascending 
		sb.append(String.format("%07d", fare.getFare2nd())); //$NON-NLS-1$
		//	16 Flag 4 for 2nd Class single fare numeric 1 M  132 0 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	17 1st Class single fare numeric 7 M  133-139 5 digits before the decimal point, 2 digits after the decimal point 
		sb.append(String.format("%07d", fare.getFare1st())); //$NON-NLS-1$
		//	18 Flag 5 for 1st Class single fare numeric 1 M  140 0 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	19 2nd Class return fare numeric 7 O  141-147 5 digits before the decimal point, 2 digits after the decimal point 
		sb.append(NationalLanguageSupport.LegacyExporter_93);
		//	20 Flag 6 for 2nd Class return fare numeric 1 M  148 0 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	21 1st Class return fare numeric 7 O  149-155 5 digits before the decimal point, 2 digits after the decimal point 
		sb.append("0000000"); //$NON-NLS-1$
		//	22 Flag 7 for 1st Class return fare numeric 1 M  156 0 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	23 First day of validity of fare numeric 8 M  157-164 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(fare.getValidFrom()));
		//	24 Version number numeric 2 M  165-166 Sequential version number related to the fare date; '01' for the first issue, '02' for the second etc. 
		sb.append("01"); //$NON-NLS-1$
		//	25 Last day of validity of fare numeric 8 M  167-174 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(fare.getValidUntil())); 

		return sb.toString();

	}




	private String getStationLine(Legacy108Station station) {
		
		
		StringBuilder sb = new StringBuilder();
		
		//	1 code of the supplying RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
		sb.append(String.format("%4s", provider));   //$NON-NLS-1$
		//	2 station code numeric 5 M TAP TSI Technical Document B.9 5-9  
		sb.append(String.format("%05d", station.getStationCode()));   //$NON-NLS-1$
		//	3 Key flag for station code numeric 1 M  10 0, 1 or 2 (see point 2.2) 
		sb.append("1"); //$NON-NLS-1$
		//	4 Old railway code numeric 5 O TAP TSI Technical Document B.9 11-15 This field is only used when stations are first introduced. 
		sb.append("00000"); //$NON-NLS-1$
		//	5 35-character station designation alpha numeric 35 M  16-50 Station designation in the national language including accents and in upper and lower case. 
		sb.append(String.format("%-35s",GtmUtils.limitStringLengthWithConsoleEntry(station.getNameUTF8(),35,editor,NationalLanguageSupport.LegacyExporter_103)));		 //$NON-NLS-1$
		//	6 Flag 1 for the 35- character station designation numeric 1 M  51 0 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	7 17-character station designation alpha numeric 17 M  52-68 Computer notation with no accents but in upper and lower case. The file is to be transferred in the ascending alphanumeric order of this field. 
		sb.append(String.format("%-17s",GtmUtils.limitStringLengthWithConsoleEntry(station.getShortName(),17,editor,NationalLanguageSupport.LegacyExporter_106)));				 //$NON-NLS-1$
		//	8 Flag 2 for the 17- character station designation numeric 1 M  69 0 or 3 (see point 2.2) 
		sb.append("0");		 //$NON-NLS-1$
		//	9 17-character route description of station alpha numeric 17 O  70-86 Field 7 notation for route instruction purposes. 
		sb.append(String.format("%-17s",GtmUtils.limitStringLengthWithConsoleEntry(station.getShortName(),17,editor,NationalLanguageSupport.LegacyExporter_109)));			 //$NON-NLS-1$
		//	10 Flag 3 for the 17- character route description of the station numeric 1 M  87 0 or 3 (see point 2.2) 
		sb.append("0");				 //$NON-NLS-1$
		//	11 Zone numeric 4 O  88-91  
		sb.append("0000");		 //$NON-NLS-1$
		//	12 Flag 4 for zone numeric 1 O  92 0 or 3 (see point 2.2) 
		sb.append("0");		 //$NON-NLS-1$
		//	13 border-point code numeric 4 O Code List  B.1.3 93-96 Where a station has the status of a border station, the border point code shall be entered in this field and may not be omitted. 
		sb.append(String.format("%04d", station.getBorderPointCode()));   //$NON-NLS-1$
		//	14 Flag 5 for border- point code numeric 1 M  97 0 or 3 (see point 2.2) 
		sb.append("0");			 //$NON-NLS-1$
		//	15 reserved alpha numeric 2 M  98-99  
		sb.append("  ");			 //$NON-NLS-1$
		//	16 reserved alpha numeric 1 M  100  
		sb.append(" ");	 //$NON-NLS-1$
		//	17 reserved numeric 2 M  101-102  
		sb.append("00");	 //$NON-NLS-1$
		//	18 reserved numeric 1 M  103  
		sb.append("0");	 //$NON-NLS-1$
		//	19 1st pictogram code numeric 4 O  104-107 numeric pictogram code as listed in Appendix L. 
		sb.append("0000");	 //$NON-NLS-1$
		//	20 2nd pictogram code numeric 4 O  108-111  
		sb.append("0000");	 //$NON-NLS-1$
		//	21 3rd pictogram code numeric 4 O  112-115  
		sb.append("0000");	 //$NON-NLS-1$
		//	22 Flag 7 of pictogram codes numeric 1 O  116 This field relates to fields 19-21; 0 or 3 (see point 2.2). 
		sb.append("0");			 //$NON-NLS-1$
		//	23 Font numeric 1 M  117 Determines font for printing of fare only 1 = normal 2 = bold 3 = italics 
		sb.append("1");	 //$NON-NLS-1$
		//	24 Flag 8 for font numeric 1 M  118 0 or 3 (see point 2.2) 
		sb.append("0");	 //$NON-NLS-1$
		//	25 Designation for third party RU  alpha numeric 10 O  119-128 Details of private transport undertaking to which the station applies. 
		sb.append("          ");	 //$NON-NLS-1$
		//	26 Flag 9 for third party RU numeric 1 M  129 0 or 3 (see point 2.2) 
		sb.append("0");	 //$NON-NLS-1$
		//	27  code for fare reference station numeric 5 O TAP TSI Technical Document B.9 130-134  code for station setting fare/price in respect of field 2. 
		sb.append(String.format("%05d", station.getFareReferenceStationCode()));   //$NON-NLS-1$
		//	28 Flag 10 for fare reference station numeric 1 M  135 0 or 3 (see point 2.2) 
		sb.append("0");			 //$NON-NLS-1$
		//	29  code for accounting station numeric 5 O TAP TSI Technical Document B.9 136-140 This field is only used if there is a separate accounting station. 
		sb.append("00000");	 //$NON-NLS-1$
		//	30 Flag 11 for accounting station numeric 1 M  141 0 or 3 (see point 2.2) 
		sb.append("0");	 //$NON-NLS-1$
		//	31 Station latitude numeric 10 O  142-1 51 Latitude using Gauss-Krüger coordinate system 10-digit figure with 6 decimal places 
		sb.append("0000000000");	 //$NON-NLS-1$
		//	32 Station’s longitude numeric 10 O  152-161 Longitude using Gauss-Krüger coordinate system 10-digit figure with 6 decimal places 
		sb.append("0000000000");	 //$NON-NLS-1$
		//	33 Flag 12 for geographic details numeric 1 M  162 This field relates to fields 31-32;  0 or 3 (see point 2.2) 
		sb.append("0");	 //$NON-NLS-1$
		//	34 First day of validity of fare numeric 8 M  163-170 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(fromDate));
		//	35 Version number numeric 2 M  171-172 Sequential version number related to the fare date; '01' for the first issue, '02' for the second, etc. 
		sb.append("01");			 //$NON-NLS-1$
		//	36 Last day of validity of fare numeric 8 M  173-180 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(untilDate));
		
		return sb.toString();
	}

	private String getSeriesLine(LegacySeries series) {
		
		
		StringBuilder sb = new StringBuilder();
		
		//	1  code of the supplying RU numeric 4 M TAP TSI Technical Document B.8 1-4 e.g. 0081 for ÖBB 
		sb.append(String.format("%4s", provider));   //$NON-NLS-1$
		//	2 Series number numeric 5 M TAP TSI Technical Document B.8 5-9 Coding for distance and routing between two stations or two fare points within a given country. 
		sb.append(String.format("%05d", series.getNumber()));   //$NON-NLS-1$
		//	3 Key flag for series numeric 1 M  10 0, 1 or 2 (see point 2.2) 
		sb.append("1");	 //$NON-NLS-1$
		//	4 Type of series numeric 1 M  11 1 = transit 2 = border - destination station 3 = station - station 1st sorting criterion 
		sb.append(series.getType().getValue());
		//	5 Flag 1 for series type numeric 1 M  12 0 or 3 (see point 2.2) 
		sb.append("0");	 //$NON-NLS-1$
		//	6 code for departure station numeric 5 M TAP TSI Technical Document B.9 13-17  
		sb.append(String.format("%05d", series.getFromStation()));   //$NON-NLS-1$
		//	7 Connecting code for departure station numeric 2 O  18-19 cf. Notes to Appendix B, point B.2. 			
		sb.append("00"); //$NON-NLS-1$
		//	8 17-character designation for departure station alpha numeric 17 M  20-36 17-character designation in station list (17-character route description in case of fare reference stations) 2nd sorting criterion 
		sb.append(String.format("%-17s",GtmUtils.limitStringLengthWithConsoleEntry(series.getFromStationName(),17,editor,NationalLanguageSupport.LegacyExporter_0)));	 //$NON-NLS-1$
		//	9 Flag 2 for departure station designation numeric 1 M  37 0 or 3 (see point 2.2) 
		sb.append("0");			 //$NON-NLS-1$
		//	10  code for destination station numeric 5 M TAP TSI Technical Document B.9 38-42  
		sb.append(String.format("%05d", series.getToStation()));  		 //$NON-NLS-1$
		//	11 Connecting code for destination station numeric 2 O  43-44 cf. Notes to Appendix B, point B.2. 
		sb.append("00"); //$NON-NLS-1$
		//	12 17-character designation for destination station alpha numeric 17 M  45-61 17-character designation in station list (17-character route description in case of fare reference stations) 3rd sorting criterion 			
		sb.append(String.format("%-17s",GtmUtils.limitStringLengthWithConsoleEntry(series.getToStationName(),17,editor,NationalLanguageSupport.LegacyExporter_147)));	 //$NON-NLS-1$
		//	13 Flag 3 for destination station designation numeric 1 M  62 0 or 3 (see point 2.2) 
		sb.append("0");				 //$NON-NLS-1$
		//	14 Route number numeric 1 M  63 4th sorting criterion 
		sb.append("0");		 //$NON-NLS-1$
		//	15 Product code numeric 2 O  64-65 cf. Notes to Appendix B, point B.2. 
		sb.append("00");				 //$NON-NLS-1$
		//	16 Product offer code numeric 2 O  66-67 cf. Notes to Appendix B, point B.2. 
		sb.append("00");		 //$NON-NLS-1$
		//	17 Symbol marking usual route alpha numeric 1 O  68 Usual route indicated by means of '+' if applicable 
		sb.append("0");		 //$NON-NLS-1$
		//	18 Flag 4 for usual route numeric 1 M  69 0 or 3 (see point 2.2) 
		sb.append("0");		 //$NON-NLS-1$
		//	19 Bus code alpha numeric 1 O  70 'B' entered here in the case of bus services 
		sb.append(" ");	 //$NON-NLS-1$
		//	20 Flag 5 for bus code numeric 1 M  71 0 or 3 (see point 2.2) 
		sb.append("0");		 //$NON-NLS-1$
		//	21 Ferry code alpha numeric 1 O  72 'S' entered here in the case of ferry services 
		sb.append(" ");		 //$NON-NLS-1$
		//	22 Flag 6 for ferry code numeric 1 M  73 0 or 3 (see point 2.2) 
		sb.append("0");		 //$NON-NLS-1$
		//	23 Carrier code separator 1 '<' 1 M  74 This field always contains the symbol '<'. 
		sb.append("<");		 //$NON-NLS-1$
		//	24 Carrier code numeric 4 M TAP TSI Technical Document B.8 75-78 4-character -code for the contractual carrier on this route 
		sb.append(String.format("%4s",series.getCarrierCode())); //$NON-NLS-1$
		//	25 Carrier code separator 2 '>' 1 M  79 This field always contains the symbol '>'’ 
		sb.append(">");		 //$NON-NLS-1$
		//	26 Itinerary alpha numeric 58 O TAP TSI Technical Document B.5 80-1 37  
		sb.append(String.format("%-58s",GtmUtils.limitStringLengthWithConsoleEntry(series.getRouteDescription(),58,editor,NationalLanguageSupport.LegacyExporter_8)));		 //$NON-NLS-1$
		//	27 Flag 7 for combination of carrier code and itinerary numeric 1 M  138 Indicates combination of fields 24 and 26; 0 or 3 (see point 2.2) 
		sb.append("0");			 //$NON-NLS-1$
		//	28 Kilometres in 2nd Class numeric 5 M  139-1 43  
		sb.append(String.format("%05d", series.getDistance2()));  	 //$NON-NLS-1$
		//	29 Flag 8 for kilometres in 2nd Class numeric 1 M  144 0 or 3 (see point 2.2) 
		sb.append("0");			 //$NON-NLS-1$
		//	30 Kilometres in 1st Class numeric 5 M  145-1 49  
		sb.append(String.format("%05d", series.getDistance1()));  			 //$NON-NLS-1$
		//	31 Flag 9 for kilometres in 1st Class numeric 1 M  150 0 or 3 (see point 2.2) 
		sb.append("0");			 //$NON-NLS-1$
		//	32 Standard fare calculation numeric 1 M  151 1 = Kilometre-based 2 = route-based 
		sb.append("2");			 //$NON-NLS-1$
		//	33 Flag 10 for standard fare calculation numeric 1 M  152 0 or 3 (see point 2.2) 
		sb.append("0");			 //$NON-NLS-1$
		//	34 Standard fare table number numeric 4 M  153-1 56  
		if (series.getFareTableNumber() == 0) {
			sb.append("9999");		 //$NON-NLS-1$
		} else {
			sb.append(String.format("%04d",series.getFareTableNumber())); //$NON-NLS-1$
		}
		//	35 Flag 11 for standard fare table number numeric 1 M  157 0 or 3 (see point 2.2) 
		sb.append("0");	 //$NON-NLS-1$
		//	36 Ferry link code numeric 2 O  158-159  
		sb.append("00");			 //$NON-NLS-1$	
		//  37 Flag 12 for ferry link code numeric 1 M  160 0 or 3 (see point 2.2) 
		sb.append("0");			 //$NON-NLS-1$
		//	38 Info code numeric 4 O  161-164 Completed if the info file contains specific references to the series 
		sb.append("0000");	 //$NON-NLS-1$
		//	39 Flag 13 for info code numeric 1 M  165 0 or 3 (see point 2.2) 
		sb.append("0");	 //$NON-NLS-1$
		//	40 1st replaced series numeric 5 O  166-1 70  
		sb.append("00000");	 //$NON-NLS-1$
		//	41 2nd replaced series numeric 5 O  171 -1 75  
		sb.append("00000");	 //$NON-NLS-1$
		
		if (series.getViastations() != null && series.getViastations().size() > 0) {
			//	42  code for 1st station in route description numeric 5 O TAP TSI Technical Document B.9 176-1 80
			sb.append(String.format("%05d", series.getViastations().get(0).getCode()));  			 //$NON-NLS-1$
			//	43 Position of 1st station numeric 1 O  181 1 = centre 2 = left 3 = right 
			sb.append(String.format("%01d", series.getViastations().get(0).getPosition()));  	 //$NON-NLS-1$
			//	44 Abridging code for 1st station numeric 1 O  182  
			sb.append("0"); //$NON-NLS-1$
		} else {
			sb.append("0000000"); //$NON-NLS-1$
		}
		if (series.getViastations() != null && series.getViastations().size() > 1) {
			//	45  code for 1st station in route description numeric 5 O TAP TSI Technical Document B.9 176-1 80
			sb.append(String.format("%05d", series.getViastations().get(1).getCode()));  			 //$NON-NLS-1$
			//	46 Position of 1st station numeric 1 O  181 1 = centre 2 = left 3 = right 
			sb.append(String.format("%01d", series.getViastations().get(1).getPosition()));  	 //$NON-NLS-1$
			//	47 Abridging code for 1st station numeric 1 O  182  
			sb.append("0"); //$NON-NLS-1$
		} else {
			sb.append("0000000"); //$NON-NLS-1$
		}
		if (series.getViastations() != null && series.getViastations().size() > 2) {
			//	48  code for 1st station in route description numeric 5 O TAP TSI Technical Document B.9 176-1 80
			sb.append(String.format("%05d", series.getViastations().get(2).getCode()));  			 //$NON-NLS-1$
			//	49 Position of 1st station numeric 1 O  181 1 = centre 2 = left 3 = right 
			sb.append(String.format("%01d", series.getViastations().get(2).getPosition())); 
			//	50 Abridging code for 1st station numeric 1 O  182    
			sb.append("0"); //$NON-NLS-1$
		} else {
			sb.append("0000000"); //$NON-NLS-1$
		}		
		if (series.getViastations() != null && series.getViastations().size() > 3) {
			//	51  code for 1st station in route description numeric 5 O TAP TSI Technical Document B.9 176-1 80
			sb.append(String.format("%05d", series.getViastations().get(3).getCode()));  			 //$NON-NLS-1$
			//	52 Position of 1st station numeric 1 O  181 1 = centre 2 = left 3 = right 
			sb.append(String.format("%01d", series.getViastations().get(3).getPosition()));  	 //$NON-NLS-1$
			//	53 Abridging code for 1st station numeric 1 O  182  
			sb.append("0"); //$NON-NLS-1$
		} else {
			sb.append("0000000"); //$NON-NLS-1$
		}		
		if (series.getViastations() != null && series.getViastations().size() > 4) {
			//	54  code for 1st station in route description numeric 5 O TAP TSI Technical Document B.9 176-1 80
			sb.append(String.format("%05d", series.getViastations().get(4).getCode()));  			 //$NON-NLS-1$
			//	55 Position of 1st station numeric 1 O  181 1 = centre 2 = left 3 = right 
			sb.append(String.format("%01d", series.getViastations().get(4).getPosition()));  	 //$NON-NLS-1$
			//	56 Abridging code for 1st station numeric 1 O  182  
			sb.append("0"); //$NON-NLS-1$
		} else {
			sb.append("0000000"); //$NON-NLS-1$
		}		
		
	
		//	57 Flag 14 for computerised route numeric 1 M  211 Relates to Fields 40-54 or 3 (see point 2.2) 
		sb.append("0"); //$NON-NLS-1$
		//	58 First day of validity of fare numeric 8 M  212-219 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(series.getValidFrom()));		
		//	59 Version number numeric 2 M  220-221 Sequential version number related to the fare date; '01' for the first issue, '02' for the second etc. 
		sb.append("01"); //$NON-NLS-1$
		//	60 Last day of validity of fare numeric 8 M  222-229 Expressed as: 'YYYYMMDD' 
		sb.append(dateFormat.format(series.getValidUntil()));
		
		return sb.toString();
	}


	private BufferedWriter getWriter(Path path, String fileName)  {
		
		File file = new File(path.toString(), fileName);
		
        BufferedWriter br;
		try {
			br = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.LegacyExporter_9 + file.toString());
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return null;
		} 
        
        return br;

		
	}

	private void writeConsoleError(String message) {
		GtmUtils.writeConsoleError(message,editor);
	}

}
