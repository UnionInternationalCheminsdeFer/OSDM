
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
    "combiningServiceClassIds",
    "textRef",
    "text",
    "includesClassName",
    "reservationParameterId"
})
public class ServiceLevelDef {

    /**
     * Code of the service level, code-list in IRS 90918-1.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Code of the service level, code-list in IRS 90918-1.")
    private String id;
    /**
     * list of service class ids that can be combined with these service levels
     * 
     */
    @JsonProperty("combiningServiceClassIds")
    @JsonPropertyDescription("list of service class ids that can be combined with these service levels")
    private List<gtm.ServiceClassDefinitionDef.ServiceClassIdDef> combiningServiceClassIds = new ArrayList<gtm.ServiceClassDefinitionDef.ServiceClassIdDef>();
    /**
     * id of the text describing the service level
     * 
     */
    @JsonProperty("textRef")
    @JsonPropertyDescription("id of the text describing the service level")
    private String textRef;
    /**
     * directly included text in case of online services
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("directly included text in case of online services")
    private TextDef text;
    /**
     * indicates that the class name is included
     * 
     */
    @JsonProperty("includesClassName")
    @JsonPropertyDescription("indicates that the class name is included")
    private Boolean includesClassName = true;
    @JsonProperty("reservationParameterId")
    private String reservationParameterId;

    /**
     * Code of the service level, code-list in IRS 90918-1.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Code of the service level, code-list in IRS 90918-1.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * list of service class ids that can be combined with these service levels
     * 
     */
    @JsonProperty("combiningServiceClassIds")
    public List<gtm.ServiceClassDefinitionDef.ServiceClassIdDef> getCombiningServiceClassIds() {
        return combiningServiceClassIds;
    }

    /**
     * list of service class ids that can be combined with these service levels
     * 
     */
    @JsonProperty("combiningServiceClassIds")
    public void setCombiningServiceClassIds(List<gtm.ServiceClassDefinitionDef.ServiceClassIdDef> combiningServiceClassIds) {
        this.combiningServiceClassIds = combiningServiceClassIds;
    }

    /**
     * id of the text describing the service level
     * 
     */
    @JsonProperty("textRef")
    public String getTextRef() {
        return textRef;
    }

    /**
     * id of the text describing the service level
     * 
     */
    @JsonProperty("textRef")
    public void setTextRef(String textRef) {
        this.textRef = textRef;
    }

    /**
     * directly included text in case of online services
     * (Required)
     * 
     */
    @JsonProperty("text")
    public TextDef getText() {
        return text;
    }

    /**
     * directly included text in case of online services
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(TextDef text) {
        this.text = text;
    }

    /**
     * indicates that the class name is included
     * 
     */
    @JsonProperty("includesClassName")
    public Boolean getIncludesClassName() {
        return includesClassName;
    }

    /**
     * indicates that the class name is included
     * 
     */
    @JsonProperty("includesClassName")
    public void setIncludesClassName(Boolean includesClassName) {
        this.includesClassName = includesClassName;
    }

    @JsonProperty("reservationParameterId")
    public String getReservationParameterId() {
        return reservationParameterId;
    }

    @JsonProperty("reservationParameterId")
    public void setReservationParameterId(String reservationParameterId) {
        this.reservationParameterId = reservationParameterId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceLevelDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("combiningServiceClassIds");
        sb.append('=');
        sb.append(((this.combiningServiceClassIds == null)?"<null>":this.combiningServiceClassIds));
        sb.append(',');
        sb.append("textRef");
        sb.append('=');
        sb.append(((this.textRef == null)?"<null>":this.textRef));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("includesClassName");
        sb.append('=');
        sb.append(((this.includesClassName == null)?"<null>":this.includesClassName));
        sb.append(',');
        sb.append("reservationParameterId");
        sb.append('=');
        sb.append(((this.reservationParameterId == null)?"<null>":this.reservationParameterId));
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
        result = ((result* 31)+((this.reservationParameterId == null)? 0 :this.reservationParameterId.hashCode()));
        result = ((result* 31)+((this.includesClassName == null)? 0 :this.includesClassName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.textRef == null)? 0 :this.textRef.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.combiningServiceClassIds == null)? 0 :this.combiningServiceClassIds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceLevelDef) == false) {
            return false;
        }
        ServiceLevelDef rhs = ((ServiceLevelDef) other);
        return (((((((this.reservationParameterId == rhs.reservationParameterId)||((this.reservationParameterId!= null)&&this.reservationParameterId.equals(rhs.reservationParameterId)))&&((this.includesClassName == rhs.includesClassName)||((this.includesClassName!= null)&&this.includesClassName.equals(rhs.includesClassName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.textRef == rhs.textRef)||((this.textRef!= null)&&this.textRef.equals(rhs.textRef))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.combiningServiceClassIds == rhs.combiningServiceClassIds)||((this.combiningServiceClassIds!= null)&&this.combiningServiceClassIds.equals(rhs.combiningServiceClassIds))));
    }

}
