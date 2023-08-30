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
 * PackageResponseContainer
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
@JsonTypeName("PackageResponseContainer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackageResponseContainer {

    @JsonProperty("packageResponse")
    protected PackagePlanResponse packageResponse;

    /**
     * Constructs a validated instance of {@link PackageResponseContainer}.
     *
     * @param spec the specification to process
     */
    public PackageResponseContainer(Consumer<PackageResponseContainer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PackageResponseContainer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PackageResponseContainer(Consumer)} instead.
     * @param packageResponse packageResponse
     */
    @ApiStatus.Internal
    public PackageResponseContainer(PackagePlanResponse packageResponse) {
        this.packageResponse = packageResponse;
    }

}
