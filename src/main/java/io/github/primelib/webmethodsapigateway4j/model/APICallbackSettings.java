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
 * APICallbackSettings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link APICallbackSettings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APICallbackSettings(Consumer<APICallbackSettings> spec) {
        spec.accept(this);
    }

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


}
