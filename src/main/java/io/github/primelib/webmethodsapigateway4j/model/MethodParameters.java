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
 * MethodParameters
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
    "enabled",
    "parameters",
    "returnType"
})
@JsonTypeName("MethodParameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MethodParameters {

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("parameters")
    protected Map<String, String> parameters;

    @JsonProperty("returnType")
    protected String returnType;

    /**
     * Constructs a validated instance of {@link MethodParameters}.
     *
     * @param spec the specification to process
     */
    public MethodParameters(Consumer<MethodParameters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MethodParameters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MethodParameters(Consumer)} instead.
     * @param enabled enabled
     * @param parameters parameters
     * @param returnType returnType
     */
    @ApiStatus.Internal
    public MethodParameters(Boolean enabled, Map<String, String> parameters, String returnType) {
        this.enabled = enabled;
        this.parameters = parameters;
        this.returnType = returnType;
    }

}
