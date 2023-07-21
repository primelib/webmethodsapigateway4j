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
 * GqlOperationTypeDefinition
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
    "enabled",
    "name",
    "typeName"
})
@JsonTypeName("GqlOperationTypeDefinition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlOperationTypeDefinition {

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

    /**
     * Constructs a validated instance of {@link GqlOperationTypeDefinition}.
     *
     * @param spec the specification to process
     */
    public GqlOperationTypeDefinition(Consumer<GqlOperationTypeDefinition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlOperationTypeDefinition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlOperationTypeDefinition(Consumer)} instead.
     * @param comments List of comments
     * @param enabled Flag to specify if this field is enabled or not
     * @param name Name of the operation type definition
     * @param typeName var.name
     */
    @ApiStatus.Internal
    public GqlOperationTypeDefinition(List<GqlComment> comments, Boolean enabled, String name, GqlTypeName typeName) {
        this.comments = comments;
        this.enabled = enabled;
        this.name = name;
        this.typeName = typeName;
    }

}
