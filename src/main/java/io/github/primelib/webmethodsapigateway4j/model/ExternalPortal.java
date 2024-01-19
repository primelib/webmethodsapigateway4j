package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
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
 * ExternalPortal
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link ExternalPortal}.
     *
     * @param spec the specification to process
     */
    public ExternalPortal(Consumer<ExternalPortal> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ExternalPortal}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ExternalPortal(Consumer)} instead.
     * @param endpointPassword Password for API Portal user used by API Gateway to access portal.
     * @param endpointTenant API Portal tenant name.
     * @param endpointURL API Portal endpoint URL.
     * @param endpointUsername API Portal username used by API Gateway to communicate.
     * @param type type
     */
    @ApiStatus.Internal
    public ExternalPortal(String endpointPassword, String endpointTenant, String endpointURL, String endpointUsername, String type) {
        this.endpointPassword = endpointPassword;
        this.endpointTenant = endpointTenant;
        this.endpointURL = endpointURL;
        this.endpointUsername = endpointUsername;
        this.type = type;
    }

}
