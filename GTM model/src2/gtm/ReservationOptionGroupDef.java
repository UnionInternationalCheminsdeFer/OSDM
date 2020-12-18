
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "preferenceGroup",
    "preferences"
})
public class ReservationOptionGroupDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("preferenceGroup")
    private String preferenceGroup;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("preferences")
    private List<String> preferences = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("preferenceGroup")
    public String getPreferenceGroup() {
        return preferenceGroup;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("preferenceGroup")
    public void setPreferenceGroup(String preferenceGroup) {
        this.preferenceGroup = preferenceGroup;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("preferences")
    public List<String> getPreferences() {
        return preferences;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("preferences")
    public void setPreferences(List<String> preferences) {
        this.preferences = preferences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReservationOptionGroupDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preferenceGroup");
        sb.append('=');
        sb.append(((this.preferenceGroup == null)?"<null>":this.preferenceGroup));
        sb.append(',');
        sb.append("preferences");
        sb.append('=');
        sb.append(((this.preferences == null)?"<null>":this.preferences));
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
        result = ((result* 31)+((this.preferenceGroup == null)? 0 :this.preferenceGroup.hashCode()));
        result = ((result* 31)+((this.preferences == null)? 0 :this.preferences.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReservationOptionGroupDef) == false) {
            return false;
        }
        ReservationOptionGroupDef rhs = ((ReservationOptionGroupDef) other);
        return (((this.preferenceGroup == rhs.preferenceGroup)||((this.preferenceGroup!= null)&&this.preferenceGroup.equals(rhs.preferenceGroup)))&&((this.preferences == rhs.preferences)||((this.preferences!= null)&&this.preferences.equals(rhs.preferences))));
    }

}
