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
 * GqlDirective
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
    "arguments",
    "comments",
    "name"
})
@JsonTypeName("GqlDirective")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlDirective {

    /**
     * List of arguments
     */
    @JsonProperty("arguments")
    protected List<GqlArgument> arguments;

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Name of the directive
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link GqlDirective}.
     *
     * @param spec the specification to process
     */
    public GqlDirective(Consumer<GqlDirective> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlDirective}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlDirective(Consumer)} instead.
     * @param arguments List of arguments
     * @param comments List of comments
     * @param name Name of the directive
     */
    @ApiStatus.Internal
    public GqlDirective(List<GqlArgument> arguments, List<GqlComment> comments, String name) {
        this.arguments = arguments;
        this.comments = comments;
        this.name = name;
    }

}
