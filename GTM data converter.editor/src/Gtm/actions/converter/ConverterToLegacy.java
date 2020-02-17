package Gtm.actions.converter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AlternativeRoute;
import Gtm.Clusters;
import Gtm.CombinationModel;
import Gtm.FareCombinationModel;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FareStationSetDefinitions;
import Gtm.GTMTool;
import Gtm.GtmPackage;
import Gtm.LegacyRouteFare;
import Gtm.LegacySeries;
import Gtm.RegionalValidity;
import Gtm.Station;
import Gtm.TravelerType;
import Gtm.ViaStation;
import Gtm.actions.GtmUtils;

public class 	ConverterToLegacy {
	
	
	private GTMTool tool = null;
	private HashSet<Station> convertibleStations = new HashSet<Station>();
	private HashSet<FareStationSetDefinitions> convertibleFareStationSets = new HashSet<FareStationSetDefinitions>();
	
		
	public ConverterToLegacy(GTMTool tool) {
		this.tool = tool;
	}
	
	public CompoundCommand convert() {
		
		
		List<FareElement> convertableFares = selectFares();

		CompoundCommand command = new CompoundCommand();
		
		for (FareElement fare : convertableFares) {
			CompoundCommand com = covertFare(fare, convertableFares.indexOf(fare));
			if (com != null && !com.isEmpty() && com.canExecute()) {
				command.append(com);
			}
		}
		
		CompoundCommand com2 = convertStations(convertibleStations);
		if (com2 != null && !com2.isEmpty() && com2.canExecute()) {
			command.append(com2);
		}
		
		CompoundCommand com3 = convertFareStationSets(convertibleFareStationSets);
		if (com3 != null && !com3.isEmpty() && com3.canExecute()) {
			command.append(com3);
		}
		
		return command;
	}
	
	
	private CompoundCommand convertFareStationSets(HashSet<FareStationSetDefinitions> convertibleFareStationSets2) {
		// TODO Auto-generated method stub
		return null;
	}

	private CompoundCommand convertStations(HashSet<Station> convertibleStations2) {
		// TODO Auto-generated method stub
		return null;
	}

	private CompoundCommand covertFare(FareElement fare,int index) {
		
		LegacySeries series = convertToSeries(fare,index);
		if (series == null) return null;
		
		LegacyRouteFare routeFare = convertToFare(fare,series,index);
		if (routeFare == null) return null;

		CompoundCommand com = new CompoundCommand();
		
		EditingDomain domain = GtmUtils.getActiveDomain(); 
	
		com.append(AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList(), GtmPackage.Literals.LEGACY_SERIES_LIST__SERIES, series));
		
		com.append(AddCommand.create(domain, tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares(), GtmPackage.Literals.LEGACY_ROUTE_FARES__ROUTE_FARE, routeFare));
		
		return null;
	}

	private LegacyRouteFare convertToFare(FareElement fare, LegacySeries series, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	private LegacySeries convertToSeries(FareElement fare, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<FareElement> selectFares() {
		
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		
		for (FareElement fare :  tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
			//only ADULT
			if (fare.getPassengerConstraint().getTravelerType() != TravelerType.ADULT) break;
			
			//only FULL_FLEX combination
			if (!isFullFlexCombi(fare)) break;
			
			//no reductions
			if (fare.getReductionConstraint() != null) break;
			
			//must be convertible in legacy series
			if (!hasSimpleRegionalValidity(fare)) break;
			
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
		
		//is return route 
		if (isReturnRoute(via)) return false;
		
		return false;
	}

	private boolean isReturnRoute(ViaStation via) {
		
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
	
	

}
