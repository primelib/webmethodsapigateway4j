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
 * Scope
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
    "applicableAPITypes",
    "description",
    "getoAuth2ScopeName",
    "logicalConnector",
    "mashedUpAPI",
    "name",
    "policies",
    "scopeConditions"
})
@JsonTypeName("Scope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Scope {

    /**
     * This contains the list of API types on which the global policy can be applied. For now only REST and SOAP API types are allowed.
     */
    @JsonProperty("applicableAPITypes")
    protected List<ApplicableAPITypesEnum> applicableAPITypes;

    /**
     * Description of the oauth2 scope
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("getoAuth2ScopeName")
    protected String getoAuth2ScopeName;

    /**
     * The field is used to perform the logical operation between the scope condition. It will be valid only if we specify scope condition. The default value for this field is AND
     */
    @JsonProperty("logicalConnector")
    protected LogicalConnectorEnum logicalConnector;

    @JsonProperty("mashedUpAPI")
    protected Boolean mashedUpAPI;

    /**
     * Name of the oauth2 scope
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("policies")
    protected List<String> policies;

    @JsonProperty("scopeConditions")
    protected List<ScopeCondition> scopeConditions;

    /**
     * Constructs a validated instance of {@link Scope}.
     *
     * @param spec the specification to process
     */
    public Scope(Consumer<Scope> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Scope}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Scope(Consumer)} instead.
     * @param applicableAPITypes This contains the list of API types on which the global policy can be applied. For now only REST and SOAP API types are allowed.
     * @param description Description of the oauth2 scope
     * @param getoAuth2ScopeName getoAuth2ScopeName
     * @param logicalConnector The field is used to perform the logical operation between the scope condition. It will be valid only if we specify scope condition. The default value for this field is AND
     * @param mashedUpAPI mashedUpAPI
     * @param name Name of the oauth2 scope
     * @param policies policies
     * @param scopeConditions scopeConditions
     */
    @ApiStatus.Internal
    public Scope(List<ApplicableAPITypesEnum> applicableAPITypes, String description, String getoAuth2ScopeName, LogicalConnectorEnum logicalConnector, Boolean mashedUpAPI, String name, List<String> policies, List<ScopeCondition> scopeConditions) {
        this.applicableAPITypes = applicableAPITypes;
        this.description = description;
        this.getoAuth2ScopeName = getoAuth2ScopeName;
        this.logicalConnector = logicalConnector;
        this.mashedUpAPI = mashedUpAPI;
        this.name = name;
        this.policies = policies;
        this.scopeConditions = scopeConditions;
    }

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

        private static final ApplicableAPITypesEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ApplicableAPITypesEnum of(String input) {
            if (input != null) {
                for (ApplicableAPITypesEnum v : VALUES) {
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

    /**
     * The field is used to perform the logical operation between the scope condition. It will be valid only if we specify scope condition. The default value for this field is AND
     */
    @AllArgsConstructor
    public enum LogicalConnectorEnum {
        AND("AND"),
        OR("OR");

        private static final LogicalConnectorEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static LogicalConnectorEnum of(String input) {
            if (input != null) {
                for (LogicalConnectorEnum v : VALUES) {
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
