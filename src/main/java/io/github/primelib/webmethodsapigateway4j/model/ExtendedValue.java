package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ExtendedValue
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "endpointType",
    "key",
    "value"
})
@JsonTypeName("ExtendedValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExtendedValue {

    /**
     * Type of endpoint for which the additional header needs to sent
     */
    @JsonProperty("endpointType")
    protected EndpointTypeEnum endpointType;

    /**
     * Header name
     */
    @JsonProperty("key")
    protected String key;

    /**
     * Header value
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link ExtendedValue}.
     *
     * @param spec the specification to process
     */
    public ExtendedValue(Consumer<ExtendedValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExtendedValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExtendedValue(Consumer)} instead.
     * @param endpointType Type of endpoint for which the additional header needs to sent
     * @param key Header name
     * @param value Header value
     */
    @ApiStatus.Internal
    public ExtendedValue(EndpointTypeEnum endpointType, String key, String value) {
        this.endpointType = endpointType;
        this.key = key;
        this.value = value;
    }

    /**
     * Type of endpoint for which the additional header needs to sent
     */
    @AllArgsConstructor
    public enum EndpointTypeEnum {
        CLIENT_REGISTRATION("CLIENT_REGISTRATION"),
        CLIENT_UPDATE("CLIENT_UPDATE"),
        CLIENT_DELETE("CLIENT_DELETE"),
        CLIENT_READ("CLIENT_READ"),
        SCOPE_CREATE("SCOPE_CREATE"),
        SCOPE_READ("SCOPE_READ"),
        SCOPE_DELETE("SCOPE_DELETE"),
        SCOPE_UPDATE("SCOPE_UPDATE");

        private static final EndpointTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static EndpointTypeEnum of(String input) {
            if (input != null) {
                for (EndpointTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
