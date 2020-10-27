
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Either excluded or included carriers can be set.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "includedCarrier",
    "excludedCarrier"
})
public class CarrierConstraintDef {

    @JsonProperty("id")
    private String id;
    @JsonProperty("includedCarrier")
    private List<String> includedCarrier = new ArrayList<String>();
    @JsonProperty("excludedCarrier")
    private List<String> excludedCarrier = new ArrayList<String>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("includedCarrier")
    public List<String> getIncludedCarrier() {
        return includedCarrier;
    }

    @JsonProperty("includedCarrier")
    public void setIncludedCarrier(List<String> includedCarrier) {
        this.includedCarrier = includedCarrier;
    }

    @JsonProperty("excludedCarrier")
    public List<String> getExcludedCarrier() {
        return excludedCarrier;
    }

    @JsonProperty("excludedCarrier")
    public void setExcludedCarrier(List<String> excludedCarrier) {
        this.excludedCarrier = excludedCarrier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CarrierConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("includedCarrier");
        sb.append('=');
        sb.append(((this.includedCarrier == null)?"<null>":this.includedCarrier));
        sb.append(',');
        sb.append("excludedCarrier");
        sb.append('=');
        sb.append(((this.excludedCarrier == null)?"<null>":this.excludedCarrier));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.includedCarrier == null)? 0 :this.includedCarrier.hashCode()));
        result = ((result* 31)+((this.excludedCarrier == null)? 0 :this.excludedCarrier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CarrierConstraintDef) == false) {
            return false;
        }
        CarrierConstraintDef rhs = ((CarrierConstraintDef) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.includedCarrier == rhs.includedCarrier)||((this.includedCarrier!= null)&&this.includedCarrier.equals(rhs.includedCarrier))))&&((this.excludedCarrier == rhs.excludedCarrier)||((this.excludedCarrier!= null)&&this.excludedCarrier.equals(rhs.excludedCarrier))));
    }

}
