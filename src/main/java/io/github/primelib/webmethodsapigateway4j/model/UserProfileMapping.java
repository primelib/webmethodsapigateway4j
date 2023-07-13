package io.github.primelib.webmethodsapigateway4j.model;

import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserProfileMapping
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String emailAddresses;

    /**
     * Specifies the attribute from SAML assertion to be mapped with APIGateway user profile's first name.
     */
    @JsonProperty("firstName")
    private String firstName;

    /**
     * Specifies the attribute from SAML assertion to be mapped with APIGateway user profile's last name.
     */
    @JsonProperty("lastName")
    private String lastName;


}
