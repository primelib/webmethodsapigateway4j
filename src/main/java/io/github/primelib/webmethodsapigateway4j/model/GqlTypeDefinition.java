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
 * GqlTypeDefinition
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
    "directives",
    "directivesByName",
    "name"
})
@JsonTypeName("GqlTypeDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlTypeDefinition {

    @JsonProperty("comments")
    protected List<GqlComment> comments;

    @JsonProperty("directives")
    protected List<GqlDirective> directives;

    @JsonProperty("directivesByName")
    protected Map<String, GqlDirective> directivesByName;

    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link GqlTypeDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlTypeDefinition(Consumer<GqlTypeDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlTypeDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlTypeDefinition(Consumer)} instead.
     * @param comments var.name
     * @param directives var.name
     * @param directivesByName var.name
     * @param name var.name
     */
    @ApiStatus.Internal
    public GqlTypeDefinition(List<GqlComment> comments, List<GqlDirective> directives, Map<String, GqlDirective> directivesByName, String name) {
        this.comments = comments;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.name = name;
    }

}
