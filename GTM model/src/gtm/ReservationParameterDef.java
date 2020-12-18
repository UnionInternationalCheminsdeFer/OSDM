
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "reservationRequired",
    "reservationParams918-1",
    "reservationOptions",
    "reservationRequiredForBrand",
    "reservationRequiredForMode"
})
public class ReservationParameterDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("reservationRequired")
    private Boolean reservationRequired = false;
    /**
     * reservation parameter to support the UIC 90918-1 interface for booking
     * 
     */
    @JsonProperty("reservationParams918-1")
    @JsonPropertyDescription("reservation parameter to support the UIC 90918-1 interface for booking")
    private LegacyReservationParameterDef reservationParams9181;
    /**
     * options for reservations, Note: full details might be provided in the online version only
     * 
     */
    @JsonProperty("reservationOptions")
    @JsonPropertyDescription("options for reservations, Note: full details might be provided in the online version only")
    private ReservationOptions reservationOptions;
    /**
     * service brand mode for which a reservation is mandatory
     * 
     */
    @JsonProperty("reservationRequiredForBrand")
    @JsonPropertyDescription("service brand mode for which a reservation is mandatory")
    private List<Integer> reservationRequiredForBrand = new ArrayList<Integer>();
    /**
     * service service mode for which a reservation is mandatory
     * 
     */
    @JsonProperty("reservationRequiredForMode")
    @JsonPropertyDescription("service service mode for which a reservation is mandatory")
    private List<String> reservationRequiredForMode = new ArrayList<String>();

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

    @JsonProperty("reservationRequired")
    public Boolean getReservationRequired() {
        return reservationRequired;
    }

    @JsonProperty("reservationRequired")
    public void setReservationRequired(Boolean reservationRequired) {
        this.reservationRequired = reservationRequired;
    }

    /**
     * reservation parameter to support the UIC 90918-1 interface for booking
     * 
     */
    @JsonProperty("reservationParams918-1")
    public LegacyReservationParameterDef getReservationParams9181() {
        return reservationParams9181;
    }

    /**
     * reservation parameter to support the UIC 90918-1 interface for booking
     * 
     */
    @JsonProperty("reservationParams918-1")
    public void setReservationParams9181(LegacyReservationParameterDef reservationParams9181) {
        this.reservationParams9181 = reservationParams9181;
    }

    /**
     * options for reservations, Note: full details might be provided in the online version only
     * 
     */
    @JsonProperty("reservationOptions")
    public ReservationOptions getReservationOptions() {
        return reservationOptions;
    }

    /**
     * options for reservations, Note: full details might be provided in the online version only
     * 
     */
    @JsonProperty("reservationOptions")
    public void setReservationOptions(ReservationOptions reservationOptions) {
        this.reservationOptions = reservationOptions;
    }

    /**
     * service brand mode for which a reservation is mandatory
     * 
     */
    @JsonProperty("reservationRequiredForBrand")
    public List<Integer> getReservationRequiredForBrand() {
        return reservationRequiredForBrand;
    }

    /**
     * service brand mode for which a reservation is mandatory
     * 
     */
    @JsonProperty("reservationRequiredForBrand")
    public void setReservationRequiredForBrand(List<Integer> reservationRequiredForBrand) {
        this.reservationRequiredForBrand = reservationRequiredForBrand;
    }

    /**
     * service service mode for which a reservation is mandatory
     * 
     */
    @JsonProperty("reservationRequiredForMode")
    public List<String> getReservationRequiredForMode() {
        return reservationRequiredForMode;
    }

    /**
     * service service mode for which a reservation is mandatory
     * 
     */
    @JsonProperty("reservationRequiredForMode")
    public void setReservationRequiredForMode(List<String> reservationRequiredForMode) {
        this.reservationRequiredForMode = reservationRequiredForMode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReservationParameterDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("reservationRequired");
        sb.append('=');
        sb.append(((this.reservationRequired == null)?"<null>":this.reservationRequired));
        sb.append(',');
        sb.append("reservationParams9181");
        sb.append('=');
        sb.append(((this.reservationParams9181 == null)?"<null>":this.reservationParams9181));
        sb.append(',');
        sb.append("reservationOptions");
        sb.append('=');
        sb.append(((this.reservationOptions == null)?"<null>":this.reservationOptions));
        sb.append(',');
        sb.append("reservationRequiredForBrand");
        sb.append('=');
        sb.append(((this.reservationRequiredForBrand == null)?"<null>":this.reservationRequiredForBrand));
        sb.append(',');
        sb.append("reservationRequiredForMode");
        sb.append('=');
        sb.append(((this.reservationRequiredForMode == null)?"<null>":this.reservationRequiredForMode));
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
        result = ((result* 31)+((this.reservationRequiredForBrand == null)? 0 :this.reservationRequiredForBrand.hashCode()));
        result = ((result* 31)+((this.reservationRequiredForMode == null)? 0 :this.reservationRequiredForMode.hashCode()));
        result = ((result* 31)+((this.reservationOptions == null)? 0 :this.reservationOptions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reservationParams9181 == null)? 0 :this.reservationParams9181 .hashCode()));
        result = ((result* 31)+((this.reservationRequired == null)? 0 :this.reservationRequired.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReservationParameterDef) == false) {
            return false;
        }
        ReservationParameterDef rhs = ((ReservationParameterDef) other);
        return (((((((this.reservationRequiredForBrand == rhs.reservationRequiredForBrand)||((this.reservationRequiredForBrand!= null)&&this.reservationRequiredForBrand.equals(rhs.reservationRequiredForBrand)))&&((this.reservationRequiredForMode == rhs.reservationRequiredForMode)||((this.reservationRequiredForMode!= null)&&this.reservationRequiredForMode.equals(rhs.reservationRequiredForMode))))&&((this.reservationOptions == rhs.reservationOptions)||((this.reservationOptions!= null)&&this.reservationOptions.equals(rhs.reservationOptions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reservationParams9181 == rhs.reservationParams9181)||((this.reservationParams9181 != null)&&this.reservationParams9181 .equals(rhs.reservationParams9181))))&&((this.reservationRequired == rhs.reservationRequired)||((this.reservationRequired!= null)&&this.reservationRequired.equals(rhs.reservationRequired))));
    }

}
