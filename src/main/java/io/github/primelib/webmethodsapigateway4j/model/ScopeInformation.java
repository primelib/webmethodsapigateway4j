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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScopeInformation
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
    "resourcePath",
    "supportedOperations"
})
@JsonTypeName("ScopeInformation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScopeInformation {

    @JsonProperty("resourcePath")
    protected String resourcePath;

    @JsonProperty("supportedOperations")
    protected List<String> supportedOperations;

    /**
     * Constructs a validated instance of {@link ScopeInformation}.
     *
     * @param spec the specification to process
     */
    public ScopeInformation(Consumer<ScopeInformation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScopeInformation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScopeInformation(Consumer)} instead.
     * @param resourcePath resourcePath
     * @param supportedOperations supportedOperations
     */
    @ApiStatus.Internal
    public ScopeInformation(String resourcePath, List<String> supportedOperations) {
        this.resourcePath = resourcePath;
        this.supportedOperations = supportedOperations;
    }

}
