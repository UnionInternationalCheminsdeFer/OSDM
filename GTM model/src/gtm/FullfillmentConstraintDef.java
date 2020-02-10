
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
    "acceptedFullfillmentTypes",
    "acceptedBarCodes",
    "requiredBarCodes",
    "requiredSiS",
    "individualTicketingPermitted"
})
public class FullfillmentConstraintDef {

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
    @JsonProperty("acceptedFullfillmentTypes")
    private List<FulfillmentTypeDef> acceptedFullfillmentTypes = new ArrayList<FulfillmentTypeDef>();
    /**
     * for SiD fulllfillment one of the listed bar codes is required
     * 
     */
    @JsonProperty("acceptedBarCodes")
    @JsonPropertyDescription("for SiD fulllfillment one of the listed bar codes is required")
    private List<String> acceptedBarCodes = new ArrayList<String>();
    /**
     * one of the listed bar codes must be provided
     * 
     */
    @JsonProperty("requiredBarCodes")
    @JsonPropertyDescription("one of the listed bar codes must be provided")
    private List<String> requiredBarCodes = new ArrayList<String>();
    /**
     * for SiS fullfillment one of the listed interfaces is required
     * 
     */
    @JsonProperty("requiredSiS")
    @JsonPropertyDescription("for SiS fullfillment one of the listed interfaces is required")
    private List<String> requiredSiS = new ArrayList<String>();
    /**
     * a seprate fullfillment per traveler is permitted
     * (Required)
     * 
     */
    @JsonProperty("individualTicketingPermitted")
    @JsonPropertyDescription("a seprate fullfillment per traveler is permitted")
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acceptedFullfillmentTypes")
    public List<FulfillmentTypeDef> getAcceptedFullfillmentTypes() {
        return acceptedFullfillmentTypes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acceptedFullfillmentTypes")
    public void setAcceptedFullfillmentTypes(List<FulfillmentTypeDef> acceptedFullfillmentTypes) {
        this.acceptedFullfillmentTypes = acceptedFullfillmentTypes;
    }

    /**
     * for SiD fulllfillment one of the listed bar codes is required
     * 
     */
    @JsonProperty("acceptedBarCodes")
    public List<String> getAcceptedBarCodes() {
        return acceptedBarCodes;
    }

    /**
     * for SiD fulllfillment one of the listed bar codes is required
     * 
     */
    @JsonProperty("acceptedBarCodes")
    public void setAcceptedBarCodes(List<String> acceptedBarCodes) {
        this.acceptedBarCodes = acceptedBarCodes;
    }

    /**
     * one of the listed bar codes must be provided
     * 
     */
    @JsonProperty("requiredBarCodes")
    public List<String> getRequiredBarCodes() {
        return requiredBarCodes;
    }

    /**
     * one of the listed bar codes must be provided
     * 
     */
    @JsonProperty("requiredBarCodes")
    public void setRequiredBarCodes(List<String> requiredBarCodes) {
        this.requiredBarCodes = requiredBarCodes;
    }

    /**
     * for SiS fullfillment one of the listed interfaces is required
     * 
     */
    @JsonProperty("requiredSiS")
    public List<String> getRequiredSiS() {
        return requiredSiS;
    }

    /**
     * for SiS fullfillment one of the listed interfaces is required
     * 
     */
    @JsonProperty("requiredSiS")
    public void setRequiredSiS(List<String> requiredSiS) {
        this.requiredSiS = requiredSiS;
    }

    /**
     * a seprate fullfillment per traveler is permitted
     * (Required)
     * 
     */
    @JsonProperty("individualTicketingPermitted")
    public Boolean getIndividualTicketingPermitted() {
        return individualTicketingPermitted;
    }

    /**
     * a seprate fullfillment per traveler is permitted
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
        sb.append(FullfillmentConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("acceptedFullfillmentTypes");
        sb.append('=');
        sb.append(((this.acceptedFullfillmentTypes == null)?"<null>":this.acceptedFullfillmentTypes));
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
        result = ((result* 31)+((this.acceptedFullfillmentTypes == null)? 0 :this.acceptedFullfillmentTypes.hashCode()));
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
        if ((other instanceof FullfillmentConstraintDef) == false) {
            return false;
        }
        FullfillmentConstraintDef rhs = ((FullfillmentConstraintDef) other);
        return (((((((this.acceptedBarCodes == rhs.acceptedBarCodes)||((this.acceptedBarCodes!= null)&&this.acceptedBarCodes.equals(rhs.acceptedBarCodes)))&&((this.acceptedFullfillmentTypes == rhs.acceptedFullfillmentTypes)||((this.acceptedFullfillmentTypes!= null)&&this.acceptedFullfillmentTypes.equals(rhs.acceptedFullfillmentTypes))))&&((this.requiredSiS == rhs.requiredSiS)||((this.requiredSiS!= null)&&this.requiredSiS.equals(rhs.requiredSiS))))&&((this.individualTicketingPermitted == rhs.individualTicketingPermitted)||((this.individualTicketingPermitted!= null)&&this.individualTicketingPermitted.equals(rhs.individualTicketingPermitted))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.requiredBarCodes == rhs.requiredBarCodes)||((this.requiredBarCodes!= null)&&this.requiredBarCodes.equals(rhs.requiredBarCodes))));
    }

}
