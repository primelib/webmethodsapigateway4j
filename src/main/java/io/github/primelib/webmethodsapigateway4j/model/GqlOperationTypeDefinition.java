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
 * GqlOperationTypeDefinition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "comments",
    "enabled",
    "name",
    "typeName"
})
@JsonTypeName("GqlOperationTypeDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlOperationTypeDefinition {

    /**
     * Constructs a validated implementation of {@link GqlOperationTypeDefinition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlOperationTypeDefinition(Consumer<GqlOperationTypeDefinition> spec) {
        spec.accept(this);
    }

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Flag to specify if this field is enabled or not
     */
    @JsonProperty("enabled")
    protected Boolean enabled;

    /**
     * Name of the operation type definition
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("typeName")
    protected GqlTypeName typeName;


}
