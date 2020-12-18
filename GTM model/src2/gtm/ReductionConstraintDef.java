
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "requiredCards"
})
public class ReductionConstraintDef {

    /**
     * in bulk data only
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("in bulk data only")
    private String id;
    /**
     * One of the listed cards is required to be valid at the time of travel.
     * (Required)
     * 
     */
    @JsonProperty("requiredCards")
    @JsonPropertyDescription("One of the listed cards is required to be valid at the time of travel.")
    private List<ReductionCardReferenceDef> requiredCards = new ArrayList<ReductionCardReferenceDef>();

    /**
     * in bulk data only
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * in bulk data only
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * One of the listed cards is required to be valid at the time of travel.
     * (Required)
     * 
     */
    @JsonProperty("requiredCards")
    public List<ReductionCardReferenceDef> getRequiredCards() {
        return requiredCards;
    }

    /**
     * One of the listed cards is required to be valid at the time of travel.
     * (Required)
     * 
     */
    @JsonProperty("requiredCards")
    public void setRequiredCards(List<ReductionCardReferenceDef> requiredCards) {
        this.requiredCards = requiredCards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReductionConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requiredCards");
        sb.append('=');
        sb.append(((this.requiredCards == null)?"<null>":this.requiredCards));
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
        result = ((result* 31)+((this.requiredCards == null)? 0 :this.requiredCards.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReductionConstraintDef) == false) {
            return false;
        }
        ReductionConstraintDef rhs = ((ReductionConstraintDef) other);
        return (((this.requiredCards == rhs.requiredCards)||((this.requiredCards!= null)&&this.requiredCards.equals(rhs.requiredCards)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
