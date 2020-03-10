package Gtm.actions.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;


public class DateRange {

	
	Date startDate = null;
	Date endDate = null;	
	
	
	public DateRange  (Date start, Date end){
		startDate = start;
		endDate = end;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	
	public static ArrayList<DateRange> getIntervalls(Set<Date> dateSet){
		
		ArrayList<Date> dateList = new ArrayList<Date>();
		dateList.addAll(dateSet);
		
		Collections.sort(dateList, new Comparator<Date>() {
			  public int compare(Date o1, Date o2) {
			      if (o1 == null || o2 == null)
			        return 0;
			      return o1.compareTo(o2);
			  }
		});
		
		ArrayList<DateRange> ranges = new ArrayList<DateRange>();
		
		for (int i = 0; i < dateList.size() - 1; i++) {
			
			DateRange r = new DateRange(dateList.get(i), dateList.get(i + 1));
			ranges.add(r);

		}

		return ranges;
	}


	public static void addUniqueRanges(ArrayList<DateRange> validityRanges, ArrayList<DateRange> seriesRanges) {

		for (DateRange range1 : seriesRanges) {
		
			boolean found = false;
		
			for (DateRange range2 : validityRanges) {
				if ( range1.startDate.equals(range2.startDate) && range1.endDate.equals(range2.endDate)) {
					found = true;
					break;
				}
			}
			if (!found) {
				validityRanges.add(range1);
			}
	}
		
	}
	
	
}
