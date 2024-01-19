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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ArchiveTraceInfoRequest
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
    "correlationIDs"
})
@JsonTypeName("ArchiveTraceInfoRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArchiveTraceInfoRequest {

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

    /**
     * Constructs a validated instance of {@link ArchiveTraceInfoRequest}.
     *
     * @param spec the specification to process
     */
    public ArchiveTraceInfoRequest(Consumer<ArchiveTraceInfoRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ArchiveTraceInfoRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ArchiveTraceInfoRequest(Consumer)} instead.
     * @param apiId The UUID of the API from which the tracer events are exported.
     * @param apiType The type of the API. Possible values are SOAP, REST, ODATA
     * @param correlationIDs Specifies the list of Correlation ID data for which trace information should be archived.
     */
    @ApiStatus.Internal
    public ArchiveTraceInfoRequest(String apiId, String apiType, List<CorrelationIDInfo> correlationIDs) {
        this.apiId = apiId;
        this.apiType = apiType;
        this.correlationIDs = correlationIDs;
    }

}
