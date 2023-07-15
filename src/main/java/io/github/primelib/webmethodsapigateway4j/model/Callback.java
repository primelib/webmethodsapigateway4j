package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Callback
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "callbacksMap",
    "get$ref",
    "vendorExtensions"
})
@JsonTypeName("Callback")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Callback {

    /**
     * Constructs a validated implementation of {@link Callback}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Callback(Consumer<Callback> spec) {
        spec.accept(this);
    }

    /**
     * A Path Item Object used to define a callback request and expected responses
     */
    @JsonProperty("callbacksMap")
    protected Map<String, Path> callbacksMap = new HashMap<>();

    @JsonProperty("get$ref")
    protected String get$ref;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}
