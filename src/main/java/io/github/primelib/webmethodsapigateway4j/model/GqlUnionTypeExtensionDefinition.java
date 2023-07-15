package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GqlUnionTypeExtensionDefinition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "comments",
    "description",
    "directives",
    "directivesByName",
    "memberTypes",
    "name"
})
@JsonTypeName("GqlUnionTypeExtensionDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlUnionTypeExtensionDefinition {

    /**
     * Constructs a validated implementation of {@link GqlUnionTypeExtensionDefinition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlUnionTypeExtensionDefinition(Consumer<GqlUnionTypeExtensionDefinition> spec) {
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
     * List of directives
     */
    @JsonProperty("directives")
    protected List<GqlDirective> directives;

    @JsonProperty("directivesByName")
    protected Map<String, GqlDirective> directivesByName = new HashMap<>();

    /**
     * The list union types
     */
    @JsonProperty("memberTypes")
    protected List<GqlType> memberTypes;

    /**
     * Name of the union type definition
     */
    @JsonProperty("name")
    protected String name;


}
