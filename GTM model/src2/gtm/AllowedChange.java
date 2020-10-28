
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
    "acceptedReason",
    "timeLimit"
})
public class AllowedChange {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acceptedReason")
    private AllowedChange.AcceptedReason acceptedReason;
    /**
     * the change is limited to n hours after booking confirmation
     * 
     */
    @JsonProperty("timeLimit")
    @JsonPropertyDescription("the change is limited to n hours after booking confirmation")
    private Integer timeLimit;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acceptedReason")
    public AllowedChange.AcceptedReason getAcceptedReason() {
        return acceptedReason;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acceptedReason")
    public void setAcceptedReason(AllowedChange.AcceptedReason acceptedReason) {
        this.acceptedReason = acceptedReason;
    }

    /**
     * the change is limited to n hours after booking confirmation
     * 
     */
    @JsonProperty("timeLimit")
    public Integer getTimeLimit() {
        return timeLimit;
    }

    /**
     * the change is limited to n hours after booking confirmation
     * 
     */
    @JsonProperty("timeLimit")
    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AllowedChange.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acceptedReason");
        sb.append('=');
        sb.append(((this.acceptedReason == null)?"<null>":this.acceptedReason));
        sb.append(',');
        sb.append("timeLimit");
        sb.append('=');
        sb.append(((this.timeLimit == null)?"<null>":this.timeLimit));
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
        result = ((result* 31)+((this.timeLimit == null)? 0 :this.timeLimit.hashCode()));
        result = ((result* 31)+((this.acceptedReason == null)? 0 :this.acceptedReason.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllowedChange) == false) {
            return false;
        }
        AllowedChange rhs = ((AllowedChange) other);
        return (((this.timeLimit == rhs.timeLimit)||((this.timeLimit!= null)&&this.timeLimit.equals(rhs.timeLimit)))&&((this.acceptedReason == rhs.acceptedReason)||((this.acceptedReason!= null)&&this.acceptedReason.equals(rhs.acceptedReason))));
    }

    public enum AcceptedReason {

        IN_GENERAL("IN_GENERAL"),
        MARRIAGE("MARRIAGE"),
        DOCUMENT_CHANGE("DOCUMENT_CHANGE"),
        AGENT_ERROR("AGENT_ERROR");
        private final String value;
        private final static Map<String, AllowedChange.AcceptedReason> CONSTANTS = new HashMap<String, AllowedChange.AcceptedReason>();

        static {
            for (AllowedChange.AcceptedReason c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AcceptedReason(String value) {
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
        public static AllowedChange.AcceptedReason fromValue(String value) {
            AllowedChange.AcceptedReason constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
