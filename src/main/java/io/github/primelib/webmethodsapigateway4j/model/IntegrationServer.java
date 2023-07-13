package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationServer
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "Adapter Runtime",
    "Clustering",
    "Concurrent Sessions",
    "Distributed Cache",
    "Enterprise Gateway",
    "Guaranteed Delivery",
    "Product Code",
    "Product Version",
    "Publish / Subscribe",
    "Remote Invoke",
    "Security Auditing"
})
@JsonTypeName("IntegrationServer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IntegrationServer {

    @JsonProperty("Adapter Runtime")
    private String adapterRuntime;

    @JsonProperty("Clustering")
    private String clustering;

    @JsonProperty("Concurrent Sessions")
    private String concurrentSessions;

    @JsonProperty("Distributed Cache")
    private String distributedCache;

    @JsonProperty("Enterprise Gateway")
    private String enterpriseGateway;

    @JsonProperty("Guaranteed Delivery")
    private String guaranteedDelivery;

    @JsonProperty("Product Code")
    private String productCode;

    @JsonProperty("Product Version")
    private String productVersion;

    @JsonProperty("Publish / Subscribe")
    private String publishSubscribe;

    @JsonProperty("Remote Invoke")
    private String remoteInvoke;

    @JsonProperty("Security Auditing")
    private String securityAuditing;


}
