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
 * GqlEnumTypeExtensionDefinition
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
    "enumValueDefinitions",
    "name"
})
@JsonTypeName("GqlEnumTypeExtensionDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlEnumTypeExtensionDefinition {

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
     * List of enum value definition
     */
    @JsonProperty("enumValueDefinitions")
    protected List<GqlEnumValueDefinition> enumValueDefinitions;

    /**
     * Name of the enum type definition
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link GqlEnumTypeExtensionDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlEnumTypeExtensionDefinition(Consumer<GqlEnumTypeExtensionDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlEnumTypeExtensionDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlEnumTypeExtensionDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param description description
     * @param directives List of directives
     * @param directivesByName directivesByName
     * @param enumValueDefinitions List of enum value definition
     * @param name Name of the enum type definition
     */
    @ApiStatus.Internal
    public GqlEnumTypeExtensionDefinition(List<GqlComment> comments, GqlDescription description, List<GqlDirective> directives, Map<String, GqlDirective> directivesByName, List<GqlEnumValueDefinition> enumValueDefinitions, String name) {
        this.comments = comments;
        this.description = description;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.enumValueDefinitions = enumValueDefinitions;
        this.name = name;
    }

}
