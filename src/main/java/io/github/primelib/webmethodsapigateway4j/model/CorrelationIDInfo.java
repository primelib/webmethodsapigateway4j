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
 * CorrelationIDInfo
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
    "correlationID",
    "creationDate",
    "status",
    "statusCode"
})
@JsonTypeName("CorrelationIDInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CorrelationIDInfo {

    /**
     * The correlation ID of the tracer event which should be archived.
     */
    @JsonProperty("correlationID")
    protected String correlationID;

    /**
     * The epoch timestamp (in milliseconds) of the instance when the runtime execution happened.
     */
    @JsonProperty("creationDate")
    protected Long creationDate;

    /**
     * The status of the runtime execution. Possible values are SUCCESS, FAILURE
     */
    @JsonProperty("status")
    protected String status;

    /**
     * The status code of the runtime execution.
     */
    @JsonProperty("statusCode")
    protected Integer statusCode;

    /**
     * Constructs a validated instance of {@link CorrelationIDInfo}.
     *
     * @param spec the specification to process
     */
    public CorrelationIDInfo(Consumer<CorrelationIDInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CorrelationIDInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CorrelationIDInfo(Consumer)} instead.
     * @param correlationID The correlation ID of the tracer event which should be archived.
     * @param creationDate The epoch timestamp (in milliseconds) of the instance when the runtime execution happened.
     * @param status The status of the runtime execution. Possible values are SUCCESS, FAILURE
     * @param statusCode The status code of the runtime execution.
     */
    @ApiStatus.Internal
    public CorrelationIDInfo(String correlationID, Long creationDate, String status, Integer statusCode) {
        this.correlationID = correlationID;
        this.creationDate = creationDate;
        this.status = status;
        this.statusCode = statusCode;
    }

}
