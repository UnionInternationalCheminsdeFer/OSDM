
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "salesRestrictions"
})
public class SalesAvailabilityConstraintDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesRestrictions")
    private List<SalesRestriction> salesRestrictions = new ArrayList<SalesRestriction>();

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesRestrictions")
    public List<SalesRestriction> getSalesRestrictions() {
        return salesRestrictions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("salesRestrictions")
    public void setSalesRestrictions(List<SalesRestriction> salesRestrictions) {
        this.salesRestrictions = salesRestrictions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesAvailabilityConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("salesRestrictions");
        sb.append('=');
        sb.append(((this.salesRestrictions == null)?"<null>":this.salesRestrictions));
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
        result = ((result* 31)+((this.salesRestrictions == null)? 0 :this.salesRestrictions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SalesAvailabilityConstraintDef) == false) {
            return false;
        }
        SalesAvailabilityConstraintDef rhs = ((SalesAvailabilityConstraintDef) other);
        return (((this.salesRestrictions == rhs.salesRestrictions)||((this.salesRestrictions!= null)&&this.salesRestrictions.equals(rhs.salesRestrictions)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
