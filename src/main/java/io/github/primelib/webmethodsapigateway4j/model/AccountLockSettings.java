package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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
 * AccountLockSettings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "appliesToUsers",
    "blockDuration",
    "blockDurationUnit",
    "isEnabled",
    "maximumLoginAttempts",
    "restrictLoginForUsersInDefaultTeam",
    "timeInterval",
    "timeIntervalUnit"
})
@JsonTypeName("AccountLockSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccountLockSettings {

    /**
     * Constructs a validated implementation of {@link AccountLockSettings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AccountLockSettings(Consumer<AccountLockSettings> spec) {
        spec.accept(this);
    }

    /**
     * List of users to whom the account locking settings apply. Possible values are 'allUsersExceptPredefinedUsers' and 'allUsers'. 'allUsersExceptPredefinedUsers' indicates that account locking rules apply to all user accounts except the predefined user accounts. 'allUsers' indicates the account locking rules apply to all user accounts.
     */
    @JsonProperty("appliesToUsers")
    protected String appliesToUsers;

    /**
     * Duration for which the account remains locked.
     */
    @JsonProperty("blockDuration")
    protected String blockDuration;

    /**
     * The unit for the duration specified under 'blockDuration' field. Possible values are 'Minutes', 'Hours', 'Days'.
     */
    @JsonProperty("blockDurationUnit")
    protected String blockDurationUnit;

    /**
     * Specifies whether to enable the account locking settings. Possible values are 'true' and 'false'
     */
    @JsonProperty("isEnabled")
    protected String isEnabled;

    /**
     * Number of attempts in the specified time interval (specified using timeInterval and timeIntervalUnit fields) to provide the correct password before locking the account
     */
    @JsonProperty("maximumLoginAttempts")
    protected String maximumLoginAttempts;

    /**
     * Specifies whether to restrict login for users who are not part of any team other than Default. By default the value is false.
     */
    @JsonProperty("restrictLoginForUsersInDefaultTeam")
    protected String restrictLoginForUsersInDefaultTeam;

    /**
     * The time interval within which the number of wrong login attempts exceeding the value specified in 'maximumLoginAttempts' will result in locking the account.
     */
    @JsonProperty("timeInterval")
    protected String timeInterval;

    /**
     * The unit for the time interval specified in the 'timeInterval' field. Possible values are 'Minutes', 'Hours', 'Days'.
     */
    @JsonProperty("timeIntervalUnit")
    protected String timeIntervalUnit;


}
