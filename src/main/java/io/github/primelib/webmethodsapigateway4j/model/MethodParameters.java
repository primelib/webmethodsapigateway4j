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
 * MethodParameters
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enabled",
    "parameters",
    "returnType"
})
@JsonTypeName("MethodParameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MethodParameters {

    /**
     * Constructs a validated implementation of {@link MethodParameters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MethodParameters(Consumer<MethodParameters> spec) {
        spec.accept(this);
    }

    @JsonProperty("enabled")
    protected Boolean enabled;

    @JsonProperty("parameters")
    protected Map<String, String> parameters = new HashMap<>();

    @JsonProperty("returnType")
    protected String returnType;


}
