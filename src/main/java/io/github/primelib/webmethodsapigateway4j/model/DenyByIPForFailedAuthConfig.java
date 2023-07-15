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
 * DenyByIPForFailedAuthConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link DenyByIPForFailedAuthConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DenyByIPForFailedAuthConfig(Consumer<DenyByIPForFailedAuthConfig> spec) {
        spec.accept(this);
    }

    /**
     * Specifies the block time interval(in seconds) for an IP address from accessing APIGateway
     */
    @JsonProperty("blockIntervalInSeconds")
    protected String blockIntervalInSeconds;

    /**
     * Specifies list of IP addresses that are denied from accessing APIGateway
     */
    @JsonProperty("deniedIPList")
    protected List<String> deniedIPList;

    /**
     * Specifies whether to enable authentication based restrictions by blocking/denying IP addresses which failed authentication.
     */
    @JsonProperty("isEnabled")
    protected String isEnabled;

    /**
     * Specifies maximum failed requests for a particular IP address.
     */
    @JsonProperty("maximumFailedAuthRequests")
    protected String maximumFailedAuthRequests;

    /**
     * Specifies the time interval, in seconds, in which maximum authentication failure can be permitted.
     */
    @JsonProperty("maximumFailedAuthRequestsDuration")
    protected String maximumFailedAuthRequestsDuration;

    /**
     * Specifies action to be performed when maximum failed request is breached. The value can be BLOCK or DENY
     */
    @JsonProperty("whenLimitExceeds")
    protected String whenLimitExceeds;


}
