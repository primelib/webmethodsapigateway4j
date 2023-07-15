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
 * ArchiveTraceInfoRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiId",
    "apiType",
    "correlationIDs"
})
@JsonTypeName("ArchiveTraceInfoRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArchiveTraceInfoRequest {

    /**
     * Constructs a validated implementation of {@link ArchiveTraceInfoRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ArchiveTraceInfoRequest(Consumer<ArchiveTraceInfoRequest> spec) {
        spec.accept(this);
    }

    /**
     * The UUID of the API from which the tracer events are exported.
     */
    @JsonProperty("apiId")
    protected String apiId;

    /**
     * The type of the API. Possible values are SOAP, REST, ODATA
     */
    @JsonProperty("apiType")
    protected String apiType;

    /**
     * Specifies the list of Correlation ID data for which trace information should be archived.
     */
    @JsonProperty("correlationIDs")
    protected List<CorrelationIDInfo> correlationIDs;


}
