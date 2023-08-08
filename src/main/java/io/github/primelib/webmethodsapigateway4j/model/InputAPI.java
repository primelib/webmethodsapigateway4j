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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InputAPI
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
    "apiDefinition",
    "apiDescription",
    "apiName",
    "apiVersion",
    "authorizationValue",
    "maturityState",
    "rootFileName",
    "teams",
    "type",
    "url"
})
@JsonTypeName("InputAPI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputAPI {

    @JsonProperty("apiDefinition")
    protected API apiDefinition;

    @JsonProperty("apiDescription")
    protected String apiDescription;

    @JsonProperty("apiName")
    protected String apiName;

    @JsonProperty("apiVersion")
    protected String apiVersion;

    @JsonProperty("authorizationValue")
    protected AuthorizationValue authorizationValue;

    @JsonProperty("maturityState")
    protected String maturityState;

    /**
     * Required when creating an API by importing protected URL
     */
    @JsonProperty("rootFileName")
    protected String rootFileName;

    /**
     * Contains teams to which the API must be assigned.
     */
    @JsonProperty("teams")
    protected List<Team> teams;

    @JsonProperty("type")
    protected String type;

    /**
     * Required when creating an API by importing URL
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link InputAPI}.
     *
     * @param spec the specification to process
     */
    public InputAPI(Consumer<InputAPI> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputAPI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputAPI(Consumer)} instead.
     * @param apiDefinition apiDefinition
     * @param apiDescription apiDescription
     * @param apiName apiName
     * @param apiVersion apiVersion
     * @param authorizationValue authorizationValue
     * @param maturityState maturityState
     * @param rootFileName Required when creating an API by importing protected URL
     * @param teams Contains teams to which the API must be assigned.
     * @param type type
     * @param url Required when creating an API by importing URL
     */
    @ApiStatus.Internal
    public InputAPI(API apiDefinition, String apiDescription, String apiName, String apiVersion, AuthorizationValue authorizationValue, String maturityState, String rootFileName, List<Team> teams, String type, String url) {
        this.apiDefinition = apiDefinition;
        this.apiDescription = apiDescription;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
        this.authorizationValue = authorizationValue;
        this.maturityState = maturityState;
        this.rootFileName = rootFileName;
        this.teams = teams;
        this.type = type;
        this.url = url;
    }

}
