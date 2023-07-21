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
 * GqlInputValueDefinition
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
    "defaultValue",
    "description",
    "directives",
    "directivesByName",
    "name",
    "type"
})
@JsonTypeName("GqlInputValueDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlInputValueDefinition {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    @JsonProperty("defaultValue")
    protected GqlValue defaultValue;

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
     * Name of the input value definition
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("type")
    protected GqlType type;

    /**
     * Constructs a validated instance of {@link GqlInputValueDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlInputValueDefinition(Consumer<GqlInputValueDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlInputValueDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlInputValueDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param defaultValue var.name
     * @param description var.name
     * @param directives List of directives
     * @param directivesByName var.name
     * @param name Name of the input value definition
     * @param type var.name
     */
    @ApiStatus.Internal
    public GqlInputValueDefinition(List<GqlComment> comments, GqlValue defaultValue, GqlDescription description, List<GqlDirective> directives, Map<String, GqlDirective> directivesByName, String name, GqlType type) {
        this.comments = comments;
        this.defaultValue = defaultValue;
        this.description = description;
        this.directives = directives;
        this.directivesByName = directivesByName;
        this.name = name;
        this.type = type;
    }

}
