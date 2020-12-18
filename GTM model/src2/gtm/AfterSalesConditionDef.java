
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "afterSalesRules"
})
public class AfterSalesConditionDef {

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
    @JsonProperty("afterSalesRules")
    private List<AfterSalesRuleDef> afterSalesRules = new ArrayList<AfterSalesRuleDef>();

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
    @JsonProperty("afterSalesRules")
    public List<AfterSalesRuleDef> getAfterSalesRules() {
        return afterSalesRules;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("afterSalesRules")
    public void setAfterSalesRules(List<AfterSalesRuleDef> afterSalesRules) {
        this.afterSalesRules = afterSalesRules;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AfterSalesConditionDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("afterSalesRules");
        sb.append('=');
        sb.append(((this.afterSalesRules == null)?"<null>":this.afterSalesRules));
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
        result = ((result* 31)+((this.afterSalesRules == null)? 0 :this.afterSalesRules.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AfterSalesConditionDef) == false) {
            return false;
        }
        AfterSalesConditionDef rhs = ((AfterSalesConditionDef) other);
        return (((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.afterSalesRules == rhs.afterSalesRules)||((this.afterSalesRules!= null)&&this.afterSalesRules.equals(rhs.afterSalesRules))));
    }

}
