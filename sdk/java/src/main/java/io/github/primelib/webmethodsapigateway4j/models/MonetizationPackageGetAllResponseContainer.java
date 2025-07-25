// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * MonetizationPackageGetAllResponseContainer
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("MonetizationPackageGetAllResponseContainer")
@JsonPropertyOrder({
    "packageResponse"
})
@Generated(value = "io.github.primelib.primecodegen")
public class MonetizationPackageGetAllResponseContainer {

    @JsonProperty("packageResponse")
    protected List<MonetizationPackageResponse> packageResponse;

    /**
     * Constructs a validated instance of {@link MonetizationPackageGetAllResponseContainer}.
     *
     * @param spec the specification to process
     */
    public MonetizationPackageGetAllResponseContainer(Consumer<MonetizationPackageGetAllResponseContainer> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MonetizationPackageGetAllResponseContainer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MonetizationPackageGetAllResponseContainer(Consumer)} instead.
     * @param packageResponse packageResponse
     */
    @ApiStatus.Internal
    public MonetizationPackageGetAllResponseContainer(List<MonetizationPackageResponse> packageResponse) {
        this.packageResponse = packageResponse;
    }
}
