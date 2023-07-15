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
 * ExternalDocs
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "url",
    "vendorExtensions"
})
@JsonTypeName("ExternalDocs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExternalDocs {

    /**
     * Constructs a validated implementation of {@link ExternalDocs}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExternalDocs(Consumer<ExternalDocs> spec) {
        spec.accept(this);
    }

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
    protected Map<String, Object> vendorExtensions = new HashMap<>();


}
