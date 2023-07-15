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
 * IntegrationServerPublishResponse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "failureReason",
    "integrationServerId",
    "integrationServerName",
    "status",
    "success"
})
@JsonTypeName("IntegrationServerPublishResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IntegrationServerPublishResponse {

    /**
     * Constructs a validated implementation of {@link IntegrationServerPublishResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IntegrationServerPublishResponse(Consumer<IntegrationServerPublishResponse> spec) {
        spec.accept(this);
    }

    /**
     * Represents the status of the publish operation of the API to the service registry eg: Publish successful, Publish failed, etc
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Provides the reason for the failure when the publish operation is not successful
     */
    @JsonProperty("failureReason")
    protected String failureReason;

    /**
     * Id i.e, UDDI key of the service registry
     */
    @JsonProperty("integrationServerId")
    protected String integrationServerId;

    @JsonProperty("integrationServerName")
    protected String integrationServerName;

    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Represents whether the publish of API to the service registry is success. Possible values: true/false
     */
    @JsonProperty("success")
    protected Boolean success;


    @AllArgsConstructor
    public enum StatusEnum {
        NEW("NEW"),
        PUBLISHED("PUBLISHED"),
        SUSPENDED("SUSPENDED");

        private final String value;
    }

}
