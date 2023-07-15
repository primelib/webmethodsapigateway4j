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
 * PortalGatewayCommunitiesData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "communities",
    "provider"
})
@JsonTypeName("PortalGatewayCommunitiesData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalGatewayCommunitiesData {

    /**
     * Constructs a validated implementation of {@link PortalGatewayCommunitiesData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PortalGatewayCommunitiesData(Consumer<PortalGatewayCommunitiesData> spec) {
        spec.accept(this);
    }

    @JsonProperty("communities")
    protected PortalGatewayData communities;

    /**
     * The API Portal destination configuration name
     */
    @JsonProperty("provider")
    protected String provider;


}
