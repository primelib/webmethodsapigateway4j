package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UnpublishInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "apiId",
    "serviceRegistryIds"
})
@JsonTypeName("UnpublishInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnpublishInfo {

    /**
     * Constructs a validated implementation of {@link UnpublishInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UnpublishInfo(Consumer<UnpublishInfo> spec) {
        spec.accept(this);
    }

    /**
     * API id for the API to be unpublished. This field is required.
     */
    @JsonProperty("apiId")
    protected String apiId;

    /**
     * List of ids of the service registries from which the API has to be unpublished. This field is required.
     */
    @JsonProperty("serviceRegistryIds")
    protected List<String> serviceRegistryIds;


}
