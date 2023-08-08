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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TransactionEvent
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
    protected Map<String, String> customFields;

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
    protected Map<String, String> nativeRequestHeaders;

    /**
     * Response payload received from native call
     */
    @JsonProperty("nativeResPayload")
    protected String nativeResPayload;

    /**
     * Response headers received from native call
     */
    @JsonProperty("nativeResponseHeaders")
    protected Map<String, String> nativeResponseHeaders;

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
    protected Map<String, String> queryParameters;

    /**
     * The complete request payload
     */
    @JsonProperty("reqPayload")
    protected String reqPayload;

    /**
     * Incoming request headers
     */
    @JsonProperty("requestHeaders")
    protected Map<String, String> requestHeaders;

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
    protected Map<String, String> responseHeaders;

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

    /**
     * Constructs a validated instance of {@link TransactionEvent}.
     *
     * @param spec the specification to process
     */
    public TransactionEvent(Consumer<TransactionEvent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TransactionEvent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TransactionEvent(Consumer)} instead.
     * @param apiId API Id
     * @param apiName API name
     * @param apiVersion API version
     * @param applicationId Unique Id of the application
     * @param applicationIp IP address of the application for the current request
     * @param applicationName Application name
     * @param cachedResponse Boolean value to indicate whether the response is served from cache
     * @param callbackRequest callbackRequest
     * @param consumerIp IP address of the consumer for the current request
     * @param correlationID Correlation ID used in the logging
     * @param creationDate Creation time of the transaction.
     * @param customFields Custom fields to be added.
     * @param errorOrigin Information of error orgination
     * @param eventType eventType
     * @param externalCalls Details of external calls made
     * @param gatewayTime Time taken by the API Gateway for processing the request
     * @param httpMethod Name of the method
     * @param id id
     * @param messagePayload Payload of a Websocket message
     * @param messageType Websocket message type
     * @param nativeHttpMethod Finally resolved HTTP method of native endpoint call
     * @param nativeReqPayload Request payload sent in native call
     * @param nativeRequestHeaders Request headers sent in native call
     * @param nativeResPayload Response payload received from native call
     * @param nativeResponseHeaders Response headers received from native call
     * @param nativeURL Finally resolved URL of native endpoint call
     * @param operationName Operation name of the incoming request
     * @param origin Origin of a Websocket message
     * @param packageId Id of the package.
     * @param packageName Package name
     * @param planId Id of the Plan
     * @param planName Plan name
     * @param providerTime Time taken by the native provider for processing the request
     * @param queryParameters Incoming query parameters
     * @param reqPayload The complete request payload
     * @param requestHeaders Incoming request headers
     * @param resPayload The complete response payload
     * @param responseCode Response status code
     * @param responseHeaders Outgoing response headers
     * @param serverID Information about APIGW servername and port
     * @param sessionId Unique Id of the session
     * @param sourceGateway sourceGateway
     * @param sourceGatewayDetails sourceGatewayDetails
     * @param sourceGatewayNode The node which processed the request, in a multi node gateway
     * @param status Status of the request
     * @param totalDataSize Total size of the payload
     * @param totalTime Total time taken for processing the request
     */
    @ApiStatus.Internal
    public TransactionEvent(String apiId, String apiName, String apiVersion, String applicationId, String applicationIp, String applicationName, String cachedResponse, Boolean callbackRequest, String consumerIp, String correlationID, Long creationDate, Map<String, String> customFields, String errorOrigin, String eventType, List<ExternalCallData> externalCalls, Long gatewayTime, String httpMethod, String id, String messagePayload, String messageType, String nativeHttpMethod, String nativeReqPayload, Map<String, String> nativeRequestHeaders, String nativeResPayload, Map<String, String> nativeResponseHeaders, String nativeURL, String operationName, String origin, String packageId, String packageName, String planId, String planName, Long providerTime, Map<String, String> queryParameters, String reqPayload, Map<String, String> requestHeaders, String resPayload, String responseCode, Map<String, String> responseHeaders, String serverID, String sessionId, String sourceGateway, String sourceGatewayDetails, String sourceGatewayNode, String status, Long totalDataSize, Long totalTime) {
        this.apiId = apiId;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.applicationId = applicationId;
        this.applicationIp = applicationIp;
        this.applicationName = applicationName;
        this.cachedResponse = cachedResponse;
        this.callbackRequest = callbackRequest;
        this.consumerIp = consumerIp;
        this.correlationID = correlationID;
        this.creationDate = creationDate;
        this.customFields = customFields;
        this.errorOrigin = errorOrigin;
        this.eventType = eventType;
        this.externalCalls = externalCalls;
        this.gatewayTime = gatewayTime;
        this.httpMethod = httpMethod;
        this.id = id;
        this.messagePayload = messagePayload;
        this.messageType = messageType;
        this.nativeHttpMethod = nativeHttpMethod;
        this.nativeReqPayload = nativeReqPayload;
        this.nativeRequestHeaders = nativeRequestHeaders;
        this.nativeResPayload = nativeResPayload;
        this.nativeResponseHeaders = nativeResponseHeaders;
        this.nativeURL = nativeURL;
        this.operationName = operationName;
        this.origin = origin;
        this.packageId = packageId;
        this.packageName = packageName;
        this.planId = planId;
        this.planName = planName;
        this.providerTime = providerTime;
        this.queryParameters = queryParameters;
        this.reqPayload = reqPayload;
        this.requestHeaders = requestHeaders;
        this.resPayload = resPayload;
        this.responseCode = responseCode;
        this.responseHeaders = responseHeaders;
        this.serverID = serverID;
        this.sessionId = sessionId;
        this.sourceGateway = sourceGateway;
        this.sourceGatewayDetails = sourceGatewayDetails;
        this.sourceGatewayNode = sourceGatewayNode;
        this.status = status;
        this.totalDataSize = totalDataSize;
        this.totalTime = totalTime;
    }

}
