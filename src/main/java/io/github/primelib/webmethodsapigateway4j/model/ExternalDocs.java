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
 * ExternalDocs
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
    "url",
    "vendorExtensions"
})
@JsonTypeName("ExternalDocs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExternalDocs {

    /**
     * A short description of the target documentation
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The URL for the target documentation
     */
    @JsonProperty("url")
    protected String url;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link ExternalDocs}.
     *
     * @param spec the specification to process
     */
    public ExternalDocs(Consumer<ExternalDocs> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExternalDocs}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExternalDocs(Consumer)} instead.
     * @param description A short description of the target documentation
     * @param url The URL for the target documentation
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public ExternalDocs(String description, String url, Map<String, Object> vendorExtensions) {
        this.description = description;
        this.url = url;
        this.vendorExtensions = vendorExtensions;
    }

}
