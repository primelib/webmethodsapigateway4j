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
 * GqlFieldDefinition
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
    "enabled",
    "inputValueDefinitions",
    "name",
    "type"
})
@JsonTypeName("GqlFieldDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlFieldDefinition {

    /**
     * Constructs a validated implementation of {@link GqlFieldDefinition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlFieldDefinition(Consumer<GqlFieldDefinition> spec) {
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


}
