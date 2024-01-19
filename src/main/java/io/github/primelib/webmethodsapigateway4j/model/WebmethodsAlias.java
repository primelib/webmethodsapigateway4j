package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * WebmethodsAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated instance of {@link WebmethodsAlias}.
     *
     * @param spec the specification to process
     */
    public WebmethodsAlias(Consumer<WebmethodsAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebmethodsAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebmethodsAlias(Consumer)} instead.
     * @param complyToISSpec A boolean value wheather the given service complies to the IS sepcification
     * @param runAsUser User in gateway under whom you want to invoke this service
     * @param serviceName the webMethods Integration Server service name
     */
    @ApiStatus.Internal
    public WebmethodsAlias(Boolean complyToISSpec, String runAsUser, String serviceName) {
        this.complyToISSpec = complyToISSpec;
        this.runAsUser = runAsUser;
        this.serviceName = serviceName;
    }

}
