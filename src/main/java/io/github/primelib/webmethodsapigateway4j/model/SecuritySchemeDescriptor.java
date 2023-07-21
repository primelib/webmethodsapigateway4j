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
 * SecuritySchemeDescriptor
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
    "headers",
    "queryParameters",
    "responses"
})
@JsonTypeName("SecuritySchemeDescriptor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeDescriptor {

    @JsonProperty("headers")
    protected Map<String, Object> headers;

    @JsonProperty("queryParameters")
    protected Map<String, Object> queryParameters;

    @JsonProperty("responses")
    protected Map<String, Object> responses;

    /**
     * Constructs a validated instance of {@link SecuritySchemeDescriptor}.
     *
     * @param spec the specification to process
     */
    public SecuritySchemeDescriptor(Consumer<SecuritySchemeDescriptor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecuritySchemeDescriptor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecuritySchemeDescriptor(Consumer)} instead.
     * @param headers var.name
     * @param queryParameters var.name
     * @param responses var.name
     */
    @ApiStatus.Internal
    public SecuritySchemeDescriptor(Map<String, Object> headers, Map<String, Object> queryParameters, Map<String, Object> responses) {
        this.headers = headers;
        this.queryParameters = queryParameters;
        this.responses = responses;
    }

}
