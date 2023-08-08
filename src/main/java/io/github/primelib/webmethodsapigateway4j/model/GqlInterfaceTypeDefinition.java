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
 * GqlInterfaceTypeDefinition
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
    "name",
    "description",
    "fieldDefinitions",
    "implements"
})
@JsonTypeName("GqlInterfaceTypeDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlInterfaceTypeDefinition {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * List of directives
     */
    @JsonProperty("directives")
    protected List<GqlDirective> directives;

    @JsonProperty("directivesByName")
    protected Map<String, GqlDirective> directivesByName;

    /**
     * Name of the interface type definition
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected GqlDescription description;

    /**
     * List of field definitions
     */
    @JsonProperty("fieldDefinitions")
    protected List<GqlFieldDefinition> fieldDefinitions;

    @JsonProperty("implements")
    protected List<GqlType> _implements;

    /**
     * Constructs a validated instance of {@link GqlInterfaceTypeDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlInterfaceTypeDefinition(Consumer<GqlInterfaceTypeDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlInterfaceTypeDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlInterfaceTypeDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param directives List of directives
     * @param directivesByName directivesByName
     * @param name Name of the interface type definition
     * @param description description
     * @param fieldDefinitions List of field definitions
     * @param _implements _implements
     */
    @ApiStatus.Internal
    public GqlInterfaceTypeDefinition(List<GqlComment> comments, List<GqlDirective> directives, Map<String, GqlDirective> directivesByName, String name, GqlDescription description, List<GqlFieldDefinition> fieldDefinitions, List<GqlType> _implements) {
        this.comments = comments;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.name = name;
        this.description = description;
        this.fieldDefinitions = fieldDefinitions;
        this._implements = _implements;
    }

}
