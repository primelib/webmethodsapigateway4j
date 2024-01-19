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
 * InputServiceRegistryUnpublish
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
    "unpublishInfo",
    "unpublishInfos"
})
@JsonTypeName("InputServiceRegistryUnpublish")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputServiceRegistryUnpublish {

    @JsonProperty("unpublishInfo")
    protected UnpublishInfo unpublishInfo;

    /**
     * This contains the unpublish information for multiple APIs. Required when publishing more than one API from one or more service registries.
     */
    @JsonProperty("unpublishInfos")
    protected List<UnpublishInfo> unpublishInfos;

    /**
     * Constructs a validated instance of {@link InputServiceRegistryUnpublish}.
     *
     * @param spec the specification to process
     */
    public InputServiceRegistryUnpublish(Consumer<InputServiceRegistryUnpublish> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputServiceRegistryUnpublish}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputServiceRegistryUnpublish(Consumer)} instead.
     * @param unpublishInfo unpublishInfo
     * @param unpublishInfos This contains the unpublish information for multiple APIs. Required when publishing more than one API from one or more service registries.
     */
    @ApiStatus.Internal
    public InputServiceRegistryUnpublish(UnpublishInfo unpublishInfo, List<UnpublishInfo> unpublishInfos) {
        this.unpublishInfo = unpublishInfo;
        this.unpublishInfos = unpublishInfos;
    }

}
