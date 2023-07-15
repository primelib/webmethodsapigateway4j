package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PackageResponseContainer
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "packageResponse"
})
@JsonTypeName("PackageResponseContainer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackageResponseContainer {

    /**
     * Constructs a validated implementation of {@link PackageResponseContainer}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PackageResponseContainer(Consumer<PackageResponseContainer> spec) {
        spec.accept(this);
    }

    @JsonProperty("packageResponse")
    protected PackagePlanResponse packageResponse;


}
