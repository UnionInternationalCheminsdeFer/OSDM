
package gtm;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fromStation",
    "toStation",
    "train",
    "travelDate"
})
public class TrainLinkDef {

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("fromStation")
    @JsonPropertyDescription("Used to represent a station location. This is a location that can be used as origin and destination for a train journey")
    private StationDef fromStation;
    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("toStation")
    @JsonPropertyDescription("Used to represent a station location. This is a location that can be used as origin and destination for a train journey")
    private StationDef toStation;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("train")
    private String train;
    /**
     * date and time of the departure where the train link starts
     * (Required)
     * 
     */
    @JsonProperty("travelDate")
    @JsonPropertyDescription("date and time of the departure where the train link starts")
    private Date travelDate;

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("fromStation")
    public StationDef getFromStation() {
        return fromStation;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("fromStation")
    public void setFromStation(StationDef fromStation) {
        this.fromStation = fromStation;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("toStation")
    public StationDef getToStation() {
        return toStation;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("toStation")
    public void setToStation(StationDef toStation) {
        this.toStation = toStation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("train")
    public String getTrain() {
        return train;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("train")
    public void setTrain(String train) {
        this.train = train;
    }

    /**
     * date and time of the departure where the train link starts
     * (Required)
     * 
     */
    @JsonProperty("travelDate")
    public Date getTravelDate() {
        return travelDate;
    }

    /**
     * date and time of the departure where the train link starts
     * (Required)
     * 
     */
    @JsonProperty("travelDate")
    public void setTravelDate(Date travelDate) {
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
