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
 * GqlListType
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
@JsonTypeName("GqlListType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlListType {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    @JsonProperty("type")
    protected GqlType type;

    /**
     * Constructs a validated instance of {@link GqlListType}.
     *
     * @param spec the specification to process
     */
    public GqlListType(Consumer<GqlListType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlListType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlListType(Consumer)} instead.
     * @param comments List of comments
     * @param type type
     */
    @ApiStatus.Internal
    public GqlListType(List<GqlComment> comments, GqlType type) {
        this.comments = comments;
        this.type = type;
    }

}
