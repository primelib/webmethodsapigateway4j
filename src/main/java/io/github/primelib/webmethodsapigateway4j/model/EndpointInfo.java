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
 * EndpointInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "endpoint",
    "gatewayPoolId"
})
@JsonTypeName("EndpointInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EndpointInfo {

    /**
     * Constructs a validated implementation of {@link EndpointInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EndpointInfo(Consumer<EndpointInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("endpoint")
    protected String endpoint;

    @JsonProperty("gatewayPoolId")
    protected String gatewayPoolId;


}
