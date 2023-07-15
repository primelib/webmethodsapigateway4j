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
 * LockedAccounts
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "lockedAccounts"
})
@JsonTypeName("LockedAccounts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LockedAccounts {

    /**
     * Constructs a validated implementation of {@link LockedAccounts}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LockedAccounts(Consumer<LockedAccounts> spec) {
        spec.accept(this);
    }

    /**
     * Comma separated list of user accounts which are locked.
     */
    @JsonProperty("lockedAccounts")
    protected List<String> lockedAccounts;


}
