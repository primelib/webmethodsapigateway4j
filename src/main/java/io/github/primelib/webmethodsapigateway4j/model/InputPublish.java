package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InputPublish
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "communities",
    "endpoints",
    "portalGatewayId"
})
@JsonTypeName("InputPublish")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputPublish {

    /**
     * Constructs a validated implementation of {@link InputPublish}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputPublish(Consumer<InputPublish> spec) {
        spec.accept(this);
    }

    @JsonProperty("communities")
    protected List<String> communities;

    @JsonProperty("endpoints")
    protected List<String> endpoints;

    @JsonProperty("portalGatewayId")
    protected String portalGatewayId;


}
