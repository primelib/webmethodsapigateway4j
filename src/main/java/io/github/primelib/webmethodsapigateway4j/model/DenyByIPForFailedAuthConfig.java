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
 * DenyByIPForFailedAuthConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "blockIntervalInSeconds",
    "deniedIPList",
    "isEnabled",
    "maximumFailedAuthRequests",
    "maximumFailedAuthRequestsDuration",
    "whenLimitExceeds"
})
@JsonTypeName("DenyByIPForFailedAuthConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DenyByIPForFailedAuthConfig {

    /**
     * Specifies the block time interval(in seconds) for an IP address from accessing APIGateway
     */
    @JsonProperty("blockIntervalInSeconds")
    private String blockIntervalInSeconds;

    /**
     * Specifies list of IP addresses that are denied from accessing APIGateway
     */
    @JsonProperty("deniedIPList")
    private List<String> deniedIPList;

    /**
     * Specifies whether to enable authentication based restrictions by blocking/denying IP addresses which failed authentication.
     */
    @JsonProperty("isEnabled")
    private String isEnabled;

    /**
     * Specifies maximum failed requests for a particular IP address.
     */
    @JsonProperty("maximumFailedAuthRequests")
    private String maximumFailedAuthRequests;

    /**
     * Specifies the time interval, in seconds, in which maximum authentication failure can be permitted.
     */
    @JsonProperty("maximumFailedAuthRequestsDuration")
    private String maximumFailedAuthRequestsDuration;

    /**
     * Specifies action to be performed when maximum failed request is breached. The value can be BLOCK or DENY
     */
    @JsonProperty("whenLimitExceeds")
    private String whenLimitExceeds;


}
