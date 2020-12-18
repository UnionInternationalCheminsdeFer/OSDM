
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "maxNumber",
    "passengerTypeRef"
})
public class CombinationConstraint {

    /**
     * number of passengers allowed per accompanying passenger
     * (Required)
     * 
     */
    @JsonProperty("maxNumber")
    @JsonPropertyDescription("number of passengers allowed per accompanying passenger")
    private Integer maxNumber;
    /**
     * Subset of the values from the traveler type code list IRS 90918-10 
     * (Required)
     * 
     */
    @JsonProperty("passengerTypeRef")
    @JsonPropertyDescription("Subset of the values from the traveler type code list IRS 90918-10 ")
    private String passengerTypeRef;

    /**
     * number of passengers allowed per accompanying passenger
     * (Required)
     * 
     */
    @JsonProperty("maxNumber")
    public Integer getMaxNumber() {
        return maxNumber;
    }

    /**
     * number of passengers allowed per accompanying passenger
     * (Required)
     * 
     */
    @JsonProperty("maxNumber")
    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    /**
     * Subset of the values from the traveler type code list IRS 90918-10 
     * (Required)
     * 
     */
    @JsonProperty("passengerTypeRef")
    public String getPassengerTypeRef() {
        return passengerTypeRef;
    }

    /**
     * Subset of the values from the traveler type code list IRS 90918-10 
     * (Required)
     * 
     */
    @JsonProperty("passengerTypeRef")
    public void setPassengerTypeRef(String passengerTypeRef) {
        this.passengerTypeRef = passengerTypeRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CombinationConstraint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxNumber");
        sb.append('=');
        sb.append(((this.maxNumber == null)?"<null>":this.maxNumber));
        sb.append(',');
        sb.append("passengerTypeRef");
        sb.append('=');
        sb.append(((this.passengerTypeRef == null)?"<null>":this.passengerTypeRef));
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
        result = ((result* 31)+((this.passengerTypeRef == null)? 0 :this.passengerTypeRef.hashCode()));
        result = ((result* 31)+((this.maxNumber == null)? 0 :this.maxNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CombinationConstraint) == false) {
            return false;
        }
        CombinationConstraint rhs = ((CombinationConstraint) other);
        return (((this.passengerTypeRef == rhs.passengerTypeRef)||((this.passengerTypeRef!= null)&&this.passengerTypeRef.equals(rhs.passengerTypeRef)))&&((this.maxNumber == rhs.maxNumber)||((this.maxNumber!= null)&&this.maxNumber.equals(rhs.maxNumber))));
    }

}
