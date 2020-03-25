package Gtm.actions.converter;

import org.eclipse.emf.common.util.EList;
import Gtm.AlternativeRoute;
import Gtm.RegionalValidity;
import Gtm.Route;
import Gtm.Station;
import Gtm.ViaStation;
import Gtm.actions.GtmUtils;

public class RouteDescriptionBuilder {
	

	
	
	public static String getRouteDescription(EList<RegionalValidity> rvl) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(getFirstStationCodeName(getMainVia(rvl)));
		
		sb.append("--");
		
		sb.append(getViaDescription(rvl));
		
		sb.append("--");
		
		sb.append(getLastStationCodeName(getMainVia(rvl)));
		
		return sb.toString();
		
	}
	
	
	
	private static ViaStation getMainVia(EList<RegionalValidity> rvl) {
		
		if (rvl == null || rvl.isEmpty()) {
			return null;
		}
		
		ViaStation via = rvl.get(0).getViaStation();

		return via;
	}

	
	public static String getViaDescription(EList<RegionalValidity> regionalValidity) {
		
		if (regionalValidity.isEmpty()) {
			return "missing route";
		}
		
		ViaStation via = regionalValidity.get(0).getViaStation();
		if (via == null ||
			via.getRoute() == null || 
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
				if (label.length() > 0 && !label.toString().substring(label.length() - 1).equals("*")) { //$NON-NLS-1$
					label.append("*").append(getRouteDescription(via2)); //$NON-NLS-1$
				} else {
					label.append(getRouteDescription(via2));
				}
			}
		}

		return label.toString();

	}

	private static String getRouteDescription(ViaStation via) {
		
		if (via.getStation()!= null) {
			return getShortNameCaseASCII(via.getStation());
		}
		
		StringBuilder label = new StringBuilder();
		
		if (via.getRoute()!= null && via.getRoute().getStations() != null && !via.getRoute().getStations().isEmpty() ) {
			
			for (ViaStation station : via.getRoute().getStations()) {
				
				if (station != null) {
					if (label.length() == 0 || label.substring(label.length()-1,label.length()).equals("*")) { //$NON-NLS-1$
						label.append(getRouteDescription(station));
					} else {
						label.append("*").append(getRouteDescription(station)); //$NON-NLS-1$
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
	
	private static String getLastStationCodeName(ViaStation viaStation) {
		
		if (viaStation == null) {
			return "missing arrival";
		}
		
		ViaStation via = viaStation.getRoute().getStations().get(viaStation.getRoute().getStations().size() - 1);
		if (via.getStation() != null) {
			return getName(via.getStation());
		} else if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return null;
	}

	private static String getFirstStationCodeName(ViaStation viaStation) {
		
		if (viaStation == null) {
			return "missing departure";
		}
		
		ViaStation via = viaStation.getRoute().getStations().get(0);
		if (via.getStation() != null) {
			return getName(via.getStation());
		} else if (via.getFareStationSet() != null) {
			return via.getFareStationSet().getName();
		}
		return null;
	}
	
	private static String getName(Station station) {
		
		if (station.getShortNameCaseASCII() != null && station.getShortNameCaseASCII().length() > 0) {
			return station.getShortNameCaseASCII().trim();
		}
		if (station.getNameCaseASCII() != null && station.getNameCaseASCII().length() > 0) {
			return station.getNameCaseASCII().trim();
		}
		if (station.getName() != null && station.getName().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getName()).trim();
		}			
		if (station.getShortNameCaseUTF8() != null && station.getShortNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getShortNameCaseUTF8()).trim();
		}			
		if (station.getNameCaseUTF8() != null && station.getNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getNameCaseUTF8()).trim();
		}		

		return null;
	}
	
	private static String getShortNameCaseASCII(Station station) {
		
		if (station.getShortNameCaseASCII() != null && station.getShortNameCaseASCII().length() > 0) {
			return station.getShortNameCaseASCII().trim();
		}
		if (station.getShortNameCaseUTF8() != null && station.getShortNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getShortNameCaseUTF8()).trim();
		}	
		if (station.getNameCaseASCII() != null && station.getNameCaseASCII().length() > 0) {
			return station.getNameCaseASCII().trim();
		}
		if (station.getName() != null && station.getName().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getName()).trim();
		}			
		if (station.getNameCaseUTF8() != null && station.getNameCaseUTF8().length() > 0) {
			return GtmUtils.toPrintableAscII(station.getNameCaseUTF8()).trim();
		}		

		return null;

	}

}
