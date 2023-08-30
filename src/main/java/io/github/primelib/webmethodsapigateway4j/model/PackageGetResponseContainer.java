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
 * PackageGetResponseContainer
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
    "packageResponse"
})
@JsonTypeName("PackageGetResponseContainer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackageGetResponseContainer {

    @JsonProperty("packageResponse")
    protected PackageResponse packageResponse;

    /**
     * Constructs a validated instance of {@link PackageGetResponseContainer}.
     *
     * @param spec the specification to process
     */
    public PackageGetResponseContainer(Consumer<PackageGetResponseContainer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PackageGetResponseContainer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PackageGetResponseContainer(Consumer)} instead.
     * @param packageResponse packageResponse
     */
    @ApiStatus.Internal
    public PackageGetResponseContainer(PackageResponse packageResponse) {
        this.packageResponse = packageResponse;
    }

}
