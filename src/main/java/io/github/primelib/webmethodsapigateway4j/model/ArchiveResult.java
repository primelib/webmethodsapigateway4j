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
 * ArchiveResult
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
    "dependencyFailed",
    "explanation",
    "importedOK",
    "name",
    "overwritten",
    "warning"
})
@JsonTypeName("ArchiveResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ArchiveResult {

    @JsonProperty("dependencyFailed")
    protected Boolean dependencyFailed;

    @JsonProperty("explanation")
    protected String explanation;

    @JsonProperty("importedOK")
    protected Boolean importedOK;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("overwritten")
    protected Boolean overwritten;

    @JsonProperty("warning")
    protected Boolean warning;

    /**
     * Constructs a validated instance of {@link ArchiveResult}.
     *
     * @param spec the specification to process
     */
    public ArchiveResult(Consumer<ArchiveResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ArchiveResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ArchiveResult(Consumer)} instead.
     * @param dependencyFailed dependencyFailed
     * @param explanation explanation
     * @param importedOK importedOK
     * @param name name
     * @param overwritten overwritten
     * @param warning warning
     */
    @ApiStatus.Internal
    public ArchiveResult(Boolean dependencyFailed, String explanation, Boolean importedOK, String name, Boolean overwritten, Boolean warning) {
        this.dependencyFailed = dependencyFailed;
        this.explanation = explanation;
        this.importedOK = importedOK;
        this.name = name;
        this.overwritten = overwritten;
        this.warning = warning;
    }

}
