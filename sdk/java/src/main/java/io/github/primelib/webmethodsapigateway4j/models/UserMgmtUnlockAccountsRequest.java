// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * UserMgmtUnlockAccountsRequest
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("UserMgmtUnlockAccountsRequest")
@JsonPropertyOrder({
    "unLockAccounts"
})
@Generated(value = "io.github.primelib.primecodegen")
public class UserMgmtUnlockAccountsRequest {

    @JsonProperty("unLockAccounts")
    protected UserMgmtUnlockAccounts unLockAccounts;

    /**
     * Constructs a validated instance of {@link UserMgmtUnlockAccountsRequest}.
     *
     * @param spec the specification to process
     */
    public UserMgmtUnlockAccountsRequest(Consumer<UserMgmtUnlockAccountsRequest> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserMgmtUnlockAccountsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserMgmtUnlockAccountsRequest(Consumer)} instead.
     * @param unLockAccounts unLockAccounts
     */
    @ApiStatus.Internal
    public UserMgmtUnlockAccountsRequest(UserMgmtUnlockAccounts unLockAccounts) {
        this.unLockAccounts = unLockAccounts;
    }
}
