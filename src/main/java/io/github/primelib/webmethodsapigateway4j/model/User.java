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
 * User
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "active",
    "allowDigestAuth",
    "emailAddresses",
    "firstName",
    "id",
    "language",
    "lastName",
    "loginId"
})
@JsonTypeName("User")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class User {

    /**
     * Constructs a validated implementation of {@link User}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public User(Consumer<User> spec) {
        spec.accept(this);
    }

    /**
     * active status of the user
     */
    @JsonProperty("active")
    protected Boolean active;

    /**
     * list of email addresses of the user
     */
    @JsonProperty("allowDigestAuth")
    protected Boolean allowDigestAuth;

    /**
     * list of email addresses of the user
     */
    @JsonProperty("emailAddresses")
    protected List<String> emailAddresses;

    /**
     * first name of the user
     */
    @JsonProperty("firstName")
    protected String firstName;

    /**
     * unique identifier of a user
     */
    @JsonProperty("id")
    protected String id;

    /**
     * preferred language of the user
     */
    @JsonProperty("language")
    protected String language;

    /**
     * last name of the user
     */
    @JsonProperty("lastName")
    protected String lastName;

    /**
     * login name
     */
    @JsonProperty("loginId")
    protected String loginId;


}
