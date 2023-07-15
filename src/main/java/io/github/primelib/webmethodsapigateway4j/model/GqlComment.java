package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GqlComment
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "content"
})
@JsonTypeName("GqlComment")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlComment {

    /**
     * Constructs a validated implementation of {@link GqlComment}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlComment(Consumer<GqlComment> spec) {
        spec.accept(this);
    }

    /**
     * Comment value
     */
    @JsonProperty("content")
    protected String content;


}
