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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * APIResponseGetAPIs
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

    /**
     * Constructs a validated instance of {@link APIResponseGetAPIs}.
     *
     * @param spec the specification to process
     */
    public APIResponseGetAPIs(Consumer<APIResponseGetAPIs> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIResponseGetAPIs}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIResponseGetAPIs(Consumer)} instead.
     * @param active active
     * @param apiId apiId
     * @param apiName API Name
     * @param apiVersion API Version
     * @param errorReason errorReason
     * @param id API Id
     * @param publishedPortals Published portals of an API
     * @param responseStatus responseStatus
     * @param systemVersion System version of an API
     * @param teams Contains teams belonging to an API.
     * @param type API Type
     */
    @ApiStatus.Internal
    public APIResponseGetAPIs(Boolean active, String apiId, String apiName, String apiVersion, String errorReason, String id, List<String> publishedPortals, ResponseStatusEnum responseStatus, Integer systemVersion, List<Team> teams, String type) {
        this.active = active;
        this.apiId = apiId;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.errorReason = errorReason;
        this.id = id;
        this.publishedPortals = publishedPortals;
        this.responseStatus = responseStatus;
        this.systemVersion = systemVersion;
        this.teams = teams;
        this.type = type;
    }

    @AllArgsConstructor
    public enum ResponseStatusEnum {
        SUCCESS("SUCCESS"),
        ERROR("ERROR"),
        NOT_FOUND("NOT_FOUND"),
        BAD_REQUEST("BAD_REQUEST"),
        PARTIAL_SUCCESS("PARTIAL_SUCCESS");

        private static final ResponseStatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ResponseStatusEnum of(String input) {
            if (input != null) {
                for (ResponseStatusEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
