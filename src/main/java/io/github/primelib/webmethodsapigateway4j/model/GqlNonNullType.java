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
 * GqlNonNullType
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
    "type"
})
@JsonTypeName("GqlNonNullType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlNonNullType {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    @JsonProperty("type")
    protected GqlType type;

    /**
     * Constructs a validated instance of {@link GqlNonNullType}.
     *
     * @param spec the specification to process
     */
    public GqlNonNullType(Consumer<GqlNonNullType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlNonNullType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlNonNullType(Consumer)} instead.
     * @param comments List of comments
     * @param type type
     */
    @ApiStatus.Internal
    public GqlNonNullType(List<GqlComment> comments, GqlType type) {
        this.comments = comments;
        this.type = type;
    }

}
