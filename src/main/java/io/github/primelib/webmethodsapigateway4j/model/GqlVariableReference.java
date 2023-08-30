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
 * GqlVariableReference
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
    "comments",
    "name"
})
@JsonTypeName("GqlVariableReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlVariableReference {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Name of the variable reference
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link GqlVariableReference}.
     *
     * @param spec the specification to process
     */
    public GqlVariableReference(Consumer<GqlVariableReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlVariableReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlVariableReference(Consumer)} instead.
     * @param comments List of comments
     * @param name Name of the variable reference
     */
    @ApiStatus.Internal
    public GqlVariableReference(List<GqlComment> comments, String name) {
        this.comments = comments;
        this.name = name;
    }

}
