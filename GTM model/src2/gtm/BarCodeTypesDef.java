
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BarCodeTypesDef {

    FCB("FCB"),
    TLB("TLB"),
    SSB("SSB");
    private final String value;
    private final static Map<String, BarCodeTypesDef> CONSTANTS = new HashMap<String, BarCodeTypesDef>();

    static {
        for (BarCodeTypesDef c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private BarCodeTypesDef(String value) {
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
    public static BarCodeTypesDef fromValue(String value) {
        BarCodeTypesDef constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
