
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "combinationModels"
})
public class FareCombinationConstraintDef {

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
    @JsonProperty("combinationModels")
    private List<FareCombinationModelDef> combinationModels = new ArrayList<FareCombinationModelDef>();

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
    @JsonProperty("combinationModels")
    public List<FareCombinationModelDef> getCombinationModels() {
        return combinationModels;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("combinationModels")
    public void setCombinationModels(List<FareCombinationModelDef> combinationModels) {
        this.combinationModels = combinationModels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareCombinationConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("combinationModels");
        sb.append('=');
        sb.append(((this.combinationModels == null)?"<null>":this.combinationModels));
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
        result = ((result* 31)+((this.combinationModels == null)? 0 :this.combinationModels.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareCombinationConstraintDef) == false) {
            return false;
        }
        FareCombinationConstraintDef rhs = ((FareCombinationConstraintDef) other);
        return (((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.combinationModels == rhs.combinationModels)||((this.combinationModels!= null)&&this.combinationModels.equals(rhs.combinationModels))));
    }

}
