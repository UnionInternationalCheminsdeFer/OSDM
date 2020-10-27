
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "from",
    "until",
    "scope"
})
public class ExcludedTimeRange {

    /**
     * minutes of the day in the time zone of travel
     * (Required)
     * 
     */
    @JsonProperty("from")
    @JsonPropertyDescription("minutes of the day in the time zone of travel")
    private Integer from;
    /**
     * minutes of the day in the time zone of travel
     * (Required)
     * 
     */
    @JsonProperty("until")
    @JsonPropertyDescription("minutes of the day in the time zone of travel")
    private Integer until;
    /**
     * START_OF_TRAVEL,COMPLETE_RANGE
     * (Required)
     * 
     */
    @JsonProperty("scope")
    @JsonPropertyDescription("START_OF_TRAVEL,COMPLETE_RANGE")
    private String scope;

    /**
     * minutes of the day in the time zone of travel
     * (Required)
     * 
     */
    @JsonProperty("from")
    public Integer getFrom() {
        return from;
    }

    /**
     * minutes of the day in the time zone of travel
     * (Required)
     * 
     */
    @JsonProperty("from")
    public void setFrom(Integer from) {
        this.from = from;
    }

    /**
     * minutes of the day in the time zone of travel
     * (Required)
     * 
     */
    @JsonProperty("until")
    public Integer getUntil() {
        return until;
    }

    /**
     * minutes of the day in the time zone of travel
     * (Required)
     * 
     */
    @JsonProperty("until")
    public void setUntil(Integer until) {
        this.until = until;
    }

    /**
     * START_OF_TRAVEL,COMPLETE_RANGE
     * (Required)
     * 
     */
    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    /**
     * START_OF_TRAVEL,COMPLETE_RANGE
     * (Required)
     * 
     */
    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExcludedTimeRange.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("until");
        sb.append('=');
        sb.append(((this.until == null)?"<null>":this.until));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
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
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.until == null)? 0 :this.until.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExcludedTimeRange) == false) {
            return false;
        }
        ExcludedTimeRange rhs = ((ExcludedTimeRange) other);
        return ((((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from)))&&((this.until == rhs.until)||((this.until!= null)&&this.until.equals(rhs.until))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))));
    }

}
