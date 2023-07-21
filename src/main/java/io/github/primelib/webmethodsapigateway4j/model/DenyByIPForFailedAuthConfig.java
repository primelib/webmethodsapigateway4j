package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DenyByIPForFailedAuthConfig
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link DenyByIPForFailedAuthConfig}.
     *
     * @param spec the specification to process
     */
    public DenyByIPForFailedAuthConfig(Consumer<DenyByIPForFailedAuthConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DenyByIPForFailedAuthConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DenyByIPForFailedAuthConfig(Consumer)} instead.
     * @param blockIntervalInSeconds Specifies the block time interval(in seconds) for an IP address from accessing APIGateway
     * @param deniedIPList Specifies list of IP addresses that are denied from accessing APIGateway
     * @param isEnabled Specifies whether to enable authentication based restrictions by blocking/denying IP addresses which failed authentication.
     * @param maximumFailedAuthRequests Specifies maximum failed requests for a particular IP address.
     * @param maximumFailedAuthRequestsDuration Specifies the time interval, in seconds, in which maximum authentication failure can be permitted.
     * @param whenLimitExceeds Specifies action to be performed when maximum failed request is breached. The value can be BLOCK or DENY
     */
    @ApiStatus.Internal
    public DenyByIPForFailedAuthConfig(String blockIntervalInSeconds, List<String> deniedIPList, String isEnabled, String maximumFailedAuthRequests, String maximumFailedAuthRequestsDuration, String whenLimitExceeds) {
        this.blockIntervalInSeconds = blockIntervalInSeconds;
        this.deniedIPList = deniedIPList;
        this.isEnabled = isEnabled;
        this.maximumFailedAuthRequests = maximumFailedAuthRequests;
        this.maximumFailedAuthRequestsDuration = maximumFailedAuthRequestsDuration;
        this.whenLimitExceeds = whenLimitExceeds;
    }

}
