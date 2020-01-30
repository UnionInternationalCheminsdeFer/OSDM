
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferenceGroup",
    "preference"
})
public class ReservationOptionGroupDef {

    @JsonProperty("preferenceGroup")
    private String preferenceGroup;
    @JsonProperty("preference")
    private List<String> preference = new ArrayList<String>();

    @JsonProperty("preferenceGroup")
    public String getPreferenceGroup() {
        return preferenceGroup;
    }

    @JsonProperty("preferenceGroup")
    public void setPreferenceGroup(String preferenceGroup) {
        this.preferenceGroup = preferenceGroup;
    }

    @JsonProperty("preference")
    public List<String> getPreference() {
        return preference;
    }

    @JsonProperty("preference")
    public void setPreference(List<String> preference) {
        this.preference = preference;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReservationOptionGroupDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preferenceGroup");
        sb.append('=');
        sb.append(((this.preferenceGroup == null)?"<null>":this.preferenceGroup));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
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
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
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
        return (((this.preferenceGroup == rhs.preferenceGroup)||((this.preferenceGroup!= null)&&this.preferenceGroup.equals(rhs.preferenceGroup)))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
