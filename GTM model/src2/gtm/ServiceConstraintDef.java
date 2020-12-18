
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Either excluded or included service brands can be set.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "includedServiceBrands",
    "excludedServiceBrands"
})
public class ServiceConstraintDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("includedServiceBrands")
    private List<Integer> includedServiceBrands = new ArrayList<Integer>();
    @JsonProperty("excludedServiceBrands")
    private List<Integer> excludedServiceBrands = new ArrayList<Integer>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("includedServiceBrands")
    public List<Integer> getIncludedServiceBrands() {
        return includedServiceBrands;
    }

    @JsonProperty("includedServiceBrands")
    public void setIncludedServiceBrands(List<Integer> includedServiceBrands) {
        this.includedServiceBrands = includedServiceBrands;
    }

    @JsonProperty("excludedServiceBrands")
    public List<Integer> getExcludedServiceBrands() {
        return excludedServiceBrands;
    }

    @JsonProperty("excludedServiceBrands")
    public void setExcludedServiceBrands(List<Integer> excludedServiceBrands) {
        this.excludedServiceBrands = excludedServiceBrands;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("includedServiceBrands");
        sb.append('=');
        sb.append(((this.includedServiceBrands == null)?"<null>":this.includedServiceBrands));
        sb.append(',');
        sb.append("excludedServiceBrands");
        sb.append('=');
        sb.append(((this.excludedServiceBrands == null)?"<null>":this.excludedServiceBrands));
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
        result = ((result* 31)+((this.excludedServiceBrands == null)? 0 :this.excludedServiceBrands.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.includedServiceBrands == null)? 0 :this.includedServiceBrands.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceConstraintDef) == false) {
            return false;
        }
        ServiceConstraintDef rhs = ((ServiceConstraintDef) other);
        return ((((this.excludedServiceBrands == rhs.excludedServiceBrands)||((this.excludedServiceBrands!= null)&&this.excludedServiceBrands.equals(rhs.excludedServiceBrands)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.includedServiceBrands == rhs.includedServiceBrands)||((this.includedServiceBrands!= null)&&this.includedServiceBrands.equals(rhs.includedServiceBrands))));
    }

}
