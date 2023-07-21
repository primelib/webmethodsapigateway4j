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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tag
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
    "description",
    "externalDocs",
    "name",
    "vendorExtensions"
})
@JsonTypeName("Tag")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Tag {

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
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link Tag}.
     *
     * @param spec the specification to process
     */
    public Tag(Consumer<Tag> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Tag}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Tag(Consumer)} instead.
     * @param description A short description for the tag
     * @param externalDocs var.name
     * @param name The name of the tag
     * @param vendorExtensions var.name
     */
    @ApiStatus.Internal
    public Tag(String description, ExternalDocs externalDocs, String name, Map<String, Object> vendorExtensions) {
        this.description = description;
        this.externalDocs = externalDocs;
        this.name = name;
        this.vendorExtensions = vendorExtensions;
    }

}
