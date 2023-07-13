package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "accessTokenURL",
    "authorizeURL",
    "refreshTokenURL"
})
@JsonTypeName("Metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Metadata {

    /**
     * URL to get the access token from the authorization server
     */
    @JsonProperty("accessTokenURL")
    private String accessTokenURL;

    /**
     * URL to get the approval from the resource owner
     */
    @JsonProperty("authorizeURL")
    private String authorizeURL;

    /**
     * URL to get the new access token from the refresh token
     */
    @JsonProperty("refreshTokenURL")
    private String refreshTokenURL;


}
