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
 * GqlDirectiveDefinition
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
    "directiveLocations",
    "inputValueDefinitions",
    "name"
})
@JsonTypeName("GqlDirectiveDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlDirectiveDefinition {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    @JsonProperty("description")
    protected GqlDescription description;

    /**
     * List of directive locations
     */
    @JsonProperty("directiveLocations")
    protected List<GqlDirectiveLocation> directiveLocations;

    /**
     * List of input value type definitions
     */
    @JsonProperty("inputValueDefinitions")
    protected List<GqlInputValueDefinition> inputValueDefinitions;

    /**
     * Name of the directive
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link GqlDirectiveDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlDirectiveDefinition(Consumer<GqlDirectiveDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlDirectiveDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlDirectiveDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param description description
     * @param directiveLocations List of directive locations
     * @param inputValueDefinitions List of input value type definitions
     * @param name Name of the directive
     */
    @ApiStatus.Internal
    public GqlDirectiveDefinition(List<GqlComment> comments, GqlDescription description, List<GqlDirectiveLocation> directiveLocations, List<GqlInputValueDefinition> inputValueDefinitions, String name) {
        this.comments = comments;
        this.description = description;
        this.directiveLocations = directiveLocations;
        this.inputValueDefinitions = inputValueDefinitions;
        this.name = name;
    }

}
