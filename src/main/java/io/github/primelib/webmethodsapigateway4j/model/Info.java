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
 * Info
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
    protected Map<String, Object> vendorExtensions;

    /**
     * Version of the API
     */
    @JsonProperty("version")
    protected String version;

    /**
     * Constructs a validated instance of {@link Info}.
     *
     * @param spec the specification to process
     */
    public Info(Consumer<Info> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Info}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Info(Consumer)} instead.
     * @param contact var.name
     * @param description A short description of the application
     * @param license var.name
     * @param termsOfService A URL to the Terms of Service for the API
     * @param title The title of the application
     * @param vendorExtensions var.name
     * @param version Version of the API
     */
    @ApiStatus.Internal
    public Info(Contact contact, String description, Licence license, String termsOfService, String title, Map<String, Object> vendorExtensions, String version) {
        this.contact = contact;
        this.description = description;
        this.license = license;
        this.termsOfService = termsOfService;
        this.title = title;
        this.vendorExtensions = vendorExtensions;
        this.version = version;
    }

}
