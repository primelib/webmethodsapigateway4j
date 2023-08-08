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
import lombok.experimental.Accessors;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Callback
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
    "callbacksMap",
    "get$ref",
    "vendorExtensions"
})
@JsonTypeName("Callback")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Callback {

    /**
     * A Path Item Object used to define a callback request and expected responses
     */
    @JsonProperty("callbacksMap")
    protected Map<String, Path> callbacksMap;

    @JsonProperty("get$ref")
    protected String get$ref;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Callback}.
     *
     * @param spec the specification to process
     */
    public Callback(Consumer<Callback> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Callback}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Callback(Consumer)} instead.
     * @param callbacksMap A Path Item Object used to define a callback request and expected responses
     * @param get$ref get$ref
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public Callback(Map<String, Path> callbacksMap, String get$ref, Map<String, Object> vendorExtensions) {
        this.callbacksMap = callbacksMap;
        this.get$ref = get$ref;
        this.vendorExtensions = vendorExtensions;
    }

}
