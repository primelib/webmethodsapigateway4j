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
 * CorrelationIDInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link CorrelationIDInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CorrelationIDInfo(Consumer<CorrelationIDInfo> spec) {
        spec.accept(this);
    }

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


}
