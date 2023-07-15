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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScopeInformation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "resourcePath",
    "supportedOperations"
})
@JsonTypeName("ScopeInformation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScopeInformation {

    /**
     * Constructs a validated implementation of {@link ScopeInformation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScopeInformation(Consumer<ScopeInformation> spec) {
        spec.accept(this);
    }

    @JsonProperty("resourcePath")
    protected String resourcePath;

    @JsonProperty("supportedOperations")
    protected List<String> supportedOperations;


}
