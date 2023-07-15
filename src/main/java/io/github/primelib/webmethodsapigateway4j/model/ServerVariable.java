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
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServerVariable
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "default",
    "description",
    "enum",
    "vendorExtensions"
})
@JsonTypeName("ServerVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServerVariable {

    /**
     * Constructs a validated implementation of {@link ServerVariable}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServerVariable(Consumer<ServerVariable> spec) {
        spec.accept(this);
    }

    @JsonProperty("default")
    protected String _default;

    /**
     * An optional description for the server variable
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("enum")
    protected List<String> _enum;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}
