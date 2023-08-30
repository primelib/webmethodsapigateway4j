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
 * UnlockAccountsRequest
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
    "unLockAccounts"
})
@JsonTypeName("UnlockAccountsRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnlockAccountsRequest {

    @JsonProperty("unLockAccounts")
    protected UnlockAccounts unLockAccounts;

    /**
     * Constructs a validated instance of {@link UnlockAccountsRequest}.
     *
     * @param spec the specification to process
     */
    public UnlockAccountsRequest(Consumer<UnlockAccountsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UnlockAccountsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UnlockAccountsRequest(Consumer)} instead.
     * @param unLockAccounts unLockAccounts
     */
    @ApiStatus.Internal
    public UnlockAccountsRequest(UnlockAccounts unLockAccounts) {
        this.unLockAccounts = unLockAccounts;
    }

}
