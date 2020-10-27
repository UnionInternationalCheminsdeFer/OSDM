
package gtm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * calendar
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "fromDate",
    "untilDate",
    "dates",
    "utcOffset"
})
public class CalendarDef {

    /**
     * \*** BULK-ONLY *** identification within the bulk data mandatory in bulk data exchange
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("\\*** BULK-ONLY *** identification within the bulk data mandatory in bulk data exchange")
    private String id;
    @JsonProperty("fromDate")
    private Date fromDate;
    @JsonProperty("untilDate")
    private Date untilDate;
    /**
     * dates included in the calendar. In case no dates are provided the range is assumed to be valid
     * 
     */
    @JsonProperty("dates")
    @JsonPropertyDescription("dates included in the calendar. In case no dates are provided the range is assumed to be valid")
    private List<Date> dates = new ArrayList<Date>();
    /**
     * offset to UTC in minutes (number of minutes to be added to get UTC dates)
     * 
     */
    @JsonProperty("utcOffset")
    @JsonPropertyDescription("offset to UTC in minutes (number of minutes to be added to get UTC dates)")
    private Integer utcOffset;

    /**
     * \*** BULK-ONLY *** identification within the bulk data mandatory in bulk data exchange
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * \*** BULK-ONLY *** identification within the bulk data mandatory in bulk data exchange
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @JsonProperty("untilDate")
    public Date getUntilDate() {
        return untilDate;
    }

    @JsonProperty("untilDate")
    public void setUntilDate(Date untilDate) {
        this.untilDate = untilDate;
    }

    /**
     * dates included in the calendar. In case no dates are provided the range is assumed to be valid
     * 
     */
    @JsonProperty("dates")
    public List<Date> getDates() {
        return dates;
    }

    /**
     * dates included in the calendar. In case no dates are provided the range is assumed to be valid
     * 
     */
    @JsonProperty("dates")
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    /**
     * offset to UTC in minutes (number of minutes to be added to get UTC dates)
     * 
     */
    @JsonProperty("utcOffset")
    public Integer getUtcOffset() {
        return utcOffset;
    }

    /**
     * offset to UTC in minutes (number of minutes to be added to get UTC dates)
     * 
     */
    @JsonProperty("utcOffset")
    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
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
        sb.append("utcOffset");
        sb.append('=');
        sb.append(((this.utcOffset == null)?"<null>":this.utcOffset));
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
        result = ((result* 31)+((this.utcOffset == null)? 0 :this.utcOffset.hashCode()));
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
        return ((((((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate)))&&((this.dates == rhs.dates)||((this.dates!= null)&&this.dates.equals(rhs.dates))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.utcOffset == rhs.utcOffset)||((this.utcOffset!= null)&&this.utcOffset.equals(rhs.utcOffset))))&&((this.untilDate == rhs.untilDate)||((this.untilDate!= null)&&this.untilDate.equals(rhs.untilDate))));
    }

}
