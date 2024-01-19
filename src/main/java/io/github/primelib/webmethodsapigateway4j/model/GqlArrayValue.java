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
 * GqlArrayValue
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
    "values"
})
@JsonTypeName("GqlArrayValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlArrayValue {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * List of values
     */
    @JsonProperty("values")
    protected List<GqlValue> values;

    /**
     * Constructs a validated instance of {@link GqlArrayValue}.
     *
     * @param spec the specification to process
     */
    public GqlArrayValue(Consumer<GqlArrayValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlArrayValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlArrayValue(Consumer)} instead.
     * @param comments List of comments
     * @param values List of values
     */
    @ApiStatus.Internal
    public GqlArrayValue(List<GqlComment> comments, List<GqlValue> values) {
        this.comments = comments;
        this.values = values;
    }

}
