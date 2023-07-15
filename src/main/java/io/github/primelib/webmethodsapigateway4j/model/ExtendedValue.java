package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExtendedValue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "endpointType",
    "key",
    "value"
})
@JsonTypeName("ExtendedValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExtendedValue {

    /**
     * Constructs a validated implementation of {@link ExtendedValue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExtendedValue(Consumer<ExtendedValue> spec) {
        spec.accept(this);
    }

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

        private final String value;
    }

}
