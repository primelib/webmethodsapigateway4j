package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Scope
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "name",
    "applicableAPITypes",
    "logicalConnector",
    "scopeConditions",
    "getoAuth2ScopeName",
    "mashedUpAPI",
    "policies"
})
@JsonTypeName("Scope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Scope {

    /**
     * Constructs a validated implementation of {@link Scope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Scope(Consumer<Scope> spec) {
        spec.accept(this);
    }

    /**
     * Description of the oauth2 scope
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Name of the oauth2 scope
     */
    @JsonProperty("name")
    protected String name;

    /**
     * This contains the list of API types on which the global policy can be applied. For now only REST and SOAP API types are allowed.
     */
    @JsonProperty("applicableAPITypes")
    protected List<ApplicableAPITypesEnum> applicableAPITypes = new ArrayList<>();

    /**
     * The field is used to perform the logical operation between the scope condition. It will be valid only if we specify scope condition. The default value for this field is AND
     */
    @JsonProperty("logicalConnector")
    protected LogicalConnectorEnum logicalConnector;

    @JsonProperty("scopeConditions")
    protected List<ScopeCondition> scopeConditions;

    @JsonProperty("getoAuth2ScopeName")
    protected String getoAuth2ScopeName;

    @JsonProperty("mashedUpAPI")
    protected Boolean mashedUpAPI;

    @JsonProperty("policies")
    protected List<String> policies;


    /**
     * This contains the list of API types on which the global policy can be applied. For now only REST and SOAP API types are allowed.
     */
    @AllArgsConstructor
    public enum ApplicableAPITypesEnum {
        SOAP("SOAP"),
        REST("REST"),
        ODATA("ODATA"),
        WEBSOCKET("WEBSOCKET"),
        GRAPHQL("GRAPHQL");

        private final String value;
    }

    /**
     * The field is used to perform the logical operation between the scope condition. It will be valid only if we specify scope condition. The default value for this field is AND
     */
    @AllArgsConstructor
    public enum LogicalConnectorEnum {
        AND("AND"),
        OR("OR");

        private final String value;
    }

}
