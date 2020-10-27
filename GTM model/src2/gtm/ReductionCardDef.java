
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "issuer",
    "id",
    "name",
    "nameRef",
    "serviceClasses",
    "type",
    "cardIdRequired"
})
public class ReductionCardDef {

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("issuer")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String issuer;
    /**
     * id of the card type within the issuer
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("id of the card type within the issuer")
    private String id;
    /**
     * directly included text in case of online services
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("directly included text in case of online services")
    private TextDef name;
    /**
     * referenced text in bulk data
     * 
     */
    @JsonProperty("nameRef")
    @JsonPropertyDescription("referenced text in bulk data")
    private String nameRef;
    /**
     * list of service classes in case this class is available for different classes
     * 
     */
    @JsonProperty("serviceClasses")
    @JsonPropertyDescription("list of service classes in case this class is available for different classes")
    private List<gtm.ServiceClassDefinitionDef.ServiceClassIdDef> serviceClasses = new ArrayList<gtm.ServiceClassDefinitionDef.ServiceClassIdDef>();
    /**
     * LOYALTY_CARD,REDUCTION_CARD,PASS
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("LOYALTY_CARD,REDUCTION_CARD,PASS")
    private String type;
    /**
     * the card id must be delivered in online sales 
     * 
     */
    @JsonProperty("cardIdRequired")
    @JsonPropertyDescription("the card id must be delivered in online sales ")
    private Boolean cardIdRequired = false;

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("issuer")
    public String getIssuer() {
        return issuer;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * (Required)
     * 
     */
    @JsonProperty("issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * id of the card type within the issuer
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * id of the card type within the issuer
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * directly included text in case of online services
     * (Required)
     * 
     */
    @JsonProperty("name")
    public TextDef getName() {
        return name;
    }

    /**
     * directly included text in case of online services
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(TextDef name) {
        this.name = name;
    }

    /**
     * referenced text in bulk data
     * 
     */
    @JsonProperty("nameRef")
    public String getNameRef() {
        return nameRef;
    }

    /**
     * referenced text in bulk data
     * 
     */
    @JsonProperty("nameRef")
    public void setNameRef(String nameRef) {
        this.nameRef = nameRef;
    }

    /**
     * list of service classes in case this class is available for different classes
     * 
     */
    @JsonProperty("serviceClasses")
    public List<gtm.ServiceClassDefinitionDef.ServiceClassIdDef> getServiceClasses() {
        return serviceClasses;
    }

    /**
     * list of service classes in case this class is available for different classes
     * 
     */
    @JsonProperty("serviceClasses")
    public void setServiceClasses(List<gtm.ServiceClassDefinitionDef.ServiceClassIdDef> serviceClasses) {
        this.serviceClasses = serviceClasses;
    }

    /**
     * LOYALTY_CARD,REDUCTION_CARD,PASS
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * LOYALTY_CARD,REDUCTION_CARD,PASS
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * the card id must be delivered in online sales 
     * 
     */
    @JsonProperty("cardIdRequired")
    public Boolean getCardIdRequired() {
        return cardIdRequired;
    }

    /**
     * the card id must be delivered in online sales 
     * 
     */
    @JsonProperty("cardIdRequired")
    public void setCardIdRequired(Boolean cardIdRequired) {
        this.cardIdRequired = cardIdRequired;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReductionCardDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("issuer");
        sb.append('=');
        sb.append(((this.issuer == null)?"<null>":this.issuer));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameRef");
        sb.append('=');
        sb.append(((this.nameRef == null)?"<null>":this.nameRef));
        sb.append(',');
        sb.append("serviceClasses");
        sb.append('=');
        sb.append(((this.serviceClasses == null)?"<null>":this.serviceClasses));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("cardIdRequired");
        sb.append('=');
        sb.append(((this.cardIdRequired == null)?"<null>":this.cardIdRequired));
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
        result = ((result* 31)+((this.serviceClasses == null)? 0 :this.serviceClasses.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.nameRef == null)? 0 :this.nameRef.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.issuer == null)? 0 :this.issuer.hashCode()));
        result = ((result* 31)+((this.cardIdRequired == null)? 0 :this.cardIdRequired.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReductionCardDef) == false) {
            return false;
        }
        ReductionCardDef rhs = ((ReductionCardDef) other);
        return ((((((((this.serviceClasses == rhs.serviceClasses)||((this.serviceClasses!= null)&&this.serviceClasses.equals(rhs.serviceClasses)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.nameRef == rhs.nameRef)||((this.nameRef!= null)&&this.nameRef.equals(rhs.nameRef))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.issuer == rhs.issuer)||((this.issuer!= null)&&this.issuer.equals(rhs.issuer))))&&((this.cardIdRequired == rhs.cardIdRequired)||((this.cardIdRequired!= null)&&this.cardIdRequired.equals(rhs.cardIdRequired))));
    }

}
