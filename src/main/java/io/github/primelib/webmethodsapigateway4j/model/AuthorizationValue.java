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
 * AuthorizationValue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "keyName",
    "type",
    "urlMatcher",
    "value"
})
@JsonTypeName("AuthorizationValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuthorizationValue {

    /**
     * Constructs a validated implementation of {@link AuthorizationValue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuthorizationValue(Consumer<AuthorizationValue> spec) {
        spec.accept(this);
    }

    @JsonProperty("keyName")
    protected String keyName;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("urlMatcher")
    protected Object urlMatcher;

    @JsonProperty("value")
    protected String value;


}
