package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InputForGatewayEndpoints
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "add",
    "remove",
    "update"
})
@JsonTypeName("InputForGatewayEndpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputForGatewayEndpoints {

    /**
     * Constructs a validated implementation of {@link InputForGatewayEndpoints}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputForGatewayEndpoints(Consumer<InputForGatewayEndpoints> spec) {
        spec.accept(this);
    }

    @JsonProperty("add")
    protected InputForAddGatewayEndpoint add;

    @JsonProperty("remove")
    protected InputForRemoveGatewayEndpoint remove;

    @JsonProperty("update")
    protected InputForUpdateGatewayEndpoint update;


}
