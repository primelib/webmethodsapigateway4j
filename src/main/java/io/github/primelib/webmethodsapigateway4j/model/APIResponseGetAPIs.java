package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APIResponseGetAPIs
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "active",
    "apiId",
    "apiName",
    "apiVersion",
    "errorReason",
    "id",
    "publishedPortals",
    "responseStatus",
    "systemVersion",
    "teams",
    "type"
})
@JsonTypeName("APIResponseGetAPIs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseGetAPIs {

    /**
     * Constructs a validated implementation of {@link APIResponseGetAPIs}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public APIResponseGetAPIs(Consumer<APIResponseGetAPIs> spec) {
        spec.accept(this);
    }

    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("apiId")
    protected String apiId;

    /**
     * API Name
     */
    @JsonProperty("apiName")
    protected String apiName;

    /**
     * API Version
     */
    @JsonProperty("apiVersion")
    protected String apiVersion;

    @JsonProperty("errorReason")
    protected String errorReason;

    /**
     * API Id
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Published portals of an API
     */
    @JsonProperty("publishedPortals")
    protected List<String> publishedPortals;

    @JsonProperty("responseStatus")
    protected ResponseStatusEnum responseStatus;

    /**
     * System version of an API
     */
    @JsonProperty("systemVersion")
    protected Integer systemVersion;

    /**
     * Contains teams belonging to an API.
     */
    @JsonProperty("teams")
    protected List<Team> teams;

    /**
     * API Type
     */
    @JsonProperty("type")
    protected String type;


    @AllArgsConstructor
    public enum ResponseStatusEnum {
        SUCCESS("SUCCESS"),
        ERROR("ERROR"),
        NOT_FOUND("NOT_FOUND"),
        BAD_REQUEST("BAD_REQUEST"),
        PARTIAL_SUCCESS("PARTIAL_SUCCESS");

        private final String value;
    }

}
