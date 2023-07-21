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
 * AssetObject
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

    /**
     * Constructs a validated instance of {@link AssetObject}.
     *
     * @param spec the specification to process
     */
    public AssetObject(Consumer<AssetObject> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AssetObject}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AssetObject(Consumer)} instead.
     * @param dependencyFailed Specified whether the dependency asset is failed or not
     * @param explanation Explanation for the failure
     * @param id Id of the API gateway asset
     * @param name Name of the API gateway asset
     * @param overwritten Specifies whether the promoted asset overwrite any existing asset or not
     * @param status Status of the API gateway asset i.e success or failure
     * @param warning Specified whether a warning occurred during import of the asset
     */
    @ApiStatus.Internal
    public AssetObject(Boolean dependencyFailed, String explanation, String id, String name, Boolean overwritten, String status, Boolean warning) {
        this.dependencyFailed = dependencyFailed;
        this.explanation = explanation;
        this.id = id;
        this.name = name;
        this.overwritten = overwritten;
        this.status = status;
        this.warning = warning;
    }

}
