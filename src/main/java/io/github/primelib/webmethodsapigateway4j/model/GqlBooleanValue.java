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
 * GqlBooleanValue
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
@JsonTypeName("GqlBooleanValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlBooleanValue {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Boolean value
     */
    @JsonProperty("value")
    protected Boolean value;

    /**
     * Constructs a validated instance of {@link GqlBooleanValue}.
     *
     * @param spec the specification to process
     */
    public GqlBooleanValue(Consumer<GqlBooleanValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlBooleanValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlBooleanValue(Consumer)} instead.
     * @param comments List of comments
     * @param value Boolean value
     */
    @ApiStatus.Internal
    public GqlBooleanValue(List<GqlComment> comments, Boolean value) {
        this.comments = comments;
        this.value = value;
    }

}
