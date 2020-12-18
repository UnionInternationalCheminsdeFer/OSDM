
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "requiredData",
    "allowedChanges"
})
public class PersonalDataConstraintDef {

    @JsonProperty("id")
    private String id;
    @JsonProperty("requiredData")
    private List<RequiredDatum> requiredData = new ArrayList<RequiredDatum>();
    @JsonProperty("allowedChanges")
    private List<AllowedChange> allowedChanges = new ArrayList<AllowedChange>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("requiredData")
    public List<RequiredDatum> getRequiredData() {
        return requiredData;
    }

    @JsonProperty("requiredData")
    public void setRequiredData(List<RequiredDatum> requiredData) {
        this.requiredData = requiredData;
    }

    @JsonProperty("allowedChanges")
    public List<AllowedChange> getAllowedChanges() {
        return allowedChanges;
    }

    @JsonProperty("allowedChanges")
    public void setAllowedChanges(List<AllowedChange> allowedChanges) {
        this.allowedChanges = allowedChanges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonalDataConstraintDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requiredData");
        sb.append('=');
        sb.append(((this.requiredData == null)?"<null>":this.requiredData));
        sb.append(',');
        sb.append("allowedChanges");
        sb.append('=');
        sb.append(((this.allowedChanges == null)?"<null>":this.allowedChanges));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.allowedChanges == null)? 0 :this.allowedChanges.hashCode()));
        result = ((result* 31)+((this.requiredData == null)? 0 :this.requiredData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonalDataConstraintDef) == false) {
            return false;
        }
        PersonalDataConstraintDef rhs = ((PersonalDataConstraintDef) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.allowedChanges == rhs.allowedChanges)||((this.allowedChanges!= null)&&this.allowedChanges.equals(rhs.allowedChanges))))&&((this.requiredData == rhs.requiredData)||((this.requiredData!= null)&&this.requiredData.equals(rhs.requiredData))));
    }

}
