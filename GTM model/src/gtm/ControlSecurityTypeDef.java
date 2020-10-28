
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ControlSecurityTypeDef {

    SIP("SIP"),
    SID("SID"),
    SIS("SIS");
    private final String value;
    private final static Map<String, ControlSecurityTypeDef> CONSTANTS = new HashMap<String, ControlSecurityTypeDef>();

    static {
        for (ControlSecurityTypeDef c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ControlSecurityTypeDef(String value) {
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
    public static ControlSecurityTypeDef fromValue(String value) {
        ControlSecurityTypeDef constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
