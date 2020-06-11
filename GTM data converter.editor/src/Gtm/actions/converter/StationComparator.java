package Gtm.actions.converter;

import java.util.Comparator;

import Gtm.Legacy108Station;

public class StationComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		return Integer.compare( ((Legacy108Station)o1).getStationCode(), ((Legacy108Station)o2).getStationCode());

	}

}
