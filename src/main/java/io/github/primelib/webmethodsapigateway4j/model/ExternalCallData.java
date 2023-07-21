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
 * ExternalCallData
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
    "callDuration",
    "callEndTime",
    "callStartTime",
    "externalCallType",
    "externalURL",
    "responseCode"
})
@JsonTypeName("ExternalCallData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExternalCallData {

    @JsonProperty("callDuration")
    protected Long callDuration;

    @JsonProperty("callEndTime")
    protected Long callEndTime;

    @JsonProperty("callStartTime")
    protected Long callStartTime;

    @JsonProperty("externalCallType")
    protected String externalCallType;

    @JsonProperty("externalURL")
    protected String externalURL;

    @JsonProperty("responseCode")
    protected String responseCode;

    /**
     * Constructs a validated instance of {@link ExternalCallData}.
     *
     * @param spec the specification to process
     */
    public ExternalCallData(Consumer<ExternalCallData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExternalCallData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExternalCallData(Consumer)} instead.
     * @param callDuration var.name
     * @param callEndTime var.name
     * @param callStartTime var.name
     * @param externalCallType var.name
     * @param externalURL var.name
     * @param responseCode var.name
     */
    @ApiStatus.Internal
    public ExternalCallData(Long callDuration, Long callEndTime, Long callStartTime, String externalCallType, String externalURL, String responseCode) {
        this.callDuration = callDuration;
        this.callEndTime = callEndTime;
        this.callStartTime = callStartTime;
        this.externalCallType = externalCallType;
        this.externalURL = externalURL;
        this.responseCode = responseCode;
    }

}
