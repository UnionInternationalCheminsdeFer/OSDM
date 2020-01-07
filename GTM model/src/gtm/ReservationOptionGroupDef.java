
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "optionGroup",
    "option"
})
public class ReservationOptionGroupDef {

    @JsonProperty("optionGroup")
    private String optionGroup;
    @JsonProperty("option")
    private List<Object> option = new ArrayList<Object>();

    @JsonProperty("optionGroup")
    public String getOptionGroup() {
        return optionGroup;
    }

    @JsonProperty("optionGroup")
    public void setOptionGroup(String optionGroup) {
        this.optionGroup = optionGroup;
    }

    @JsonProperty("option")
    public List<Object> getOption() {
        return option;
    }

    @JsonProperty("option")
    public void setOption(List<Object> option) {
        this.option = option;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReservationOptionGroupDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("optionGroup");
        sb.append('=');
        sb.append(((this.optionGroup == null)?"<null>":this.optionGroup));
        sb.append(',');
        sb.append("option");
        sb.append('=');
        sb.append(((this.option == null)?"<null>":this.option));
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
        result = ((result* 31)+((this.optionGroup == null)? 0 :this.optionGroup.hashCode()));
        result = ((result* 31)+((this.option == null)? 0 :this.option.hashCode()));
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
        return (((this.optionGroup == rhs.optionGroup)||((this.optionGroup!= null)&&this.optionGroup.equals(rhs.optionGroup)))&&((this.option == rhs.option)||((this.option!= null)&&this.option.equals(rhs.option))));
    }

}
