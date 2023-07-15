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
 * PortalGateway
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link PortalGateway}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PortalGateway(Consumer<PortalGateway> spec) {
        spec.accept(this);
    }

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


}
