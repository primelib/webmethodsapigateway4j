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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UnpublishInfo
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
    "apiId",
    "serviceRegistryIds"
})
@JsonTypeName("UnpublishInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnpublishInfo {

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

    /**
     * Constructs a validated instance of {@link UnpublishInfo}.
     *
     * @param spec the specification to process
     */
    public UnpublishInfo(Consumer<UnpublishInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UnpublishInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UnpublishInfo(Consumer)} instead.
     * @param apiId API id for the API to be unpublished. This field is required.
     * @param serviceRegistryIds List of ids of the service registries from which the API has to be unpublished. This field is required.
     */
    @ApiStatus.Internal
    public UnpublishInfo(String apiId, List<String> serviceRegistryIds) {
        this.apiId = apiId;
        this.serviceRegistryIds = serviceRegistryIds;
    }

}
