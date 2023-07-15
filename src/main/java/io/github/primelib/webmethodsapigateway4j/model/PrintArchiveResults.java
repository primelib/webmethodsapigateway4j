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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrintArchiveResults
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "ArchiveResult",
    "errorReason",
    "status"
})
@JsonTypeName("PrintArchiveResults")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PrintArchiveResults {

    /**
     * Constructs a validated implementation of {@link PrintArchiveResults}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PrintArchiveResults(Consumer<PrintArchiveResults> spec) {
        spec.accept(this);
    }

    /**
     * List of the result of the promotion of all selected assets where key in the each element is the asset type
     */
    @JsonProperty("ArchiveResult")
    protected List<Map<String, AssetObject>> archiveResult;

    /**
     * Error reason for the promotion of assets, if the promotion is failed
     */
    @JsonProperty("errorReason")
    protected String errorReason;

    /**
     * Status of the promotion of assets
     */
    @JsonProperty("status")
    protected String status;


}
