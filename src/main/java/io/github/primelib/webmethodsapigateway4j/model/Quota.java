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
 * Quota
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enforcementPolicy"
})
@JsonTypeName("Quota")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Quota {

    /**
     * Constructs a validated implementation of {@link Quota}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Quota(Consumer<Quota> spec) {
        spec.accept(this);
    }

    /**
     * Policy id holding the information of throttling and monitor policy action to enforce quota limit.
     */
    @JsonProperty("enforcementPolicy")
    protected String enforcementPolicy;


}
