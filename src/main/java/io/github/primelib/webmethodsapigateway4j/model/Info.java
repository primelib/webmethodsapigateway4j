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
 * Info
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contact",
    "description",
    "license",
    "termsOfService",
    "title",
    "vendorExtensions",
    "version"
})
@JsonTypeName("Info")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Info {

    /**
     * Constructs a validated implementation of {@link Info}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Info(Consumer<Info> spec) {
        spec.accept(this);
    }

    @JsonProperty("contact")
    protected Contact contact;

    /**
     * A short description of the application
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("license")
    protected Licence license;

    /**
     * A URL to the Terms of Service for the API
     */
    @JsonProperty("termsOfService")
    protected String termsOfService;

    /**
     * The title of the application
     */
    @JsonProperty("title")
    protected String title;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions = new HashMap<>();

    /**
     * Version of the API
     */
    @JsonProperty("version")
    protected String version;


}
