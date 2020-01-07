
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * valid on all days in case no calendar is provided
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fromDate",
    "untilDate",
    "dates",
    "UTCoffset"
})
public class CalendarDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    private String fromDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("untilDate")
    private String untilDate;
    /**
     * dates included in the calendar. In case no dates are provided the entire range is assumed to be valid
     * 
     */
    @JsonProperty("dates")
    @JsonPropertyDescription("dates included in the calendar. In case no dates are provided the entire range is assumed to be valid")
    private List<String> dates = new ArrayList<String>();
    /**
     * offsett to UTC in minutes (number of minutes to be added to get UTC dates)
     * (Required)
     * 
     */
    @JsonProperty("UTCoffset")
    @JsonPropertyDescription("offsett to UTC in minutes (number of minutes to be added to get UTC dates)")
    private Double uTCoffset;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public String getFromDate() {
        return fromDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("untilDate")
    public String getUntilDate() {
        return untilDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("untilDate")
    public void setUntilDate(String untilDate) {
        this.untilDate = untilDate;
    }

    /**
     * dates included in the calendar. In case no dates are provided the entire range is assumed to be valid
     * 
     */
    @JsonProperty("dates")
    public List<String> getDates() {
        return dates;
    }

    /**
     * dates included in the calendar. In case no dates are provided the entire range is assumed to be valid
     * 
     */
    @JsonProperty("dates")
    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    /**
     * offsett to UTC in minutes (number of minutes to be added to get UTC dates)
     * 
     */
    @JsonProperty("UTCoffset")
    public Double getUTCoffset() {
        return uTCoffset;
    }

    /**
     * offsett to UTC in minutes (number of minutes to be added to get UTC dates)
     * 
     */
    @JsonProperty("UTCoffset")
    public void setUTCoffset(Double uTCoffset) {
        this.uTCoffset = uTCoffset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CalendarDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("untilDate");
        sb.append('=');
        sb.append(((this.untilDate == null)?"<null>":this.untilDate));
        sb.append(',');
        sb.append("dates");
        sb.append('=');
        sb.append(((this.dates == null)?"<null>":this.dates));
        sb.append(',');
        sb.append("uTCoffset");
        sb.append('=');
        sb.append(((this.uTCoffset == null)?"<null>":this.uTCoffset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.dates == null)? 0 :this.dates.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.uTCoffset == null)? 0 :this.uTCoffset.hashCode()));
        result = ((result* 31)+((this.untilDate == null)? 0 :this.untilDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CalendarDef) == false) {
            return false;
        }
        CalendarDef rhs = ((CalendarDef) other);
        return ((((((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate)))&&((this.dates == rhs.dates)||((this.dates!= null)&&this.dates.equals(rhs.dates))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.uTCoffset == rhs.uTCoffset)||((this.uTCoffset!= null)&&this.uTCoffset.equals(rhs.uTCoffset))))&&((this.untilDate == rhs.untilDate)||((this.untilDate!= null)&&this.untilDate.equals(rhs.untilDate))));
    }

}
