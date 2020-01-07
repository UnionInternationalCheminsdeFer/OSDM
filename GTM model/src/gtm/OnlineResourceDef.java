
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resourceType",
    "interfaceType",
    "version",
    "system"
})
public class OnlineResourceDef {

    /**
     * The resource provides offers bases on trains or based on areas. Train based offers must start and end at a read station and are not splitted inbetween a train run . Values TRAIN, AREA
     * 
     */
    @JsonProperty("resourceType")
    @JsonPropertyDescription("The resource provides offers bases on trains or based on areas. Train based offers must start and end at a read station and are not splitted inbetween a train run . Values TRAIN, AREA")
    private String resourceType;
    /**
     * "TAPTSI-B5", ""nTM",..
     * (Required)
     * 
     */
    @JsonProperty("interfaceType")
    @JsonPropertyDescription("\"TAPTSI-B5\", \"\"nTM\",..")
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
     * The resource provides offers bases on trains or based on areas. Train based offers must start and end at a read station and are not splitted inbetween a train run . Values TRAIN, AREA
     * 
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The resource provides offers bases on trains or based on areas. Train based offers must start and end at a read station and are not splitted inbetween a train run . Values TRAIN, AREA
     * 
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * "TAPTSI-B5", ""nTM",..
     * (Required)
     * 
     */
    @JsonProperty("interfaceType")
    public String getInterfaceType() {
        return interfaceType;
    }

    /**
     * "TAPTSI-B5", ""nTM",..
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
        sb.append("resourceType");
        sb.append('=');
        sb.append(((this.resourceType == null)?"<null>":this.resourceType));
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
        result = ((result* 31)+((this.interfaceType == null)? 0 :this.interfaceType.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.resourceType == null)? 0 :this.resourceType.hashCode()));
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
        return (((((this.interfaceType == rhs.interfaceType)||((this.interfaceType!= null)&&this.interfaceType.equals(rhs.interfaceType)))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.resourceType == rhs.resourceType)||((this.resourceType!= null)&&this.resourceType.equals(rhs.resourceType))));
    }

}
