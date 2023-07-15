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
 * ArchiveResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link ArchiveResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ArchiveResult(Consumer<ArchiveResult> spec) {
        spec.accept(this);
    }

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


}
