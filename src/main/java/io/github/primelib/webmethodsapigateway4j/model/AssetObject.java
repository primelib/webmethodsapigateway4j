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
 * AssetObject
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "dependencyFailed",
    "explanation",
    "id",
    "name",
    "overwritten",
    "status",
    "warning"
})
@JsonTypeName("AssetObject")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AssetObject {

    /**
     * Constructs a validated implementation of {@link AssetObject}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AssetObject(Consumer<AssetObject> spec) {
        spec.accept(this);
    }

    /**
     * Specified whether the dependency asset is failed or not
     */
    @JsonProperty("dependencyFailed")
    protected Boolean dependencyFailed;

    /**
     * Explanation for the failure
     */
    @JsonProperty("explanation")
    protected String explanation;

    /**
     * Id of the API gateway asset
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Name of the API gateway asset
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Specifies whether the promoted asset overwrite any existing asset or not
     */
    @JsonProperty("overwritten")
    protected Boolean overwritten;

    /**
     * Status of the API gateway asset i.e success or failure
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Specified whether a warning occurred during import of the asset
     */
    @JsonProperty("warning")
    protected Boolean warning;


}
