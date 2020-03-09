package Gtm.actions.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AlternativeRoute;
import Gtm.Calendar;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.ClassicClassType;
import Gtm.ConnectionPoint;
import Gtm.Country;
import Gtm.CurrencyPrice;
import Gtm.DataSource;
import Gtm.EndOfSale;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108Station;
import Gtm.LegacyAccountingIdentifier;
import Gtm.LegacyBorderPointMapping;
import Gtm.LegacyCalculationType;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyFareStationSetMap;
import Gtm.LegacyFareStationSetMappings;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeries;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;
import Gtm.Price;
import Gtm.RegionalConstraint;
import Gtm.RegionalValidity;
import Gtm.SalesAvailabilityConstraint;
import Gtm.SalesRestriction;
import Gtm.ServiceConstraint;
import Gtm.StartOfSale;
import Gtm.Station;
import Gtm.StationNames;
import Gtm.StationSet;
import Gtm.TaxScope;
import Gtm.VATDetail;
import Gtm.ViaStation;
import Gtm.console.ConsoleUtil;
import Gtm.presentation.DirtyCommand;
import Gtm.presentation.GtmEditor;

public class ConverterFromLegacy {
	
	
	
	private HashMap<Integer,Station> localStations = null;
	private HashMap<Integer,Legacy108Station> legacyStations = null;
	private HashMap<String,Carrier> carriers = null;
	private HashMap<String, CarrierConstraint> carrierConstraints = null;
	private Country myCountry = null;
	private GTMTool tool = null;
	private EditingDomain domain = null;
	private GtmEditor editor = null;
	
	
	public ConverterFromLegacy(GTMTool tool, EditingDomain domain, GtmEditor editor) {
		localStations = new HashMap<Integer,Station>();
		carriers = new HashMap<String,Carrier>();
		legacyStations = new HashMap<Integer,Legacy108Station>();
		carrierConstraints = new HashMap<String,CarrierConstraint>();
		this.tool = tool;
		this.editor = editor;
		this.domain = domain;

		myCountry = tool.getConversionFromLegacy().getParams().getCountry();
		
		for (Station station : tool.getCodeLists().getStations().getStations()) {
			if (station.getCountry().getCode() == myCountry.getCode()) {
				try {
					localStations.put(Integer.parseInt(station.getCode()), station);
				} catch (Exception e){
					//do nothing 
				}
			}
		}
		
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()) {
			carriers.put(carrier.getCode(), carrier);
		}
		
		
		
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
				legacyStations.put(Integer.valueOf(station.getStationCode()), station);
		}
		
	}
		
	
	
	
	public int deleteOldConversionResults() {
		int deleted = 0;

		CompoundCommand command = new CompoundCommand();
		
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		for (FareElement fare : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (fare.getDataSource() == DataSource.CONVERTED) {
				fares.add(fare);
			}
		}
		command.append(RemoveCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getFareElements(),GtmPackage.Literals.FARE_ELEMENTS__FARE_ELEMENTS, fares) );
		executeAndFlush(command,domain);
		fares.clear();
		
		command = new CompoundCommand();
		ArrayList<RegionalConstraint> regions = new ArrayList<RegionalConstraint>();
		for (RegionalConstraint region : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			if (region.getDataSource() == DataSource.CONVERTED) {
				regions.add(region);
				
			}
		}
		command.append(RemoveCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints(),GtmPackage.Literals.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS, regions) );
		executeAndFlush(command,domain);
		regions.clear();
		
		
		command = new CompoundCommand();
		ArrayList<Price> prices = new ArrayList<Price>();
		for (Price price : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			if (price.getDataSource() == DataSource.CONVERTED) {
				prices.add(price);
			}
		}	
		command.append(RemoveCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getPrices(),GtmPackage.Literals.PRICES__PRICES, prices) );
		executeAndFlush(command,domain);
		prices.clear();
		
		command = new CompoundCommand();		
		for (ConnectionPoint point : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (point.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(domain, point) );
			}
		}			
		
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}		
		executeAndFlush(command,domain);
		
		command = new CompoundCommand();		
		for (Calendar sa : tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}	
		executeAndFlush(command,domain);
		
		command = new CompoundCommand();		
		for (FareStationSetDefinition sa : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		executeAndFlush(command,domain);


		return deleted;
	}


	public int convertToGtm(IProgressMonitor monitor) {
		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = "the country is missing in the conversion parameter";
			writeConsoleError(message);
			return 0;
		}
		
		ArrayList<Price> priceList = new ArrayList<Price>();
		ArrayList<RegionalConstraint> regions = new ArrayList<RegionalConstraint>();
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		

		
		
		int nbSeries = 0;
		int worked = 100000 / tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries().size();
		if (worked < 1 ) worked = 1;
		int added = 0;
		
		
		monitor.subTask("create carrier constraints");
		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			if (carrierConstraints.get(series.getCarrierCode()) == null)  {
				Carrier carrier = tool.getCodeLists().getCarriers().findCarrier(series.getCarrierCode());
				CarrierConstraint constraint = GtmFactory.eINSTANCE.createCarrierConstraint();
				constraint.setDataDescription("only " + carrier.getName());
				constraint.getIncludedCarriers().add(carrier);
				carrierConstraints.put(carrier.getCode(),constraint);
			}

		}

		CompoundCommand command = new CompoundCommand();
		Command com0 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints(), GtmPackage.Literals.CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS, carrierConstraints);
		command.append(com0);
		executeAndFlush(command, domain);
		monitor.worked(1);
		
		
		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			nbSeries++;
			
			ArrayList<DateRange> validityRanges = findValidRanges (series);
			
			RegionalConstraint regionalConstraint = null;
			try {
				regionalConstraint = convertSeriesToRegionalConstraint(series);
			} catch (ConverterException e) {
				//continue
			}
			
			RegionalConstraint regionalConstraintR = null;
			try {
				regionalConstraintR = convertSeriesToReversedRegionalConstraint(series);
			} catch (ConverterException e) {
				//continue
			}
			
			if (regionalConstraint != null) {
				regions.add(regionalConstraint);
			}
			if (regionalConstraintR != null) {
				regions.add(regionalConstraintR);
			}
		

			int legacyFareCounter = 0;
			for (FareTemplate fareTemplate: tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates()) {
				
				try {
					for (DateRange dateRange : validityRanges) {
						convertSeriesToFares(series, fareTemplate,added, dateRange, regionalConstraint,regionalConstraintR ,priceList, legacyFareCounter, fares);
					}
					added++;
				} catch (ConverterException e) {
					// error already logged
				}
			}		
			
						
			if (nbSeries % 1000 == 0 ) {			
				monitor.subTask("convert series: "+ String.valueOf(nbSeries));
				monitor.worked(worked);
			} 
			
			
		}
		
		Command com1 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints(), GtmPackage.Literals.REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS, regions);
		command.append(com1);
		executeAndFlush(command, domain);
		monitor.worked(1);
		
		command = new CompoundCommand();
		Command com2 = AddCommand.create(domain,tool.getGeneralTariffModel().getFareStructure().getPrices(), GtmPackage.Literals.PRICES__PRICES, priceList);
		command.append(com2);
		executeAndFlush(command, domain);
		monitor.worked(1);
		
		command = new CompoundCommand();
		Command com3 = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getFareElements(),GtmPackage.Literals.FARE_ELEMENTS__FARE_ELEMENTS , fares);		
		command.append(com3);	
		executeAndFlush(command, domain);
		monitor.worked(1);
		
		return added;
	}


	
	public void convertSeriesToFares(LegacySeries series, FareTemplate fareTemplate, int number,DateRange dateRange, RegionalConstraint regionalConstraint, RegionalConstraint regionalConstraintR, ArrayList<Price> priceList, int legacyFareCounter, ArrayList<FareElement> fares) throws ConverterException{
		
		try {
			
			Price price = convertSeriesToPrice(tool, series, fareTemplate, tool.getConversionFromLegacy().getParams().getCountry(), dateRange);
			if (price == null) return;
			Price oldPrice = findPrice(price, priceList);
			if (oldPrice != null) {
				price=oldPrice;
			}
					
			FareElement fareElement = convertSeriesToFare(tool, series, fareTemplate, 1);
			fareElement.getLegacyAccountingIdentifier().setTariffId(legacyFareCounter++);
			fareElement.setPrice(price);
			fareElement.setRegionalConstraint(regionalConstraint);
			fareElement.setSalesAvailability(findSalesAvailability(tool,dateRange));
			fareElement.getLegacyAccountingIdentifier().setTariffId(number);
			

			FareElement fareElementR =  null;
			
			fareElementR = convertSeriesToFare(tool, series, fareTemplate, 2);
			fareElement.getLegacyAccountingIdentifier().setTariffId(legacyFareCounter++);
			fareElementR.getLegacyAccountingIdentifier().setTariffId(number);
			fareElementR.setPrice(price);
			fareElementR.setRegionalConstraint(regionalConstraintR);
				
			//get service constraints
			ServiceConstraint serviceConstraint = null;
			for (LegacyViastation via : series.getViastations()) {
				serviceConstraint = tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().findServiceConstraint(via.getCode());
			}
			if (serviceConstraint != null) {
				fareElement.setServiceConstraint(serviceConstraint);
				if (fareElementR != null) {
					fareElementR.setServiceConstraint(serviceConstraint);
				}
			}
			
			if (price != null && fareElement != null) {
				fares.add(fareElement);			
				fares.add(fareElementR);	
			}
			
			
		} catch (ConverterException e) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " conversion of this series failed";
			writeConsoleError(message);
		}
		return;
	
	}	
	
	

	private static Price findPrice(Price newPrice, ArrayList<Price> priceList) {
		
		for (Price price :priceList) {
			
			if (price.getCurrencies().get(0).getAmount() == newPrice.getCurrencies().get(0).getAmount()) {
				return price;
			}
			
		}
		
		priceList.add(newPrice);

		return null;
	}


	private static SalesAvailabilityConstraint findSalesAvailability(GTMTool tool, DateRange dateRange) {
		
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()){
			
			if ( sa.getDataSource() == DataSource.CONVERTED) {
				
				if (sa.getRestrictions().get(0).getSalesDates().getFromDate().equals(dateRange.startDate) 
					&& sa.getRestrictions().get(0).getSalesDates().getUntilDate().equals(dateRange.endDate) ) {
					return sa;
				}
			}
		}
		
		return null;
	}


	private ArrayList<DateRange> findValidRanges(LegacySeries series) {
				
		HashSet<Date> dateSet = new HashSet<Date>();
		dateSet.add(series.getValidFrom());
		dateSet.add(series.getValidUntil());
		
		if (series.getPricetype() == LegacyCalculationType.DISTANCE_BASED) {
		
			for (LegacyDistanceFare fare :  tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare()) {
				if (fare.getValidFrom().after(series.getValidFrom()) && fare.getValidFrom().before(series.getValidUntil())) {
					dateSet.add(fare.getValidFrom());
				}
				if (fare.getValidUntil().after(series.getValidFrom()) && fare.getValidUntil().before(series.getValidUntil())) {
					dateSet.add(fare.getValidUntil());
				}
			} 
		} else if (series.getPricetype() == LegacyCalculationType.ROUTE_BASED) {
			
			for (LegacyRouteFare fare :  tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()) {
				if (fare.getValidFrom().after(series.getValidFrom()) && fare.getValidFrom().before(series.getValidUntil())) {
					dateSet.add(fare.getValidFrom());
				}
				if (fare.getValidUntil().after(series.getValidFrom()) && fare.getValidUntil().before(series.getValidUntil())) {
					dateSet.add(fare.getValidUntil());
				}
			} 
			
		}
		
		return DateRange.getIntervalls(dateSet);

	}


	private RegionalConstraint convertSeriesToReversedRegionalConstraint(LegacySeries series) throws ConverterException {
		RegionalConstraint constraint = GtmFactory.eINSTANCE.createRegionalConstraint();
		constraint.setDataSource(DataSource.CONVERTED);
		constraint.setDistance( (series.getDistance1() + series.getDistance2())/2 );
		
		int seqNb = 1;
		

		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = "the country is missing in the conversion parameter";
			writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		
		//handle departure
		int code =  series.getToStation();
		Station departureStation = null;
		FareStationSetDefinition departureFareStation = null;
		departureStation = getStation(tool, country, code);
		if (departureStation  == null) {
			departureStation = findBorderPointMappingStation(code);
		} 		
		if (departureStation  == null) {
			departureFareStation = findFareStation(code);
		} 
		if (departureStation == null && departureFareStation == null) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " station not found: " + Integer.toString(code);
			writeConsoleError(message);
			throw new ConverterException(message);
		}

		//handle arrival
		code =  series.getFromStation();
		Station arrivalStation = null;
		FareStationSetDefinition arrivalFareStation = null;
		arrivalStation = getStation(tool, country, code);
		if (arrivalStation  == null) {
			arrivalStation = findBorderPointMappingStation(code);
		} 		
		if (arrivalStation  == null) {
			arrivalFareStation = findFareStation(code);
		} 
		if (arrivalStation == null && arrivalFareStation == null) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " station not found: " + Integer.toString(code);
			writeConsoleError(message);
			throw new ConverterException(message);
		}		
		
		
		if (series.getType() == LegacySeriesType.TRANSIT || series.getType() == LegacySeriesType.BORDER_DESTINATION) {
		int borderpointcode = getBorderPointCode(tool, series.getFromStation());
			ConnectionPoint exit = findConnectionPoint(tool,borderpointcode,departureStation);
			if (exit == null) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + "connection point missing";
				writeConsoleError(message);
				throw new ConverterException(message);
			}
			constraint.setExitConnectionPoint(exit);
		}


		
		//handle route

		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();
		constraint.getRegionalValidity().add(region);
		region.setSeqNb(seqNb);
		seqNb++;
		
		ViaStation mainViaStation = GtmFactory.eINSTANCE.createViaStation();
		mainViaStation.setCarrier(carriers.get(series.getCarrierCode()));
		region.setViaStation(mainViaStation);
		mainViaStation.setRoute(GtmFactory.eINSTANCE.createRoute());
		



		ViaStation viaDeparture = GtmFactory.eINSTANCE.createViaStation();
		if (departureStation != null) {
			viaDeparture.setStation(departureStation);
		} else if (departureFareStation != null) {
			viaDeparture.setFareStationSet(departureFareStation);
		}
		
		mainViaStation.getRoute().getStations().add(viaDeparture);

		int mainRoutePosition = 1;
		int lastPosition = mainRoutePosition; 
		EList<ViaStation> mainRoute = mainViaStation.getRoute().getStations();
		EList<ViaStation> lastRoute = mainViaStation.getRoute().getStations();
		ViaStation alternativeRoutesVia = null;
		
		for (int i = series.getViastations().size() - 1; i > -1; i--) {
			
			LegacyViastation legacyViaStation = series.getViastations().get(i);
			if (legacyViaStation.getPosition() != lastPosition) {
				if (legacyViaStation.getPosition() == mainRoutePosition){
					//switch back to main route
					lastRoute = mainRoute;
					lastPosition = mainRoutePosition;
					try {
						addToRoute(lastRoute, legacyViaStation, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
						writeConsoleError(message);
						throw new ConverterException(message);
					}
				} else if (lastPosition == mainRoutePosition) {
					//start alternatives to the main route
					alternativeRoutesVia = GtmFactory.eINSTANCE.createViaStation();
					mainRoute.add(alternativeRoutesVia);
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
					lastRoute = alternativeRoute.getStations();
					lastPosition = legacyViaStation.getPosition();
					try {
						addToRoute(lastRoute, legacyViaStation, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
						writeConsoleError(message);
						throw new ConverterException(message);
					}					
				} else {
					// add another alternative
					lastPosition = legacyViaStation.getPosition();
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					try {
						alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
						lastRoute = alternativeRoute.getStations();						
						addToRoute(lastRoute, legacyViaStation, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") :" + e.getMessage();
						writeConsoleError(message);
						throw e;
					}		
				}
			} else {
				try {
					addToRoute(lastRoute, legacyViaStation, country);
				} catch (ConverterException e) {
					String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
					writeConsoleError(message);
					throw new ConverterException(message);
				}		
			}
		}
		
		//handle arrival
		
		ViaStation via = GtmFactory.eINSTANCE.createViaStation();
		via.setStation(arrivalStation);
		via.setFareStationSet(arrivalFareStation);
		via.setDataDescription(via.getDescription());
		mainRoute.add(via);
		
		//find connection points
		if (series.getType() == LegacySeriesType.TRANSIT) {
			
			int borderpointcode = getBorderPointCode(tool, series.getToStation());
			ConnectionPoint entry = findConnectionPoint(tool,borderpointcode,arrivalStation);
			if (entry == null) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + "connection point missing for transit series";
				writeConsoleError(message);
				throw new ConverterException(message);
			}
			constraint.setEntryConnectionPoint(entry);
		}
		
		setDescription(mainViaStation);
		
		constraint.setDataDescription(mainViaStation.getDataDescription());
		
		return constraint;
	}
	
	private Station findBorderPointMappingStation(int code) {
		LegacyBorderPointMapping map = (tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings().getMappingByBorderPointCode(code));
		if (map != null) {
			return map.getStation();
		}
		return null;
	}




	private FareStationSetDefinition findFareStation(int code) {
		for (LegacyFareStationSetMap map : tool.getConversionFromLegacy().getParams().getLegacyFareStationMappings().getLegacyFareStationSetMap()) {
			if (map.getLegacyCode() == code) return map.getStationSet();
		}
		return null;
	}




	private static int getBorderPointCode(GTMTool tool, int stationcode) {
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			if (station.getStationCode() == stationcode) return station.getBorderPointCode();
		}
		return 0;
	}


	public static ConnectionPoint findConnectionPointviaBorderPointCode (GTMTool tool, int borderpointcode) {
		LegacyBorderPointMapping map = tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings().getMappingByBorderPointCode(borderpointcode);
		if (map != null && map.getConnectionPoint() != null) {
			return map.getConnectionPoint();
		}
		
		
		if (tool.getGeneralTariffModel().getFareStructure() == null) return null;
		if (tool.getGeneralTariffModel().getFareStructure() == null) return null;
		if (tool.getGeneralTariffModel().getFareStructure().getConnectionPoints() == null) return null;
		if (tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints().isEmpty()) return null;
		for (ConnectionPoint point : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (point.getLegacyBorderPointCode() == borderpointcode) {
				return point;
			}
		}

		return null;
		
		
	}


	public RegionalConstraint convertSeriesToRegionalConstraint(LegacySeries series) throws ConverterException{
		
		RegionalConstraint constraint = GtmFactory.eINSTANCE.createRegionalConstraint();
		constraint.setDataSource(DataSource.CONVERTED);
		
		int seqNb = 1;
				
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		
		//handle departure
		int code =  series.getFromStation();
		Station departureStation = null;
		FareStationSetDefinition departureFareStation = null;
		departureStation = getStation(tool, country, code);
		if (departureStation  == null) {
			departureStation = findBorderPointMappingStation(code);
		} 		
		if (departureStation  == null) {
			departureFareStation = findFareStation(code);
		} 
		if (departureStation == null && departureFareStation == null) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " station not found: " + Integer.toString(code);
			writeConsoleError(message);
			throw new ConverterException(message);
		}

		//handle arrival
		code =  series.getToStation();
		Station arrivalStation = null;
		FareStationSetDefinition arrivalFareStation = null;
		arrivalStation = getStation(tool, country, code);
		if (arrivalStation  == null) {
			arrivalStation = findBorderPointMappingStation(code);
		} 		
		if (arrivalStation  == null) {
			arrivalFareStation = findFareStation(code);
		} 
		if (arrivalStation == null && arrivalFareStation == null) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " station not found: " + Integer.toString(code);
			writeConsoleError(message);
			throw new ConverterException(message);
		}	
		
		ViaStation mainViaStation = GtmFactory.eINSTANCE.createViaStation();
		mainViaStation.setRoute(GtmFactory.eINSTANCE.createRoute());
		mainViaStation.setCarrier(carriers.get(series.getCarrierCode()));
		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();
		region.setSeqNb(seqNb);
		seqNb++;
		region.setViaStation(mainViaStation);
		constraint.getRegionalValidity().add(region);
		
		//find connection points
		if (series.getType() == LegacySeriesType.TRANSIT) {
			
			int borderpointcode = getBorderPointCode(tool, series.getFromStation());
			ConnectionPoint entry = findConnectionPoint(tool,borderpointcode,departureStation);
			if (entry == null) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + "connection point missing for transit series";
				writeConsoleError(message);
				throw new ConverterException(message);
			}
			constraint.setEntryConnectionPoint(entry);
		}

		//create route
		
		ViaStation viaDeparture = GtmFactory.eINSTANCE.createViaStation();
		if (departureStation != null) {
			viaDeparture.setStation(departureStation);
		}
		mainViaStation.getRoute().getStations().add(viaDeparture);

		int mainRoutePosition = 1;
		int lastPosition = mainRoutePosition; 
		EList<ViaStation> mainRoute = mainViaStation.getRoute().getStations();
		EList<ViaStation> lastRoute = mainViaStation.getRoute().getStations();
		ViaStation alternativeRoutesVia = null;

		
		for (LegacyViastation legacyViaStation : series.getViastations()) {
			if (legacyViaStation.getPosition() != lastPosition) {
				if (legacyViaStation.getPosition() == mainRoutePosition){
					//switch back to main route
					lastRoute = mainRoute;
					lastPosition = mainRoutePosition;
					alternativeRoutesVia = null;
					try {
						addToRoute(lastRoute, legacyViaStation, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
						writeConsoleError(message);
						throw new ConverterException(message);
					}
				} else if (lastPosition == mainRoutePosition) {
					//start alternatives to the main route
					alternativeRoutesVia = GtmFactory.eINSTANCE.createViaStation();
					mainRoute.add(alternativeRoutesVia);
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
					lastRoute = alternativeRoute.getStations();
					lastPosition = legacyViaStation.getPosition();
					try {
						addToRoute(lastRoute, legacyViaStation, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
						writeConsoleError(message);
						throw new ConverterException(message);
					}					
				} else {
					// add another alternative				
					lastPosition = legacyViaStation.getPosition();
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					try {
						alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
						lastRoute = alternativeRoute.getStations();
						addToRoute(lastRoute, legacyViaStation, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") :" + e.getMessage();
						writeConsoleError(message);
						throw e;
					}		
				}
			} else {
				//we stay in the same route
				try {
					addToRoute(lastRoute, legacyViaStation, country);
				} catch (ConverterException e) {
					String message = "error in series: " + Integer.toString(series.getNumber()) + " station ignored!) : " + e.getMessage();
					writeConsoleError(message);
				}		
			}
		}
		
		//handle arrival
		
	
		if (series.getType() == LegacySeriesType.TRANSIT || series.getType() == LegacySeriesType.BORDER_DESTINATION) {
			int borderpointcode = getBorderPointCode(tool, series.getToStation());
			ConnectionPoint exit = findConnectionPoint(tool,borderpointcode,arrivalStation);
			if (exit == null) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + "connection point missing";
				writeConsoleError(message);
				throw new ConverterException(message);
			}
			constraint.setExitConnectionPoint(exit);
		}
		
		ViaStation via = GtmFactory.eINSTANCE.createViaStation();
		via.setStation(arrivalStation);
		via.setFareStationSet(arrivalFareStation);
		mainRoute.add(via);			
		setDescription(mainViaStation);
		
		constraint.setDataDescription(mainViaStation.getDataDescription());
		
		return constraint;
	}
	
	private void setDescription(ViaStation via) {
		if (via == null) return;
		via.setDataDescription(via.getDescription());
		if (via.getRoute() != null && via.getRoute().getStations() != null &&  !via.getRoute().getStations().isEmpty())
		for (ViaStation v1 : via.getRoute().getStations() ) {
			v1.setDataDescription(v1.getDescription());
		}
		if (via.getAlternativeRoutes() != null && !via.getAlternativeRoutes().isEmpty()) {
			for (AlternativeRoute ar :  via.getAlternativeRoutes()) {
				if (ar.getStations() != null && !ar.getStations().isEmpty()) {
				  for (ViaStation v2: ar.getStations()){
					  v2.setDataDescription(v2.getDescription());
				  }
				}
			}
		}
		
		
	}

	private static ConnectionPoint findConnectionPoint(GTMTool tool, int borderpointcode, Station station) {
		ConnectionPoint point = findConnectionPointviaBorderPointCode(tool,borderpointcode);
		if (point != null) return point;
		
		point = tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().findSimpleConnectionPoint(station);
		return point;
	}


	private void addToRoute(EList<ViaStation> lastRoute, LegacyViastation legacyViaStation, Country country) throws ConverterException {
		ViaStation via = GtmFactory.eINSTANCE.createViaStation();
		int code = legacyViaStation.getCode();
		Station station = getStation(tool, country,code);
		if (station != null) {
			via.setStation(station);
		} 
		FareStationSetDefinition fareStation = findFareStation(code);
		if (fareStation != null) {
			via.setFareStationSet(fareStation);
		}
		if (station != null || fareStation != null) {
			lastRoute.add(via);
		} else {
			String message = "station not found: " + Integer.toString(code);
			writeConsoleError(message);
			throw new ConverterException(message);
		}
	}

	public Station getStation(GTMTool tool, Country country, int localCode) throws ConverterException {
		
		//mapped station?
		
		Station station = tool.getConversionFromLegacy().getParams().getLegacyStationMappings().findMappedStation(localCode);
		if (station != null) {
			return station;
		}
		ServiceConstraint constraint = tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().findServiceConstraint(localCode);
		if (constraint != null){
			return null;
		}
			
		//borderpoint?	
		if (tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings() != null) {
			LegacyBorderPointMapping map = tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings().getMappingByBorderPointCode(localCode);
			if (map != null) {
				station = map.getStation();
			}
		}
		
		//real station
		station = localStations.get(Integer.valueOf(localCode));

		if (station == null) {
			String message = "station not found station unknown: " + Integer.toString(localCode) ;
			writeConsoleError(message);
		}
		return station;
	}
	

	public Price convertSeriesToPrice(GTMTool tool, LegacySeries series, FareTemplate fareTemplate, Country country, DateRange dateRange) throws ConverterException{
		
		Price price = GtmFactory.eINSTANCE.createPrice();
		price.setDataSource(DataSource.CONVERTED);
			
		try {
			Float amount = null;
			if (fareTemplate.getServiceClass().getClassicClass() == ClassicClassType.FIRST) {
				amount = getAdultAmount(tool, series,1,dateRange);
			} else {
				amount = getAdultAmount(tool, series,2,dateRange);	
			}	
			if (amount == null) return null;

			amount = amount * fareTemplate.getPriceFactor();
			
			// 2 digits for EUR
			double scale = Math.pow(10, 2);
		    amount = (float) (Math.round(amount * scale) / scale);
			
		
			CurrencyPrice curPrice = GtmFactory.eINSTANCE.createCurrencyPrice();
			curPrice.setAmount(amount);
			curPrice.setCurrency(tool.getCodeLists().getCurrencies().findCurrency("EUR"));
		
			VATDetail vatDetail = GtmFactory.eINSTANCE.createVATDetail();
			vatDetail.setPercentage(tool.getConversionFromLegacy().getParams().getVATpercentage());
			vatDetail.setCountry(country);
			vatDetail.setTaxId(tool.getConversionFromLegacy().getParams().getTaxId());
			vatDetail.setScope(TaxScope.ANY);
			vatDetail.setAmount(amount * tool.getConversionFromLegacy().getParams().getVATpercentage()/100);
			curPrice.getVATdetails().add(vatDetail);
		
			price.getCurrencies().add(curPrice);

			return price;
		
		} catch (Exception e) {
			String message = "Price calculation failed for series: (" + Integer.toString(series.getNumber()) + ")";
			writeConsoleError(message);
			return null;
		}
		
	}
	
	private static Float getAdultAmount(GTMTool tool, LegacySeries series, int travelClass, DateRange dateRange) {
		
		if (series.getPricetype() == LegacyCalculationType.ROUTE_BASED) {
			
			for (LegacyRouteFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()){
			
				if (fare.getSeriesNumber() == series.getNumber() 
						&& ( fare.getValidFrom().before(dateRange.getStartDate())
								|| fare.getValidFrom().equals(dateRange.getStartDate()) )
						&& ( fare.getValidUntil().after(dateRange.getEndDate())
							   ||fare.getValidUntil().equals(dateRange.getEndDate()) ) )  {
					if (travelClass == 1) {
						return ((float) fare.getFare1st())/100; 
					} else {
						return ((float) fare.getFare2nd())/100; 			
					}
				}
			}
		}  else {
			float price = 0;
			
			int distance = 0;
			if (travelClass == 1) {
				distance = series.getDistance1();
				//distance = 0 indicates no price in that class!
				if (distance== 0) return null;
			} else {
				distance = series.getDistance2();
				//distance = 0 indicates no price in that class!
				if (distance == 0) return null;
			}
			
			
					
			//get the lowest price where the distance is ok
			for (LegacyDistanceFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares().getDistanceFare()) {
				if ( (     fare.getValidFrom().before(dateRange.getStartDate())
						|| fare.getValidFrom().equals(dateRange.getStartDate()) )
					&& ( fare.getValidUntil().after(dateRange.getEndDate())
					   ||fare.getValidUntil().equals(dateRange.getEndDate()) ) )  {
				
					if (travelClass == 1) {
						if (distance > fare.getDistance() && fare.getFare1st() > price) {
							price = fare.getFare1st();
						}
					} else {
						if (distance > fare.getDistance() && fare.getFare2nd() > price) {
							price = fare.getFare2nd();
						}				
					}
				}
			}
			
			return price/100;
		}
		return null;
	}

	


	public FareElement convertSeriesToFare(GTMTool tool, LegacySeries series, FareTemplate fareTemplate, int direction) throws ConverterException{
		
		FareElement fare = GtmFactory.eINSTANCE.createFareElement();
		LegacyAccountingIdentifier accountingIdentifier = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		accountingIdentifier.setAddSeriesId(0);
		accountingIdentifier.setTariffId(0);
		accountingIdentifier.setSeriesId(series.getNumber());
		fare.setLegacyAccountingIdentifier(accountingIdentifier);
		fare.setDataSource(DataSource.CONVERTED);
		fare.setAfterSalesRule(fareTemplate.getAfterSalesRule());
		
		
		
		fare.setCarrierConstraint(carrierConstraints.get(series.getCarrierCode()));
		if (fare.getCarrierConstraint() == null) {
			fare.setCarrierConstraint(fareTemplate.getCarrierConstraint());
		}
		
		if (isSeparateContract(series)) {
			fare.setCombinationConstraint(fareTemplate.getSeparateContractCombinationConstraint());
		} else {
			fare.setCombinationConstraint(fareTemplate.getCombinationConstraint());
		}
		fare.setDataDescription("converted from series: " + Integer.toString(series.getNumber()) +" and template: " + fareTemplate.getDataDescription());;
		fare.setFareDetailDescription(fareTemplate.getFareDetailDescription());
		fare.setFulfillmentConstraint(fareTemplate.getFulfillmentConstraint());
		
		LegacyAccountingIdentifier legacyAccountingIdentifier = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		legacyAccountingIdentifier.setSeriesId(series.getNumber());
		legacyAccountingIdentifier.setAddSeriesId(direction);
		fare.setLegacyAccountingIdentifier(legacyAccountingIdentifier);
		
		fare.setPassengerConstraint(fareTemplate.getPassengerConstraint());
		fare.setReductionConstraint(fareTemplate.getReductionConstraint());
		fare.setPersonalDataConstraint(fareTemplate.getPersonalDataConstraint());
		fare.setReservationParameter(fareTemplate.getReservationParameter());
		fare.setSalesAvailability(fareTemplate.getSalesAvailability());
		fare.setServiceClass(fareTemplate.getServiceClass());
		fare.setServiceConstraint(fareTemplate.getServiceConstraint());
		fare.setServiceLevel(fareTemplate.getServiceLevel());
		fare.setText(fareTemplate.getText());
		fare.setTravelValidity(fareTemplate.getTravelValidity());
		fare.setType(fareTemplate.getType());
		fare.setLegacyConversion(fareTemplate.getLegacyConversion());
		
		return fare;
		
	}


	private boolean isSeparateContract(LegacySeries series) {
		if (tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries() == null || tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries().isEmpty()) {
			return false;
		}
		for (LegacySeparateContractSeries sep : tool.getConversionFromLegacy().getLegacy108().getLegacySeparateContractSeries().getSeparateContractSeries()) {
			if (sep.getSeriesNumber() == series.getNumber()) return true;
		}
		return false;
	}




	public int convertBorderPoints() {
		
		List<ConnectionPoint> pointList = new ArrayList<ConnectionPoint>();
		
		List<ConnectionPoint> uniquePointList = new ArrayList<ConnectionPoint>();
		
		List<LegacyBorderPointMapping> maps = new ArrayList<LegacyBorderPointMapping>();
		
		for (LegacySeries series : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			List<ConnectionPoint> points = null;
			try {
				points = convertSeriesToConnectionPoints(tool, series);
			} catch (ConverterException e) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + " cannot create connection point";
				writeConsoleError(message);
			}
			if (points != null && !points.isEmpty()) {
				pointList.addAll(points);
			}
		}
		
		for (ConnectionPoint point : pointList ) {
			
			if ( !isContainedInConnectionPointList(uniquePointList, point)) {
				uniquePointList.add(point);
			}
		}		
		
		Command command = AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getConnectionPoints(), GtmPackage.Literals.CONNECTION_POINTS__CONNECTION_POINTS, uniquePointList);
		if  (command != null && command.canExecute()) {
			domain.getCommandStack().execute(command);
		}
		
		
		
		for (ConnectionPoint point : uniquePointList) {
			if (point.getLegacyBorderPointCode() > 0) {
				if (tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings().getMappingByBorderPointCode(point.getLegacyBorderPointCode()) != null) break;
				
				LegacyBorderPointMapping map = GtmFactory.eINSTANCE.createLegacyBorderPointMapping();
				map.setCode(point.getLegacyBorderPointCode());
				map.setConnectionPoint(point);
				maps.add(map);
			}
		}
		
		Command command2 = AddCommand.create(domain, tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings(), GtmPackage.Literals.LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS, maps);
		if  (command2 != null && command2.canExecute()) {
			domain.getCommandStack().execute(command2);
		}
		
		return pointList.size();


	}
	
	private static boolean isContainedInConnectionPointList(List<ConnectionPoint> uniquePointList, ConnectionPoint point) {
		if (uniquePointList == null || uniquePointList.isEmpty()) return false;
		
		for (ConnectionPoint listPoint : uniquePointList) {
			if (listPoint.getLegacyBorderPointCode() == point.getLegacyBorderPointCode()) return true;
		}

		for (ConnectionPoint listPoint : uniquePointList) {
			
			if ( listPoint.getLegacyBorderPointCode() == 0 &&
				 listPoint.getConnectedStationSets() != null &&
				 !listPoint.getConnectedStationSets().isEmpty() &&
				 point.getConnectedStationSets() != null &&
				 !point.getConnectedStationSets().isEmpty()) {
				
				if (point.getConnectedStationSets().get(0).getStations().get(0) ==
					listPoint.getConnectedStationSets().get(0).getStations().get(0)	) {
					//converted points only include one station
					//TODO compare lists
					return true;
				}
		    }
		}
		return false;
	}


	public List<ConnectionPoint> convertSeriesToConnectionPoints(GTMTool tool, LegacySeries series) throws ConverterException{
		 
		List<ConnectionPoint> pointList = new ArrayList<ConnectionPoint>();
			
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = "the country is missing in the conversion parameter";
			writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		//find connection points
		if (series.getType() == LegacySeriesType.TRANSIT) {
			
			ConnectionPoint point = findConnectionPoint(tool, series.getFromStation(), country);
			if (point != null) {
				pointList.add(point);
			}
					
		}
		
		
		if (series.getType() == LegacySeriesType.TRANSIT || series.getType() == LegacySeriesType.BORDER_DESTINATION) {
			ConnectionPoint point = findConnectionPoint(tool, series.getToStation(), country);
			if (point != null) {
				pointList.add(point);
			}
		}
		

		return pointList;
	}





	private ConnectionPoint findConnectionPoint(GTMTool tool, int stationCode, Country country) {

		
		Station station = null;
		try {
			station = getStation(tool, country, stationCode);
		} catch (ConverterException e) {
			// continue
		}
		
		int borderpoint = 0;
		Legacy108Station legacyStation = legacyStations.get(Integer.valueOf(stationCode));
		if (legacyStation != null) {
			borderpoint = legacyStation.getBorderPointCode();
		}
		
		ConnectionPoint point = null;
		
		if (borderpoint > 0) {
			point = findConnectionPointviaBorderPointCode(tool,borderpoint);
			if (point != null){
				//connection point already exists
				return null;
			}
		}
		
		if (station != null) {
			point = tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().findSimpleConnectionPoint(station);
			if (point != null){
				//connection point already exists
				return null;
			}
		}
			
		if (point == null && station != null) {
			//create connectionPoint with a station
			
			ConnectionPoint newPoint = GtmFactory.eINSTANCE.createConnectionPoint();
			newPoint.setDataSource(DataSource.CONVERTED);
			StationSet stationSet = GtmFactory.eINSTANCE.createStationSet();
			stationSet.getStations().add(station);
			newPoint.getConnectedStationSets().add(stationSet);
			newPoint.setLegacyBorderPointCode(borderpoint);
			
			return newPoint;
		} else {
			
			ConnectionPoint newPoint = GtmFactory.eINSTANCE.createConnectionPoint();
			newPoint.setDataSource(DataSource.CONVERTED);
			newPoint.setLegacyBorderPointCode(borderpoint);
			newPoint.setName("incomplete -- stations need to be assigned!");
			
			return newPoint;
		}

	}


	public int convertSalesAvailabilities() {
		
		ArrayList<DateRange> validityRanges = new ArrayList<DateRange>();

		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			ArrayList<DateRange> seriesRanges = findValidRanges (series);
			
			if (validityRanges.isEmpty()) validityRanges.addAll(seriesRanges);
			
			DateRange.addUniqueRanges(validityRanges, seriesRanges);
			
			
		}
		
		CompoundCommand command = new CompoundCommand();
		
		for ( DateRange r : validityRanges) {
			
			SalesAvailabilityConstraint constraint = GtmFactory.eINSTANCE.createSalesAvailabilityConstraint();
			constraint.setDataSource(DataSource.CONVERTED);
			SalesRestriction rest = GtmFactory.eINSTANCE.createSalesRestriction();
			Calendar cal = GtmFactory.eINSTANCE.createCalendar();
			cal.setDataSource(DataSource.CONVERTED);
			cal.setFromDate(r.startDate);
			cal.setUntilDate(r.getEndDate());
			TimeZone tz = TimeZone.getTimeZone(tool.getConversionFromLegacy().getLegacy108().getTimeZone().getName());
			if (tz != null) {
				cal.setUtcOffset(tz.getOffset(new Date().getTime()) / 1000 / 60 );
			}
			
			if (tool.getConversionFromLegacy().getParams().getStartOfSale()!= null) {
				rest.setStartOfSale((StartOfSale) EcoreUtil.copy(tool.getConversionFromLegacy().getParams().getStartOfSale()));
			}
			if (tool.getConversionFromLegacy().getParams().getEndOfSale()!= null) {
				rest.setEndOfSale((EndOfSale) EcoreUtil.copy(tool.getConversionFromLegacy().getParams().getEndOfSale()));
			}			

			constraint.getRestrictions().add(rest);
						
			command.append(AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getCalendars() , GtmPackage.Literals.CALENDARS__CALENDARS, cal));
			command.append(AddCommand.create(domain, tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints(),GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS , constraint));
			
		}
		
		if (!command.isEmpty()) {
			if (command.canExecute()) {
				domain.getCommandStack().execute(command);
			}
		}
		
		return validityRanges.size();
	}



	/*
	 * extracts zone definition from the 108 station data and create zone definitions
	 * 
	 * Zones in 108 are identified by a zone number  in the station data. all stations with this zone number belong to the zone. one 
	 * of the stations is a virtual station which can be references as departure or arrival station
	 * 
	 * for one zone:
	 * 		generate a zone mapping for the virtual station
	 * 		generate a zone definition
	 * 
	 */
	public int convertFareStationSets() {
		
		HashMap<Integer,HashSet<Legacy108Station>> stationList = new HashMap<Integer,HashSet<Legacy108Station>>();

		//create list of zones
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			if (station.getFareReferenceStationCode() > 0) {
				Integer code = Integer.valueOf(station.getFareReferenceStationCode());
				
				if (stationList.get(code) != null) {
					stationList.get(code).add(station);
				} else {
					stationList.put(code,new HashSet<Legacy108Station>());
					stationList.get(code).add(station);
				}
				
			}
		}
		
		//create FareStationSets
		
		FareStationSetDefinitions fareStationSetDefinitions = GtmFactory.eINSTANCE.createFareStationSetDefinitions();
		LegacyFareStationSetMappings fareStationSetMappings = GtmFactory.eINSTANCE.createLegacyFareStationSetMappings();
		
		for (Integer code : stationList.keySet()) {
			
			FareStationSetDefinition def = GtmFactory.eINSTANCE.createFareStationSetDefinition();
			LegacyFareStationSetMap map = GtmFactory.eINSTANCE.createLegacyFareStationSetMap();
			fareStationSetDefinitions.getFareStationSetDefinitions().add(def);
			fareStationSetMappings.getLegacyFareStationSetMap().add(map);
			map.setLegacyCode(code.intValue());
			map.setStationSet(def);
			def.setDataSource(DataSource.CONVERTED);
			def.setCode(code.toString());
			def.setCarrier(tool.getConversionFromLegacy().getLegacy108().getCarrier());
			def.setLegacyCode(code.intValue());

			
			for (Legacy108Station legacyStation : stationList.get(code)) {
				
				if (legacyStation.getStationCode() == legacyStation.getFareReferenceStationCode())  {
					//this is the station defining the name
					def.setName(legacyStation.getName());
					def.setNameUtf8(legacyStation.getNameUTF8());
				} else {
				
					Station station = null;
					try {
						station = getStation(tool, myCountry, legacyStation.getStationCode());
					} catch (ConverterException e) {
						// TODO Auto-generated catch block
						station = null;
					}
			
					if (station != null) {
						def.getStations().add(station);
					} else {
						// something strange happend
						String message = "error in stations: " + Integer.toString(legacyStation.getStationCode()) + "unknown station, no mapping available";
						writeConsoleError(message);
					}
				}
				
			}
			
		}
		
		Command cmd = SetCommand.create(domain,tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS, fareStationSetDefinitions);
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
		} else {
			return 0;
		}

		if (fareStationSetDefinitions.getFareStationSetDefinitions().size() == 0) return 0;
		
		Command cmd2 = SetCommand.create(domain,tool.getConversionFromLegacy().getParams(), GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS, fareStationSetMappings);
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd2);
			return fareStationSetMappings.getLegacyFareStationSetMap().size();
		} else {
			return 0;
		}

	}


	/*
	 * add a stationName list to the gtm data with the content of the TCVG import data
	 */

	public int convertStationNames() {
		
		StationNames stationNames = GtmFactory.eINSTANCE.createStationNames();
				
		for (Legacy108Station lStation : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {

			Station station;
			try {
				station = getStation(tool,myCountry,lStation.getStationCode());
				if (station != null) {
					station.setNameCaseASCII(lStation.getName());
					station.setNameCaseUTF8(lStation.getNameUTF8());
					stationNames.getStationName().add(station);
				}
			} catch (ConverterException e) {
				// only names
			}

		}

		CompoundCommand command = new CompoundCommand();
		command.append(SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__STATION_NAMES, stationNames));
		
		executeAndFlush(command,domain);
		
		return 0;
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
		if (editor == null || message == null || message.length() == 0) return;
		editor.getSite().getShell().getDisplay().asyncExec(() -> {
			ConsoleUtil.printError("Errors", message);
		});
	}
	
	
	
}