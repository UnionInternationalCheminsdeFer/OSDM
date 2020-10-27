
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Transfer {

    BOOKING("BOOKING"),
    SIS_CONTROL("SIS_CONTROL"),
    SID_CONTROL("SID_CONTROL");
    private final String value;
    private final static Map<String, Transfer> CONSTANTS = new HashMap<String, Transfer>();

    static {
        for (Transfer c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private Transfer(String value) {
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
    public static Transfer fromValue(String value) {
        Transfer constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
