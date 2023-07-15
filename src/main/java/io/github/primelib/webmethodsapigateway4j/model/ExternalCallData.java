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
 * ExternalCallData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link ExternalCallData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExternalCallData(Consumer<ExternalCallData> spec) {
        spec.accept(this);
    }

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


}
