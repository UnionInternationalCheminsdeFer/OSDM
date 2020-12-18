
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "FareStructureDelivery"
})
public class FareDelivery {

    @JsonProperty("FareStructureDelivery")
    private FareDeliveryDef fareStructureDelivery;

    @JsonProperty("FareStructureDelivery")
    public FareDeliveryDef getFareStructureDelivery() {
        return fareStructureDelivery;
    }

    @JsonProperty("FareStructureDelivery")
    public void setFareStructureDelivery(FareDeliveryDef fareStructureDelivery) {
        this.fareStructureDelivery = fareStructureDelivery;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareDelivery.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fareStructureDelivery");
        sb.append('=');
        sb.append(((this.fareStructureDelivery == null)?"<null>":this.fareStructureDelivery));
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
        result = ((result* 31)+((this.fareStructureDelivery == null)? 0 :this.fareStructureDelivery.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareDelivery) == false) {
            return false;
        }
        FareDelivery rhs = ((FareDelivery) other);
        return ((this.fareStructureDelivery == rhs.fareStructureDelivery)||((this.fareStructureDelivery!= null)&&this.fareStructureDelivery.equals(rhs.fareStructureDelivery)));
    }

}
