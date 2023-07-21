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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrintArchiveResults
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
    "ArchiveResult",
    "errorReason",
    "status"
})
@JsonTypeName("PrintArchiveResults")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PrintArchiveResults {

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

    /**
     * Constructs a validated instance of {@link PrintArchiveResults}.
     *
     * @param spec the specification to process
     */
    public PrintArchiveResults(Consumer<PrintArchiveResults> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PrintArchiveResults}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PrintArchiveResults(Consumer)} instead.
     * @param archiveResult List of the result of the promotion of all selected assets where key in the each element is the asset type
     * @param errorReason Error reason for the promotion of assets, if the promotion is failed
     * @param status Status of the promotion of assets
     */
    @ApiStatus.Internal
    public PrintArchiveResults(List<Map<String, AssetObject>> archiveResult, String errorReason, String status) {
        this.archiveResult = archiveResult;
        this.errorReason = errorReason;
        this.status = status;
    }

}
