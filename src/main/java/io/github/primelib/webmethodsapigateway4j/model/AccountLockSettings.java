package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
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
 * AccountLockSettings
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

    /**
     * Constructs a validated instance of {@link AccountLockSettings}.
     *
     * @param spec the specification to process
     */
    public AccountLockSettings(Consumer<AccountLockSettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AccountLockSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AccountLockSettings(Consumer)} instead.
     * @param appliesToUsers List of users to whom the account locking settings apply. Possible values are 'allUsersExceptPredefinedUsers' and 'allUsers'. 'allUsersExceptPredefinedUsers' indicates that account locking rules apply to all user accounts except the predefined user accounts. 'allUsers' indicates the account locking rules apply to all user accounts.
     * @param blockDuration Duration for which the account remains locked.
     * @param blockDurationUnit The unit for the duration specified under 'blockDuration' field. Possible values are 'Minutes', 'Hours', 'Days'.
     * @param isEnabled Specifies whether to enable the account locking settings. Possible values are 'true' and 'false'
     * @param maximumLoginAttempts Number of attempts in the specified time interval (specified using timeInterval and timeIntervalUnit fields) to provide the correct password before locking the account
     * @param restrictLoginForUsersInDefaultTeam Specifies whether to restrict login for users who are not part of any team other than Default. By default the value is false.
     * @param timeInterval The time interval within which the number of wrong login attempts exceeding the value specified in 'maximumLoginAttempts' will result in locking the account.
     * @param timeIntervalUnit The unit for the time interval specified in the 'timeInterval' field. Possible values are 'Minutes', 'Hours', 'Days'.
     */
    @ApiStatus.Internal
    public AccountLockSettings(String appliesToUsers, String blockDuration, String blockDurationUnit, String isEnabled, String maximumLoginAttempts, String restrictLoginForUsersInDefaultTeam, String timeInterval, String timeIntervalUnit) {
        this.appliesToUsers = appliesToUsers;
        this.blockDuration = blockDuration;
        this.blockDurationUnit = blockDurationUnit;
        this.isEnabled = isEnabled;
        this.maximumLoginAttempts = maximumLoginAttempts;
        this.restrictLoginForUsersInDefaultTeam = restrictLoginForUsersInDefaultTeam;
        this.timeInterval = timeInterval;
        this.timeIntervalUnit = timeIntervalUnit;
    }

}
