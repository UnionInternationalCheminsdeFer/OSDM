
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RegulatoryConditionsDef {

    CIV("CIV"),
    MC("MC"),
    EU_PRR("EU_PRR");
    private final String value;
    private final static Map<String, RegulatoryConditionsDef> CONSTANTS = new HashMap<String, RegulatoryConditionsDef>();

    static {
        for (RegulatoryConditionsDef c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RegulatoryConditionsDef(String value) {
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
    public static RegulatoryConditionsDef fromValue(String value) {
        RegulatoryConditionsDef constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
