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
 * Quota
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
    "enforcementPolicy"
})
@JsonTypeName("Quota")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Quota {

    /**
     * Policy id holding the information of throttling and monitor policy action to enforce quota limit.
     */
    @JsonProperty("enforcementPolicy")
    protected String enforcementPolicy;

    /**
     * Constructs a validated instance of {@link Quota}.
     *
     * @param spec the specification to process
     */
    public Quota(Consumer<Quota> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Quota}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Quota(Consumer)} instead.
     * @param enforcementPolicy Policy id holding the information of throttling and monitor policy action to enforce quota limit.
     */
    @ApiStatus.Internal
    public Quota(String enforcementPolicy) {
        this.enforcementPolicy = enforcementPolicy;
    }

}
