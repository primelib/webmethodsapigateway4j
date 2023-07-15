package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.io.File;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportTraceInfoRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "file"
})
@JsonTypeName("importTraceInfo_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ImportTraceInfoRequest {

    /**
     * Constructs a validated implementation of {@link ImportTraceInfoRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ImportTraceInfoRequest(Consumer<ImportTraceInfoRequest> spec) {
        spec.accept(this);
    }

    /**
     * The import archive containing the exported tracer events.
     */
    @JsonProperty("file")
    protected File _file;


}
