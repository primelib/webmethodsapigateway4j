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
 * GqlSchemaDefinition
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
    "operationTypeDefinitions"
})
@JsonTypeName("GqlSchemaDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlSchemaDefinition {

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
     * List of operation type definitions
     */
    @JsonProperty("operationTypeDefinitions")
    protected List<GqlOperationTypeDefinition> operationTypeDefinitions;

    /**
     * Constructs a validated instance of {@link GqlSchemaDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlSchemaDefinition(Consumer<GqlSchemaDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlSchemaDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlSchemaDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param description var.name
     * @param directives List of directives
     * @param directivesByName var.name
     * @param operationTypeDefinitions List of operation type definitions
     */
    @ApiStatus.Internal
    public GqlSchemaDefinition(List<GqlComment> comments, GqlDescription description, List<GqlDirective> directives, Map<String, GqlDirective> directivesByName, List<GqlOperationTypeDefinition> operationTypeDefinitions) {
        this.comments = comments;
        this.description = description;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.operationTypeDefinitions = operationTypeDefinitions;
    }

}
