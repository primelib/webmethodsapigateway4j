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
 * UnlockAccounts
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "userName"
})
@JsonTypeName("UnlockAccounts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnlockAccounts {

    /**
     * Constructs a validated implementation of {@link UnlockAccounts}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UnlockAccounts(Consumer<UnlockAccounts> spec) {
        spec.accept(this);
    }

    /**
     * Username that needs to be unlocked.
     */
    @JsonProperty("userName")
    protected List<String> userName;


}
