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
 * ImportTraceInfoResponse
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
    "apiType",
    "traceInfo",
    "transaction_events"
})
@JsonTypeName("ImportTraceInfoResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImportTraceInfoResponse {

    /**
     * The ID of the API for which the event(s) was/were generated.
     */
    @JsonProperty("apiId")
    protected String apiId;

    /**
     * The type of the API for which the event(s) was/were generated. Possible values are REST, SOAP, OData.
     */
    @JsonProperty("apiType")
    protected String apiType;

    /**
     * The detailed trace information of each event in the archive with the corresponding correlation ID.
     */
    @JsonProperty("traceInfo")
    protected List<Map<String, List<TraceLog>>> traceInfo;

    /**
     * The list of transaction events that were available in the imported archive.
     */
    @JsonProperty("transaction_events")
    protected List<TransactionEventObject> transactionEvents;

    /**
     * Constructs a validated instance of {@link ImportTraceInfoResponse}.
     *
     * @param spec the specification to process
     */
    public ImportTraceInfoResponse(Consumer<ImportTraceInfoResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ImportTraceInfoResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ImportTraceInfoResponse(Consumer)} instead.
     * @param apiId The ID of the API for which the event(s) was/were generated.
     * @param apiType The type of the API for which the event(s) was/were generated. Possible values are REST, SOAP, OData.
     * @param traceInfo The detailed trace information of each event in the archive with the corresponding correlation ID.
     * @param transactionEvents The list of transaction events that were available in the imported archive.
     */
    @ApiStatus.Internal
    public ImportTraceInfoResponse(String apiId, String apiType, List<Map<String, List<TraceLog>>> traceInfo, List<TransactionEventObject> transactionEvents) {
        this.apiId = apiId;
        this.apiType = apiType;
        this.traceInfo = traceInfo;
        this.transactionEvents = transactionEvents;
    }

}
