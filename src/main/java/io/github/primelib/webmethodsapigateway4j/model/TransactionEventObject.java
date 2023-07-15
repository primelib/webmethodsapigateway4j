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
 * TransactionEventObject
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
@JsonTypeName("TransactionEventObject")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TransactionEventObject {

    /**
     * Constructs a validated implementation of {@link TransactionEventObject}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TransactionEventObject(Consumer<TransactionEventObject> spec) {
        spec.accept(this);
    }

    /**
     * The correlation ID of the event which uniquely identifies an API invocation.
     */
    @JsonProperty("correlationID")
    protected String correlationID;

    /**
     * The epoch start timestamp of the event in milliseconds.
     */
    @JsonProperty("creationDate")
    protected Long creationDate;

    /**
     * The execution status of the event. Indicated as SUCCESS or FAILURE.
     */
    @JsonProperty("status")
    protected String status;

    /**
     * The HTTP status returned in the response for the API invocation.
     */
    @JsonProperty("statusCode")
    protected Integer statusCode;


}
