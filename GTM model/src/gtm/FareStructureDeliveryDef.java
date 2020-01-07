
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "delivery",
    "fareStructure"
})
public class FareStructureDeliveryDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("delivery")
    private Delivery delivery;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fareStructure")
    private FareStructure fareStructure;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("delivery")
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("delivery")
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fareStructure")
    public FareStructure getFareStructure() {
        return fareStructure;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fareStructure")
    public void setFareStructure(FareStructure fareStructure) {
        this.fareStructure = fareStructure;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareStructureDeliveryDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("delivery");
        sb.append('=');
        sb.append(((this.delivery == null)?"<null>":this.delivery));
        sb.append(',');
        sb.append("fareStructure");
        sb.append('=');
        sb.append(((this.fareStructure == null)?"<null>":this.fareStructure));
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
        result = ((result* 31)+((this.delivery == null)? 0 :this.delivery.hashCode()));
        result = ((result* 31)+((this.fareStructure == null)? 0 :this.fareStructure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareStructureDeliveryDef) == false) {
            return false;
        }
        FareStructureDeliveryDef rhs = ((FareStructureDeliveryDef) other);
        return (((this.delivery == rhs.delivery)||((this.delivery!= null)&&this.delivery.equals(rhs.delivery)))&&((this.fareStructure == rhs.fareStructure)||((this.fareStructure!= null)&&this.fareStructure.equals(rhs.fareStructure))));
    }

}
