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
 * GqlInputValueDefinition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link GqlInputValueDefinition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlInputValueDefinition(Consumer<GqlInputValueDefinition> spec) {
        spec.accept(this);
    }

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
    protected Map<String, GqlDirective> directivesByName = new HashMap<>();

    /**
     * Name of the input value definition
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("type")
    protected GqlType type;


}
