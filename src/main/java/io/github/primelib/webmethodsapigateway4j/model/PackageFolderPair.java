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
 * PackageFolderPair
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiDescriptorNSNameMap",
    "folderName",
    "markedAsDeleted",
    "packageName"
})
@JsonTypeName("PackageFolderPair")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackageFolderPair {

    /**
     * Constructs a validated implementation of {@link PackageFolderPair}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PackageFolderPair(Consumer<PackageFolderPair> spec) {
        spec.accept(this);
    }

    @JsonProperty("apiDescriptorNSNameMap")
    protected Map<String, String> apiDescriptorNSNameMap = new HashMap<>();

    @JsonProperty("folderName")
    protected String folderName;

    @JsonProperty("markedAsDeleted")
    protected Boolean markedAsDeleted;

    @JsonProperty("packageName")
    protected String packageName;


}
