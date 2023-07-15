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
 * PackageAPIsResponseContainer
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "packageResponse"
})
@JsonTypeName("PackageAPIsResponseContainer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackageAPIsResponseContainer {

    /**
     * Constructs a validated implementation of {@link PackageAPIsResponseContainer}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PackageAPIsResponseContainer(Consumer<PackageAPIsResponseContainer> spec) {
        spec.accept(this);
    }

    @JsonProperty("packageResponse")
    protected List<PackageAPIModel> packageResponse;


}
