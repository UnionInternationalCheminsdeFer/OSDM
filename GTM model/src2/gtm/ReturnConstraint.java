
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * a return trip with the same carrier must be sold in combination
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latestReturn",
    "earliestReturn",
    "excludedWeekdays"
})
public class ReturnConstraint {

    /**
     * number of days after departure or start of validity of the last return
     * (Required)
     * 
     */
    @JsonProperty("latestReturn")
    @JsonPropertyDescription("number of days after departure or start of validity of the last return")
    private Integer latestReturn;
    /**
     * number of days after departure or start of validity of the earliest return
     * (Required)
     * 
     */
    @JsonProperty("earliestReturn")
    @JsonPropertyDescription("number of days after departure or start of validity of the earliest return")
    private Integer earliestReturn;
    /**
     * weekdays (ISO day of the week, 1 = Monday) between travel and return where travel is not allowed
     * 
     */
    @JsonProperty("excludedWeekdays")
    @JsonPropertyDescription("weekdays (ISO day of the week, 1 = Monday) between travel and return where travel is not allowed")
    private List<Integer> excludedWeekdays = new ArrayList<Integer>();

    /**
     * number of days after departure or start of validity of the last return
     * (Required)
     * 
     */
    @JsonProperty("latestReturn")
    public Integer getLatestReturn() {
        return latestReturn;
    }

    /**
     * number of days after departure or start of validity of the last return
     * (Required)
     * 
     */
    @JsonProperty("latestReturn")
    public void setLatestReturn(Integer latestReturn) {
        this.latestReturn = latestReturn;
    }

    /**
     * number of days after departure or start of validity of the earliest return
     * (Required)
     * 
     */
    @JsonProperty("earliestReturn")
    public Integer getEarliestReturn() {
        return earliestReturn;
    }

    /**
     * number of days after departure or start of validity of the earliest return
     * (Required)
     * 
     */
    @JsonProperty("earliestReturn")
    public void setEarliestReturn(Integer earliestReturn) {
        this.earliestReturn = earliestReturn;
    }

    /**
     * weekdays (ISO day of the week, 1 = Monday) between travel and return where travel is not allowed
     * 
     */
    @JsonProperty("excludedWeekdays")
    public List<Integer> getExcludedWeekdays() {
        return excludedWeekdays;
    }

    /**
     * weekdays (ISO day of the week, 1 = Monday) between travel and return where travel is not allowed
     * 
     */
    @JsonProperty("excludedWeekdays")
    public void setExcludedWeekdays(List<Integer> excludedWeekdays) {
        this.excludedWeekdays = excludedWeekdays;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReturnConstraint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("latestReturn");
        sb.append('=');
        sb.append(((this.latestReturn == null)?"<null>":this.latestReturn));
        sb.append(',');
        sb.append("earliestReturn");
        sb.append('=');
        sb.append(((this.earliestReturn == null)?"<null>":this.earliestReturn));
        sb.append(',');
        sb.append("excludedWeekdays");
        sb.append('=');
        sb.append(((this.excludedWeekdays == null)?"<null>":this.excludedWeekdays));
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
        result = ((result* 31)+((this.excludedWeekdays == null)? 0 :this.excludedWeekdays.hashCode()));
        result = ((result* 31)+((this.latestReturn == null)? 0 :this.latestReturn.hashCode()));
        result = ((result* 31)+((this.earliestReturn == null)? 0 :this.earliestReturn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReturnConstraint) == false) {
            return false;
        }
        ReturnConstraint rhs = ((ReturnConstraint) other);
        return ((((this.excludedWeekdays == rhs.excludedWeekdays)||((this.excludedWeekdays!= null)&&this.excludedWeekdays.equals(rhs.excludedWeekdays)))&&((this.latestReturn == rhs.latestReturn)||((this.latestReturn!= null)&&this.latestReturn.equals(rhs.latestReturn))))&&((this.earliestReturn == rhs.earliestReturn)||((this.earliestReturn!= null)&&this.earliestReturn.equals(rhs.earliestReturn))));
    }

}
