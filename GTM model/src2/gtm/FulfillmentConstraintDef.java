
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "acceptedControlSecurityTypes",
    "acceptedBarCodes",
    "requiredBarCodes",
    "requiredSiS",
    "individualTicketingPermitted"
})
public class FulfillmentConstraintDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("acceptedControlSecurityTypes")
    private List<ControlSecurityTypeDef> acceptedControlSecurityTypes = new ArrayList<ControlSecurityTypeDef>();
    /**
     * for SiD fulfillment one of the listed bar codes is required
     * 
     */
    @JsonProperty("acceptedBarCodes")
    @JsonPropertyDescription("for SiD fulfillment one of the listed bar codes is required")
    private List<BarCodeTypesDef> acceptedBarCodes = new ArrayList<BarCodeTypesDef>();
    /**
     * One of the listed bar codes must be provided.
     * 
     */
    @JsonProperty("requiredBarCodes")
    @JsonPropertyDescription("One of the listed bar codes must be provided.")
    private List<BarCodeTypesDef> requiredBarCodes = new ArrayList<BarCodeTypesDef>();
    /**
     * To guarantee security in system (SiS) of the fulfillment one of the listed interfaces is required.
     * 
     */
    @JsonProperty("requiredSiS")
    @JsonPropertyDescription("To guarantee security in system (SiS) of the fulfillment one of the listed interfaces is required.")
    private List<RequiredSi> requiredSiS = new ArrayList<RequiredSi>();
    /**
     * a separate fulfillment per traveler is permitted
     * (Required)
     * 
     */
    @JsonProperty("individualTicketingPermitted")
    @JsonPropertyDescription("a separate fulfillment per traveler is permitted")
    private Boolean individualTicketingPermitted;

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

    @JsonProperty("acceptedControlSecurityTypes")
    public List<ControlSecurityTypeDef> getAcceptedControlSecurityTypes() {
        return acceptedControlSecurityTypes;
    }

    @JsonProperty("acceptedControlSecurityTypes")
    public void setAcceptedControlSecurityTypes(List<ControlSecurityTypeDef> acceptedControlSecurityTypes) {
        this.acceptedControlSecurityTypes = acceptedControlSecurityTypes;
    }

    /**
     * for SiD fulfillment one of the listed bar codes is required
     * 
     */
    @JsonProperty("acceptedBarCodes")
    public List<BarCodeTypesDef> getAcceptedBarCodes() {
        return acceptedBarCodes;
    }

    /**
     * for SiD fulfillment one of the listed bar codes is required
     * 
     */
    @JsonProperty("acceptedBarCodes")
    public void setAcceptedBarCodes(List<BarCodeTypesDef> acceptedBarCodes) {
        this.acceptedBarCodes = acceptedBarCodes;
    }

    /**
     * One of the listed bar codes must be provided.
     * 
     */
    @JsonProperty("requiredBarCodes")
    public List<BarCodeTypesDef> getRequiredBarCodes() {
        return requiredBarCodes;
    }

    /**
     * One of the listed bar codes must be provided.
     * 
     */
    @JsonProperty("requiredBarCodes")
    public void setRequiredBarCodes(List<BarCodeTypesDef> requiredBarCodes) {
        this.requiredBarCodes = requiredBarCodes;
    }

    /**
     * To guarantee security in system (SiS) of the fulfillment one of the listed interfaces is required.
     * 
     */
    @JsonProperty("requiredSiS")
    public List<RequiredSi> getRequiredSiS() {
        return requiredSiS;
    }

    /**
     * To guarantee security in system (SiS) of the fulfillment one of the listed interfaces is required.
     * 
     */
    @JsonProperty("requiredSiS")
    public void setRequiredSiS(List<RequiredSi> requiredSiS) {
        this.requiredSiS = requiredSiS;
    }

    /**
     * a separate fulfillment per traveler is permitted
     * (Required)
     * 
     */
    @JsonProperty("individualTicketingPermitted")
    public Boolean getIndividualTicketingPermitted() {
        return individualTicketingPermitted;
    }

    /**
     * a separate fulfillment per traveler is permitted
     * (Required)
     * 
     */
    @JsonProperty("individualTicketingPermitted")
    public void setIndividualTicketingPermitted(Boolean individualTicketingPermitted) {
        this.individualTicketingPermitted = individualTicketingPermitted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FulfillmentConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("acceptedControlSecurityTypes");
        sb.append('=');
        sb.append(((this.acceptedControlSecurityTypes == null)?"<null>":this.acceptedControlSecurityTypes));
        sb.append(',');
        sb.append("acceptedBarCodes");
        sb.append('=');
        sb.append(((this.acceptedBarCodes == null)?"<null>":this.acceptedBarCodes));
        sb.append(',');
        sb.append("requiredBarCodes");
        sb.append('=');
        sb.append(((this.requiredBarCodes == null)?"<null>":this.requiredBarCodes));
        sb.append(',');
        sb.append("requiredSiS");
        sb.append('=');
        sb.append(((this.requiredSiS == null)?"<null>":this.requiredSiS));
        sb.append(',');
        sb.append("individualTicketingPermitted");
        sb.append('=');
        sb.append(((this.individualTicketingPermitted == null)?"<null>":this.individualTicketingPermitted));
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
        result = ((result* 31)+((this.acceptedBarCodes == null)? 0 :this.acceptedBarCodes.hashCode()));
        result = ((result* 31)+((this.acceptedControlSecurityTypes == null)? 0 :this.acceptedControlSecurityTypes.hashCode()));
        result = ((result* 31)+((this.requiredSiS == null)? 0 :this.requiredSiS.hashCode()));
        result = ((result* 31)+((this.individualTicketingPermitted == null)? 0 :this.individualTicketingPermitted.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.requiredBarCodes == null)? 0 :this.requiredBarCodes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FulfillmentConstraintDef) == false) {
            return false;
        }
        FulfillmentConstraintDef rhs = ((FulfillmentConstraintDef) other);
        return (((((((this.acceptedBarCodes == rhs.acceptedBarCodes)||((this.acceptedBarCodes!= null)&&this.acceptedBarCodes.equals(rhs.acceptedBarCodes)))&&((this.acceptedControlSecurityTypes == rhs.acceptedControlSecurityTypes)||((this.acceptedControlSecurityTypes!= null)&&this.acceptedControlSecurityTypes.equals(rhs.acceptedControlSecurityTypes))))&&((this.requiredSiS == rhs.requiredSiS)||((this.requiredSiS!= null)&&this.requiredSiS.equals(rhs.requiredSiS))))&&((this.individualTicketingPermitted == rhs.individualTicketingPermitted)||((this.individualTicketingPermitted!= null)&&this.individualTicketingPermitted.equals(rhs.individualTicketingPermitted))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.requiredBarCodes == rhs.requiredBarCodes)||((this.requiredBarCodes!= null)&&this.requiredBarCodes.equals(rhs.requiredBarCodes))));
    }

}
