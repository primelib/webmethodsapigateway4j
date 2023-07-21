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
 * PackageFolderPair
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
    "apiDescriptorNSNameMap",
    "folderName",
    "markedAsDeleted",
    "packageName"
})
@JsonTypeName("PackageFolderPair")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackageFolderPair {

    @JsonProperty("apiDescriptorNSNameMap")
    protected Map<String, String> apiDescriptorNSNameMap;

    @JsonProperty("folderName")
    protected String folderName;

    @JsonProperty("markedAsDeleted")
    protected Boolean markedAsDeleted;

    @JsonProperty("packageName")
    protected String packageName;

    /**
     * Constructs a validated instance of {@link PackageFolderPair}.
     *
     * @param spec the specification to process
     */
    public PackageFolderPair(Consumer<PackageFolderPair> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PackageFolderPair}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PackageFolderPair(Consumer)} instead.
     * @param apiDescriptorNSNameMap var.name
     * @param folderName var.name
     * @param markedAsDeleted var.name
     * @param packageName var.name
     */
    @ApiStatus.Internal
    public PackageFolderPair(Map<String, String> apiDescriptorNSNameMap, String folderName, Boolean markedAsDeleted, String packageName) {
        this.apiDescriptorNSNameMap = apiDescriptorNSNameMap;
        this.folderName = folderName;
        this.markedAsDeleted = markedAsDeleted;
        this.packageName = packageName;
    }

}
