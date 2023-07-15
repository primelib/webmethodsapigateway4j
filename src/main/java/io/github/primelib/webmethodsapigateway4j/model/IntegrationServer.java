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
 * IntegrationServer
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link IntegrationServer}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IntegrationServer(Consumer<IntegrationServer> spec) {
        spec.accept(this);
    }

    @JsonProperty("Adapter Runtime")
    protected String adapterRuntime;

    @JsonProperty("Clustering")
    protected String clustering;

    @JsonProperty("Concurrent Sessions")
    protected String concurrentSessions;

    @JsonProperty("Distributed Cache")
    protected String distributedCache;

    @JsonProperty("Enterprise Gateway")
    protected String enterpriseGateway;

    @JsonProperty("Guaranteed Delivery")
    protected String guaranteedDelivery;

    @JsonProperty("Product Code")
    protected String productCode;

    @JsonProperty("Product Version")
    protected String productVersion;

    @JsonProperty("Publish / Subscribe")
    protected String publishSubscribe;

    @JsonProperty("Remote Invoke")
    protected String remoteInvoke;

    @JsonProperty("Security Auditing")
    protected String securityAuditing;


}
