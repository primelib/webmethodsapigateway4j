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
 * InputServiceRegistryUnpublish
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "unpublishInfo",
    "unpublishInfos"
})
@JsonTypeName("InputServiceRegistryUnpublish")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputServiceRegistryUnpublish {

    /**
     * Constructs a validated implementation of {@link InputServiceRegistryUnpublish}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputServiceRegistryUnpublish(Consumer<InputServiceRegistryUnpublish> spec) {
        spec.accept(this);
    }

    @JsonProperty("unpublishInfo")
    protected UnpublishInfo unpublishInfo;

    /**
     * This contains the unpublish information for multiple APIs. Required when publishing more than one API from one or more service registries.
     */
    @JsonProperty("unpublishInfos")
    protected List<UnpublishInfo> unpublishInfos;


}
