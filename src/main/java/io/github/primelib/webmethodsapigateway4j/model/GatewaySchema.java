package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewaySchema
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "schema",
    "type"
})
@JsonTypeName("GatewaySchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewaySchema extends ParameterSchema {

    @JsonProperty("schema")
    protected String schema;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link GatewaySchema}.
     *
     * @param spec the specification to process
     */
    public GatewaySchema(Consumer<GatewaySchema> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GatewaySchema}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GatewaySchema(Consumer)} instead.
     * @param schema var.name
     * @param type var.name
     */
    @ApiStatus.Internal
    public GatewaySchema(String schema, String type) {
        this.schema = schema;
        this.type = type;
    }

}
