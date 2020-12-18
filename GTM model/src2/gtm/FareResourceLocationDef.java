
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * locate the online services 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "CarrierLocations",
    "TrainLocations",
    "StationLocations"
})
public class FareResourceLocationDef {

    /**
     * locating the online resource via the carrier provided in the time table
     * 
     */
    @JsonProperty("CarrierLocations")
    @JsonPropertyDescription("locating the online resource via the carrier provided in the time table")
    private List<CarrierResourceLocationDef> carrierLocations = new ArrayList<CarrierResourceLocationDef>();
    /**
     * locating the online resource via the train from the time table
     * 
     */
    @JsonProperty("TrainLocations")
    @JsonPropertyDescription("locating the online resource via the train from the time table")
    private List<TrainResourceLocationDef> trainLocations = new ArrayList<TrainResourceLocationDef>();
    @JsonProperty("StationLocations")
    private List<StationResourceLocationDef> stationLocations = new ArrayList<StationResourceLocationDef>();

    /**
     * locating the online resource via the carrier provided in the time table
     * 
     */
    @JsonProperty("CarrierLocations")
    public List<CarrierResourceLocationDef> getCarrierLocations() {
        return carrierLocations;
    }

    /**
     * locating the online resource via the carrier provided in the time table
     * 
     */
    @JsonProperty("CarrierLocations")
    public void setCarrierLocations(List<CarrierResourceLocationDef> carrierLocations) {
        this.carrierLocations = carrierLocations;
    }

    /**
     * locating the online resource via the train from the time table
     * 
     */
    @JsonProperty("TrainLocations")
    public List<TrainResourceLocationDef> getTrainLocations() {
        return trainLocations;
    }

    /**
     * locating the online resource via the train from the time table
     * 
     */
    @JsonProperty("TrainLocations")
    public void setTrainLocations(List<TrainResourceLocationDef> trainLocations) {
        this.trainLocations = trainLocations;
    }

    @JsonProperty("StationLocations")
    public List<StationResourceLocationDef> getStationLocations() {
        return stationLocations;
    }

    @JsonProperty("StationLocations")
    public void setStationLocations(List<StationResourceLocationDef> stationLocations) {
        this.stationLocations = stationLocations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FareResourceLocationDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrierLocations");
        sb.append('=');
        sb.append(((this.carrierLocations == null)?"<null>":this.carrierLocations));
        sb.append(',');
        sb.append("trainLocations");
        sb.append('=');
        sb.append(((this.trainLocations == null)?"<null>":this.trainLocations));
        sb.append(',');
        sb.append("stationLocations");
        sb.append('=');
        sb.append(((this.stationLocations == null)?"<null>":this.stationLocations));
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
        result = ((result* 31)+((this.carrierLocations == null)? 0 :this.carrierLocations.hashCode()));
        result = ((result* 31)+((this.trainLocations == null)? 0 :this.trainLocations.hashCode()));
        result = ((result* 31)+((this.stationLocations == null)? 0 :this.stationLocations.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareResourceLocationDef) == false) {
            return false;
        }
        FareResourceLocationDef rhs = ((FareResourceLocationDef) other);
        return ((((this.carrierLocations == rhs.carrierLocations)||((this.carrierLocations!= null)&&this.carrierLocations.equals(rhs.carrierLocations)))&&((this.trainLocations == rhs.trainLocations)||((this.trainLocations!= null)&&this.trainLocations.equals(rhs.trainLocations))))&&((this.stationLocations == rhs.stationLocations)||((this.stationLocations!= null)&&this.stationLocations.equals(rhs.stationLocations))));
    }

}
