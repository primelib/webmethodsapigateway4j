package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Credentials
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "domain",
    "password",
    "userName"
})
@JsonTypeName("Credentials")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Credentials {

    /**
     * Specify a domain to access the native API
     */
    @JsonProperty("domain")
    private String domain;

    /**
     * Specify a base64 encoded password to access the native API
     */
    @JsonProperty("password")
    private String password;

    /**
     * Specify a username to access the native API
     */
    @JsonProperty("userName")
    private String userName;


}
