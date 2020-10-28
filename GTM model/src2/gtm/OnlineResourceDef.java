
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offerType",
    "interfaceType",
    "version",
    "system"
})
public class OnlineResourceDef {

    /**
     * The resource provides offers bases on trains or based on areas. Train based offers must start and end at a real station and are not splitted inbetween a train run . Values TRAIN, AREA
     * 
     */
    @JsonProperty("offerType")
    @JsonPropertyDescription("The resource provides offers bases on trains or based on areas. Train based offers must start and end at a real station and are not splitted inbetween a train run . Values TRAIN, AREA")
    private String offerType;
    /**
     * GTM,...
     * (Required)
     * 
     */
    @JsonProperty("interfaceType")
    @JsonPropertyDescription("GTM,...")
    private String interfaceType;
    @JsonProperty("version")
    private String version;
    /**
     * system where the offer can be found (e.r. for TAP-TSI-B5 the reservation system code)
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("system where the offer can be found (e.r. for TAP-TSI-B5 the reservation system code)")
    private String system;

    /**
     * The resource provides offers bases on trains or based on areas. Train based offers must start and end at a real station and are not splitted inbetween a train run . Values TRAIN, AREA
     * 
     */
    @JsonProperty("offerType")
    public String getOfferType() {
        return offerType;
    }

    /**
     * The resource provides offers bases on trains or based on areas. Train based offers must start and end at a real station and are not splitted inbetween a train run . Values TRAIN, AREA
     * 
     */
    @JsonProperty("offerType")
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    /**
     * GTM,...
     * (Required)
     * 
     */
    @JsonProperty("interfaceType")
    public String getInterfaceType() {
        return interfaceType;
    }

    /**
     * GTM,...
     * (Required)
     * 
     */
    @JsonProperty("interfaceType")
    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * system where the offer can be found (e.r. for TAP-TSI-B5 the reservation system code)
     * 
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * system where the offer can be found (e.r. for TAP-TSI-B5 the reservation system code)
     * 
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OnlineResourceDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("offerType");
        sb.append('=');
        sb.append(((this.offerType == null)?"<null>":this.offerType));
        sb.append(',');
        sb.append("interfaceType");
        sb.append('=');
        sb.append(((this.interfaceType == null)?"<null>":this.interfaceType));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
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
        result = ((result* 31)+((this.offerType == null)? 0 :this.offerType.hashCode()));
        result = ((result* 31)+((this.interfaceType == null)? 0 :this.interfaceType.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OnlineResourceDef) == false) {
            return false;
        }
        OnlineResourceDef rhs = ((OnlineResourceDef) other);
        return (((((this.offerType == rhs.offerType)||((this.offerType!= null)&&this.offerType.equals(rhs.offerType)))&&((this.interfaceType == rhs.interfaceType)||((this.interfaceType!= null)&&this.interfaceType.equals(rhs.interfaceType))))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))));
    }

}
