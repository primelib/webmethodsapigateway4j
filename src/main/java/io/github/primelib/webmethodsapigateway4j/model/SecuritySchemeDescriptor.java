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
 * SecuritySchemeDescriptor
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "headers",
    "queryParameters",
    "responses"
})
@JsonTypeName("SecuritySchemeDescriptor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeDescriptor {

    /**
     * Constructs a validated implementation of {@link SecuritySchemeDescriptor}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecuritySchemeDescriptor(Consumer<SecuritySchemeDescriptor> spec) {
        spec.accept(this);
    }

    @JsonProperty("headers")
    protected Map<String, Object> headers = new HashMap<>();

    @JsonProperty("queryParameters")
    protected Map<String, Object> queryParameters = new HashMap<>();

    @JsonProperty("responses")
    protected Map<String, Object> responses = new HashMap<>();


}