
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "timeUnit",
    "timeValue",
    "timeReference"
})
public class RelativeTimeDef {

    /**
     * Time unit in days, hours or minutes.
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    @JsonPropertyDescription("Time unit in days, hours or minutes.")
    private RelativeTimeDef.TimeUnit timeUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeValue")
    private Integer timeValue;
    /**
     * Time reference.
     * (Required)
     * 
     */
    @JsonProperty("timeReference")
    @JsonPropertyDescription("Time reference.")
    private RelativeTimeDef.TimeReference timeReference;

    /**
     * Time unit in days, hours or minutes.
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public RelativeTimeDef.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * Time unit in days, hours or minutes.
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(RelativeTimeDef.TimeUnit timeUnit) {
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
     * Time reference.
     * (Required)
     * 
     */
    @JsonProperty("timeReference")
    public RelativeTimeDef.TimeReference getTimeReference() {
        return timeReference;
    }

    /**
     * Time reference.
     * (Required)
     * 
     */
    @JsonProperty("timeReference")
    public void setTimeReference(RelativeTimeDef.TimeReference timeReference) {
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

    public enum TimeReference {

        BEFORE_DEPARTURE("BEFORE_DEPARTURE"),
        AFTER_DEPARTURE("AFTER_DEPARTURE"),
        AFTER_SALE("AFTER_SALE"),
        BEFORE_START_VALIDITY("BEFORE_START_VALIDITY"),
        AFTER_END_VALIDITY("AFTER_END_VALIDITY");
        private final String value;
        private final static Map<String, RelativeTimeDef.TimeReference> CONSTANTS = new HashMap<String, RelativeTimeDef.TimeReference>();

        static {
            for (RelativeTimeDef.TimeReference c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TimeReference(String value) {
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
        public static RelativeTimeDef.TimeReference fromValue(String value) {
            RelativeTimeDef.TimeReference constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TimeUnit {

        DAYS("DAYS"),
        HOURS("HOURS"),
        MINUTES("MINUTES");
        private final String value;
        private final static Map<String, RelativeTimeDef.TimeUnit> CONSTANTS = new HashMap<String, RelativeTimeDef.TimeUnit>();

        static {
            for (RelativeTimeDef.TimeUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TimeUnit(String value) {
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
        public static RelativeTimeDef.TimeUnit fromValue(String value) {
            RelativeTimeDef.TimeUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
