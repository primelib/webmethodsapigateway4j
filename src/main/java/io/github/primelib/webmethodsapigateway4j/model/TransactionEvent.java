package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TransactionEvent
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiId",
    "apiName",
    "apiVersion",
    "applicationId",
    "applicationIp",
    "applicationName",
    "cachedResponse",
    "callbackRequest",
    "consumerIp",
    "correlationID",
    "creationDate",
    "customFields",
    "errorOrigin",
    "eventType",
    "externalCalls",
    "gatewayTime",
    "httpMethod",
    "id",
    "messagePayload",
    "messageType",
    "nativeHttpMethod",
    "nativeReqPayload",
    "nativeRequestHeaders",
    "nativeResPayload",
    "nativeResponseHeaders",
    "nativeURL",
    "operationName",
    "origin",
    "packageId",
    "packageName",
    "planId",
    "planName",
    "providerTime",
    "queryParameters",
    "reqPayload",
    "requestHeaders",
    "resPayload",
    "responseCode",
    "responseHeaders",
    "serverID",
    "sessionId",
    "sourceGateway",
    "sourceGatewayDetails",
    "sourceGatewayNode",
    "status",
    "totalDataSize",
    "totalTime"
})
@JsonTypeName("TransactionEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TransactionEvent {

    /**
     * Constructs a validated implementation of {@link TransactionEvent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TransactionEvent(Consumer<TransactionEvent> spec) {
        spec.accept(this);
    }

    /**
     * API Id
     */
    @JsonProperty("apiId")
    protected String apiId;

    /**
     * API name
     */
    @JsonProperty("apiName")
    protected String apiName;

    /**
     * API version
     */
    @JsonProperty("apiVersion")
    protected String apiVersion;

    /**
     * Unique Id of the application
     */
    @JsonProperty("applicationId")
    protected String applicationId;

    /**
     * IP address of the application for the current request
     */
    @JsonProperty("applicationIp")
    protected String applicationIp;

    /**
     * Application name
     */
    @JsonProperty("applicationName")
    protected String applicationName;

    /**
     * Boolean value to indicate whether the response is served from cache
     */
    @JsonProperty("cachedResponse")
    protected String cachedResponse;

    @JsonProperty("callbackRequest")
    protected Boolean callbackRequest;

    /**
     * IP address of the consumer for the current request
     */
    @JsonProperty("consumerIp")
    protected String consumerIp;

    /**
     * Correlation ID used in the logging
     */
    @JsonProperty("correlationID")
    protected String correlationID;

    /**
     * Creation time of the transaction.
     */
    @JsonProperty("creationDate")
    protected Long creationDate;

    /**
     * Custom fields to be added.
     */
    @JsonProperty("customFields")
    protected Map<String, String> customFields = new HashMap<>();

    /**
     * Information of error orgination
     */
    @JsonProperty("errorOrigin")
    protected String errorOrigin;

    @JsonProperty("eventType")
    protected String eventType;

    /**
     * Details of external calls made
     */
    @JsonProperty("externalCalls")
    protected List<ExternalCallData> externalCalls;

    /**
     * Time taken by the API Gateway for processing the request
     */
    @JsonProperty("gatewayTime")
    protected Long gatewayTime;

    /**
     * Name of the method
     */
    @JsonProperty("httpMethod")
    protected String httpMethod;

    @JsonProperty("id")
    protected String id;

    /**
     * Payload of a Websocket message
     */
    @JsonProperty("messagePayload")
    protected String messagePayload;

    /**
     * Websocket message type
     */
    @JsonProperty("messageType")
    protected String messageType;

    /**
     * Finally resolved HTTP method of native endpoint call
     */
    @JsonProperty("nativeHttpMethod")
    protected String nativeHttpMethod;

    /**
     * Request payload sent in native call
     */
    @JsonProperty("nativeReqPayload")
    protected String nativeReqPayload;

    /**
     * Request headers sent in native call
     */
    @JsonProperty("nativeRequestHeaders")
    protected Map<String, String> nativeRequestHeaders = new HashMap<>();

    /**
     * Response payload received from native call
     */
    @JsonProperty("nativeResPayload")
    protected String nativeResPayload;

    /**
     * Response headers received from native call
     */
    @JsonProperty("nativeResponseHeaders")
    protected Map<String, String> nativeResponseHeaders = new HashMap<>();

    /**
     * Finally resolved URL of native endpoint call
     */
    @JsonProperty("nativeURL")
    protected String nativeURL;

    /**
     * Operation name of the incoming request
     */
    @JsonProperty("operationName")
    protected String operationName;

    /**
     * Origin of a Websocket message
     */
    @JsonProperty("origin")
    protected String origin;

    /**
     * Id of the package.
     */
    @JsonProperty("packageId")
    protected String packageId;

    /**
     * Package name
     */
    @JsonProperty("packageName")
    protected String packageName;

    /**
     * Id of the Plan
     */
    @JsonProperty("planId")
    protected String planId;

    /**
     * Plan name
     */
    @JsonProperty("planName")
    protected String planName;

    /**
     * Time taken by the native provider for processing the request
     */
    @JsonProperty("providerTime")
    protected Long providerTime;

    /**
     * Incoming query parameters
     */
    @JsonProperty("queryParameters")
    protected Map<String, String> queryParameters = new HashMap<>();

    /**
     * The complete request payload
     */
    @JsonProperty("reqPayload")
    protected String reqPayload;

    /**
     * Incoming request headers
     */
    @JsonProperty("requestHeaders")
    protected Map<String, String> requestHeaders = new HashMap<>();

    /**
     * The complete response payload
     */
    @JsonProperty("resPayload")
    protected String resPayload;

    /**
     * Response status code
     */
    @JsonProperty("responseCode")
    protected String responseCode;

    /**
     * Outgoing response headers
     */
    @JsonProperty("responseHeaders")
    protected Map<String, String> responseHeaders = new HashMap<>();

    /**
     * Information about APIGW servername and port
     */
    @JsonProperty("serverID")
    protected String serverID;

    /**
     * Unique Id of the session
     */
    @JsonProperty("sessionId")
    protected String sessionId;

    @JsonProperty("sourceGateway")
    protected String sourceGateway;

    @JsonProperty("sourceGatewayDetails")
    protected String sourceGatewayDetails;

    /**
     * The node which processed the request, in a multi node gateway
     */
    @JsonProperty("sourceGatewayNode")
    protected String sourceGatewayNode;

    /**
     * Status of the request
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Total size of the payload
     */
    @JsonProperty("totalDataSize")
    protected Long totalDataSize;

    /**
     * Total time taken for processing the request
     */
    @JsonProperty("totalTime")
    protected Long totalTime;


}
