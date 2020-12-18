
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "validTravelDates",
    "validityRange",
    "excludedTimeRange",
    "numberOfTravelDays",
    "returnConstraint"
})
public class TravelValidityConstraintDef {

    /**
     * mandatory in bulk data exchange
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("mandatory in bulk data exchange")
    private String id;
    /**
     * calendar
     * 
     */
    @JsonProperty("validTravelDates")
    @JsonPropertyDescription("calendar")
    private CalendarDef validTravelDates;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("validityRange")
    private ValidityRange validityRange;
    /**
     * time ranges excluded from the validity (e.g. off peak fulfillments)
     * 
     */
    @JsonProperty("excludedTimeRange")
    @JsonPropertyDescription("time ranges excluded from the validity (e.g. off peak fulfillments)")
    private List<ExcludedTimeRange> excludedTimeRange = new ArrayList<ExcludedTimeRange>();
    /**
     * number of allowed travel days (e.g. 3 travel days within 2 weeks)
     * 
     */
    @JsonProperty("numberOfTravelDays")
    @JsonPropertyDescription("number of allowed travel days (e.g. 3 travel days within 2 weeks)")
    private Integer numberOfTravelDays;
    /**
     * a return trip with the same carrier must be sold in combination
     * 
     */
    @JsonProperty("returnConstraint")
    @JsonPropertyDescription("a return trip with the same carrier must be sold in combination")
    private ReturnConstraint returnConstraint;

    /**
     * mandatory in bulk data exchange
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * mandatory in bulk data exchange
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * calendar
     * 
     */
    @JsonProperty("validTravelDates")
    public CalendarDef getValidTravelDates() {
        return validTravelDates;
    }

    /**
     * calendar
     * 
     */
    @JsonProperty("validTravelDates")
    public void setValidTravelDates(CalendarDef validTravelDates) {
        this.validTravelDates = validTravelDates;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("validityRange")
    public ValidityRange getValidityRange() {
        return validityRange;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("validityRange")
    public void setValidityRange(ValidityRange validityRange) {
        this.validityRange = validityRange;
    }

    /**
     * time ranges excluded from the validity (e.g. off peak fulfillments)
     * 
     */
    @JsonProperty("excludedTimeRange")
    public List<ExcludedTimeRange> getExcludedTimeRange() {
        return excludedTimeRange;
    }

    /**
     * time ranges excluded from the validity (e.g. off peak fulfillments)
     * 
     */
    @JsonProperty("excludedTimeRange")
    public void setExcludedTimeRange(List<ExcludedTimeRange> excludedTimeRange) {
        this.excludedTimeRange = excludedTimeRange;
    }

    /**
     * number of allowed travel days (e.g. 3 travel days within 2 weeks)
     * 
     */
    @JsonProperty("numberOfTravelDays")
    public Integer getNumberOfTravelDays() {
        return numberOfTravelDays;
    }

    /**
     * number of allowed travel days (e.g. 3 travel days within 2 weeks)
     * 
     */
    @JsonProperty("numberOfTravelDays")
    public void setNumberOfTravelDays(Integer numberOfTravelDays) {
        this.numberOfTravelDays = numberOfTravelDays;
    }

    /**
     * a return trip with the same carrier must be sold in combination
     * 
     */
    @JsonProperty("returnConstraint")
    public ReturnConstraint getReturnConstraint() {
        return returnConstraint;
    }

    /**
     * a return trip with the same carrier must be sold in combination
     * 
     */
    @JsonProperty("returnConstraint")
    public void setReturnConstraint(ReturnConstraint returnConstraint) {
        this.returnConstraint = returnConstraint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TravelValidityConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("validTravelDates");
        sb.append('=');
        sb.append(((this.validTravelDates == null)?"<null>":this.validTravelDates));
        sb.append(',');
        sb.append("validityRange");
        sb.append('=');
        sb.append(((this.validityRange == null)?"<null>":this.validityRange));
        sb.append(',');
        sb.append("excludedTimeRange");
        sb.append('=');
        sb.append(((this.excludedTimeRange == null)?"<null>":this.excludedTimeRange));
        sb.append(',');
        sb.append("numberOfTravelDays");
        sb.append('=');
        sb.append(((this.numberOfTravelDays == null)?"<null>":this.numberOfTravelDays));
        sb.append(',');
        sb.append("returnConstraint");
        sb.append('=');
        sb.append(((this.returnConstraint == null)?"<null>":this.returnConstraint));
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
        result = ((result* 31)+((this.excludedTimeRange == null)? 0 :this.excludedTimeRange.hashCode()));
        result = ((result* 31)+((this.numberOfTravelDays == null)? 0 :this.numberOfTravelDays.hashCode()));
        result = ((result* 31)+((this.validTravelDates == null)? 0 :this.validTravelDates.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.returnConstraint == null)? 0 :this.returnConstraint.hashCode()));
        result = ((result* 31)+((this.validityRange == null)? 0 :this.validityRange.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TravelValidityConstraintDef) == false) {
            return false;
        }
        TravelValidityConstraintDef rhs = ((TravelValidityConstraintDef) other);
        return (((((((this.excludedTimeRange == rhs.excludedTimeRange)||((this.excludedTimeRange!= null)&&this.excludedTimeRange.equals(rhs.excludedTimeRange)))&&((this.numberOfTravelDays == rhs.numberOfTravelDays)||((this.numberOfTravelDays!= null)&&this.numberOfTravelDays.equals(rhs.numberOfTravelDays))))&&((this.validTravelDates == rhs.validTravelDates)||((this.validTravelDates!= null)&&this.validTravelDates.equals(rhs.validTravelDates))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.returnConstraint == rhs.returnConstraint)||((this.returnConstraint!= null)&&this.returnConstraint.equals(rhs.returnConstraint))))&&((this.validityRange == rhs.validityRange)||((this.validityRange!= null)&&this.validityRange.equals(rhs.validityRange))));
    }

}
