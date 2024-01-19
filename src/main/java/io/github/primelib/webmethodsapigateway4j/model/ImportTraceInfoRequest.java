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

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportTraceInfoRequest
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
    "file"
})
@JsonTypeName("importTraceInfo_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImportTraceInfoRequest {

    /**
     * The import archive containing the exported tracer events.
     */
    @JsonProperty("file")
    protected File _file;

    /**
     * Constructs a validated instance of {@link ImportTraceInfoRequest}.
     *
     * @param spec the specification to process
     */
    public ImportTraceInfoRequest(Consumer<ImportTraceInfoRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ImportTraceInfoRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ImportTraceInfoRequest(Consumer)} instead.
     * @param _file The import archive containing the exported tracer events.
     */
    @ApiStatus.Internal
    public ImportTraceInfoRequest(File _file) {
        this._file = _file;
    }

}
