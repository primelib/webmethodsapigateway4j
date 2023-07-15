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
 * ScopeResourceIndex
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "references",
    "scope"
})
@JsonTypeName("ScopeResourceIndex")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScopeResourceIndex {

    /**
     * Constructs a validated implementation of {@link ScopeResourceIndex}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScopeResourceIndex(Consumer<ScopeResourceIndex> spec) {
        spec.accept(this);
    }

    @JsonProperty("references")
    protected List<ScopeInformation> references;

    @JsonProperty("scope")
    protected Scope scope;


}
