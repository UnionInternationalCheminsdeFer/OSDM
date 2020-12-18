
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "fromCountry",
    "toCountry",
    "affectedServiceBrands"
})
public class CrossBorderConditionDef {

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("fromCountry")
    @JsonPropertyDescription("ISO 3166 2A codes")
    private String fromCountry;
    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("toCountry")
    @JsonPropertyDescription("ISO 3166 2A codes")
    private String toCountry;
    @JsonProperty("affectedServiceBrands")
    private List<Integer> affectedServiceBrands = new ArrayList<Integer>();

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("fromCountry")
    public String getFromCountry() {
        return fromCountry;
    }

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("fromCountry")
    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("toCountry")
    public String getToCountry() {
        return toCountry;
    }

    /**
     * ISO 3166 2A codes
     * (Required)
     * 
     */
    @JsonProperty("toCountry")
    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    @JsonProperty("affectedServiceBrands")
    public List<Integer> getAffectedServiceBrands() {
        return affectedServiceBrands;
    }

    @JsonProperty("affectedServiceBrands")
    public void setAffectedServiceBrands(List<Integer> affectedServiceBrands) {
        this.affectedServiceBrands = affectedServiceBrands;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CrossBorderConditionDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromCountry");
        sb.append('=');
        sb.append(((this.fromCountry == null)?"<null>":this.fromCountry));
        sb.append(',');
        sb.append("toCountry");
        sb.append('=');
        sb.append(((this.toCountry == null)?"<null>":this.toCountry));
        sb.append(',');
        sb.append("affectedServiceBrands");
        sb.append('=');
        sb.append(((this.affectedServiceBrands == null)?"<null>":this.affectedServiceBrands));
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
        result = ((result* 31)+((this.fromCountry == null)? 0 :this.fromCountry.hashCode()));
        result = ((result* 31)+((this.affectedServiceBrands == null)? 0 :this.affectedServiceBrands.hashCode()));
        result = ((result* 31)+((this.toCountry == null)? 0 :this.toCountry.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrossBorderConditionDef) == false) {
            return false;
        }
        CrossBorderConditionDef rhs = ((CrossBorderConditionDef) other);
        return ((((this.fromCountry == rhs.fromCountry)||((this.fromCountry!= null)&&this.fromCountry.equals(rhs.fromCountry)))&&((this.affectedServiceBrands == rhs.affectedServiceBrands)||((this.affectedServiceBrands!= null)&&this.affectedServiceBrands.equals(rhs.affectedServiceBrands))))&&((this.toCountry == rhs.toCountry)||((this.toCountry!= null)&&this.toCountry.equals(rhs.toCountry))));
    }

}
