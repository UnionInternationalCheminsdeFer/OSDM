
package gtm;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RequiredSi {

    REGISTRY("REGISTRY"),
    PEER_TO_PEER("PEER_TO_PEER");
    private final String value;
    private final static Map<String, RequiredSi> CONSTANTS = new HashMap<String, RequiredSi>();

    static {
        for (RequiredSi c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private RequiredSi(String value) {
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
    public static RequiredSi fromValue(String value) {
        RequiredSi constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
