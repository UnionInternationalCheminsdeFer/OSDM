
package gtm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isBorder",
    "routeId",
    "seriesId",
    "alternativeRoute",
    "carrier",
    "route",
    "serviceBrand",
    "station",
    "fareReferenceStationSet"
})
public class ViaStationsDef {

    @JsonProperty("isBorder")
    private Boolean isBorder = false;
    @JsonProperty("routeId")
    private Integer routeId;
    @JsonProperty("seriesId")
    private Integer seriesId;
    @JsonProperty("alternativeRoute")
    private List<ViaStationsDef> alternativeRoute = new ArrayList<ViaStationsDef>();
    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * 
     */
    @JsonProperty("carrier")
    @JsonPropertyDescription("RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x")
    private String carrier;
    @JsonProperty("route")
    private List<ViaStationsDef> route = new ArrayList<ViaStationsDef>();
    /**
     * restriction to a specific service brand
     * 
     */
    @JsonProperty("serviceBrand")
    @JsonPropertyDescription("restriction to a specific service brand")
    private String serviceBrand;
    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("station")
    @JsonPropertyDescription("Used to represent a station location. This is a location that can be used as origin and destination for a train journey")
    private StationDef station;
    /**
     * reference to a list of stations included in the fare
     * 
     */
    @JsonProperty("fareReferenceStationSet")
    @JsonPropertyDescription("reference to a list of stations included in the fare")
    private FareReferenceStationSet fareReferenceStationSet;

    @JsonProperty("isBorder")
    public Boolean getIsBorder() {
        return isBorder;
    }

    @JsonProperty("isBorder")
    public void setIsBorder(Boolean isBorder) {
        this.isBorder = isBorder;
    }

    @JsonProperty("routeId")
    public Integer getRouteId() {
        return routeId;
    }

    @JsonProperty("routeId")
    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    @JsonProperty("seriesId")
    public Integer getSeriesId() {
        return seriesId;
    }

    @JsonProperty("seriesId")
    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    @JsonProperty("alternativeRoute")
    public List<ViaStationsDef> getAlternativeRoute() {
        return alternativeRoute;
    }

    @JsonProperty("alternativeRoute")
    public void setAlternativeRoute(List<ViaStationsDef> alternativeRoute) {
        this.alternativeRoute = alternativeRoute;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * 
     */
    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    /**
     * RICS company code or the upcoming compatible ERA company code. In case proprietary codes are used on a bilateral base the  codes must have at least 5 positions and start with x
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("route")
    public List<ViaStationsDef> getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(List<ViaStationsDef> route) {
        this.route = route;
    }

    /**
     * restriction to a specific service brand
     * 
     */
    @JsonProperty("serviceBrand")
    public String getServiceBrand() {
        return serviceBrand;
    }

    /**
     * restriction to a specific service brand
     * 
     */
    @JsonProperty("serviceBrand")
    public void setServiceBrand(String serviceBrand) {
        this.serviceBrand = serviceBrand;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("station")
    public StationDef getStation() {
        return station;
    }

    /**
     * Used to represent a station location. This is a location that can be used as origin and destination for a train journey
     * (Required)
     * 
     */
    @JsonProperty("station")
    public void setStation(StationDef station) {
        this.station = station;
    }

    /**
     * reference to a list of stations included in the fare
     * 
     */
    @JsonProperty("fareReferenceStationSet")
    public FareReferenceStationSet getFareReferenceStationSet() {
        return fareReferenceStationSet;
    }

    /**
     * reference to a list of stations included in the fare
     * 
     */
    @JsonProperty("fareReferenceStationSet")
    public void setFareReferenceStationSet(FareReferenceStationSet fareReferenceStationSet) {
        this.fareReferenceStationSet = fareReferenceStationSet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ViaStationsDef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isBorder");
        sb.append('=');
        sb.append(((this.isBorder == null)?"<null>":this.isBorder));
        sb.append(',');
        sb.append("routeId");
        sb.append('=');
        sb.append(((this.routeId == null)?"<null>":this.routeId));
        sb.append(',');
        sb.append("seriesId");
        sb.append('=');
        sb.append(((this.seriesId == null)?"<null>":this.seriesId));
        sb.append(',');
        sb.append("alternativeRoute");
        sb.append('=');
        sb.append(((this.alternativeRoute == null)?"<null>":this.alternativeRoute));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("route");
        sb.append('=');
        sb.append(((this.route == null)?"<null>":this.route));
        sb.append(',');
        sb.append("serviceBrand");
        sb.append('=');
        sb.append(((this.serviceBrand == null)?"<null>":this.serviceBrand));
        sb.append(',');
        sb.append("station");
        sb.append('=');
        sb.append(((this.station == null)?"<null>":this.station));
        sb.append(',');
        sb.append("fareReferenceStationSet");
        sb.append('=');
        sb.append(((this.fareReferenceStationSet == null)?"<null>":this.fareReferenceStationSet));
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
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.routeId == null)? 0 :this.routeId.hashCode()));
        result = ((result* 31)+((this.route == null)? 0 :this.route.hashCode()));
        result = ((result* 31)+((this.alternativeRoute == null)? 0 :this.alternativeRoute.hashCode()));
        result = ((result* 31)+((this.station == null)? 0 :this.station.hashCode()));
        result = ((result* 31)+((this.seriesId == null)? 0 :this.seriesId.hashCode()));
        result = ((result* 31)+((this.serviceBrand == null)? 0 :this.serviceBrand.hashCode()));
        result = ((result* 31)+((this.fareReferenceStationSet == null)? 0 :this.fareReferenceStationSet.hashCode()));
        result = ((result* 31)+((this.isBorder == null)? 0 :this.isBorder.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViaStationsDef) == false) {
            return false;
        }
        ViaStationsDef rhs = ((ViaStationsDef) other);
        return ((((((((((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier)))&&((this.routeId == rhs.routeId)||((this.routeId!= null)&&this.routeId.equals(rhs.routeId))))&&((this.route == rhs.route)||((this.route!= null)&&this.route.equals(rhs.route))))&&((this.alternativeRoute == rhs.alternativeRoute)||((this.alternativeRoute!= null)&&this.alternativeRoute.equals(rhs.alternativeRoute))))&&((this.station == rhs.station)||((this.station!= null)&&this.station.equals(rhs.station))))&&((this.seriesId == rhs.seriesId)||((this.seriesId!= null)&&this.seriesId.equals(rhs.seriesId))))&&((this.serviceBrand == rhs.serviceBrand)||((this.serviceBrand!= null)&&this.serviceBrand.equals(rhs.serviceBrand))))&&((this.fareReferenceStationSet == rhs.fareReferenceStationSet)||((this.fareReferenceStationSet!= null)&&this.fareReferenceStationSet.equals(rhs.fareReferenceStationSet))))&&((this.isBorder == rhs.isBorder)||((this.isBorder!= null)&&this.isBorder.equals(rhs.isBorder))));
    }

}
