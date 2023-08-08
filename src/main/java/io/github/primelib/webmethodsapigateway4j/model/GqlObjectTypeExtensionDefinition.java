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
 * GqlObjectTypeExtensionDefinition
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
    "fieldDefinitions",
    "implements",
    "name"
})
@JsonTypeName("GqlObjectTypeExtensionDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlObjectTypeExtensionDefinition {

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
     * List of field definitions
     */
    @JsonProperty("fieldDefinitions")
    protected List<GqlFieldDefinition> fieldDefinitions;

    @JsonProperty("implements")
    protected List<GqlType> _implements;

    /**
     * Name of the object type definition
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link GqlObjectTypeExtensionDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlObjectTypeExtensionDefinition(Consumer<GqlObjectTypeExtensionDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlObjectTypeExtensionDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlObjectTypeExtensionDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param description description
     * @param directives List of directives
     * @param directivesByName directivesByName
     * @param fieldDefinitions List of field definitions
     * @param _implements _implements
     * @param name Name of the object type definition
     */
    @ApiStatus.Internal
    public GqlObjectTypeExtensionDefinition(List<GqlComment> comments, GqlDescription description, List<GqlDirective> directives, Map<String, GqlDirective> directivesByName, List<GqlFieldDefinition> fieldDefinitions, List<GqlType> _implements, String name) {
        this.comments = comments;
        this.description = description;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.fieldDefinitions = fieldDefinitions;
        this._implements = _implements;
        this.name = name;
    }

}
