package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PackageAPIModel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link PackageAPIModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PackageAPIModel(Consumer<PackageAPIModel> spec) {
        spec.accept(this);
    }

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


}