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
 * InputAPI
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link InputAPI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InputAPI(Consumer<InputAPI> spec) {
        spec.accept(this);
    }

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


}
