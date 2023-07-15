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
 * MasterPasswordExpiryInterval
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expireInterval"
})
@JsonTypeName("MasterPasswordExpiryInterval")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MasterPasswordExpiryInterval {

    /**
     * Constructs a validated implementation of {@link MasterPasswordExpiryInterval}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MasterPasswordExpiryInterval(Consumer<MasterPasswordExpiryInterval> spec) {
        spec.accept(this);
    }

    /**
     * This interval(in days) specifies the time after which the master password would expire
     */
    @JsonProperty("expireInterval")
    protected String expireInterval;


}
