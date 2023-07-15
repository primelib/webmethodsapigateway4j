package io.github.primelib.webmethodsapigateway4j.model;

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
 * ExternalPortal
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "endpointPassword",
    "endpointTenant",
    "endpointURL",
    "endpointUsername",
    "type"
})
@JsonTypeName("ExternalPortal")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ExternalPortal {

    /**
     * Constructs a validated implementation of {@link ExternalPortal}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ExternalPortal(Consumer<ExternalPortal> spec) {
        spec.accept(this);
    }

    /**
     * Password for API Portal user used by API Gateway to access portal.
     */
    @JsonProperty("endpointPassword")
    protected String endpointPassword;

    /**
     * API Portal tenant name.
     */
    @JsonProperty("endpointTenant")
    protected String endpointTenant;

    /**
     * API Portal endpoint URL.
     */
    @JsonProperty("endpointURL")
    protected String endpointURL;

    /**
     * API Portal username used by API Gateway to communicate.
     */
    @JsonProperty("endpointUsername")
    protected String endpointUsername;

    @JsonProperty("type")
    protected String type;


}
