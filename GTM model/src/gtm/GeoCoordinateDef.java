
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "System",
    "accuracy",
    "hemisphereEW",
    "hemisphereNS",
    "unit",
    "Latitude",
    "Longitude"
})
public class GeoCoordinateDef {

    /**
     * geo coordinate system indication: wgs84 = WGS 84 standard system, grs80 = (outdated) GRS 80 coordinate system
     * 
     */
    @JsonProperty("System")
    @JsonPropertyDescription("geo coordinate system indication: wgs84 = WGS 84 standard system, grs80 = (outdated) GRS 80 coordinate system")
    private GeoCoordinateDef.System system = GeoCoordinateDef.System.fromValue("wgs84");
    @JsonProperty("accuracy")
    private String accuracy;
    @JsonProperty("hemisphereEW")
    private GeoCoordinateDef.HemisphereEW hemisphereEW = GeoCoordinateDef.HemisphereEW.fromValue("east");
    @JsonProperty("hemisphereNS")
    private GeoCoordinateDef.HemisphereNS hemisphereNS = GeoCoordinateDef.HemisphereNS.fromValue("north");
    /**
     * units of degree for geo-coordinates 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    @JsonPropertyDescription("units of degree for geo-coordinates ")
    private GeoCoordinateDef.GeoCoordinateUnitDef unit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Latitude")
    private Float latitude;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Longitude")
    private Float longitude;

    /**
     * geo coordinate system indication: wgs84 = WGS 84 standard system, grs80 = (outdated) GRS 80 coordinate system
     * 
     */
    @JsonProperty("System")
    public GeoCoordinateDef.System getSystem() {
        return system;
    }

    /**
     * geo coordinate system indication: wgs84 = WGS 84 standard system, grs80 = (outdated) GRS 80 coordinate system
     * 
     */
    @JsonProperty("System")
    public void setSystem(GeoCoordinateDef.System system) {
        this.system = system;
    }

    @JsonProperty("accuracy")
    public String getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    @JsonProperty("hemisphereEW")
    public GeoCoordinateDef.HemisphereEW getHemisphereEW() {
        return hemisphereEW;
    }

    @JsonProperty("hemisphereEW")
    public void setHemisphereEW(GeoCoordinateDef.HemisphereEW hemisphereEW) {
        this.hemisphereEW = hemisphereEW;
    }

    @JsonProperty("hemisphereNS")
    public GeoCoordinateDef.HemisphereNS getHemisphereNS() {
        return hemisphereNS;
    }

    @JsonProperty("hemisphereNS")
    public void setHemisphereNS(GeoCoordinateDef.HemisphereNS hemisphereNS) {
        this.hemisphereNS = hemisphereNS;
    }

    /**
     * units of degree for geo-coordinates 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    public GeoCoordinateDef.GeoCoordinateUnitDef getUnit() {
        return unit;
    }

    /**
     * units of degree for geo-coordinates 
     * (Required)
     * 
     */
    @JsonProperty("unit")
    public void setUnit(GeoCoordinateDef.GeoCoordinateUnitDef unit) {
        this.unit = unit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Latitude")
    public Float getLatitude() {
        return latitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Latitude")
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Longitude")
    public Float getLongitude() {
        return longitude;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Longitude")
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeoCoordinateDef.class.getName()).append('@').append(Integer.toHexString(java.lang.System.identityHashCode(this))).append('[');
        sb.append("system");
        sb.append('=');
        sb.append(((this.system == null)?"<null>":this.system));
        sb.append(',');
        sb.append("accuracy");
        sb.append('=');
        sb.append(((this.accuracy == null)?"<null>":this.accuracy));
        sb.append(',');
        sb.append("hemisphereEW");
        sb.append('=');
        sb.append(((this.hemisphereEW == null)?"<null>":this.hemisphereEW));
        sb.append(',');
        sb.append("hemisphereNS");
        sb.append('=');
        sb.append(((this.hemisphereNS == null)?"<null>":this.hemisphereNS));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
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
        result = ((result* 31)+((this.hemisphereNS == null)? 0 :this.hemisphereNS.hashCode()));
        result = ((result* 31)+((this.hemisphereEW == null)? 0 :this.hemisphereEW.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.accuracy == null)? 0 :this.accuracy.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoCoordinateDef) == false) {
            return false;
        }
        GeoCoordinateDef rhs = ((GeoCoordinateDef) other);
        return ((((((((this.hemisphereNS == rhs.hemisphereNS)||((this.hemisphereNS!= null)&&this.hemisphereNS.equals(rhs.hemisphereNS)))&&((this.hemisphereEW == rhs.hemisphereEW)||((this.hemisphereEW!= null)&&this.hemisphereEW.equals(rhs.hemisphereEW))))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude))))&&((this.accuracy == rhs.accuracy)||((this.accuracy!= null)&&this.accuracy.equals(rhs.accuracy))))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

    public enum GeoCoordinateUnitDef {

        MICRO_DEGREE("microDegree"),
        TENTHMILLI_DEGREE("tenthmilliDegree"),
        CENTI_DEGREE("centiDegree"),
        DECI_DEGREE("deciDegree"),
        MILLI_DEGREE("milliDegree");
        private final String value;
        private final static Map<String, GeoCoordinateDef.GeoCoordinateUnitDef> CONSTANTS = new HashMap<String, GeoCoordinateDef.GeoCoordinateUnitDef>();

        static {
            for (GeoCoordinateDef.GeoCoordinateUnitDef c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private GeoCoordinateUnitDef(String value) {
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
        public static GeoCoordinateDef.GeoCoordinateUnitDef fromValue(String value) {
            GeoCoordinateDef.GeoCoordinateUnitDef constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum HemisphereEW {

        EAST("east"),
        WEST("west");
        private final String value;
        private final static Map<String, GeoCoordinateDef.HemisphereEW> CONSTANTS = new HashMap<String, GeoCoordinateDef.HemisphereEW>();

        static {
            for (GeoCoordinateDef.HemisphereEW c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private HemisphereEW(String value) {
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
        public static GeoCoordinateDef.HemisphereEW fromValue(String value) {
            GeoCoordinateDef.HemisphereEW constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum HemisphereNS {

        NORTH("north"),
        SOUTH("south");
        private final String value;
        private final static Map<String, GeoCoordinateDef.HemisphereNS> CONSTANTS = new HashMap<String, GeoCoordinateDef.HemisphereNS>();

        static {
            for (GeoCoordinateDef.HemisphereNS c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private HemisphereNS(String value) {
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
        public static GeoCoordinateDef.HemisphereNS fromValue(String value) {
            GeoCoordinateDef.HemisphereNS constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum System {

        WGS_84("wgs84"),
        GRS_80("grs80");
        private final String value;
        private final static Map<String, GeoCoordinateDef.System> CONSTANTS = new HashMap<String, GeoCoordinateDef.System>();

        static {
            for (GeoCoordinateDef.System c: values()) {
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
        public static GeoCoordinateDef.System fromValue(String value) {
            GeoCoordinateDef.System constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
