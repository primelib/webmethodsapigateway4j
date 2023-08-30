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
 * PortalGateway
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
    "externalPortal",
    "gatewayDescription",
    "gatewayName",
    "gatewayPassword",
    "gatewayURL",
    "gatewayUsername",
    "id",
    "published",
    "refId",
    "stageName",
    "version"
})
@JsonTypeName("PortalGateway")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalGateway {

    @JsonProperty("externalPortal")
    protected ExternalPortal externalPortal;

    /**
     * Description of API Portal.
     */
    @JsonProperty("gatewayDescription")
    protected String gatewayDescription;

    /**
     * Name of the API Portal.
     */
    @JsonProperty("gatewayName")
    protected String gatewayName;

    /**
     * API Gateway password for provided username used by API Portal to access API Gateway.
     */
    @JsonProperty("gatewayPassword")
    protected String gatewayPassword;

    /**
     * Integration Server URL of the API Gateway.
     */
    @JsonProperty("gatewayURL")
    protected String gatewayURL;

    /**
     * API Gateway administrative privileged username used by API Portal to access API Gateway.
     */
    @JsonProperty("gatewayUsername")
    protected String gatewayUsername;

    /**
     * API Portal configuration object ID in API Gateway.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("published")
    protected Boolean published;

    /**
     * Specifies API Gateway reference ID in API Portal. This is used to identify the API Gateway in API Portal.
     */
    @JsonProperty("refId")
    protected String refId;

    /**
     * Specifies the current stage name of the Gateway
     */
    @JsonProperty("stageName")
    protected String stageName;

    /**
     * Specifies API Portal configuration version.
     */
    @JsonProperty("version")
    protected String version;

    /**
     * Constructs a validated instance of {@link PortalGateway}.
     *
     * @param spec the specification to process
     */
    public PortalGateway(Consumer<PortalGateway> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PortalGateway}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PortalGateway(Consumer)} instead.
     * @param externalPortal externalPortal
     * @param gatewayDescription Description of API Portal.
     * @param gatewayName Name of the API Portal.
     * @param gatewayPassword API Gateway password for provided username used by API Portal to access API Gateway.
     * @param gatewayURL Integration Server URL of the API Gateway.
     * @param gatewayUsername API Gateway administrative privileged username used by API Portal to access API Gateway.
     * @param id API Portal configuration object ID in API Gateway.
     * @param published published
     * @param refId Specifies API Gateway reference ID in API Portal. This is used to identify the API Gateway in API Portal.
     * @param stageName Specifies the current stage name of the Gateway
     * @param version Specifies API Portal configuration version.
     */
    @ApiStatus.Internal
    public PortalGateway(ExternalPortal externalPortal, String gatewayDescription, String gatewayName, String gatewayPassword, String gatewayURL, String gatewayUsername, String id, Boolean published, String refId, String stageName, String version) {
        this.externalPortal = externalPortal;
        this.gatewayDescription = gatewayDescription;
        this.gatewayName = gatewayName;
        this.gatewayPassword = gatewayPassword;
        this.gatewayURL = gatewayURL;
        this.gatewayUsername = gatewayUsername;
        this.id = id;
        this.published = published;
        this.refId = refId;
        this.stageName = stageName;
        this.version = version;
    }

}
