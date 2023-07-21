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

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GqlFloatValue
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
@JsonTypeName("GqlFloatValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlFloatValue {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Decimal value
     */
    @JsonProperty("value")
    protected BigDecimal value;

    /**
     * Constructs a validated instance of {@link GqlFloatValue}.
     *
     * @param spec the specification to process
     */
    public GqlFloatValue(Consumer<GqlFloatValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlFloatValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlFloatValue(Consumer)} instead.
     * @param comments List of comments
     * @param value Decimal value
     */
    @ApiStatus.Internal
    public GqlFloatValue(List<GqlComment> comments, BigDecimal value) {
        this.comments = comments;
        this.value = value;
    }

}
