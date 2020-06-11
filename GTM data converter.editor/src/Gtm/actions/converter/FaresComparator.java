package Gtm.actions.converter;

import java.util.Comparator;

import Gtm.LegacyRouteFare;

public class FaresComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		int r = Integer.compare( ((LegacyRouteFare)o1).getFareTableNumber(), ((LegacyRouteFare)o2).getFareTableNumber());
		
		if (r == 0) {
			return Integer.compare( ((LegacyRouteFare)o1).getSeriesNumber(), ((LegacyRouteFare)o2).getSeriesNumber());
			
		} else {
			return r;
		}
	}

}
