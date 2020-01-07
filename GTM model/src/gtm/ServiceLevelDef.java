
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
    "combiningServiceClasses",
    "textRef",
    "includesClassName",
    "reservationParameterId"
})
public class ServiceLevelDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * list of service class ids that can be combined with these service levels
     * 
     */
    @JsonProperty("combiningServiceClasses")
    @JsonPropertyDescription("list of service class ids that can be combined with these service levels")
    private List<String> combiningServiceClasses = new ArrayList<String>();
    /**
     * id of the text describing the service level
     * 
     */
    @JsonProperty("textRef")
    @JsonPropertyDescription("id of the text describing the service level")
    private String textRef;
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
     * list of service class ids that can be combined with these service levels
     * 
     */
    @JsonProperty("combiningServiceClasses")
    public List<String> getCombiningServiceClasses() {
        return combiningServiceClasses;
    }

    /**
     * list of service class ids that can be combined with these service levels
     * 
     */
    @JsonProperty("combiningServiceClasses")
    public void setCombiningServiceClasses(List<String> combiningServiceClasses) {
        this.combiningServiceClasses = combiningServiceClasses;
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
        sb.append("combiningServiceClasses");
        sb.append('=');
        sb.append(((this.combiningServiceClasses == null)?"<null>":this.combiningServiceClasses));
        sb.append(',');
        sb.append("textRef");
        sb.append('=');
        sb.append(((this.textRef == null)?"<null>":this.textRef));
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
        result = ((result* 31)+((this.combiningServiceClasses == null)? 0 :this.combiningServiceClasses.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.textRef == null)? 0 :this.textRef.hashCode()));
        result = ((result* 31)+((this.reservationParameterId == null)? 0 :this.reservationParameterId.hashCode()));
        result = ((result* 31)+((this.includesClassName == null)? 0 :this.includesClassName.hashCode()));
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
        return ((((((this.combiningServiceClasses == rhs.combiningServiceClasses)||((this.combiningServiceClasses!= null)&&this.combiningServiceClasses.equals(rhs.combiningServiceClasses)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.textRef == rhs.textRef)||((this.textRef!= null)&&this.textRef.equals(rhs.textRef))))&&((this.reservationParameterId == rhs.reservationParameterId)||((this.reservationParameterId!= null)&&this.reservationParameterId.equals(rhs.reservationParameterId))))&&((this.includesClassName == rhs.includesClassName)||((this.includesClassName!= null)&&this.includesClassName.equals(rhs.includesClassName))));
    }

}
