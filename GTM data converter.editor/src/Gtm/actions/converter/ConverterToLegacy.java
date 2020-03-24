package Gtm.actions.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AlternativeRoute;
import Gtm.Carrier;
import Gtm.ClassId;
import Gtm.Clusters;
import Gtm.CombinationModel;
import Gtm.CurrencyPrice;
import Gtm.FareCombinationModel;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108FareDescription;
import Gtm.Legacy108Station;
import Gtm.LegacyCalculationType;
import Gtm.LegacyConversionType;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;
import Gtm.Price;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.Route;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesRestriction;
import Gtm.ServiceBrand;
import Gtm.ServiceConstraint;
import Gtm.Station;
import Gtm.Text;
import Gtm.Translation;
import Gtm.TravelerType;
import Gtm.ViaStation;
import Gtm.actions.GtmUtils;
import Gtm.console.ConsoleUtil;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.DirtyCommand;
import Gtm.presentation.GtmEditor;

public class 	ConverterToLegacy {
	
	
	private GTMTool tool = null;
	private EditingDomain domain = null;
	private GtmEditor editor = null;
	private HashMap<String,LegacyRouteFare> legacyFares = new HashMap<String,LegacyRouteFare>(); 
	private HashSet<LegacyRouteFare> routeFares = new HashSet<LegacyRouteFare>();
	private HashSet<LegacySeries> series = new HashSet<LegacySeries>();	
	private HashSet<Legacy108Station> legacyStations = new HashSet<Legacy108Station>();	

	private HashSet<LegacySeparateContractSeries> legacySeparateContractSeries = new HashSet<LegacySeparateContractSeries>();	
	private HashMap<Integer,Legacy108FareDescription> legacyFareDescriptions = new HashMap<Integer,Legacy108FareDescription>();	
	
	public ConverterToLegacy(GTMTool tool, GtmEditor editor, EditingDomain domain) {
		this.tool = tool;
		this.editor = editor;
		this.domain = domain;
	}
	
	public int getMonitorTasks() {
		return 13;
	}
	
