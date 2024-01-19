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
 * MasterPasswordExpiryInterval
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
    "expireInterval"
})
@JsonTypeName("MasterPasswordExpiryInterval")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordExpiryInterval {

    /**
     * This interval(in days) specifies the time after which the master password would expire
     */
    @JsonProperty("expireInterval")
    protected String expireInterval;

    /**
     * Constructs a validated instance of {@link MasterPasswordExpiryInterval}.
     *
     * @param spec the specification to process
     */
    public MasterPasswordExpiryInterval(Consumer<MasterPasswordExpiryInterval> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MasterPasswordExpiryInterval}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MasterPasswordExpiryInterval(Consumer)} instead.
     * @param expireInterval This interval(in days) specifies the time after which the master password would expire
     */
    @ApiStatus.Internal
    public MasterPasswordExpiryInterval(String expireInterval) {
        this.expireInterval = expireInterval;
    }

}
