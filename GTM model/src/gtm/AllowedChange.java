
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "acceptedReason",
    "timeLimit"
})
public class AllowedChange {

    /**
     * IN_GENERAL,MARRIAGE,DOCUMENT_CHANGE,AGENT_ERROR
     * (Required)
     * 
     */
    @JsonProperty("acceptedReason")
    @JsonPropertyDescription("IN_GENERAL,MARRIAGE,DOCUMENT_CHANGE,AGENT_ERROR")
    private String acceptedReason;
    /**
     * the change is limited to n hours after booking confirmation
     * 
     */
    @JsonProperty("timeLimit")
    @JsonPropertyDescription("the change is limited to n hours after booking confirmation")
    private Float timeLimit;

    /**
     * IN_GENERAL,MARRIAGE,DOCUMENT_CHANGE,AGENT_ERROR
     * (Required)
     * 
     */
    @JsonProperty("acceptedReason")
    public String getAcceptedReason() {
        return acceptedReason;
    }

    /**
     * IN_GENERAL,MARRIAGE,DOCUMENT_CHANGE,AGENT_ERROR
     * (Required)
     * 
     */
    @JsonProperty("acceptedReason")
    public void setAcceptedReason(String acceptedReason) {
        this.acceptedReason = acceptedReason;
    }

    /**
     * the change is limited to n hours after booking confirmation
     * 
     */
    @JsonProperty("timeLimit")
    public Float getTimeLimit() {
        return timeLimit;
    }

    /**
     * the change is limited to n hours after booking confirmation
     * 
     */
    @JsonProperty("timeLimit")
    public void setTimeLimit(Float timeLimit) {
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

}
