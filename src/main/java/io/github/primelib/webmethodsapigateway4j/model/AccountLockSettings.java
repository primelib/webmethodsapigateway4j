package io.github.primelib.webmethodsapigateway4j.model;

import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AccountLockSettings
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String appliesToUsers;

    /**
     * Duration for which the account remains locked.
     */
    @JsonProperty("blockDuration")
    private String blockDuration;

    /**
     * The unit for the duration specified under 'blockDuration' field. Possible values are 'Minutes', 'Hours', 'Days'.
     */
    @JsonProperty("blockDurationUnit")
    private String blockDurationUnit;

    /**
     * Specifies whether to enable the account locking settings. Possible values are 'true' and 'false'
     */
    @JsonProperty("isEnabled")
    private String isEnabled;

    /**
     * Number of attempts in the specified time interval (specified using timeInterval and timeIntervalUnit fields) to provide the correct password before locking the account
     */
    @JsonProperty("maximumLoginAttempts")
    private String maximumLoginAttempts;

    /**
     * Specifies whether to restrict login for users who are not part of any team other than Default. By default the value is false.
     */
    @JsonProperty("restrictLoginForUsersInDefaultTeam")
    private String restrictLoginForUsersInDefaultTeam;

    /**
     * The time interval within which the number of wrong login attempts exceeding the value specified in 'maximumLoginAttempts' will result in locking the account.
     */
    @JsonProperty("timeInterval")
    private String timeInterval;

    /**
     * The unit for the time interval specified in the 'timeInterval' field. Possible values are 'Minutes', 'Hours', 'Days'.
     */
    @JsonProperty("timeIntervalUnit")
    private String timeIntervalUnit;


}
