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
 * InputIntegrationServerPublish
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "publishInfo",
    "publishInfos"
})
@JsonTypeName("InputIntegrationServerPublish")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputIntegrationServerPublish {

    /**
     * Constructs a validated implementation of {@link InputIntegrationServerPublish}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputIntegrationServerPublish(Consumer<InputIntegrationServerPublish> spec) {
        spec.accept(this);
    }

    @JsonProperty("publishInfo")
    protected PublishPayload publishInfo;

    /**
     * This contains the publish information for multiple APIs. Required when publishing more than one API to one or more integration servers.
     */
    @JsonProperty("publishInfos")
    protected List<PublishPayload> publishInfos;


}
