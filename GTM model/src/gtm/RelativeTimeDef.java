
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeUnit",
    "timeValue",
    "timeReference"
})
public class RelativeTimeDef {

    /**
     * MINUTES,DAYS,HOURS
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    @JsonPropertyDescription("MINUTES,DAYS,HOURS")
    private String timeUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeValue")
    private Integer timeValue;
    /**
     * BEFORE_DEPARTURE,AFTER_DEPARTURE,AFTER_SALE,BEFOR_START_VALIDITY,AFTER_END_VALIDITY
     * (Required)
     * 
     */
    @JsonProperty("timeReference")
    @JsonPropertyDescription("BEFORE_DEPARTURE,AFTER_DEPARTURE,AFTER_SALE,BEFOR_START_VALIDITY,AFTER_END_VALIDITY")
    private String timeReference;

    /**
     * MINUTES,DAYS,HOURS
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * MINUTES,DAYS,HOURS
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
    @JsonProperty("timeValue")
    public Integer getTimeValue() {
        return timeValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeValue")
    public void setTimeValue(Integer timeValue) {
        this.timeValue = timeValue;
    }

    /**
     * BEFORE_DEPARTURE,AFTER_DEPARTURE,AFTER_SALE,BEFOR_START_VALIDITY,AFTER_END_VALIDITY
     * (Required)
     * 
     */
    @JsonProperty("timeReference")
    public String getTimeReference() {
        return timeReference;
    }

    /**
     * BEFORE_DEPARTURE,AFTER_DEPARTURE,AFTER_SALE,BEFOR_START_VALIDITY,AFTER_END_VALIDITY
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
        sb.append(RelativeTimeDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeUnit");
        sb.append('=');
        sb.append(((this.timeUnit == null)?"<null>":this.timeUnit));
        sb.append(',');
        sb.append("timeValue");
        sb.append('=');
        sb.append(((this.timeValue == null)?"<null>":this.timeValue));
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
        result = ((result* 31)+((this.timeValue == null)? 0 :this.timeValue.hashCode()));
        result = ((result* 31)+((this.timeReference == null)? 0 :this.timeReference.hashCode()));
        result = ((result* 31)+((this.timeUnit == null)? 0 :this.timeUnit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelativeTimeDef) == false) {
            return false;
        }
        RelativeTimeDef rhs = ((RelativeTimeDef) other);
        return ((((this.timeValue == rhs.timeValue)||((this.timeValue!= null)&&this.timeValue.equals(rhs.timeValue)))&&((this.timeReference == rhs.timeReference)||((this.timeReference!= null)&&this.timeReference.equals(rhs.timeReference))))&&((this.timeUnit == rhs.timeUnit)||((this.timeUnit!= null)&&this.timeUnit.equals(rhs.timeUnit))));
    }

}
