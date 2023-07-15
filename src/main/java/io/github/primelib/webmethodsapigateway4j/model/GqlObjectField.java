package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GqlObjectField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "comments",
    "name",
    "value"
})
@JsonTypeName("GqlObjectField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlObjectField {

    /**
     * Constructs a validated implementation of {@link GqlObjectField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlObjectField(Consumer<GqlObjectField> spec) {
        spec.accept(this);
    }

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Name of the object field
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("value")
    protected GqlValue value;


}
