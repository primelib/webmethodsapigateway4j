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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User
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

    /**
     * Constructs a validated instance of {@link User}.
     *
     * @param spec the specification to process
     */
    public User(Consumer<User> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link User}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #User(Consumer)} instead.
     * @param active active status of the user
     * @param allowDigestAuth list of email addresses of the user
     * @param emailAddresses list of email addresses of the user
     * @param firstName first name of the user
     * @param id unique identifier of a user
     * @param language preferred language of the user
     * @param lastName last name of the user
     * @param loginId login name
     */
    @ApiStatus.Internal
    public User(Boolean active, Boolean allowDigestAuth, List<String> emailAddresses, String firstName, String id, String language, String lastName, String loginId) {
        this.active = active;
        this.allowDigestAuth = allowDigestAuth;
        this.emailAddresses = emailAddresses;
        this.firstName = firstName;
        this.id = id;
        this.language = language;
        this.lastName = lastName;
        this.loginId = loginId;
    }

}
