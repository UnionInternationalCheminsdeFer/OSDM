
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "model",
    "combinableCarrier",
    "onlyWhenCombined",
    "referenceCluster",
    "allowedClusters",
    "allowedAllocators",
    "allowedCommonContracts"
})
public class FareCombinationModelDef {

    /**
     * Possible models are SEPARATE_TICKET, SEPARATE_CONTRACT, CLUSTERING, COMBINING.  The models need to be supported by the allocator.
     * (Required)
     * 
     */
    @JsonProperty("model")
    @JsonPropertyDescription("Possible models are SEPARATE_TICKET, SEPARATE_CONTRACT, CLUSTERING, COMBINING.  The models need to be supported by the allocator.")
    private String model;
    /**
     * List of all carriers where the model can be applied, in case the list is empty all combinations are allowed.
     * 
     */
    @JsonProperty("combinableCarrier")
    @JsonPropertyDescription("List of all carriers where the model can be applied, in case the list is empty all combinations are allowed.")
    private List<String> combinableCarrier = new ArrayList<String>();
    /**
     * This combination model applies only in case the fare is combined with another carrier
     * 
     */
    @JsonProperty("onlyWhenCombined")
    @JsonPropertyDescription("This combination model applies only in case the fare is combined with another carrier")
    private Boolean onlyWhenCombined = false;
    /**
     * In case of CLUSTERING model: the cluster to which the fare belongs
     * 
     */
    @JsonProperty("referenceCluster")
    @JsonPropertyDescription("In case of CLUSTERING model: the cluster to which the fare belongs")
    private String referenceCluster;
    /**
     * In case of CLUSTERING model: the other clusters that allow a combination
     * 
     */
    @JsonProperty("allowedClusters")
    @JsonPropertyDescription("In case of CLUSTERING model: the other clusters that allow a combination")
    private List<String> allowedClusters = new ArrayList<String>();
    /**
     * List of allowed allocators. If the list is empty all allocators with a sales contract are permitted.
     * 
     */
    @JsonProperty("allowedAllocators")
    @JsonPropertyDescription("List of allowed allocators. If the list is empty all allocators with a sales contract are permitted.")
    private List<String> allowedAllocators = new ArrayList<String>();
    /**
     * List of carriers where a common contract with separate fulfillments are allowed.
     * 
     */
    @JsonProperty("allowedCommonContracts")
    @JsonPropertyDescription("List of carriers where a common contract with separate fulfillments are allowed.")
    private List<String> allowedCommonContracts = new ArrayList<String>();

    /**
     * Possible models are SEPARATE_TICKET, SEPARATE_CONTRACT, CLUSTERING, COMBINING.  The models need to be supported by the allocator.
     * (Required)
     * 
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    /**
     * Possible models are SEPARATE_TICKET, SEPARATE_CONTRACT, CLUSTERING, COMBINING.  The models need to be supported by the allocator.
     * (Required)
     * 
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * List of all carriers where the model can be applied, in case the list is empty all combinations are allowed.
     * 
     */
    @JsonProperty("combinableCarrier")
    public List<String> getCombinableCarrier() {
        return combinableCarrier;
    }

    /**
     * List of all carriers where the model can be applied, in case the list is empty all combinations are allowed.
     * 
     */
    @JsonProperty("combinableCarrier")
    public void setCombinableCarrier(List<String> combinableCarrier) {
        this.combinableCarrier = combinableCarrier;
    }

    /**
     * This combination model applies only in case the fare is combined with another carrier
     * 
     */
    @JsonProperty("onlyWhenCombined")
    public Boolean getOnlyWhenCombined() {
        return onlyWhenCombined;
    }

    /**
     * This combination model applies only in case the fare is combined with another carrier
     * 
     */
    @JsonProperty("onlyWhenCombined")
    public void setOnlyWhenCombined(Boolean onlyWhenCombined) {
        this.onlyWhenCombined = onlyWhenCombined;
    }

    /**
     * In case of CLUSTERING model: the cluster to which the fare belongs
     * 
     */
    @JsonProperty("referenceCluster")
    public String getReferenceCluster() {
        return referenceCluster;
    }

    /**
     * In case of CLUSTERING model: the cluster to which the fare belongs
     * 
     */
    @JsonProperty("referenceCluster")
    public void setReferenceCluster(String referenceCluster) {
        this.referenceCluster = referenceCluster;
    }

    /**
     * In case of CLUSTERING model: the other clusters that allow a combination
     * 
     */
    @JsonProperty("allowedClusters")
    public List<String> getAllowedClusters() {
        return allowedClusters;
    }

