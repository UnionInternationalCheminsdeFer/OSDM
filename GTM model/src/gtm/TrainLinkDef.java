
package gtm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FromStation",
    "ToStation",
    "Train",
    "TravelDate"
})
public class TrainLinkDef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FromStation")
    private StationDef fromStation;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ToStation")
    private StationDef toStation;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Train")
    private String train;
    /**
     * UTC date in format YYYY-MM-DDThh:mm:ssTZD. TDZ should be given as offset: (eg. 1997-07-16T19:20:30.45+01:00)
     * (Required)
     * 
     */
    @JsonProperty("TravelDate")
    @JsonPropertyDescription("UTC date in format YYYY-MM-DDThh:mm:ssTZD. TDZ should be given as offset: (eg. 1997-07-16T19:20:30.45+01:00)")
    private String travelDate;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FromStation")
    public StationDef getFromStation() {
        return fromStation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FromStation")
    public void setFromStation(StationDef fromStation) {
        this.fromStation = fromStation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ToStation")
    public StationDef getToStation() {
        return toStation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ToStation")
    public void setToStation(StationDef toStation) {
        this.toStation = toStation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Train")
    public String getTrain() {
        return train;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Train")
    public void setTrain(String train) {
        this.train = train;
    }

    /**
     * UTC date in format YYYY-MM-DDThh:mm:ssTZD. TDZ should be given as offset: (eg. 1997-07-16T19:20:30.45+01:00)
     * (Required)
     * 
     */
    @JsonProperty("TravelDate")
    public String getTravelDate() {
        return travelDate;
    }

    /**
     * UTC date in format YYYY-MM-DDThh:mm:ssTZD. TDZ should be given as offset: (eg. 1997-07-16T19:20:30.45+01:00)
     * (Required)
     * 
     */
    @JsonProperty("TravelDate")
    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrainLinkDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromStation");
        sb.append('=');
        sb.append(((this.fromStation == null)?"<null>":this.fromStation));
        sb.append(',');
        sb.append("toStation");
        sb.append('=');
        sb.append(((this.toStation == null)?"<null>":this.toStation));
        sb.append(',');
        sb.append("train");
        sb.append('=');
        sb.append(((this.train == null)?"<null>":this.train));
        sb.append(',');
        sb.append("travelDate");
        sb.append('=');
        sb.append(((this.travelDate == null)?"<null>":this.travelDate));
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
        result = ((result* 31)+((this.toStation == null)? 0 :this.toStation.hashCode()));
        result = ((result* 31)+((this.travelDate == null)? 0 :this.travelDate.hashCode()));
        result = ((result* 31)+((this.fromStation == null)? 0 :this.fromStation.hashCode()));
        result = ((result* 31)+((this.train == null)? 0 :this.train.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrainLinkDef) == false) {
            return false;
        }
        TrainLinkDef rhs = ((TrainLinkDef) other);
        return (((((this.toStation == rhs.toStation)||((this.toStation!= null)&&this.toStation.equals(rhs.toStation)))&&((this.travelDate == rhs.travelDate)||((this.travelDate!= null)&&this.travelDate.equals(rhs.travelDate))))&&((this.fromStation == rhs.fromStation)||((this.fromStation!= null)&&this.fromStation.equals(rhs.fromStation))))&&((this.train == rhs.train)||((this.train!= null)&&this.train.equals(rhs.train))));
    }

}
