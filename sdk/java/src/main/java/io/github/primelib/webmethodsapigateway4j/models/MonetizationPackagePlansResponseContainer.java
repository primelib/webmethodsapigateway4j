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
 * MonetizationPackagePlansResponseContainer
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("MonetizationPackagePlansResponseContainer")
@JsonPropertyOrder({
    "packageResponse"
})
@Generated(value = "io.github.primelib.primecodegen")
public class MonetizationPackagePlansResponseContainer {

    @JsonProperty("packageResponse")
    protected List<MonetizationPlan> packageResponse;

    /**
     * Constructs a validated instance of {@link MonetizationPackagePlansResponseContainer}.
     *
     * @param spec the specification to process
     */
    public MonetizationPackagePlansResponseContainer(Consumer<MonetizationPackagePlansResponseContainer> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MonetizationPackagePlansResponseContainer}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MonetizationPackagePlansResponseContainer(Consumer)} instead.
     * @param packageResponse packageResponse
     */
    @ApiStatus.Internal
    public MonetizationPackagePlansResponseContainer(List<MonetizationPlan> packageResponse) {
        this.packageResponse = packageResponse;
    }
}
