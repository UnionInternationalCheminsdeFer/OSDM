
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "carrier",
    "trainId",
    "onlineResource"
})
public class TrainResourceLocationDef {

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String carrier;
    /**
     * ztrain number (without service brand abbreviation)
     * (Required)
     * 
     */
    @JsonProperty("trainId")
    @JsonPropertyDescription("ztrain number (without service brand abbreviation)")
    private String trainId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("onlineResource")
    private List<OnlineResourceDef> onlineResource = new ArrayList<OnlineResourceDef>();

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * ztrain number (without service brand abbreviation)
     * (Required)
     * 
     */
    @JsonProperty("trainId")
    public String getTrainId() {
        return trainId;
    }

    /**
     * ztrain number (without service brand abbreviation)
     * (Required)
     * 
     */
    @JsonProperty("trainId")
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("onlineResource")
    public List<OnlineResourceDef> getOnlineResource() {
        return onlineResource;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("onlineResource")
    public void setOnlineResource(List<OnlineResourceDef> onlineResource) {
        this.onlineResource = onlineResource;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrainResourceLocationDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("trainId");
        sb.append('=');
        sb.append(((this.trainId == null)?"<null>":this.trainId));
        sb.append(',');
        sb.append("onlineResource");
        sb.append('=');
        sb.append(((this.onlineResource == null)?"<null>":this.onlineResource));
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
        result = ((result* 31)+((this.trainId == null)? 0 :this.trainId.hashCode()));
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.onlineResource == null)? 0 :this.onlineResource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrainResourceLocationDef) == false) {
            return false;
        }
        TrainResourceLocationDef rhs = ((TrainResourceLocationDef) other);
        return ((((this.trainId == rhs.trainId)||((this.trainId!= null)&&this.trainId.equals(rhs.trainId)))&&((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier))))&&((this.onlineResource == rhs.onlineResource)||((this.onlineResource!= null)&&this.onlineResource.equals(rhs.onlineResource))));
    }

}
