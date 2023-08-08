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
 * ServiceRegistryPublishGetResponse
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
    "publishInfo"
})
@JsonTypeName("ServiceRegistryPublishGetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryPublishGetResponse {

    @JsonProperty("publishInfo")
    protected PublishPayload publishInfo;

    /**
     * Constructs a validated instance of {@link ServiceRegistryPublishGetResponse}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryPublishGetResponse(Consumer<ServiceRegistryPublishGetResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryPublishGetResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryPublishGetResponse(Consumer)} instead.
     * @param publishInfo publishInfo
     */
    @ApiStatus.Internal
    public ServiceRegistryPublishGetResponse(PublishPayload publishInfo) {
        this.publishInfo = publishInfo;
    }

}
