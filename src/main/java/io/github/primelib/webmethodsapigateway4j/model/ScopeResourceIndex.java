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
 * ScopeResourceIndex
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
    "references",
    "scope"
})
@JsonTypeName("ScopeResourceIndex")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScopeResourceIndex {

    @JsonProperty("references")
    protected List<ScopeInformation> references;

    @JsonProperty("scope")
    protected Scope scope;

    /**
     * Constructs a validated instance of {@link ScopeResourceIndex}.
     *
     * @param spec the specification to process
     */
    public ScopeResourceIndex(Consumer<ScopeResourceIndex> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScopeResourceIndex}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScopeResourceIndex(Consumer)} instead.
     * @param references var.name
     * @param scope var.name
     */
    @ApiStatus.Internal
    public ScopeResourceIndex(List<ScopeInformation> references, Scope scope) {
        this.references = references;
        this.scope = scope;
    }

}
