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
 * APICallbackSettings
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
    protected Boolean allowCallBackRequestsHTTPsAccessOnly;

    /**
     * Decider to process callback requests based on Allowed IPs
     */
    @JsonProperty("allowCallbackRequestAccessToAllowedIPs")
    protected Boolean allowCallbackRequestAccessToAllowedIPs;

    /**
     * Configure Allowed IPs.
     */
    @JsonProperty("allowedIPs")
    protected List<String> allowedIPs;

    /**
     * Select value from Loadbalancer, HTTP, HTTPS, External, the port used to forward to Native Server
     */
    @JsonProperty("portType")
    protected String portType;

    /**
     * Decider to process the callback URLs
     */
    @JsonProperty("processCallbackRequests")
    protected Boolean processCallbackRequests;

    /**
     * Constructs a validated instance of {@link APICallbackSettings}.
     *
     * @param spec the specification to process
     */
    public APICallbackSettings(Consumer<APICallbackSettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APICallbackSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APICallbackSettings(Consumer)} instead.
     * @param allowCallBackRequestsHTTPsAccessOnly Native Servers can access the callback proxy through HTTPs protocal
     * @param allowCallbackRequestAccessToAllowedIPs Decider to process callback requests based on Allowed IPs
     * @param allowedIPs Configure Allowed IPs.
     * @param portType Select value from Loadbalancer, HTTP, HTTPS, External, the port used to forward to Native Server
     * @param processCallbackRequests Decider to process the callback URLs
     */
    @ApiStatus.Internal
    public APICallbackSettings(Boolean allowCallBackRequestsHTTPsAccessOnly, Boolean allowCallbackRequestAccessToAllowedIPs, List<String> allowedIPs, String portType, Boolean processCallbackRequests) {
        this.allowCallBackRequestsHTTPsAccessOnly = allowCallBackRequestsHTTPsAccessOnly;
        this.allowCallbackRequestAccessToAllowedIPs = allowCallbackRequestAccessToAllowedIPs;
        this.allowedIPs = allowedIPs;
        this.portType = portType;
        this.processCallbackRequests = processCallbackRequests;
    }

}
