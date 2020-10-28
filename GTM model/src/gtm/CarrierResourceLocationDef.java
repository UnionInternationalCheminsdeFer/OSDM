
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrier",
    "serviceBrandCode",
    "onlineResource"
})
public class CarrierResourceLocationDef {

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("carrier")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String carrier;
    /**
     * Service brand codes allowed in response, code list can be found on  [https:/uic.org/passenger/passenger-services-group/article/service-brand-code-list] (https:/uic.org/passenger/passenger-services-group/article/service-brand-code-list)
     * 
     */
    @JsonProperty("serviceBrandCode")
    @JsonPropertyDescription("Service brand codes allowed in response, code list can be found on  [https:/uic.org/passenger/passenger-services-group/article/service-brand-code-list] (https:/uic.org/passenger/passenger-services-group/article/service-brand-code-list)")
    private Integer serviceBrandCode;
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
     * Service brand codes allowed in response, code list can be found on  [https:/uic.org/passenger/passenger-services-group/article/service-brand-code-list] (https:/uic.org/passenger/passenger-services-group/article/service-brand-code-list)
     * 
     */
    @JsonProperty("serviceBrandCode")
    public Integer getServiceBrandCode() {
        return serviceBrandCode;
    }

    /**
     * Service brand codes allowed in response, code list can be found on  [https:/uic.org/passenger/passenger-services-group/article/service-brand-code-list] (https:/uic.org/passenger/passenger-services-group/article/service-brand-code-list)
     * 
     */
    @JsonProperty("serviceBrandCode")
    public void setServiceBrandCode(Integer serviceBrandCode) {
        this.serviceBrandCode = serviceBrandCode;
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
        sb.append(CarrierResourceLocationDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("serviceBrandCode");
        sb.append('=');
        sb.append(((this.serviceBrandCode == null)?"<null>":this.serviceBrandCode));
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
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.serviceBrandCode == null)? 0 :this.serviceBrandCode.hashCode()));
        result = ((result* 31)+((this.onlineResource == null)? 0 :this.onlineResource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CarrierResourceLocationDef) == false) {
            return false;
        }
        CarrierResourceLocationDef rhs = ((CarrierResourceLocationDef) other);
        return ((((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier)))&&((this.serviceBrandCode == rhs.serviceBrandCode)||((this.serviceBrandCode!= null)&&this.serviceBrandCode.equals(rhs.serviceBrandCode))))&&((this.onlineResource == rhs.onlineResource)||((this.onlineResource!= null)&&this.onlineResource.equals(rhs.onlineResource))));
    }

}
