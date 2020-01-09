
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeUnit",
    "value",
    "hoursAfterMidnight"
})
public class ValidityRange {

    /**
     * DAYS, HOURS, MINUTES
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    @JsonPropertyDescription("DAYS, HOURS, MINUTES")
    private String timeUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * validity extended after midnight
     * 
     */
    @JsonProperty("hoursAfterMidnight")
    @JsonPropertyDescription("validity extended after midnight")
    private Double hoursAfterMidnight;

    /**
     * DAYS, HOURS, MINUTES
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * DAYS, HOURS, MINUTES
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * validity extended after midnight
     * 
     */
    @JsonProperty("hoursAfterMidnight")
    public Double getHoursAfterMidnight() {
        return hoursAfterMidnight;
    }

    /**
     * validity extended after midnight
     * 
     */
    @JsonProperty("hoursAfterMidnight")
    public void setHoursAfterMidnight(Double hoursAfterMidnight) {
        this.hoursAfterMidnight = hoursAfterMidnight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValidityRange.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeUnit");
        sb.append('=');
        sb.append(((this.timeUnit == null)?"<null>":this.timeUnit));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("hoursAfterMidnight");
        sb.append('=');
        sb.append(((this.hoursAfterMidnight == null)?"<null>":this.hoursAfterMidnight));
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
        result = ((result* 31)+((this.hoursAfterMidnight == null)? 0 :this.hoursAfterMidnight.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.timeUnit == null)? 0 :this.timeUnit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValidityRange) == false) {
            return false;
        }
        ValidityRange rhs = ((ValidityRange) other);
        return ((((this.hoursAfterMidnight == rhs.hoursAfterMidnight)||((this.hoursAfterMidnight!= null)&&this.hoursAfterMidnight.equals(rhs.hoursAfterMidnight)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.timeUnit == rhs.timeUnit)||((this.timeUnit!= null)&&this.timeUnit.equals(rhs.timeUnit))));
    }

}