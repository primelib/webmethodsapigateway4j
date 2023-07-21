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
 * GqlStringValue
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
@JsonTypeName("GqlStringValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlStringValue {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * String value
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link GqlStringValue}.
     *
     * @param spec the specification to process
     */
    public GqlStringValue(Consumer<GqlStringValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlStringValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlStringValue(Consumer)} instead.
     * @param comments List of comments
     * @param value String value
     */
    @ApiStatus.Internal
    public GqlStringValue(List<GqlComment> comments, String value) {
        this.comments = comments;
        this.value = value;
    }

}
