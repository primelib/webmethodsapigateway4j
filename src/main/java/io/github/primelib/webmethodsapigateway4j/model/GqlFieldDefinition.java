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
 * GqlFieldDefinition
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
    "enabled",
    "inputValueDefinitions",
    "name",
    "type"
})
@JsonTypeName("GqlFieldDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlFieldDefinition {

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
     * Flag to specify if this field is enabled or not
     */
    @JsonProperty("enabled")
    protected Boolean enabled;

    /**
     * List of input value type definitions
     */
    @JsonProperty("inputValueDefinitions")
    protected List<GqlInputValueDefinition> inputValueDefinitions;

    /**
     * Name of the field definition
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("type")
    protected GqlType type;

    /**
     * Constructs a validated instance of {@link GqlFieldDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlFieldDefinition(Consumer<GqlFieldDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlFieldDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlFieldDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param description description
     * @param directives List of directives
     * @param directivesByName directivesByName
     * @param enabled Flag to specify if this field is enabled or not
     * @param inputValueDefinitions List of input value type definitions
     * @param name Name of the field definition
     * @param type type
     */
    @ApiStatus.Internal
    public GqlFieldDefinition(List<GqlComment> comments, GqlDescription description, List<GqlDirective> directives, Map<String, GqlDirective> directivesByName, Boolean enabled, List<GqlInputValueDefinition> inputValueDefinitions, String name, GqlType type) {
        this.comments = comments;
        this.description = description;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.enabled = enabled;
        this.inputValueDefinitions = inputValueDefinitions;
        this.name = name;
        this.type = type;
    }

}
