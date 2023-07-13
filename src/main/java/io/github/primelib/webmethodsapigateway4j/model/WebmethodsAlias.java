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
 * WebmethodsAlias
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "complyToISSpec",
    "runAsUser",
    "serviceName"
})
@JsonTypeName("WebmethodsAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebmethodsAlias extends Alias {

    /**
     * A boolean value wheather the given service complies to the IS sepcification
     */
    @JsonProperty("complyToISSpec")
    private Boolean complyToISSpec;

    /**
     * User in gateway under whom you want to invoke this service
     */
    @JsonProperty("runAsUser")
    private String runAsUser;

    /**
     * the webMethods Integration Server service name
     */
    @JsonProperty("serviceName")
    private String serviceName;


}
