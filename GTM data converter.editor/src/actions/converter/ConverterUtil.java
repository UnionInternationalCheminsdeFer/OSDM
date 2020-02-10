package Gtm.actions.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
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
import Gtm.LegacyBorderPointMapping;
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
import Gtm.actions.GtmUtils;

public class ConverterUtil {
	
	
	
	private HashMap<Integer,Station> localStations = null;
	private HashMap<Integer,Legacy108Station> legacyStations = null;
	
	public ConverterUtil() {
		localStations = new HashMap<Integer,Station>();
		legacyStations = new HashMap<Integer,Legacy108Station>();
	}
	
	public static int deleteOldConversionResults(GTMTool tool, EditingDomain editingDomain) {
		int deleted = 0;

		CompoundCommand command = new CompoundCommand();
		
		for (FareElement fare : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (fare.getDataSource() == DataSource.CONVERTED) {
				command.append(RemoveCommand.create(editingDomain, fare) );
			}
		}
		for (RegionalConstraint region : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			if (region.getDataSource() == DataSource.CONVERTED) {
				command.append(RemoveCommand.create(editingDomain, region) );
			}
		}
		for (Price price : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			if (price.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(editingDomain, price) );
			}
		}		
		
		for (ConnectionPoint point : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (point.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(editingDomain, point) );
			}
		}			
		
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
				command.append(DeleteCommand.create(editingDomain, sa) );
			}
		}		
		
		for (Calendar sa : tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars()) {
			if (sa.getDataSource() == DataSource.CONVERTED) {
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


	public int convert(GTMTool tool, EditingDomain editingDomain) {
		
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
			
			CompoundCommand command = new CompoundCommand();
			if (regionalConstraint != null) {
				command.append(new AddCommand(editingDomain, tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints(), regionalConstraint) );
			}
			if (regionalConstraintR != null) {
				command.append(new AddCommand(editingDomain, tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints(), regionalConstraintR) );
			}
			
			if (!command.isEmpty() && command.canExecute()) {
				editingDomain.getCommandStack().execute(command);
			} else {
				String message = "error in series: " + Integer.toString(series.getNumber()) + " conversion of this series failed";
				GtmUtils.writeConsoleError(message);
			}
			
			
			for (TargetFareTemplate fareTemplate: tool.getConversionFromLegacy().getParams().getLegacyTargetFares().getTargetFares()) {
				
				try {
					for (DateRange dateRange : validityRanges) {
						convertSeriesToFares(tool, series, fareTemplate,editingDomain,added, dateRange, regionalConstraint,regionalConstraintR ,priceList);
					}
					added++;
				} catch (ConverterException e) {
					// error already logged
				}
			}
		}
		return added;
	}


	
	public static void convertSeriesToFares(GTMTool tool, LegacySeries series, TargetFareTemplate fareTemplate, EditingDomain domain, int number,DateRange dateRange, RegionalConstraint regionalConstraint, RegionalConstraint regionalConstraintR, ArrayList<Price> priceList) throws ConverterException{
		
		try {
			
			Price price = convertSeriesToPrice(tool, series,fareTemplate, tool.getConversionFromLegacy().getParams().getCountry(), dateRange, false);
			
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
			
			Price priceR = null;
					
			priceR = convertSeriesToPrice(tool, series,fareTemplate, tool.getConversionFromLegacy().getParams().getCountry(), dateRange, true);

			FareElement fareElementR =  null;
			boolean createNewPriceR = false;
			
			if (priceR != null) {
				Price oldPriceR = findPrice(priceR, priceList);
				if (oldPriceR == null) {
					createNewPriceR = true;
				} else {
					priceR=oldPriceR;
				}	

				fareElementR = convertSeriesToFare(tool, series, fareTemplate, 2);
				fareElementR.getLegacyAccountingIdentifier().setTariffId(number);
				fareElementR.setPrice(priceR);
				fareElementR.setRegionalConstraint(regionalConstraintR);
				
			}
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
			
			CompoundCommand command = new CompoundCommand();
			
			if (price != null && fareElement != null) {
				if (createNewPrice) {
					command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices(), price) );
				}
				command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements(), fareElement) );			
			}
			if (priceR != null && fareElementR != null) {
				if (createNewPriceR) {
					command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices(), priceR) );
				}
				command.append(new AddCommand(domain, tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements(), fareElementR) );			
			}
			
			if (!command.isEmpty() && command.canExecute()) {
				domain.getCommandStack().execute(command);
			} else {
				String message = "error in series: " + Integer.toString(series.getNumber()) + " conversion of price failed";
				GtmUtils.writeConsoleError(message);
			}
			
			
		} catch (ConverterException e) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " conversion of this series failed";
			GtmUtils.writeConsoleError(message);
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


	private RegionalConstraint convertSeriesToReversedRegionalConstraint(GTMTool tool, LegacySeries series) throws ConverterException {
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
		if (departureStation != null) {
			viaDeparture.setStation(departureStation);
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
		if (arrival != null) {
			//replacement of border point needed?
			ViaStation via = GtmFactory.eINSTANCE.createViaStation();
			via.setStation(arrival);
			via.setDataDescription(via.getDescription());
			mainRoute.add(via);
		}
		
		setDescription(mainViaStation);
		
		constraint.setDataDescription(mainViaStation.getDataDescription());
		
		return constraint;
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


	public RegionalConstraint convertSeriesToRegionalConstraint(GTMTool tool, LegacySeries series) throws ConverterException{
		
		RegionalConstraint constraint = GtmFactory.eINSTANCE.createRegionalConstraint();
		constraint.setDataSource(DataSource.CONVERTED);
		
		RegionalValidity region = GtmFactory.eINSTANCE.createRegionalValidity();

		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();

		
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
		}
		
		Station arrivalStation = getStation(tool, country, series.getToStation());
		if (arrivalStation == null) {
			String message = "error in series: " + Integer.toString(series.getNumber()) + " - station unknown: " + Integer.toString(series.getFromStation()) ;
			GtmUtils.writeConsoleError(message);
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
		
		if (arrivalStation != null) {
			ViaStation via = GtmFactory.eINSTANCE.createViaStation();
			mainRoute.add(via);
		}
		
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


	private void addToRoute(EList<ViaStation> lastRoute, LegacyViastation legacyViaStation, GTMTool tool,
			Country country) throws ConverterException {
		ViaStation via = GtmFactory.eINSTANCE.createViaStation();
		Station station = getStation(tool, country,legacyViaStation.getCode());
		if (station != null) {
			via.setStation(station);
			lastRoute.add(via);
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
			GtmUtils.writeConsoleError(message);
		}
		return station;
	}
	

	public static Price convertSeriesToPrice(GTMTool tool, LegacySeries series, TargetFareTemplate fareTemplate, Country country, DateRange dateRange, boolean returnFare) throws ConverterException{
		
		Price price = GtmFactory.eINSTANCE.createPrice();
		price.setDataSource(DataSource.CONVERTED);
			
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
			
				if (fare.getSeriesNumber() == series.getNumber() 
						&& ( fare.getValidFrom().before(dateRange.getStartDate())
								|| fare.getValidFrom().equals(dateRange.getStartDate()) )
						&& ( fare.getValidUntil().after(dateRange.getEndDate())
							   ||fare.getValidUntil().equals(dateRange.getEndDate()) ) )  {
					if (travelClass == 1) {
							if (returnFare) {							
								if (fare.getReturnFare1st() == fare.getFare1st() * 2 ) {
									//no real return fare
									return null;
								}
								return ((float) fare.getReturnFare1st())/200; 
							} else {
								return ((float) fare.getFare1st())/100; 
							}
					} else {
							if (returnFare) {
								if (fare.getReturnFare2nd() == fare.getFare2nd() * 2 ) {
									//no real return fare
									return null;
								}
								return ((float) fare.getReturnFare2nd())/200; 			
							} else {
								return ((float) fare.getFare2nd())/100; 			
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
		fare.setDataSource(DataSource.CONVERTED);
		fare.setAfterSalesRule(template.getAfterSalesRule());
		fare.setCarrierConstraint(template.getCarrierConstraint());
		fare.setCombinationConstraint(template.getCombinationConstraint());
		fare.setDataDescription("converted from series: " + Integer.toString(series.getNumber()) +" and temolate: " + template.getDataDescription());;
		fare.setFareDetailDescription(template.getFareDetailDescription());
		fare.setFulfillmentConstraint(template.getFulfillmentConstraint());
		
		LegacyAccountingIdentifier legacyAccountingIdentifier = GtmFactory.eINSTANCE.createLegacyAccountingIdentifier();
		legacyAccountingIdentifier.setSeriesId(series.getNumber());
		legacyAccountingIdentifier.setAddSeriesId(direction);
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


	public int convertBorderPoints(GTMTool tool, EditingDomain domain) {
		
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


	public List<ConnectionPoint> convertSeriesToConnectionPoints(GTMTool tool, LegacySeries series) throws ConverterException{
		 
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


	public int convertSalesAvailabilities(GTMTool tool, EditingDomain domain) {
		
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

	public void prepare(GTMTool tool) {
		
		int country = tool.getConversionFromLegacy().getParams().getCountry().getCode();
		
		for (Station station : tool.getCodeLists().getStations().getStations()) {
			if (station.getCountry().getCode() == country) {
				try {
					localStations.put(Integer.parseInt(station.getCode()), station);
				} catch (Exception e){
					//do nothing 
				}
			}
		}
		
		for (Legacy108Station station : tool.getConversionFromLegacy().getLegacy108().getLegacyStations().getLegacyStations()) {
				legacyStations.put(Integer.valueOf(station.getStationCode()), station);
		}

	}
}
