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
 * TransactionEventObject
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
@JsonTypeName("TransactionEventObject")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TransactionEventObject {

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

    /**
     * Constructs a validated instance of {@link TransactionEventObject}.
     *
     * @param spec the specification to process
     */
    public TransactionEventObject(Consumer<TransactionEventObject> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TransactionEventObject}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TransactionEventObject(Consumer)} instead.
     * @param correlationID The correlation ID of the event which uniquely identifies an API invocation.
     * @param creationDate The epoch start timestamp of the event in milliseconds.
     * @param status The execution status of the event. Indicated as SUCCESS or FAILURE.
     * @param statusCode The HTTP status returned in the response for the API invocation.
     */
    @ApiStatus.Internal
    public TransactionEventObject(String correlationID, Long creationDate, String status, Integer statusCode) {
        this.correlationID = correlationID;
        this.creationDate = creationDate;
        this.status = status;
        this.statusCode = statusCode;
    }

}
