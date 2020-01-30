package actions.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AlternativeRoute;
import Gtm.Calendar;
import Gtm.ClassicClassType;
import Gtm.ConnectionPoint;
import Gtm.Country;
import Gtm.CurrencyPrice;
import Gtm.DataSource;
import Gtm.EndOfSale;
import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108Station;
import Gtm.LegacyAccountingIdentifier;
import Gtm.LegacyCalculationType;
import Gtm.LegacyDistanceFare;
import Gtm.LegacyRouteFare;
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
import Gtm.StationSet;
import Gtm.TargetFareTemplate;
import Gtm.TaxScope;
import Gtm.VATDetail;
import Gtm.ViaStation;
import actions.GtmUtils;

public class ConverterUtil {
	
	public static int deleteOldConversionResults(GTMTool tool, EditingDomain editingDomain) {
		int deleted = 0;

		CompoundCommand command = new CompoundCommand();
		
		for (FareElement fare : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (fare.getDataSource() == DataSource.GENERATED) {
				command.append(DeleteCommand.create(editingDomain, fare) );
			}
		}
		for (RegionalConstraint region : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			if (region.getDataSource() == DataSource.GENERATED) {
				command.append(DeleteCommand.create(editingDomain, region) );
			}
		}
		for (Price price : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			if (price.getDataSource() == DataSource.GENERATED) {
				command.append(DeleteCommand.create(editingDomain, price) );
			}
		}		
		
		for (ConnectionPoint point : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (point.getDataSource() == DataSource.GENERATED) {
				command.append(DeleteCommand.create(editingDomain, point) );
			}
		}			
		
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sa.getDataSource() == DataSource.GENERATED) {
				command.append(DeleteCommand.create(editingDomain, sa) );
			}
		}		
		
		for (Calendar sa : tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars()) {
			if (sa.getDataSource() == DataSource.GENERATED) {
				command.append(DeleteCommand.create(editingDomain, sa) );
			}
		}	
		
		
		if (!command.isEmpty()) {
			
			if (command.canExecute()) {
				editingDomain.getCommandStack().execute(command);
			} else {
				String message = "could not delete old converted data";
				GtmUtils.writeConsoleError(message);
			}
		}
		
		return deleted;
	}


	public static int convert(GTMTool tool, EditingDomain editingDomain) {
		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = "the country is missing in the conversion parameter";
			GtmUtils.writeConsoleError(message);
			return 0;
		}
		
		ArrayList<Price> priceList = new ArrayList<Price>();
		
		int added = 0;
		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			ArrayList<DateRange> validityRanges = findValidRanges (tool, series);
			
			RegionalConstraint regionalConstraint = null;
			try {
				regionalConstraint = convertSeriesToRegionalConstraint(tool, series);
			} catch (ConverterException e) {
				//continue
			}
			
			RegionalConstraint regionalConstraintR = null;
			try {
				regionalConstraintR = convertSeriesToReversedRegionalConstraint(tool, series);
			} catch (ConverterException e) {
				//continue
			}
			
			
			for (TargetFareTemplate fareTemplate: tool.getConversionFromLegacy().getParams().getLegacyTargetFares().getTargetFares()) {
				
				try {
					convertSeries(tool, series, fareTemplate, editingDomain, added,validityRanges, regionalConstraint, regionalConstraintR,priceList);
					added++;
				} catch (ConverterException e) {
					// error already logged
				}
			}
		}
		return added;
	}

	public static void convertSeries(GTMTool tool, LegacySeries series, TargetFareTemplate fareTemplate, EditingDomain domain, int number, ArrayList<DateRange>validityRanges,RegionalConstraint  regionalConstraint,RegionalConstraint  regionalConstraintR, ArrayList<Price> priceList) throws ConverterException{

		
		for (DateRange dateRange : validityRanges) {
			convertSeriesToFares(tool, series, fareTemplate,domain,number, dateRange, regionalConstraint,regionalConstraintR ,priceList);
		}
		
	}
	
	public static void convertSeriesToFares(GTMTool tool, LegacySeries series, TargetFareTemplate fareTemplate, EditingDomain domain, int number,DateRange dateRange, RegionalConstraint regionalConstraint, RegionalConstraint regionalConstraintR, ArrayList<Price> priceList) throws ConverterException{
		
		try {
			
			Price price = convertSeriesToPrice(tool, series,fareTemplate, tool.getConversionFromLegacy().getParams().getCountry(), dateRange);
			
			Price oldPrice = findPrice(price, priceList);
			boolean createNewPrice = false;
			if (oldPrice == null) {
				createNewPrice = true;
			} else {
				price=oldPrice;
			}
			
			if (price == null) {
				String message = "could not calculate price " + Integer.toString(series.getNumber());
				GtmUtils.writeConsoleError(message);
			}
			
			FareElement fareElement = convertSeriesToFare(tool, series, fareTemplate, 1);
			fareElement.setPrice(price);
			fareElement.setRegionalConstraint(regionalConstraint);
			
			fareElement.setSalesAvailability(findSalesAvailability(tool,dateRange));
			
			fareElement.getLegacyAccountingIdentifier().setTariffId(number);
			
			
			Price priceR = convertSeriesToPrice(tool, series,fareTemplate, tool.getConversionFromLegacy().getParams().getCountry(), dateRange);
			Price oldPriceR = findPrice(priceR, priceList);
			boolean createNewPriceR = false;
			if (oldPriceR == null) {
				createNewPriceR = true;
			} else {
				priceR=oldPriceR;
			}			
			
			
			
			
			FareElement fareElementR = convertSeriesToFare(tool, series, fareTemplate, 2);
			fareElementR.getLegacyAccountingIdentifier().setTariffId(number);
			fareElementR.setPrice(priceR);
			fareElementR.setRegionalConstraint(regionalConstraintR);
			
			//get service constraints
			ServiceConstraint serviceConstraint = null;
			for (LegacyViastation via : series.getViastations()) {
				serviceConstraint = tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().findServiceConstraint(via.getCode());
			}
			if (serviceConstraint != null) {
				fareElement.setServiceConstraint(serviceConstraint);
				fareElementR.setServiceConstraint(serviceConstraint);
			}
			
			CompoundCommand command = new CompoundCommand();
			if (regionalConstraint != null) {
				command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints(), regionalConstraint) );
			}
			if (regionalConstraintR != null) {
				command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints(), regionalConstraintR) );
			}
			if (price != null && createNewPrice) {
				command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices(), price) );
			}
			if (priceR != null && createNewPriceR) {
				command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices(), priceR) );
			}
			if (fareElement != null) {
				command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements(), fareElement) );			
			}
			if (fareElementR != null) {
				command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements(), fareElementR) );			
			}
			
			if (!command.isEmpty() && command.canExecute()) {
				domain.getCommandStack().execute(command);
			} else {
				String message = "error in series: " + Integer.toString(series.getNumber()) + " conversion of this series failed";
				GtmUtils.writeConsoleError(message);
				throw new ConverterException(message);
			}
			
			
		} catch (ConverterException e) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " conversion of this series failed";
			GtmUtils.writeConsoleError(message);
			throw new ConverterException(message);
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


	private static ArrayList<DateRange> findValidRanges(GTMTool tool, LegacySeries series) {
				
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


	private static RegionalConstraint convertSeriesToReversedRegionalConstraint(GTMTool tool, LegacySeries series) throws ConverterException {
		RegionalConstraint constraint = GtmFactory.eINSTANCE.createRegionalConstraint();
		constraint.setDataSource(DataSource.CONVERTED);
		constraint.setDistance( (series.getDistance1() + series.getDistance2())/2 );
		
		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();
		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = "the country is missing in the conversion parameter";
			GtmUtils.writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		
		//get arrival and departure stations
		Station departureStation = null;
		try {
			departureStation = getStation(tool, country, series.getToStation());
		} catch (ConverterException e) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " " + e.getMessage();
			GtmUtils.writeConsoleError(message);
			throw new ConverterException(message);
		}
			

		
		Station arrivalStation = null;
		try {
			arrivalStation = getStation(tool, country, series.getToStation());
		} catch (ConverterException e) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " " + e.getMessage();
			GtmUtils.writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		//find connection points
		if (series.getType() == LegacySeriesType.TRANSIT) {
			
			int borderpointcode = getBorderPointCode(tool, series.getToStation());
			ConnectionPoint entry = findConnectionPoint(tool,borderpointcode,arrivalStation);
			if (entry == null) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + "connection point missing for transit series";
				GtmUtils.writeConsoleError(message);
				throw new ConverterException(message);
			}
			constraint.setEntryConnectionPoint(entry);
		}

		
		region.setSeqNb(1);
		ViaStation mainViaStation = GtmFactory.eINSTANCE.createViaStation();
		region.setViaStation(mainViaStation);
		mainViaStation.setRoute(GtmFactory.eINSTANCE.createRoute());
		
		if (series.getType() == LegacySeriesType.TRANSIT || series.getType() == LegacySeriesType.BORDER_DESTINATION) {
			int borderpointcode = getBorderPointCode(tool, series.getFromStation());
			ConnectionPoint exit = findConnectionPoint(tool,borderpointcode,departureStation);
			if (exit == null) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + "connection point missing";
				GtmUtils.writeConsoleError(message);
				throw new ConverterException(message);
			}
			constraint.setExitConnectionPoint(exit);
		}


		ViaStation viaDeparture = GtmFactory.eINSTANCE.createViaStation();
		viaDeparture.setStation(departureStation);
		
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
						addToRoute(lastRoute, legacyViaStation, tool, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
						GtmUtils.writeConsoleError(message);
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
						addToRoute(lastRoute, legacyViaStation, tool, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
						GtmUtils.writeConsoleError(message);
						throw new ConverterException(message);
					}					
				} else {
					// add another alternative
					lastPosition = legacyViaStation.getPosition();
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					try {
						alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
						lastRoute = alternativeRoute.getStations();						
						addToRoute(lastRoute, legacyViaStation, tool, country);
					} catch (ConverterException e) {
						GtmUtils.writeConsoleError("error in series: " + Integer.toString(series.getNumber()) + ") :" + e.getMessage());
						throw e;
					}		
				}
			} else {
				try {
					addToRoute(lastRoute, legacyViaStation, tool, country);
				} catch (ConverterException e) {
					String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
					GtmUtils.writeConsoleError(message);
					throw new ConverterException(message);
				}		
			}
		}
		

		Station arrival = getStation(tool, country,series.getFromStation());
		if (arrival == null) {
			//replacement of border point needed?
			return null;
		} else {
			ViaStation via = GtmFactory.eINSTANCE.createViaStation();
			via.setStation(arrival);
			mainRoute.add(via);
		}

		return constraint;
	}
	
	private static int getBorderPointCode(GTMTool tool, int stationcode) {
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
			if (station.getStationCode() == stationcode) return station.getBorderPointCode();
		}
		return 0;
	}


	public static ConnectionPoint findConnectionPointviaBorderPointCode (GTMTool tool, int borderpointcode) {
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


	public static RegionalConstraint convertSeriesToRegionalConstraint(GTMTool tool, LegacySeries series) throws ConverterException{
		
		RegionalConstraint constraint = GtmFactory.eINSTANCE.createRegionalConstraint();
		constraint.setDataSource(DataSource.CONVERTED);
		
		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();

		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = "the country is missing in the conversion parameter";
			GtmUtils.writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		region.setSeqNb(1);
		constraint.getRegionalValidity().add(region);
		ViaStation mainViaStation = GtmFactory.eINSTANCE.createViaStation();
		mainViaStation.setRoute(GtmFactory.eINSTANCE.createRoute());
		region.setViaStation(mainViaStation);
		
		//get arrival and departure stations
		
		Station departureStation = getStation(tool, country, series.getFromStation());
		if (departureStation == null) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " - station unknown: " + Integer.toString(series.getToStation()) ;
			GtmUtils.writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		Station arrivalStation = getStation(tool, country, series.getToStation());
		if (arrivalStation == null) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " - station unknown: " + Integer.toString(series.getFromStation()) ;
			GtmUtils.writeConsoleError(message);
			throw new ConverterException(message);
		}
		
		//find connection points
		if (series.getType() == LegacySeriesType.TRANSIT) {
			
			int borderpointcode = getBorderPointCode(tool, series.getFromStation());
			ConnectionPoint entry = findConnectionPoint(tool,borderpointcode,departureStation);
			if (entry == null) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + "connection point missing for transit series";
				GtmUtils.writeConsoleError(message);
				throw new ConverterException(message);
			}
			constraint.setEntryConnectionPoint(entry);
		}

		
		if (series.getType() == LegacySeriesType.TRANSIT || series.getType() == LegacySeriesType.BORDER_DESTINATION) {
			int borderpointcode = getBorderPointCode(tool, series.getToStation());
			ConnectionPoint exit = findConnectionPoint(tool,borderpointcode,arrivalStation);
			if (exit == null) {
				String message = "error in series: " + Integer.toString(series.getNumber()) + "connection point missing";
				GtmUtils.writeConsoleError(message);
				throw new ConverterException(message);
			}
			constraint.setExitConnectionPoint(exit);
		}
		
		//create route
		
		ViaStation viaDeparture = GtmFactory.eINSTANCE.createViaStation();
		viaDeparture.setStation(departureStation);
		
		
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
						addToRoute(lastRoute, legacyViaStation, tool, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
						GtmUtils.writeConsoleError(message);
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
						addToRoute(lastRoute, legacyViaStation, tool, country);
					} catch (ConverterException e) {
						String message = "error in series: " + Integer.toString(series.getNumber()) + ") : " + e.getMessage();
						GtmUtils.writeConsoleError(message);
						throw new ConverterException(message);
					}					
				} else {
					// add another alternative				
					lastPosition = legacyViaStation.getPosition();
					AlternativeRoute alternativeRoute = GtmFactory.eINSTANCE.createAlternativeRoute();
					try {
						alternativeRoutesVia.getAlternativeRoutes().add(alternativeRoute);
						lastRoute = alternativeRoute.getStations();
						addToRoute(lastRoute, legacyViaStation, tool, country);
					} catch (ConverterException e) {
						GtmUtils.writeConsoleError("error in series: " + Integer.toString(series.getNumber()) + ") :" + e.getMessage());
						throw e;
					}		
				}
			} else {
				//we stay in the same route
				try {
					addToRoute(lastRoute, legacyViaStation, tool, country);
				} catch (ConverterException e) {
					String message = "error in series: " + Integer.toString(series.getNumber()) + " station ignored!) : " + e.getMessage();
					GtmUtils.writeConsoleError(message);
				}		
			}
		}
		

		ViaStation via = GtmFactory.eINSTANCE.createViaStation();
		via.setStation(arrivalStation);
		mainRoute.add(via);

		return constraint;
	}
	
	private static ConnectionPoint findConnectionPoint(GTMTool tool, int borderpointcode, Station station) {
		ConnectionPoint point = findConnectionPointviaBorderPointCode(tool,borderpointcode);
		if (point != null) return point;
		
		point = tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().findSimpleConnectionPoint(station);
		return point;
	}


	private static void addToRoute(EList<ViaStation> lastRoute, LegacyViastation legacyViaStation, GTMTool tool,
			Country country) throws ConverterException {
		ViaStation via = GtmFactory.eINSTANCE.createViaStation();
		Station station = getStation(tool, country,legacyViaStation.getCode());
		if (station != null) {
			via.setStation(station);
			lastRoute.add(via);
		} 
	}

	public static Station getStation(GTMTool tool, Country country, int localCode) throws ConverterException {
		
		//mapped station?
		
		Station station = tool.getConversionFromLegacy().getParams().getLegacyStationMappings().findMappedStation(localCode);
		if (station != null) {
			return station;
		}
		ServiceConstraint constraint = tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().findServiceConstraint(localCode);
		if (constraint != null){
			return null;
		}
		station = tool.getCodeLists().getStations().findStation(country.getCode(), localCode);
		
		if (station == null) {
			String message = "station not foundstation unknown: " + Integer.toString(localCode) ;
			GtmUtils.writeConsoleError(message);
			throw new ConverterException(message);
		}
		return station;
	}
	

	public static Price convertSeriesToPrice(GTMTool tool, LegacySeries series, TargetFareTemplate fareTemplate, Country country, DateRange dateRange) throws ConverterException{
		
		Price price = GtmFactory.eINSTANCE.createPrice();
		price.setDataSource(DataSource.CONVERTED);
		
		boolean returnFare = false;
		if (fareTemplate.getTravelValidity() != null &&
			fareTemplate.getTravelValidity().getReturnConstraint()!= null) {
			returnFare = true;
		}
		
		try {
			Float amount = null;
			//TODO special logic for zero price
		if (fareTemplate.getServiceClass().getClassicClass() == ClassicClassType.FIRST) {
			amount = getAdultAmount(tool, series,1,returnFare,dateRange);
		} else {
			amount = getAdultAmount(tool, series,2,returnFare,dateRange);			
		}
		
		if (amount == null) return null;

		amount = amount * fareTemplate.getPriceFactor();
		
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
			GtmUtils.writeConsoleError(message);
			return null;
		}
		
	}
	
	private static Float getAdultAmount(GTMTool tool, LegacySeries series, int travelClass, boolean returnFare, DateRange dateRange) {
		
		if (series.getPricetype() == LegacyCalculationType.ROUTE_BASED) {
			
			for (LegacyRouteFare fare : tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares().getRouteFare()){
				if ( (     fare.getValidFrom().before(dateRange.getStartDate())
						|| fare.getValidFrom().equals(dateRange.getStartDate()) )
					&& ( fare.getValidUntil().after(dateRange.getEndDate())
					   ||fare.getValidUntil().equals(dateRange.getEndDate()) ) )  {
				
					if (fare.getSeriesNumber() == series.getNumber()) {
						if (travelClass == 1) {
							if (returnFare) {							
								return ((float) fare.getReturnFare1st())/200; 
							} else {
								return ((float) fare.getFare1st())/100; 
							}
						} else {
							if (returnFare) {
								return ((float) fare.getReturnFare2nd())/200; 			
							} else {
								return ((float) fare.getFare2nd())/100; 			
							}
						}
					}	
				}
			}
		}  else {
			float price = 0;
			
			int distance = 0;
			if (travelClass == 1) {
				distance = series.getDistance1();
			} else {
				distance = series.getDistance2();					
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

	


	public static FareElement convertSeriesToFare(GTMTool tool, LegacySeries series, TargetFareTemplate template, int direction) throws ConverterException{
		
		FareElement fare = GtmFactory.eINSTANCE.createFareElement();
		fare.setAfterSalesRule(template.getAfterSalesRule());
		fare.setCarrierConstraint(template.getCarrierConstraint());
		fare.setCombinationConstraint(template.getCombinationConstraint());
		fare.setDataDescription("converted from series: " + Integer.toString(series.getNumber()) +" and temolate: " + template.getDataDescription());;
		fare.setFareDetailDescription(template.getFareDetailDescription());
		fare.setFulfillmentConstraint(template.getFulfillmentConstraint());
		
		LegacyAccountingIdentifier legacyAccountingIdentifier = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		legacyAccountingIdentifier.setSeriesId(series.getNumber());
		legacyAccountingIdentifier.setSeriesId(direction);
					
		fare.setLegacyAccountingIdentifier(legacyAccountingIdentifier);
		fare.setPassengerConstraint(template.getPassengerConstraint());
		fare.setReductionConstraint(template.getReductionConstraint());
		fare.setPersonalDataConstraint(template.getPersonalDataConstraint());
		fare.setReservationParameter(template.getReservationParameter());
		fare.setSalesAvailability(template.getSalesAvailability());
		fare.setServiceClass(template.getServiceClass());
		fare.setServiceConstraint(template.getServiceConstraint());
		fare.setServiceLevel(template.getServiceLevel());
		fare.setText(template.getText());
		fare.setTravelValidity(template.getTravelValidity());
		fare.setType(template.getType());
		
		return fare;

		

		
	}


	public static int convertBorderPoints(GTMTool tool, EditingDomain domain) {
		
		List<ConnectionPoint> pointList = new ArrayList<ConnectionPoint>();
		
		List<ConnectionPoint> uniquePointList = new ArrayList<ConnectionPoint>();
		
		for (LegacySeries series : tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			List<ConnectionPoint> points = null;
			try {
				points = convertSeriesToConnectionPoints(tool, series);
			} catch (ConverterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
			return uniquePointList.size();
		}
		return 0;


	}
	
	private static boolean isContainedInConnectionPointList(List<ConnectionPoint> uniquePointList, ConnectionPoint point) {
		if (uniquePointList == null || uniquePointList.isEmpty()) return false;
		
		for (ConnectionPoint listPoint : uniquePointList) {
			if (listPoint.getLegacyBorderPointCode() == point.getLegacyBorderPointCode()) return true;
		}
		
		if (point.getLegacyBorderPointCode() > 0) return false;

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


	public static List<ConnectionPoint> convertSeriesToConnectionPoints(GTMTool tool, LegacySeries series) throws ConverterException{
		 
		List<ConnectionPoint> pointList = new ArrayList<ConnectionPoint>();
			
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = "the country is missing in the conversion parameter";
			GtmUtils.writeConsoleError(message);
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





	private static ConnectionPoint findConnectionPoint(GTMTool tool, int stationCode, Country country) {

		
		Station station = null;
		try {
			station = getStation(tool, country, stationCode);
		} catch (ConverterException e) {
			// continue
		}
		
		int borderpoint = 0;
		Legacy108Station legacyStation = tool.getConversionFromLegacy().getLegacy108().getLegacyStations().findStation(stationCode);
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


	public static int convertSalesAvailabilities(GTMTool tool, EditingDomain domain) {
		
		ArrayList<DateRange> validityRanges = new ArrayList<DateRange>();

		for (LegacySeries series: tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList().getSeries()) {
			
			ArrayList<DateRange> seriesRanges = findValidRanges (tool, series);
			
			if (validityRanges.isEmpty()) validityRanges.addAll(seriesRanges);
			
			DateRange.addUniqueRanges(validityRanges, seriesRanges);
			
			
		}
		
		CompoundCommand command = new CompoundCommand();
		
		for ( DateRange r : validityRanges) {
			
			SalesAvailabilityConstraint constraint = GtmFactory.eINSTANCE.createSalesAvailabilityConstraint();
			constraint.setDataSource(DataSource.CONVERTED);
			SalesRestriction rest = GtmFactory.eINSTANCE.createSalesRestriction();
			Calendar cal = GtmFactory.eINSTANCE.createCalendar();
			cal.setFromDate(r.startDate);
			cal.setUntilDate(r.getEndDate());
			TimeZone tz = TimeZone.getTimeZone(tool.getConversionFromLegacy().getLegacy108().getTimeZone().getName());
			if (tz != null) {
				cal.setUtcOffset(tz.getOffset(new Date().getTime()) / 1000 / 60 );
			}
			rest.setSalesDates(cal);
			
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
}
