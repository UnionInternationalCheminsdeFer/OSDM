package Gtm.actions.converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AlternativeRoute;
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
import Gtm.Legacy108Station;
import Gtm.LegacyCalculationType;
import Gtm.LegacyConversionType;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;
import Gtm.Price;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.Route;
import Gtm.Station;
import Gtm.TravelerType;
import Gtm.ViaStation;
import Gtm.console.ConsoleUtil;
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
		
	public ConverterToLegacy(GTMTool tool, GtmEditor editor, EditingDomain domain) {
		this.tool = tool;
		this.editor = editor;
		this.domain = domain;
	}
	
	public int getMonitorTasks() {
		return 9;
	}
	
	public int convert(IProgressMonitor monitor) {
		
		
		monitor.subTask("convert stations");	
		convertStations();
		monitor.worked(1);
		
		monitor.subTask("convert fare reference stations");	
		convertfareStations();	
		monitor.worked(1);

		monitor.subTask("select fares");	
		List<FareElement> convertableFares = selectFares();
		monitor.worked(1);
		
		monitor.subTask("convert fares");	
		for (FareElement fare : convertableFares) {

			try {
				LegacyRouteFare  legacyFare = convertFare(fare, convertableFares.indexOf(fare));
				if (series.size() < 99999) {
					routeFares.add(legacyFare);
					series.add(legacyFare.getSeries());
				}
				
			} catch (ConverterException e) {
				String message = "error in fare: " + fare.getId() + " " + e.getMessage();
				writeConsoleError(message);
			}
		}
		monitor.worked(1);
		
		monitor.subTask("correct series numbering");	
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
			String message = "error in series numbering: series renumbered";
			writeConsoleError(message);
		}
		monitor.worked(1);
		
		monitor.subTask("adjuct distance for missing price in class");	
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
	
		monitor.subTask("add converted series");	
		Command com = AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList(), GtmPackage.Literals.LEGACY_SERIES_LIST__SERIES, series);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);
		
		monitor.subTask("add converted fares");	
		com = AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares(), GtmPackage.Literals.LEGACY_ROUTE_FARES__ROUTE_FARE, routeFares);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);
		
		monitor.subTask("add converted stations");	
		com = AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), tool.getConversionFromLegacy().getLegacy108().getLegacyStations(), legacyStations);
		if (com != null && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		monitor.worked(1);
		
		return series.size();
	}
	
	
	private void convertfareStations() {
		for (FareStationSetDefinition fs : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			
			Legacy108Station ls = GtmFactory.eINSTANCE.createLegacy108Station();
				
			ls.setStationCode(Integer.parseInt(fs.getCode()));
			ls.setName(fs.getName());
			ls.setNameUTF8(fs.getNameUtf8());
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
				ls.setName(station.getNameCaseASCII());
				ls.setNameUTF8(station.getNameCaseUTF8());
				ls.setFareReferenceStationCode(getFareReferenceCode(station));
				
				legacyStations.add(ls);

			}
		}
		return;
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
		
		if (fareCodes.size() > 0) {
			//TODO What to do now?
		}
		return fareCode;
	}

	private LegacyRouteFare convertFare(FareElement fare,int index) throws ConverterException {
		
		LegacySeries series = convertToSeries(fare,index);
		if (series == null) return null;
		
		if (series.getNumber() > 99999) {
			String message = "too  many series";
			writeConsoleError(message);			
			return null;
		}

		LegacyRouteFare routeFare = convertToFare(fare,series,index);
		if (routeFare == null) return null;

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
		throw new ConverterException("price convertion failed");

	}

	private LegacySeries convertToSeries(FareElement fare, int index) {
		LegacySeries series = GtmFactory.eINSTANCE.createLegacySeries();
		
		series.setCarrierCode(tool.getGeneralTariffModel().getDelivery().getProvider().getCode());
		series.setCarrierCode(fare.getCarrierConstraint().getIncludedCarriers().get(0).getCode());
		
		series.setDistance1((int) fare.getRegionalConstraint().getDistance());
		series.setDistance2((int) fare.getRegionalConstraint().getDistance());
		series.setFromStation(getFirstStationCode(fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation()));
		series.setFromStationName(getFirstStationCodeName(fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation()));
		series.setNumber(fare.getLegacyAccountingIdentifier().getSeriesId());
		series.setPricetype(LegacyCalculationType.ROUTE_BASED);
		
		String routeDescription = getDescription(fare.getRegionalConstraint().getRegionalValidity());
		if (routeDescription.length() < 59) {
			series.setRouteDescription(routeDescription);
		} else	{
			String message = "route description tool long: " + routeDescription;
			writeConsoleError(message);	
			return null;
		}
		
		
		ViaStation mainVia = fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation();
		Route mainRoute = mainVia.getRoute();
		int altRoute = 1;
		addViaStations (series.getViastations(), mainRoute.getStations(), altRoute);
		if (series.getViastations().size() > 5) {
			String message = "too many stations: " + routeDescription;
			writeConsoleError(message);	
			return null;
		}
		
		
		series.setSupplyingCarrierCode(tool.getGeneralTariffModel().getDelivery().getProvider().getCode());
		series.setToStation(getLastStationCode(fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation()));
		series.setToStationName(getLastStationCodeName(fare.getRegionalConstraint().getRegionalValidity().get(0).getViaStation()));
		series.setType(getType(fare.getRegionalConstraint()));
		
		series.setValidFrom(fare.getSalesAvailability().getRestrictions().get(0).getSalesDates().getFromDate());
		series.setValidUntil(fare.getSalesAvailability().getRestrictions().get(0).getSalesDates().getUntilDate());	

		return series;
	}


	private void addViaStations(EList<LegacyViastation> viastations, EList<ViaStation> vias, int altRoute) {
		for (ViaStation station :  vias) {
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
			return via.getStation().getNameCaseASCII();
		} else if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return null;
	}

	private String getFirstStationCodeName(ViaStation viaStation) {
		ViaStation via = viaStation.getRoute().getStations().get(0);
		if (via.getStation() != null) {
			return via.getStation().getNameCaseASCII();
		} else if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return null;
	}

	private String getDescription(EList<RegionalValidity> regionalValidity) {
		return regionalValidity.get(0).getViaStation().getDescription();
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
			
			
			//fare excluded from conversion
			if (fare.getLegacyConversion() == LegacyConversionType.NO) break;
			
			//only ADULT
			if (fare.getPassengerConstraint().getTravelerType() != TravelerType.ADULT) break;
			
			//only FULL_FLEX combination
			if (!isFullFlexCombi(fare)) break;
			
			//no reductions
			if (fare.getReductionConstraint() != null) break;
			
			//must be convertible in legacy series
			if (!hasSimpleRegionalValidity(fare)) break;
			
			//must have one sales availability 
			if (fare.getSalesAvailability().getRestrictions().size() > 0) break;
			
			//must have one calendar
			if (fare.getSalesAvailability().getRestrictions().get(0).getSalesDates() != null ) break;
			
			fares.add(fare);
			
		}
		
		return null;
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
		
		if (via.getStation() != null) stations.add(via.getStation());
		if (via.getFareStationSet()!= null) fareStations.add(via.getFareStationSet());
		
		for (ViaStation via2 :via.getRoute().getStations()) {
			addStations(via2, stations, fareStations);
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
			String message = "could not change data: " + command.getDescription();
			writeConsoleError(message);
		}
		
		System.gc();
		
	}
	
	private void writeConsoleError(String message) {
		editor.getSite().getShell().getDisplay().asyncExec(() -> {
			ConsoleUtil.printError("Errors", message);
		});
	}
	
	

}
