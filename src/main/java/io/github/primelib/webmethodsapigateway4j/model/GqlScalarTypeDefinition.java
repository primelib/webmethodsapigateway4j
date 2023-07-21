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
 * GqlScalarTypeDefinition
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
    "description",
    "directives",
    "directivesByName",
    "name"
})
@JsonTypeName("GqlScalarTypeDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlScalarTypeDefinition {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    @JsonProperty("description")
    protected GqlDescription description;

    /**
     * List of directives
     */
    @JsonProperty("directives")
    protected List<GqlDirective> directives;

    @JsonProperty("directivesByName")
    protected Map<String, GqlDirective> directivesByName;

    /**
     * Name of the scalar type definition
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link GqlScalarTypeDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlScalarTypeDefinition(Consumer<GqlScalarTypeDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlScalarTypeDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlScalarTypeDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param description var.name
     * @param directives List of directives
     * @param directivesByName var.name
     * @param name Name of the scalar type definition
     */
    @ApiStatus.Internal
    public GqlScalarTypeDefinition(List<GqlComment> comments, GqlDescription description, List<GqlDirective> directives, Map<String, GqlDirective> directivesByName, String name) {
        this.comments = comments;
        this.description = description;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.name = name;
    }

}