    /**
     * In case of CLUSTERING model: the other clusters that allow a combination
     * 
     */
    @JsonProperty("allowedClusters")
    public void setAllowedClusters(List<String> allowedClusters) {
        this.allowedClusters = allowedClusters;
    }

    /**
     * List of allowed allocators. If the list is empty all allocators with a sales contract are permitted.
     * 
     */
    @JsonProperty("allowedAllocators")
    public List<String> getAllowedAllocators() {
        return allowedAllocators;
    }

    /**
     * List of allowed allocators. If the list is empty all allocators with a sales contract are permitted.
     * 
     */
    @JsonProperty("allowedAllocators")
    public void setAllowedAllocators(List<String> allowedAllocators) {
        this.allowedAllocators = allowedAllocators;
    }

    /**
     * List of carriers where a common contract with separate fulfillments are allowed.
     * 
     */
    @JsonProperty("allowedCommonContracts")
    public List<String> getAllowedCommonContracts() {
        return allowedCommonContracts;
    }

    /**
     * List of carriers where a common contract with separate fulfillments are allowed.
     * 
     */
    @JsonProperty("allowedCommonContracts")
    public void setAllowedCommonContracts(List<String> allowedCommonContracts) {
        this.allowedCommonContracts = allowedCommonContracts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareCombinationModelDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        sb.append("combinableCarrier");
        sb.append('=');
        sb.append(((this.combinableCarrier == null)?"<null>":this.combinableCarrier));
        sb.append(',');
        sb.append("onlyWhenCombined");
        sb.append('=');
        sb.append(((this.onlyWhenCombined == null)?"<null>":this.onlyWhenCombined));
        sb.append(',');
        sb.append("referenceCluster");
        sb.append('=');
        sb.append(((this.referenceCluster == null)?"<null>":this.referenceCluster));
        sb.append(',');
        sb.append("allowedClusters");
        sb.append('=');
        sb.append(((this.allowedClusters == null)?"<null>":this.allowedClusters));
        sb.append(',');
        sb.append("allowedAllocators");
        sb.append('=');
        sb.append(((this.allowedAllocators == null)?"<null>":this.allowedAllocators));
        sb.append(',');
        sb.append("allowedCommonContracts");
        sb.append('=');
        sb.append(((this.allowedCommonContracts == null)?"<null>":this.allowedCommonContracts));
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
        result = ((result* 31)+((this.onlyWhenCombined == null)? 0 :this.onlyWhenCombined.hashCode()));
        result = ((result* 31)+((this.referenceCluster == null)? 0 :this.referenceCluster.hashCode()));
        result = ((result* 31)+((this.allowedClusters == null)? 0 :this.allowedClusters.hashCode()));
        result = ((result* 31)+((this.model == null)? 0 :this.model.hashCode()));
        result = ((result* 31)+((this.allowedAllocators == null)? 0 :this.allowedAllocators.hashCode()));
        result = ((result* 31)+((this.allowedCommonContracts == null)? 0 :this.allowedCommonContracts.hashCode()));
        result = ((result* 31)+((this.combinableCarrier == null)? 0 :this.combinableCarrier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareCombinationModelDef) == false) {
            return false;
        }
        FareCombinationModelDef rhs = ((FareCombinationModelDef) other);
        return ((((((((this.onlyWhenCombined == rhs.onlyWhenCombined)||((this.onlyWhenCombined!= null)&&this.onlyWhenCombined.equals(rhs.onlyWhenCombined)))&&((this.referenceCluster == rhs.referenceCluster)||((this.referenceCluster!= null)&&this.referenceCluster.equals(rhs.referenceCluster))))&&((this.allowedClusters == rhs.allowedClusters)||((this.allowedClusters!= null)&&this.allowedClusters.equals(rhs.allowedClusters))))&&((this.model == rhs.model)||((this.model!= null)&&this.model.equals(rhs.model))))&&((this.allowedAllocators == rhs.allowedAllocators)||((this.allowedAllocators!= null)&&this.allowedAllocators.equals(rhs.allowedAllocators))))&&((this.allowedCommonContracts == rhs.allowedCommonContracts)||((this.allowedCommonContracts!= null)&&this.allowedCommonContracts.equals(rhs.allowedCommonContracts))))&&((this.combinableCarrier == rhs.combinableCarrier)||((this.combinableCarrier!= null)&&this.combinableCarrier.equals(rhs.combinableCarrier))));
    }

}
