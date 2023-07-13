package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalGateway
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private ExternalPortal externalPortal;

    /**
     * Description of API Portal.
     */
    @JsonProperty("gatewayDescription")
    private String gatewayDescription;

    /**
     * Name of the API Portal.
     */
    @JsonProperty("gatewayName")
    private String gatewayName;

    /**
     * API Gateway password for provided username used by API Portal to access API Gateway.
     */
    @JsonProperty("gatewayPassword")
    private String gatewayPassword;

    /**
     * Integration Server URL of the API Gateway.
     */
    @JsonProperty("gatewayURL")
    private String gatewayURL;

    /**
     * API Gateway administrative privileged username used by API Portal to access API Gateway.
     */
    @JsonProperty("gatewayUsername")
    private String gatewayUsername;

    /**
     * API Portal configuration object ID in API Gateway.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("published")
    private Boolean published;

    /**
     * Specifies API Gateway reference ID in API Portal. This is used to identify the API Gateway in API Portal.
     */
    @JsonProperty("refId")
    private String refId;

    /**
     * Specifies the current stage name of the Gateway
     */
    @JsonProperty("stageName")
    private String stageName;

    /**
     * Specifies API Portal configuration version.
     */
    @JsonProperty("version")
    private String version;


}
