package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewaySecret
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "cachedSecret",
    "secret",
    "xrayview"
})
@JsonTypeName("GatewaySecret")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewaySecret {

    @JsonProperty("cachedSecret")
    private String cachedSecret;

    @JsonProperty("secret")
    private String secret;

    @JsonProperty("xrayview")
    private String xrayview;


}
