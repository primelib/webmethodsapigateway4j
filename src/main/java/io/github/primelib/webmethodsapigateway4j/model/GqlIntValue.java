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
 * GqlIntValue
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
    "value"
})
@JsonTypeName("GqlIntValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlIntValue {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Integer value
     */
    @JsonProperty("value")
    protected Integer value;

    /**
     * Constructs a validated instance of {@link GqlIntValue}.
     *
     * @param spec the specification to process
     */
    public GqlIntValue(Consumer<GqlIntValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlIntValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlIntValue(Consumer)} instead.
     * @param comments List of comments
     * @param value Integer value
     */
    @ApiStatus.Internal
    public GqlIntValue(List<GqlComment> comments, Integer value) {
        this.comments = comments;
        this.value = value;
    }

}
