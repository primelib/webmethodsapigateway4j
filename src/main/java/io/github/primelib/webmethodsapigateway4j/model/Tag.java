package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tag
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "externalDocs",
    "name",
    "vendorExtensions"
})
@JsonTypeName("Tag")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Tag {

    /**
     * Constructs a validated implementation of {@link Tag}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Tag(Consumer<Tag> spec) {
        spec.accept(this);
    }

    /**
     * A short description for the tag
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("externalDocs")
    protected ExternalDocs externalDocs;

    /**
     * The name of the tag
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}
