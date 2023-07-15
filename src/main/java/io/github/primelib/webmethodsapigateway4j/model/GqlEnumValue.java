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
 * GqlEnumValue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "comments",
    "name"
})
@JsonTypeName("GqlEnumValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GqlEnumValue {

    /**
     * Constructs a validated implementation of {@link GqlEnumValue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GqlEnumValue(Consumer<GqlEnumValue> spec) {
        spec.accept(this);
    }

    /**
     * List of comments
     */
    @JsonProperty("comments")
    protected List<GqlComment> comments;

    /**
     * Name of the enum value
     */
    @JsonProperty("name")
    protected String name;


}
