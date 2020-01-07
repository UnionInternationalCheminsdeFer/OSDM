
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "reservationRequired",
    "reservationParams918-1",
    "reservationOptions"
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
    @JsonProperty("reservationParams918-1")
    private ReservationParams9181 reservationParams9181;
    /**
     * options for reservations, Not: full details might be provided in the online version only
     * 
     */
    @JsonProperty("reservationOptions")
    @JsonPropertyDescription("options for reservations, Not: full details might be provided in the online version only")
    private ReservationOptions reservationOptions;

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

    @JsonProperty("reservationParams918-1")
    public ReservationParams9181 getReservationParams9181() {
        return reservationParams9181;
    }

    @JsonProperty("reservationParams918-1")
    public void setReservationParams9181(ReservationParams9181 reservationParams9181) {
        this.reservationParams9181 = reservationParams9181;
    }

    /**
     * options for reservations, Not: full details might be provided in the online version only
     * 
     */
    @JsonProperty("reservationOptions")
    public ReservationOptions getReservationOptions() {
        return reservationOptions;
    }

    /**
     * options for reservations, Not: full details might be provided in the online version only
     * 
     */
    @JsonProperty("reservationOptions")
    public void setReservationOptions(ReservationOptions reservationOptions) {
        this.reservationOptions = reservationOptions;
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
        return (((((this.reservationOptions == rhs.reservationOptions)||((this.reservationOptions!= null)&&this.reservationOptions.equals(rhs.reservationOptions)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reservationParams9181 == rhs.reservationParams9181)||((this.reservationParams9181 != null)&&this.reservationParams9181 .equals(rhs.reservationParams9181))))&&((this.reservationRequired == rhs.reservationRequired)||((this.reservationRequired!= null)&&this.reservationRequired.equals(rhs.reservationRequired))));
    }

}
