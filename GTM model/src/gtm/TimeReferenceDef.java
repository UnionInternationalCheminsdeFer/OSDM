
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeUnit",
    "value",
    "timeReference"
})
public class TimeReferenceDef {

    /**
     * DAY,HOUR,MINUTE
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    @JsonPropertyDescription("DAY,HOUR,MINUTE")
    private String timeUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * BEFORE_DEPARTURE,AFTER_DEPARTURE,BEFORE_VALIDITY
     * (Required)
     * 
     */
    @JsonProperty("timeReference")
    @JsonPropertyDescription("BEFORE_DEPARTURE,AFTER_DEPARTURE,BEFORE_VALIDITY")
    private String timeReference;

    /**
     * DAY,HOUR,MINUTE
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * DAY,HOUR,MINUTE
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
     * BEFORE_DEPARTURE,AFTER_DEPARTURE,BEFORE_VALIDITY
     * (Required)
     * 
     */
    @JsonProperty("timeReference")
    public String getTimeReference() {
        return timeReference;
    }

    /**
     * BEFORE_DEPARTURE,AFTER_DEPARTURE,BEFORE_VALIDITY
     * (Required)
     * 
     */
    @JsonProperty("timeReference")
    public void setTimeReference(String timeReference) {
        this.timeReference = timeReference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TimeReferenceDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeUnit");
        sb.append('=');
        sb.append(((this.timeUnit == null)?"<null>":this.timeUnit));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("timeReference");
        sb.append('=');
        sb.append(((this.timeReference == null)?"<null>":this.timeReference));
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
        result = ((result* 31)+((this.timeReference == null)? 0 :this.timeReference.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.timeUnit == null)? 0 :this.timeUnit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeReferenceDef) == false) {
            return false;
        }
        TimeReferenceDef rhs = ((TimeReferenceDef) other);
        return ((((this.timeReference == rhs.timeReference)||((this.timeReference!= null)&&this.timeReference.equals(rhs.timeReference)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.timeUnit == rhs.timeUnit)||((this.timeUnit!= null)&&this.timeUnit.equals(rhs.timeUnit))));
    }

}
