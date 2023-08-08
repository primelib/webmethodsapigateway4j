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
 * GqlValue
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
    "comments"
})
@JsonTypeName("GqlValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlValue {

    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Constructs a validated instance of {@link GqlValue}.
     *
     * @param spec the specification to process
     */
    public GqlValue(Consumer<GqlValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlValue(Consumer)} instead.
     * @param comments comments
     */
    @ApiStatus.Internal
    public GqlValue(List<GqlComment> comments) {
        this.comments = comments;
    }

}
