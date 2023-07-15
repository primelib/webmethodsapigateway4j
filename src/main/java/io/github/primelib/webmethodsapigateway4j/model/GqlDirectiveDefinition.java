package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GqlDirectiveDefinition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link GqlDirectiveDefinition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlDirectiveDefinition(Consumer<GqlDirectiveDefinition> spec) {
        spec.accept(this);
    }

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


}
