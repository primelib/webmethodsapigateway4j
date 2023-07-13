package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalGatewayCommunitiesData
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "communities",
    "provider"
})
@JsonTypeName("PortalGatewayCommunitiesData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalGatewayCommunitiesData {

    @JsonProperty("communities")
    private PortalGatewayData communities;

    /**
     * The API Portal destination configuration name
     */
    @JsonProperty("provider")
    private String provider;


}
