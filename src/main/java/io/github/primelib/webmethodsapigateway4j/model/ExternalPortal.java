package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExternalPortal
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "endpointPassword",
    "endpointTenant",
    "endpointURL",
    "endpointUsername",
    "type"
})
@JsonTypeName("ExternalPortal")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExternalPortal {

    /**
     * Password for API Portal user used by API Gateway to access portal.
     */
    @JsonProperty("endpointPassword")
    private String endpointPassword;

    /**
     * API Portal tenant name.
     */
    @JsonProperty("endpointTenant")
    private String endpointTenant;

    /**
     * API Portal endpoint URL.
     */
    @JsonProperty("endpointURL")
    private String endpointURL;

    /**
     * API Portal username used by API Gateway to communicate.
     */
    @JsonProperty("endpointUsername")
    private String endpointUsername;

    @JsonProperty("type")
    private String type;


}
