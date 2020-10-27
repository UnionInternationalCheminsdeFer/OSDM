
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeUnit",
    "value",
    "hoursAfterMidnight"
})
public class ValidityRange {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    private ValidityRange.TimeUnitDef timeUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Float value;
    /**
     * validity extended after midnight
     * 
     */
    @JsonProperty("hoursAfterMidnight")
    @JsonPropertyDescription("validity extended after midnight")
    private Float hoursAfterMidnight;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public ValidityRange.TimeUnitDef getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(ValidityRange.TimeUnitDef timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Float getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * validity extended after midnight
     * 
     */
    @JsonProperty("hoursAfterMidnight")
    public Float getHoursAfterMidnight() {
        return hoursAfterMidnight;
    }

    /**
     * validity extended after midnight
     * 
     */
    @JsonProperty("hoursAfterMidnight")
    public void setHoursAfterMidnight(Float hoursAfterMidnight) {
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

    public enum TimeUnitDef {

        DAYS("DAYS"),
        HOURS("HOURS"),
        MINUTES("MINUTES");
        private final String value;
        private final static Map<String, ValidityRange.TimeUnitDef> CONSTANTS = new HashMap<String, ValidityRange.TimeUnitDef>();

        static {
            for (ValidityRange.TimeUnitDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TimeUnitDef(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ValidityRange.TimeUnitDef fromValue(String value) {
            ValidityRange.TimeUnitDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
