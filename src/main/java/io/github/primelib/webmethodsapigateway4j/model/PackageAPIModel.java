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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PackageAPIModel
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
    "apiDescription",
    "apiName",
    "apiVersion",
    "icon",
    "id",
    "isActive",
    "systemVersion",
    "type"
})
@JsonTypeName("PackageAPIModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackageAPIModel {

    @JsonProperty("apiDescription")
    protected String apiDescription;

    @JsonProperty("apiName")
    protected String apiName;

    @JsonProperty("apiVersion")
    protected String apiVersion;

    @JsonProperty("icon")
    protected String icon;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("isActive")
    protected Boolean isActive;

    @JsonProperty("systemVersion")
    protected Long systemVersion;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link PackageAPIModel}.
     *
     * @param spec the specification to process
     */
    public PackageAPIModel(Consumer<PackageAPIModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PackageAPIModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PackageAPIModel(Consumer)} instead.
     * @param apiDescription apiDescription
     * @param apiName apiName
     * @param apiVersion apiVersion
     * @param icon icon
     * @param id id
     * @param isActive isActive
     * @param systemVersion systemVersion
     * @param type type
     */
    @ApiStatus.Internal
    public PackageAPIModel(String apiDescription, String apiName, String apiVersion, String icon, String id, Boolean isActive, Long systemVersion, String type) {
        this.apiDescription = apiDescription;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.icon = icon;
        this.id = id;
        this.isActive = isActive;
        this.systemVersion = systemVersion;
        this.type = type;
    }

}
