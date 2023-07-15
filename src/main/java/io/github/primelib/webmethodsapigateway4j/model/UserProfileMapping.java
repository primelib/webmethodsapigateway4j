package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
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
 * UserProfileMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "emailAddresses",
    "firstName",
    "lastName"
})
@JsonTypeName("UserProfileMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserProfileMapping {

    /**
     * Constructs a validated implementation of {@link UserProfileMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UserProfileMapping(Consumer<UserProfileMapping> spec) {
        spec.accept(this);
    }

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


}
