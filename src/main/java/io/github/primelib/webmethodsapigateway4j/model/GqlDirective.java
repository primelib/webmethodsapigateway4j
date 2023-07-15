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
 * GqlDirective
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "arguments",
    "comments",
    "name"
})
@JsonTypeName("GqlDirective")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlDirective {

    /**
     * Constructs a validated implementation of {@link GqlDirective}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlDirective(Consumer<GqlDirective> spec) {
        spec.accept(this);
    }

    /**
     * List of arguments
     */
    @JsonProperty("arguments")
    protected List<GqlArgument> arguments;

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Name of the directive
     */
    @JsonProperty("name")
    protected String name;


}
