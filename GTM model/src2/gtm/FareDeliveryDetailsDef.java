
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fareProvider",
    "deliveryId",
    "previousDeliveryId",
    "replacementDeliveryId",
    "optionalDelivery",
    "version",
    "acceptedVersion"
})
public class FareDeliveryDetailsDef {

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("fareProvider")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String fareProvider;
    /**
     * unique id of this data delivery
     * (Required)
     * 
     */
    @JsonProperty("deliveryId")
    @JsonPropertyDescription("unique id of this data delivery")
    private String deliveryId;
    @JsonProperty("previousDeliveryId")
    private String previousDeliveryId;
    /**
     * in case this delivery replaces an previous delivery
     * 
     */
    @JsonProperty("replacementDeliveryId")
    @JsonPropertyDescription("in case this delivery replaces an previous delivery")
    private String replacementDeliveryId;
    /**
     * this delivery is not mandatory to be downloaded. 
     * 
     */
    @JsonProperty("optionalDelivery")
    @JsonPropertyDescription("this delivery is not mandatory to be downloaded. ")
    private Boolean optionalDelivery = false;
    /**
     * version of the data schema
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("version of the data schema")
    private String version;
    /**
     * minimal version required to use these data
     * (Required)
     * 
     */
    @JsonProperty("acceptedVersion")
    @JsonPropertyDescription("minimal version required to use these data")
    private String acceptedVersion;

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("fareProvider")
    public String getFareProvider() {
        return fareProvider;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("fareProvider")
    public void setFareProvider(String fareProvider) {
        this.fareProvider = fareProvider;
    }

    /**
     * unique id of this data delivery
     * (Required)
     * 
     */
    @JsonProperty("deliveryId")
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * unique id of this data delivery
     * (Required)
     * 
     */
    @JsonProperty("deliveryId")
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    @JsonProperty("previousDeliveryId")
    public String getPreviousDeliveryId() {
        return previousDeliveryId;
    }

    @JsonProperty("previousDeliveryId")
    public void setPreviousDeliveryId(String previousDeliveryId) {
        this.previousDeliveryId = previousDeliveryId;
    }

    /**
     * in case this delivery replaces an previous delivery
     * 
     */
    @JsonProperty("replacementDeliveryId")
    public String getReplacementDeliveryId() {
        return replacementDeliveryId;
    }

    /**
     * in case this delivery replaces an previous delivery
     * 
     */
    @JsonProperty("replacementDeliveryId")
    public void setReplacementDeliveryId(String replacementDeliveryId) {
        this.replacementDeliveryId = replacementDeliveryId;
    }

    /**
     * this delivery is not mandatory to be downloaded. 
     * 
     */
    @JsonProperty("optionalDelivery")
    public Boolean getOptionalDelivery() {
        return optionalDelivery;
    }

    /**
     * this delivery is not mandatory to be downloaded. 
     * 
     */
    @JsonProperty("optionalDelivery")
    public void setOptionalDelivery(Boolean optionalDelivery) {
        this.optionalDelivery = optionalDelivery;
    }

    /**
     * version of the data schema
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * version of the data schema
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * minimal version required to use these data
     * (Required)
     * 
     */
    @JsonProperty("acceptedVersion")
    public String getAcceptedVersion() {
        return acceptedVersion;
    }

    /**
     * minimal version required to use these data
     * (Required)
     * 
     */
    @JsonProperty("acceptedVersion")
    public void setAcceptedVersion(String acceptedVersion) {
        this.acceptedVersion = acceptedVersion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareDeliveryDetailsDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fareProvider");
        sb.append('=');
        sb.append(((this.fareProvider == null)?"<null>":this.fareProvider));
        sb.append(',');
        sb.append("deliveryId");
        sb.append('=');
        sb.append(((this.deliveryId == null)?"<null>":this.deliveryId));
        sb.append(',');
        sb.append("previousDeliveryId");
        sb.append('=');
        sb.append(((this.previousDeliveryId == null)?"<null>":this.previousDeliveryId));
        sb.append(',');
        sb.append("replacementDeliveryId");
        sb.append('=');
        sb.append(((this.replacementDeliveryId == null)?"<null>":this.replacementDeliveryId));
        sb.append(',');
        sb.append("optionalDelivery");
        sb.append('=');
        sb.append(((this.optionalDelivery == null)?"<null>":this.optionalDelivery));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("acceptedVersion");
        sb.append('=');
        sb.append(((this.acceptedVersion == null)?"<null>":this.acceptedVersion));
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
        result = ((result* 31)+((this.deliveryId == null)? 0 :this.deliveryId.hashCode()));
        result = ((result* 31)+((this.acceptedVersion == null)? 0 :this.acceptedVersion.hashCode()));
        result = ((result* 31)+((this.replacementDeliveryId == null)? 0 :this.replacementDeliveryId.hashCode()));
        result = ((result* 31)+((this.optionalDelivery == null)? 0 :this.optionalDelivery.hashCode()));
        result = ((result* 31)+((this.fareProvider == null)? 0 :this.fareProvider.hashCode()));
        result = ((result* 31)+((this.previousDeliveryId == null)? 0 :this.previousDeliveryId.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareDeliveryDetailsDef) == false) {
            return false;
        }
        FareDeliveryDetailsDef rhs = ((FareDeliveryDetailsDef) other);
        return ((((((((this.deliveryId == rhs.deliveryId)||((this.deliveryId!= null)&&this.deliveryId.equals(rhs.deliveryId)))&&((this.acceptedVersion == rhs.acceptedVersion)||((this.acceptedVersion!= null)&&this.acceptedVersion.equals(rhs.acceptedVersion))))&&((this.replacementDeliveryId == rhs.replacementDeliveryId)||((this.replacementDeliveryId!= null)&&this.replacementDeliveryId.equals(rhs.replacementDeliveryId))))&&((this.optionalDelivery == rhs.optionalDelivery)||((this.optionalDelivery!= null)&&this.optionalDelivery.equals(rhs.optionalDelivery))))&&((this.fareProvider == rhs.fareProvider)||((this.fareProvider!= null)&&this.fareProvider.equals(rhs.fareProvider))))&&((this.previousDeliveryId == rhs.previousDeliveryId)||((this.previousDeliveryId!= null)&&this.previousDeliveryId.equals(rhs.previousDeliveryId))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))));
    }

}
