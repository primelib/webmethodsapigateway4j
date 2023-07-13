package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APICallbackSettings
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "allowCallBackRequestsHTTPsAccessOnly",
    "allowCallbackRequestAccessToAllowedIPs",
    "allowedIPs",
    "portType",
    "processCallbackRequests"
})
@JsonTypeName("APICallbackSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APICallbackSettings {

    /**
     * Native Servers can access the callback proxy through HTTPs protocal
     */
    @JsonProperty("allowCallBackRequestsHTTPsAccessOnly")
    private Boolean allowCallBackRequestsHTTPsAccessOnly;

    /**
     * Decider to process callback requests based on Allowed IPs
     */
    @JsonProperty("allowCallbackRequestAccessToAllowedIPs")
    private Boolean allowCallbackRequestAccessToAllowedIPs;

    /**
     * Configure Allowed IPs.
     */
    @JsonProperty("allowedIPs")
    private List<String> allowedIPs;

    /**
     * Select value from Loadbalancer, HTTP, HTTPS, External, the port used to forward to Native Server
     */
    @JsonProperty("portType")
    private String portType;

    /**
     * Decider to process the callback URLs
     */
    @JsonProperty("processCallbackRequests")
    private Boolean processCallbackRequests;


}