	public int convert(IProgressMonitor monitor) {
		
		Carrier carrier = tool.getGeneralTariffModel().getDelivery().getProvider();
		Command com = SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__CARRIER, carrier);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_0);	
		convertStations();
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_1);	
		convertfareStations();	
		monitor.worked(1);

		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_2);	
		List<FareElement> convertableFares = selectFares();
		monitor.worked(1);
		
		if (convertableFares == null || convertableFares.isEmpty()) {
			monitor.done();
			return 0;
		}
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_3);	
		for (FareElement fare : convertableFares) {

			try {
				LegacyRouteFare  legacyFare = convertFare(fare, convertableFares.indexOf(fare) + 1);
				if (series.size() < 99999 && legacyFare != null) {
					routeFares.add(legacyFare);
					series.add(legacyFare.getSeries());
				}
				
			} catch (ConverterException e) {
				String message = NationalLanguageSupport.ConverterToLegacy_4 + fare.getId() + " " + e.getMessage(); //$NON-NLS-2$
				writeConsoleError(message);
			}
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_6);	
		//check numbering. if numbers are missing renumber
		boolean numberingOk = true;
		for (LegacySeries serie : series) {
			if (serie.getNumber() == 0) numberingOk = false;
		}
		if (!numberingOk) {
			int i = 0;
			for (LegacySeries serie : series) {
				serie.setNumber(i++);
			}
			String message = NationalLanguageSupport.ConverterToLegacy_7;
			writeConsoleError(message);
		}
		for (LegacySeparateContractSeries s : legacySeparateContractSeries) {
			s.setSeriesNumber(s.getSeries().getNumber());
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_8);	
		//check for missing fares in specific classes, set distance to 0
		for (LegacyRouteFare lf : routeFares) {
			if (!lf.isSetFare1st()) {
				lf.getSeries().setDistance1(0);
			}
			if (!lf.isSetFare2nd()) {
				lf.getSeries().setDistance2(0);
			}			
		}
		monitor.worked(1);
		
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_9);	
		CompoundCommand comm = new CompoundCommand();
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES,GtmFactory.eINSTANCE.createLegacyRouteFares()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_STATIONS,GtmFactory.eINSTANCE.createLegacy108Stations()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST,GtmFactory.eINSTANCE.createLegacySeriesList()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_FARE_DESCRIPTIONS,GtmFactory.eINSTANCE.createLegacy108FaresDescriptions()));
		comm.append(SetCommand.create(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES,GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList()));
		
		if (!comm.isEmpty() && comm.canExecute()) {
			domain.getCommandStack().execute(comm);
		}		
		monitor.worked(1);
		
	
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_10);	
		com = AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList(), GtmPackage.Literals.LEGACY_SERIES_LIST__SERIES, series);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_11);	
		com = AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares(), GtmPackage.Literals.LEGACY_ROUTE_FARES__ROUTE_FARE, routeFares);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_12);	
		com = AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), GtmPackage.Literals.LEGACY108_STATIONS__LEGACY_STATIONS, legacyStations);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);

		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_13);	
		com = AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), GtmPackage.Literals.LEGACY108__LEGACY_FARE_DESCRIPTIONS, legacyFareDescriptions);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_14);	
		com = AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries(), GtmPackage.Literals.LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES, legacySeparateContractSeries);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);
		
		monitor.subTask(NationalLanguageSupport.ConverterToLegacy_15);	
		CompoundCommand command = new CompoundCommand();
		command.append(SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__START_DATE, getStartDate(tool)));
		command.append(SetCommand.create(domain, tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__END_DATE, getEndDate(tool)));
		if (!command.isEmpty() && command.canExecute()) {
			domain.getCommandStack().execute(command);
		}
		monitor.worked(1);		
		
		return series.size();
	}
	

	private int addFareDescription(FareElement fare) {
		
		if (fare == null) return 0;
		
		
		Legacy108FareDescription descr = createFareDescription(fare);
		
		if (descr.getDescriptionLocal() == null || descr.getDescriptionLocal() .length() < 1) return 0;

		/*
		 * is it a new description text? --> create a new fare description resulting in a new fare table
		 * 
		 */
		for (Entry<Integer,Legacy108FareDescription> e : legacyFareDescriptions.entrySet()) {
			if (e.getValue().getDescriptionLocal().equals(descr)) return e.getKey();
		}
	
		Integer fareTableId = legacyFareDescriptions.size() + 1;
		descr.setTableId(fareTableId);
		legacyFareDescriptions.put(fareTableId, descr);
		
		
		return legacyFareDescriptions.size();
	}

	private Legacy108FareDescription createFareDescription(FareElement fare) {
		
		Legacy108FareDescription desc = GtmFactory.eINSTANCE.createLegacy108FareDescription();
		
		if (fare == null) return null;
		
		/*
		 * 
		 * create a fare description including 
		 * 
		 * fare --> text
		 * fare --> fareDescription
		 * fare serviceConstraint --> list of service brands
		 * 
		 * "Full Fare--incl. Diabolo,RE/RB"
		 * 
		 */
		
		StringBuilder sb = new StringBuilder();
		boolean firstBrand = true;
		ServiceConstraint sc = fare.getServiceConstraint();
		if (sc != null && tool.getConversionFromLegacy().getParams().isConvertServiceConstraints()) {
			if (sc != null && sc.getIncludedServiceBrands() != null && !sc.getIncludedServiceBrands().isEmpty()) {
				sb.append(","); //$NON-NLS-1$
				for (ServiceBrand brand : sc.getIncludedServiceBrands()) {
					if (brand.getAbbreviation() == null || brand.getAbbreviation().length() > 0)
						if (!firstBrand) {
							sb.append("/"); //$NON-NLS-1$
						sb.append(brand.getAbbreviation());
						firstBrand = false;
					}
				}
			}
		}
		
		String sbText = sb.toString();
		StringBuilder sbl  = new StringBuilder();
		StringBuilder sben = new StringBuilder();
		StringBuilder sbge = new StringBuilder();
		StringBuilder sbfr = new StringBuilder();
		
		
		//basic fare text
		if (fare.getText()!= null && fare.getText().getShortTextICAO()!= null) {
			sbl.append(fare.getText().getShortTextICAO());
			
			if (fare.getText().getTranslations() != null) {	
				//translations
				for (Translation trans : fare.getText().getTranslations()) {
					if (trans.getLanguage().getCode().equals("fr")) { //$NON-NLS-1$
						if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
							sbfr.append(trans.getShortTextICAO());
						} else {
							sbfr.append(sbl.toString());
						}
					}
					if (trans.getLanguage().getCode().equals("de")) { //$NON-NLS-1$
						if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
							sbge.append(trans.getShortTextICAO());
						} else {
							sbge.append(sbl.toString());
						}
					}			
					if (trans.getLanguage().getCode().equals("en")) { //$NON-NLS-1$
						if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
							sben.append(trans.getShortTextICAO());
						} else {
							sben.append(sbl.toString());
						}
					}		
				}
			}
		}
		
		//fare description local
		Text text = fare.getFareDetailDescription();
		if (text != null && tool.getConversionFromLegacy().getParams().isConvertFareDescriptions()) {
			if (text.getShortTextICAO() != null && text.getShortTextICAO().length() > 0) {
				if (sbl.length() > 0) {
					sbl.append("--"); //$NON-NLS-1$
				}
				sbl.append(text.getShortTextICAO());
				String fdl = "--" + text.getShortTextICAO(); //$NON-NLS-1$
				
				if (text.getTranslations() != null) {	
					//translations
					for (Translation trans : text.getTranslations()) {
						if (trans.getLanguage().getCode().equals("fr")) { //$NON-NLS-1$
							if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
								sbfr.append(trans.getShortTextICAO());
							} else {
								sbfr.append(fdl);
							}
						}
						if (trans.getLanguage().getCode().equals("de")) { //$NON-NLS-1$
							if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
								sbge.append(trans.getShortTextICAO());
							} else {
								sbge.append(fdl);
							}
						}			
						if (trans.getLanguage().getCode().equals("en")) { //$NON-NLS-1$
							if (trans.getShortTextICAO() != null && trans.getShortTextICAO().length() > 0) {
								sben.append(trans.getShortTextICAO());
							} else {
								sben.append(fdl);
							}
						}		
					}
				}				
			}
		}

		
		if (sbText != null && sbText.length() > 0) {
			sbl.append(sbText);
			sbfr.append(sbText);
			sbge.append(sbText);
			sben.append(sbText);
		}
		desc.setDescriptionLocal(sbl.toString());
		desc.setDescriptionFr(sbfr.toString());	
		desc.setDescriptionGe(sbge.toString());	
		desc.setDescriptionEn(sben.toString());	

		return desc;
	}

	private Object getEndDate(GTMTool tool) {
		if (tool == null || tool.getGeneralTariffModel() == null || tool.getGeneralTariffModel().getFareStructure()==null|| tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints() == null) {
			return null;
		}
		
		Date endDate = null;
		for (SalesAvailabilityConstraint sac  : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sac.getRestrictions()!= null && !sac.getRestrictions().isEmpty()) {
				for (SalesRestriction sr : sac.getRestrictions()) {
					if (sr.getSalesDates() != null) {
						if (endDate == null) {
							endDate = sr.getSalesDates().getUntilDate();
						} else {
							if (endDate.before(sr.getSalesDates().getUntilDate())) {
								endDate = sr.getSalesDates().getUntilDate();
							}
						}
					}
				}
			}
		}

		return endDate;
	}

	private Date getStartDate(GTMTool tool) {
		if (tool == null || tool.getGeneralTariffModel() == null || tool.getGeneralTariffModel().getFareStructure()==null|| tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints() == null) {
			return null;
		}
		
		Date startDate = null;
		for (SalesAvailabilityConstraint sac  : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sac.getRestrictions()!= null && !sac.getRestrictions().isEmpty()) {
				for (SalesRestriction sr : sac.getRestrictions()) {
					if (sr.getSalesDates() != null) {
						if (startDate == null) {
							startDate = sr.getSalesDates().getFromDate();
						} else {
							if (startDate.after(sr.getSalesDates().getFromDate())) {
								startDate = sr.getSalesDates().getFromDate();
							}
						}
					}
				}
			}
		}

		return startDate;
	}

	private void convertfareStations() {
		for (FareStationSetDefinition fs : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			
			Legacy108Station ls = GtmFactory.eINSTANCE.createLegacy108Station();
				
			ls.setStationCode(Integer.parseInt(fs.getCode()));
			ls.setName(fs.getName());
			ls.setNameUTF8(fs.getNameUtf8());
			ls.setShortName(fs.getName());
			if (fs.getLegacyCode() != 0) {
				ls.setFareReferenceStationCode(fs.getLegacyCode());
			} else {
				return;
			}
			legacyStations.add(ls);
		}
		return;
		
	}



	private void convertStations() {

		for (Station station : tool.getCodeLists().getStations().getStations()) {
			
			if (station.getCountry() == tool.getConversionFromLegacy().getParams().getCountry()) {
				Legacy108Station ls = GtmFactory.eINSTANCE.createLegacy108Station();
				
				ls.setStationCode(Integer.parseInt(station.getCode()));
				ls.setName(getNameCaseASCII(station));
				ls.setNameUTF8(station.getNameCaseUTF8());
				ls.setShortName(getShortNameCaseASCII(station));
				ls.setBorderPointCode(station.getLegacyBorderPointCode());
				
				// in case of emergency use MERITS names

				if (ls.getName() == null || ls.getName().length() < 1) {
					String ascii = GtmUtils.toPrintableAscII(station.getName());
					ls.setName(ascii);
				}
				if (ls.getNameUTF8() == null || ls.getNameUTF8().length() < 1) ls.setNameUTF8(station.getName());
				
				
				ls.setFareReferenceStationCode(getFareReferenceCode(station));

				legacyStations.add(ls);

			}
		}
		return;
	}
	
	private String getShortNameCaseASCII(Station station) {
		
		if (station.getShortNameCaseASCII() != null && station.getShortNameCaseASCII().length() > 0) {
			return station.getShortNameCaseASCII();
		}
		if (station.getShortNameCaseUTF8() != null && station.getShortNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getShortNameCaseUTF8());
		}	
		if (station.getNameCaseASCII() != null && station.getNameCaseASCII().length() > 0) {
			return station.getNameCaseASCII();
		}
		if (station.getName() != null && station.getName().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getName());
		}			
		if (station.getNameCaseUTF8() != null && station.getNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getNameCaseUTF8());
		}		

		return null;

	}
	
	private String getNameCaseASCII(Station station) {
		

		if (station.getNameCaseASCII() != null && station.getNameCaseASCII().length() > 0) {
			return station.getNameCaseASCII();
		}
		if (station.getShortNameCaseASCII() != null && station.getShortNameCaseASCII().length() > 0) {
			return station.getShortNameCaseASCII();
		}
		if (station.getName() != null && station.getName().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getName());
		}			
		if (station.getShortNameCaseUTF8() != null && station.getShortNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getShortNameCaseUTF8());
		}			
		if (station.getNameCaseUTF8() != null && station.getNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getNameCaseUTF8());
		}		

		return null;

	}



	private int getFareReferenceCode(Station station) {
		
		int fareCode = 0;
		Set<Integer> fareCodes = new HashSet<Integer>();
		for (FareStationSetDefinition f : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			if (f.getLegacyCode() > 0 && f.getStations().indexOf(station) >= 0 ) {
				fareCodes.add(Integer.valueOf(f.getLegacyCode()));
				fareCode = f.getLegacyCode();
			}
		}
		
		/*
		 * 
		 * 108 data structures dont't allow a station to be part of multiple fare station sets
		 * 
		 */
		if (fareCodes.size() > 0) {
			//lets take the first one
		}
		return fareCode;
	}

	private LegacyRouteFare convertFare(FareElement fare,int index) throws ConverterException {
		
		LegacySeries series = convertToSeries(fare,index);
		if (series == null) return null;
		
		if (series.getNumber() > 99999 ) {
			String message = NationalLanguageSupport.ConverterToLegacy_26;
			writeConsoleError(message);			
			return null;
		}

		LegacyRouteFare routeFare = convertToFare(fare,series,index);
		if (routeFare == null) return null;
		
		/*
		 * if all models require separate tickets the series will be added to the TCVL list
		 * 
		 */
		boolean separateTicket = true;
		for (FareCombinationModel	model : fare.getCombinationConstraint().getCombinationModels()) {
			if (model.getModel() != CombinationModel.SEPARATE_TICKET) {
				separateTicket = false;
			}
		}
		if (separateTicket) {
			LegacySeparateContractSeries scl = GtmFactory.eINSTANCE.createLegacySeparateContractSeries();
			scl.setSeries(series);
			legacySeparateContractSeries.add(scl);
		}
		
		routeFare.setFareTableNumber(addFareDescription(fare));

		return routeFare;
	}

	private LegacyRouteFare convertToFare(FareElement fare, LegacySeries series, int index) throws ConverterException {

		//search for legacy route fare to add class
		LegacyRouteFare legacyFare = legacyFares.get(series.getRouteDescription());
		if (legacyFare == null) {	
			legacyFare = GtmFactory.eINSTANCE.createLegacyRouteFare();
			legacyFare.setSeriesNumber(series.getNumber());
			legacyFare.setValidFrom(fare.getSalesAvailability().getRestrictions().get(0).getSalesDates().getFromDate());
			legacyFare.setValidUntil(fare.getSalesAvailability().getRestrictions().get(0).getSalesDates().getUntilDate());	
			legacyFare.setSeries(series);
			
		} 
		if (fare.getServiceClass().getId() == ClassId.B) {
			legacyFare.setFare1st(getPrice(fare.getPrice()));
		}
		if (fare.getServiceClass().getId() == ClassId.D) {
			legacyFare.setFare2nd(getPrice(fare.getPrice()));
		}


		return legacyFare;
	}

	private int getPrice(Price price) throws ConverterException {
		
		for (CurrencyPrice  cp : price.getCurrencies()) {

			float value = cp.getAmount() * 100;
			return (int)value;
		}
		throw new ConverterException(NationalLanguageSupport.ConverterToLegacy_27);

	}

	private LegacySeries convertToSeries(FareElement fare, int index) {
		LegacySeries series = GtmFactory.eINSTANCE.createLegacySeries();
		
		if (fare.getRegionalConstraint() == null ||
			fare.getRegionalConstraint().getRegionalValidity() == null ||
			fare.getRegionalConstraint().getRegionalValidity().isEmpty() ||
			fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation() == null ) {
			return null;
		}

		ViaStation mainVia = fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation();
	
		if (fare.getCarrierConstraint() != null && fare.getCarrierConstraint().getIncludedCarriers() != null && !fare.getCarrierConstraint().getIncludedCarriers().isEmpty()) {
			series.setCarrierCode(fare.getCarrierConstraint().getIncludedCarriers().get(0).getCode());	
		} else {
			if (mainVia.getCarrier() != null) {
				series.setCarrierCode( mainVia.getCarrier().getCode());
			}
		}
		
		series.setFromStation(getFirstStationCode( mainVia));
		series.setFromStationName(getFirstStationCodeName( mainVia));
	
		
		series.setDistance1((int) fare.getRegionalConstraint().getDistance());
		series.setDistance2((int) fare.getRegionalConstraint().getDistance());
		series.setNumber(fare.getLegacyAccountingIdentifier().getSeriesId());
		series.setPricetype(LegacyCalculationType.ROUTE_BASED);
		
		String routeDescription = getDescription(fare.getRegionalConstraint().getRegionalValidity());
		if (routeDescription.length() < 59) {
			series.setRouteDescription(routeDescription);
		} else	{
			String message = NationalLanguageSupport.ConverterToLegacy_28 + routeDescription;
			writeConsoleError(message);	
			return null;
		}
		
		Route mainRoute = mainVia.getRoute();
		int altRoute = 1;
		addViaStations (series.getViastations(), mainRoute.getStations(), altRoute);
		if (series.getViastations().size() > 5) {
			String message = NationalLanguageSupport.ConverterToLegacy_29 + routeDescription;
			writeConsoleError(message);	
			return null;
		}
		
		series.setSupplyingCarrierCode(tool.getGeneralTariffModel().getDelivery().getProvider().getCode());
		series.setToStation(getLastStationCode(mainVia));
		series.setToStationName(getLastStationCodeName(mainVia));
		series.setType(getType(fare.getRegionalConstraint()));
		
		series.setValidFrom(fare.getSalesAvailability().getRestrictions().get(0).getSalesDates().getFromDate());
		series.setValidUntil(fare.getSalesAvailability().getRestrictions().get(0).getSalesDates().getUntilDate());	

		return series;
	}


	private void addViaStations(EList<LegacyViastation> viastations, EList<ViaStation> vias, int altRoute) {
		
		int lastIndex = vias.size() - 1;
		
		for (int index = 1;index < lastIndex; index++) {
			
			ViaStation station = vias.get(index);
			if (station.getStation() != null) {
				LegacyViastation lvia = GtmFactory.eINSTANCE.createLegacyViastation();
				lvia.setPosition(altRoute);
				lvia.setCode(Integer.parseInt(station.getStation().getCode()));
				viastations.add(lvia);
			} else if (station.getFareStationSet() != null){
				LegacyViastation lvia = GtmFactory.eINSTANCE.createLegacyViastation();
				lvia.setPosition(altRoute);
				lvia.setCode(Integer.parseInt(station.getFareStationSet().getCode()));
				viastations.add(lvia);			
			} else if (station.getAlternativeRoutes() != null) {
				for (AlternativeRoute altr : station.getAlternativeRoutes()) {
					altRoute++;
					addViaStations(viastations, altr.getStations(), altRoute);
				}
				altRoute = 1;
			} 
		}
	}

	private LegacySeriesType getType(RegionalConstraint regionalConstraint) {
		if (regionalConstraint.getEntryConnectionPoint() != null && regionalConstraint.getExitConnectionPoint() != null) {
			return LegacySeriesType.TRANSIT;
		}
		if (regionalConstraint.getEntryConnectionPoint() == null && regionalConstraint.getExitConnectionPoint() == null) {
			return LegacySeriesType.BORDER_DESTINATION;
		}
		return LegacySeriesType.STATION_STATION;

	}

	private String getLastStationCodeName(ViaStation viaStation) {
		ViaStation via = viaStation.getRoute().getStations().get(viaStation.getRoute().getStations().size() - 1);
		if (via.getStation() != null) {
			return getName(via.getStation());
		} else if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return null;
	}

	private String getFirstStationCodeName(ViaStation viaStation) {
		ViaStation via = viaStation.getRoute().getStations().get(0);
		if (via.getStation() != null) {
			return getName(via.getStation());
		} else if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return null;
	}
	
	private String getName(Station station) {
		if (station.getShortNameCaseASCII() != null && station.getShortNameCaseASCII().length() > 0) {
			return station.getShortNameCaseASCII();
		}
		if (station.getNameCaseASCII() != null && station.getNameCaseASCII().length() > 0) {
			return station.getNameCaseASCII();
		}
		if (station.getName() != null && station.getName().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getName());
		}			
		if (station.getShortNameCaseUTF8() != null && station.getShortNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getShortNameCaseUTF8());
		}			
		if (station.getNameCaseUTF8() != null && station.getNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getNameCaseUTF8());
		}		

		return null;
	}

	private String getDescription(EList<RegionalValidity> regionalValidity) {
	
		StringBuilder label = new StringBuilder();
		
		label.append(getViaDescription(regionalValidity));
		
		return label.toString();

	}
	
	private String getViaDescription(EList<RegionalValidity> regionalValidity) {
		
		ViaStation via = regionalValidity.get(0).getViaStation();
		if (via.getRoute() == null || 
			via.getRoute().getStations() == null ||
			via.getRoute().getStations().isEmpty() ) {
				return " "; //$NON-NLS-1$
		}
		
		Route route = via.getRoute();
		
		StringBuilder label = new StringBuilder();
		
		int nbVias = route.getStations().size();
		
		for (int index = 1; index < nbVias -1 ; index++) {
				
			ViaStation via2 = route.getStations().get(index);
			
			if (via2 != null) {
				if (label.length() == 0 || label.substring(label.length()-1,label.length()).equals("*")) { //$NON-NLS-1$
					label.append("*").append(getRouteDescription(via2)); //$NON-NLS-1$
				} else {
					label.append(getRouteDescription(via2));
				}
			}
		}

		return label.toString();

	}

	private String getRouteDescription(ViaStation via) {
		
		if (via.getStation()!= null) return via.getStation().getName();
		
		StringBuilder label = new StringBuilder();
		
		if (via.getRoute()!= null && via.getRoute().getStations() != null && !via.getRoute().getStations().isEmpty() ) {
			
			for (ViaStation station : via.getRoute().getStations()) {
				
				if (station != null) {
					if (label.length() == 0 || label.substring(label.length()-1,label.length()).equals("*")) { //$NON-NLS-1$
						label.append(station.getStation().getName());
					} else {
						label.append("*").append(station.getStation().getName()); //$NON-NLS-1$
					}
				}
			}
			return label.toString();
		}
			
		if (via.getAlternativeRoutes()!= null && !via.getAlternativeRoutes().isEmpty()) {
			label.append("("); //$NON-NLS-1$
			for (AlternativeRoute route : via.getAlternativeRoutes() ) {
				if (label.length() > 1) {
					label.append("/"); //$NON-NLS-1$
				}
				String routeLable =""; //$NON-NLS-1$
				for (ViaStation via2 :  route.getStations()) {
					if (routeLable.length() == 0 || label.substring(label.length()-1,label.length()).equals("*")) { //$NON-NLS-1$
						label.append(via2.getDescription());
					} else {
						label.append("*").append(getRouteDescription(via2)); //$NON-NLS-1$
					}
				}
			}
			label.append(")"); //$NON-NLS-1$
			
		}
			
		return label.toString();

	}

	private int getLastStationCode(ViaStation viaStation) {
		ViaStation via = viaStation.getRoute().getStations().get(viaStation.getRoute().getStations().size() - 1);
		if (via.getStation() != null) {
			return Integer.parseInt(via.getStation().getCode());
		} else if (via.getFareStationSet() != null) {
			return Integer.parseInt(via.getFareStationSet().getCode());
		}
		return 0;
	}

	private int getFirstStationCode(ViaStation viaStation) {
		ViaStation via = viaStation.getRoute().getStations().get(0);
		if (via.getStation() != null) {
			return Integer.parseInt(via.getStation().getCode());
		} else if (via.getFareStationSet() != null) {
			return Integer.parseInt(via.getFareStationSet().getCode());
		}
		return 0;		
	}


	private List<FareElement> selectFares() {
		
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		
		for (FareElement fare :  tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {		
			if (isConvertable(fare)) {
				fares.add(fare);
			}
		}
		
		return fares;
	}
	
	
	

	private boolean isConvertable(FareElement fare) {
		//fare excluded from conversion
		if (fare.getLegacyConversion() == LegacyConversionType.NO) return false;
		
		//only ADULT
		if (fare.getPassengerConstraint().getTravelerType() != TravelerType.ADULT)  return false;
		
		//only FULL_FLEX combination
		if (!isFullFlexCombi(fare))  return false;
		
		//no reductions
		if (fare.getReductionConstraint() != null)  return false;
		
		//must be convertible in legacy series
		if (!hasSimpleRegionalValidity(fare))  return false;
		
		//must have one sales availability 
		if (fare.getSalesAvailability() == null) return false;
		if (fare.getSalesAvailability().getRestrictions() == null) return false;
		if (fare.getSalesAvailability().getRestrictions().isEmpty()) return false;
		if (fare.getSalesAvailability().getRestrictions().size() == 0) return false;
		
		//must have one calendar
		if (fare.getSalesAvailability().getRestrictions().get(0).getSalesDates() == null ) return false;
		
		return true;
	}

	private boolean hasSimpleRegionalValidity(FareElement fare) {
		if (fare.getRegionalConstraint() == null) return false;
		if (fare.getRegionalConstraint().getRegionalValidity() == null || fare.getRegionalConstraint().getRegionalValidity().isEmpty()) return false;
		//only via stations allowed
		if (fare.getRegionalConstraint().getRegionalValidity().size() > 1) return false;
				
		//contains only 
		RegionalValidity v = fare.getRegionalConstraint().getRegionalValidity().get(0);
		if (v.getViaStation() == null) return false;
		if (v.getLine() != null || v.getPolygone()!= null || v.getZone()!= null) return false;
		ViaStation via = v.getViaStation();
		
		List<Station> stations = new ArrayList<Station>();
		List<FareStationSetDefinition> fareStations = new ArrayList<FareStationSetDefinition>();
		
		//no main route
		if (via.getRoute() == null) return false;
		
		addStations(via,stations, fareStations);
		
		//too man stations
		if (stations.size() + fareStations.size() > 7) return false;
		
		//has foreign stations
		if (hasForeignStations(stations)) return false;
		
		if (fare.getRegionalConstraint().getEntryConnectionPoint() == null && fare.getRegionalConstraint().getEntryConnectionPoint() != null) return false;
			
		if ((fare.getRegionalConstraint().getEntryConnectionPoint() == null && fare.getRegionalConstraint().getEntryConnectionPoint() == null) ||
			(fare.getRegionalConstraint().getEntryConnectionPoint() != null && fare.getRegionalConstraint().getEntryConnectionPoint() != null)) {
			if (isreversedRoute(via)) return false;
		}
		return true;
	}

	private boolean isreversedRoute(ViaStation via) {
		
		int start  = 0;
		int end = 0;

		ViaStation first = via.getRoute().getStations().get(0);
		ViaStation last = via.getRoute().getStations().get(via.getRoute().getStations().size()-1);
		
		try {
			if (first.getStation()!= null){
				start = Integer.parseInt(first.getStation().getCode());
			} else { 
				start = Integer.parseInt(first.getFareStationSet().getCode());
			}
		} catch (Exception e) {
			return true;
		}
		
		try {
			if (last.getStation()!= null){
				end = Integer.parseInt(last.getStation().getCode());
			} else { 
				end = Integer.parseInt(last.getFareStationSet().getCode());
			}
		} catch (Exception e) {
			return true;
		}
		
		if (end < start) return true;

		return false;
	}

	private boolean hasForeignStations(List<Station> stations) {
		for (Station station: stations) {
			if (station.getCountry() != tool.getConversionFromLegacy().getParams().getCountry()) return true;
		}
		return false;
	}

	private void addStations(ViaStation via, List<Station> stations, List<FareStationSetDefinition> fareStations) {
		
		if (via == null) return;
		if (via.getStation() != null) stations.add(via.getStation());
		if (via.getFareStationSet()!= null) fareStations.add(via.getFareStationSet());
		
		if (via.getRoute() != null) {
			for (ViaStation via2 :via.getRoute().getStations()) {
				addStations(via2, stations, fareStations);
			}
		}
		
		for (AlternativeRoute route: via.getAlternativeRoutes()) {
			for (ViaStation via3 : route.getStations()) {
				addStations(via3, stations,fareStations);
			}
		}
		
	}

	private boolean isFullFlexCombi(FareElement fare) {
		if (fare.getCombinationConstraint() ==  null) return false;
		for (FareCombinationModel model : fare.getCombinationConstraint().getCombinationModels()) {
			
			//must allow clustering in full flex
			if (model.getModel() == CombinationModel.CLUSTERING &&
				model.getReferenceCluster() == Clusters.FULLFLEX) {
				if (model.getCombinableCarriers().isEmpty() || 
					model.getCombinableCarriers().contains(tool.getConversionFromLegacy().getLegacy108().getCarrier())) {
					if (model.getAllowedAllocators().isEmpty() || 
						model.getAllowedAllocators().contains(tool.getConversionFromLegacy().getLegacy108().getCarrier())) {	
						return true;
					}
				}
			}
		}
		return false;
	}

	public void executeAndFlush(CompoundCommand command, EditingDomain domain) {
		
		if (command != null && domain != null && !command.isEmpty() && command.canExecute()) {
			domain.getCommandStack().execute(command);
			domain.getCommandStack().flush();
			domain.getCommandStack().execute(new DirtyCommand());
		} else {
			String message = NationalLanguageSupport.ConverterToLegacy_41 + command.getDescription();
			writeConsoleError(message);
		}
		
		System.gc();
		
	}
	
	private void writeConsoleError(String message) {
		editor.getSite().getShell().getDisplay().asyncExec(() -> {
			ConsoleUtil.printError(NationalLanguageSupport.ConverterToLegacy_42, message);
		});
	}
	
	

}
