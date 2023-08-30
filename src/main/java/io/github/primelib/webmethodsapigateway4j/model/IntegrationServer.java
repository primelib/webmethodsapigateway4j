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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationServer
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

    /**
     * Constructs a validated instance of {@link IntegrationServer}.
     *
     * @param spec the specification to process
     */
    public IntegrationServer(Consumer<IntegrationServer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IntegrationServer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IntegrationServer(Consumer)} instead.
     * @param adapterRuntime adapterRuntime
     * @param clustering clustering
     * @param concurrentSessions concurrentSessions
     * @param distributedCache distributedCache
     * @param enterpriseGateway enterpriseGateway
     * @param guaranteedDelivery guaranteedDelivery
     * @param productCode productCode
     * @param productVersion productVersion
     * @param publishSubscribe publishSubscribe
     * @param remoteInvoke remoteInvoke
     * @param securityAuditing securityAuditing
     */
    @ApiStatus.Internal
    public IntegrationServer(String adapterRuntime, String clustering, String concurrentSessions, String distributedCache, String enterpriseGateway, String guaranteedDelivery, String productCode, String productVersion, String publishSubscribe, String remoteInvoke, String securityAuditing) {
        this.adapterRuntime = adapterRuntime;
        this.clustering = clustering;
        this.concurrentSessions = concurrentSessions;
        this.distributedCache = distributedCache;
        this.enterpriseGateway = enterpriseGateway;
        this.guaranteedDelivery = guaranteedDelivery;
        this.productCode = productCode;
        this.productVersion = productVersion;
        this.publishSubscribe = publishSubscribe;
        this.remoteInvoke = remoteInvoke;
        this.securityAuditing = securityAuditing;
    }

}
