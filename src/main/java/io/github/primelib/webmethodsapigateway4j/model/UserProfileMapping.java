package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
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
 * UserProfileMapping
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
    "emailAddresses",
    "firstName",
    "lastName"
})
@JsonTypeName("UserProfileMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserProfileMapping {

    /**
     * Specifies the attribute from SAML assertion to be mapped with APIGateway user profile's email address.
     */
    @JsonProperty("emailAddresses")
    protected String emailAddresses;

    /**
     * Specifies the attribute from SAML assertion to be mapped with APIGateway user profile's first name.
     */
    @JsonProperty("firstName")
    protected String firstName;

    /**
     * Specifies the attribute from SAML assertion to be mapped with APIGateway user profile's last name.
     */
    @JsonProperty("lastName")
    protected String lastName;

    /**
     * Constructs a validated instance of {@link UserProfileMapping}.
     *
     * @param spec the specification to process
     */
    public UserProfileMapping(Consumer<UserProfileMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserProfileMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserProfileMapping(Consumer)} instead.
     * @param emailAddresses Specifies the attribute from SAML assertion to be mapped with APIGateway user profile's email address.
     * @param firstName Specifies the attribute from SAML assertion to be mapped with APIGateway user profile's first name.
     * @param lastName Specifies the attribute from SAML assertion to be mapped with APIGateway user profile's last name.
     */
    @ApiStatus.Internal
    public UserProfileMapping(String emailAddresses, String firstName, String lastName) {
        this.emailAddresses = emailAddresses;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
