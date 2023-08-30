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
 * PackageAPIsResponseContainer
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
@JsonTypeName("PackageAPIsResponseContainer")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PackageAPIsResponseContainer {

    @JsonProperty("packageResponse")
    protected List<PackageAPIModel> packageResponse;

    /**
     * Constructs a validated instance of {@link PackageAPIsResponseContainer}.
     *
     * @param spec the specification to process
     */
    public PackageAPIsResponseContainer(Consumer<PackageAPIsResponseContainer> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PackageAPIsResponseContainer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PackageAPIsResponseContainer(Consumer)} instead.
     * @param packageResponse packageResponse
     */
    @ApiStatus.Internal
    public PackageAPIsResponseContainer(List<PackageAPIModel> packageResponse) {
        this.packageResponse = packageResponse;
    }

}
