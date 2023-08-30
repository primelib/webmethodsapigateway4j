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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServerVariable
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
    "default",
    "description",
    "enum",
    "vendorExtensions"
})
@JsonTypeName("ServerVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServerVariable {

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
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link ServerVariable}.
     *
     * @param spec the specification to process
     */
    public ServerVariable(Consumer<ServerVariable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServerVariable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServerVariable(Consumer)} instead.
     * @param _default _default
     * @param description An optional description for the server variable
     * @param _enum _enum
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public ServerVariable(String _default, String description, List<String> _enum, Map<String, Object> vendorExtensions) {
        this._default = _default;
        this.description = description;
        this._enum = _enum;
        this.vendorExtensions = vendorExtensions;
    }

}
