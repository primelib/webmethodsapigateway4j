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
 * InputIntegrationServerPublish
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
    "publishInfo",
    "publishInfos"
})
@JsonTypeName("InputIntegrationServerPublish")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputIntegrationServerPublish {

    @JsonProperty("publishInfo")
    protected PublishPayload publishInfo;

    /**
     * This contains the publish information for multiple APIs. Required when publishing more than one API to one or more integration servers.
     */
    @JsonProperty("publishInfos")
    protected List<PublishPayload> publishInfos;

    /**
     * Constructs a validated instance of {@link InputIntegrationServerPublish}.
     *
     * @param spec the specification to process
     */
    public InputIntegrationServerPublish(Consumer<InputIntegrationServerPublish> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputIntegrationServerPublish}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputIntegrationServerPublish(Consumer)} instead.
     * @param publishInfo var.name
     * @param publishInfos This contains the publish information for multiple APIs. Required when publishing more than one API to one or more integration servers.
     */
    @ApiStatus.Internal
    public InputIntegrationServerPublish(PublishPayload publishInfo, List<PublishPayload> publishInfos) {
        this.publishInfo = publishInfo;
        this.publishInfos = publishInfos;
    }

}
