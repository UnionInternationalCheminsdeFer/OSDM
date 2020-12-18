
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Used to provide any geo-encoded location, regardless of environment, using longitude and latitude coordinates.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "system",
    "accuracy",
    "latitude",
    "longitude"
})
public class GeoCoordinate {

    /**
     * geo coordinate system indication: 
     *  - WGS84 = WGS 84 standard system,
     *  - GRS80 = (outdated) GRS 80 coordinate system
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("geo coordinate system indication: \n - WGS84 = WGS 84 standard system,\n - GRS80 = (outdated) GRS 80 coordinate system")
    private GeoCoordinate.System system = GeoCoordinate.System.fromValue("WGS84");
    /**
     * to be provided in degree.
     * 
     */
    @JsonProperty("accuracy")
    @JsonPropertyDescription("to be provided in degree.")
    private Float accuracy;
    /**
     * Geographic coordinate that specifies the north-south position of a point on the earths surface
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    @JsonPropertyDescription("Geographic coordinate that specifies the north-south position of a point on the earths surface")
    private Float latitude;
    /**
     * Geographic coordinate that specifies the east-west position of a point on the earths surface.            
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    @JsonPropertyDescription("Geographic coordinate that specifies the east-west position of a point on the earths surface.            ")
    private Float longitude;

    /**
     * geo coordinate system indication: 
     *  - WGS84 = WGS 84 standard system,
     *  - GRS80 = (outdated) GRS 80 coordinate system
     * 
     */
    @JsonProperty("system")
    public GeoCoordinate.System getSystem() {
        return system;
    }

    /**
     * geo coordinate system indication: 
     *  - WGS84 = WGS 84 standard system,
     *  - GRS80 = (outdated) GRS 80 coordinate system
     * 
     */
    @JsonProperty("system")
    public void setSystem(GeoCoordinate.System system) {
        this.system = system;
    }

    /**
     * to be provided in degree.
     * 
     */
    @JsonProperty("accuracy")
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * to be provided in degree.
     * 
     */
    @JsonProperty("accuracy")
    public void setAccuracy(Float accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * Geographic coordinate that specifies the north-south position of a point on the earths surface
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Geographic coordinate that specifies the north-south position of a point on the earths surface
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * Geographic coordinate that specifies the east-west position of a point on the earths surface.            
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Geographic coordinate that specifies the east-west position of a point on the earths surface.            
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeoCoordinate.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("accuracy");
        sb.append('=');
        sb.append(((this.accuracy == null)?"<null>":this.accuracy));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
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
        result = ((result* 31)+((this.accuracy == null)? 0 :this.accuracy.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoCoordinate) == false) {
            return false;
        }
        GeoCoordinate rhs = ((GeoCoordinate) other);
        return (((((this.accuracy == rhs.accuracy)||((this.accuracy!= null)&&this.accuracy.equals(rhs.accuracy)))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

    public enum System {

        WGS_84("WGS84"),
        GRS_80("GRS80");
        private final String value;
        private final static Map<String, GeoCoordinate.System> CONSTANTS = new HashMap<String, GeoCoordinate.System>();

        static {
            for (GeoCoordinate.System c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private System(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static GeoCoordinate.System fromValue(String value) {
            GeoCoordinate.System constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
