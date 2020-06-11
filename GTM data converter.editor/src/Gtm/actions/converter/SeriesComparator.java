package Gtm.actions.converter;

import java.util.Comparator;
import Gtm.LegacySeries;

public class SeriesComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		return Integer.compare( ((LegacySeries)o1).getNumber(), ((LegacySeries)o2).getNumber());

	}

}
