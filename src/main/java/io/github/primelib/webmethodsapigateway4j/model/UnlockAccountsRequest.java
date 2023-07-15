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
 * UnlockAccountsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "unLockAccounts"
})
@JsonTypeName("UnlockAccountsRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnlockAccountsRequest {

    /**
     * Constructs a validated implementation of {@link UnlockAccountsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UnlockAccountsRequest(Consumer<UnlockAccountsRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("unLockAccounts")
    protected UnlockAccounts unLockAccounts;


}
