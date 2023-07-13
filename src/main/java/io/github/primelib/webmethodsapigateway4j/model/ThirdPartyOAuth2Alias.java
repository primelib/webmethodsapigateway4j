package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ThirdPartyOAuth2Alias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "authInfo",
    "endpointDetails",
    "metadata",
    "providerName"
})
@JsonTypeName("ThirdPartyOAuth2Alias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ThirdPartyOAuth2Alias extends Alias {

    @JsonProperty("authInfo")
    private Object authInfo;

    @JsonProperty("endpointDetails")
    private OAuth2Endpoints endpointDetails;

    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("providerName")
    private String providerName;


}
