// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * AdminChangeOwnerResponse
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AdminChangeOwnerResponse")
@JsonPropertyOrder({
    "matchingAssets",
    "message",
    "status"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AdminChangeOwnerResponse {

    @JsonProperty("matchingAssets")
    protected Map<String, Object> matchingAssets;

    @JsonProperty("message")
    protected String message;

    /**
     * Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Constructs a validated instance of {@link AdminChangeOwnerResponse}.
     *
     * @param spec the specification to process
     */
    public AdminChangeOwnerResponse(Consumer<AdminChangeOwnerResponse> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AdminChangeOwnerResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AdminChangeOwnerResponse(Consumer)} instead.
     * @param matchingAssets matchingAssets
     * @param message message
     * @param status Publish Status of the API for this service registry. Possible values are NEW, PUBLISHED and SUSPENDED. NEW represents the API is not published to the service registry. PUBLISHED represents the API is published to the service registry. SUSPENDED represents the API is published to service registry, but is not currently active (during deactivation of API or shutdown of API Gateway).
     */
    @ApiStatus.Internal
    public AdminChangeOwnerResponse(Map<String, Object> matchingAssets, String message, String status) {
        this.matchingAssets = matchingAssets;
        this.message = message;
        this.status = status;
    }
}
