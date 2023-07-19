package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewaySchema
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "schema",
    "type"
})
@JsonTypeName("GatewaySchema")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewaySchema extends ParameterSchema {

    /**
     * Constructs a validated implementation of {@link GatewaySchema}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GatewaySchema(Consumer<GatewaySchema> spec) {
        spec.accept(this);
    }

    @JsonProperty("schema")
    protected String schema;

    @JsonProperty("type")
    protected String type;


}