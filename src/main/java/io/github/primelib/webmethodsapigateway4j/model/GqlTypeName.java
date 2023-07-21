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
 * GqlTypeName
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
    "name"
})
@JsonTypeName("GqlTypeName")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlTypeName {

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Type
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link GqlTypeName}.
     *
     * @param spec the specification to process
     */
    public GqlTypeName(Consumer<GqlTypeName> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GqlTypeName}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GqlTypeName(Consumer)} instead.
     * @param comments List of comments
     * @param name Type
     */
    @ApiStatus.Internal
    public GqlTypeName(List<GqlComment> comments, String name) {
        this.comments = comments;
        this.name = name;
    }

}
