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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportTraceInfoResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ImportTraceInfoResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ImportTraceInfoResponse(Consumer<ImportTraceInfoResponse> spec) {
        spec.accept(this);
    }

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


}
