package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebmethodsAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link WebmethodsAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebmethodsAlias(Consumer<WebmethodsAlias> spec) {
        spec.accept(this);
    }

    /**
     * A boolean value wheather the given service complies to the IS sepcification
     */
    @JsonProperty("complyToISSpec")
    protected Boolean complyToISSpec;

    /**
     * User in gateway under whom you want to invoke this service
     */
    @JsonProperty("runAsUser")
    protected String runAsUser;

    /**
     * the webMethods Integration Server service name
     */
    @JsonProperty("serviceName")
    protected String serviceName;


}
