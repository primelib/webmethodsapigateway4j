// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * ServiceMgmtTag
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtTag")
@JsonPropertyOrder({
    "description",
    "externalDocs",
    "name",
    "vendorExtensions"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtTag {

    /**
     * A short description for the tag
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("externalDocs")
    protected ServiceMgmtExternalDocs externalDocs;

    /**
     * The name of the tag
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("vendorExtensions")
    protected Map<String, Object> vendorExtensions;

    /**
     * Constructs a validated instance of {@link ServiceMgmtTag}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtTag(Consumer<ServiceMgmtTag> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtTag}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtTag(Consumer)} instead.
     * @param description A short description for the tag
     * @param externalDocs externalDocs
     * @param name The name of the tag
     * @param vendorExtensions vendorExtensions
     */
    @ApiStatus.Internal
    public ServiceMgmtTag(String description, ServiceMgmtExternalDocs externalDocs, String name, Map<String, Object> vendorExtensions) {
        this.description = description;
        this.externalDocs = externalDocs;
        this.name = name;
        this.vendorExtensions = vendorExtensions;
    }
}
