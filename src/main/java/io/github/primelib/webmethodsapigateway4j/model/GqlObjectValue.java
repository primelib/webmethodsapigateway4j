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
 * GqlObjectValue
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
    "objectFields"
})
@JsonTypeName("GqlObjectValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlObjectValue {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * List of object fields
     */
    @JsonProperty("objectFields")
    protected List<GqlObjectField> objectFields;

    /**
     * Constructs a validated instance of {@link GqlObjectValue}.
     *
     * @param spec the specification to process
     */
    public GqlObjectValue(Consumer<GqlObjectValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlObjectValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlObjectValue(Consumer)} instead.
     * @param comments List of comments
     * @param objectFields List of object fields
     */
    @ApiStatus.Internal
    public GqlObjectValue(List<GqlComment> comments, List<GqlObjectField> objectFields) {
        this.comments = comments;
        this.objectFields = objectFields;
    }

}
