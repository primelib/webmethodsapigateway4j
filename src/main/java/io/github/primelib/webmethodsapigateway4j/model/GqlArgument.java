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
 * GqlArgument
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
    "name",
    "value"
})
@JsonTypeName("GqlArgument")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlArgument {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Name of the argument
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("value")
    protected GqlValue value;

    /**
     * Constructs a validated instance of {@link GqlArgument}.
     *
     * @param spec the specification to process
     */
    public GqlArgument(Consumer<GqlArgument> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlArgument}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlArgument(Consumer)} instead.
     * @param comments List of comments
     * @param name Name of the argument
     * @param value value
     */
    @ApiStatus.Internal
    public GqlArgument(List<GqlComment> comments, String name, GqlValue value) {
        this.comments = comments;
        this.name = name;
        this.value = value;
    }

}
