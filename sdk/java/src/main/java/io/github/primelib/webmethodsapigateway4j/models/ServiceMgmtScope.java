// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
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
 * ServiceMgmtScope
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("ServiceMgmtScope")
@JsonPropertyOrder({
    "description",
    "getoAuth2ScopeName",
    "mashedUpApi",
    "name",
    "policies"
})
@Generated(value = "io.github.primelib.primecodegen")
public class ServiceMgmtScope {

    @JsonProperty("description")
    protected String description;

    @JsonProperty("getoAuth2ScopeName")
    protected String getoAuth2ScopeName;

    @JsonProperty("mashedUpAPI")
    protected Boolean mashedUpApi;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("policies")
    protected List<String> policies;

    /**
     * Constructs a validated instance of {@link ServiceMgmtScope}.
     *
     * @param spec the specification to process
     */
    public ServiceMgmtScope(Consumer<ServiceMgmtScope> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceMgmtScope}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceMgmtScope(Consumer)} instead.
     * @param description description
     * @param getoAuth2ScopeName getoAuth2ScopeName
     * @param mashedUpApi mashedUpApi
     * @param name name
     * @param policies policies
     */
    @ApiStatus.Internal
    public ServiceMgmtScope(String description, String getoAuth2ScopeName, Boolean mashedUpApi, String name, List<String> policies) {
        this.description = description;
        this.getoAuth2ScopeName = getoAuth2ScopeName;
        this.mashedUpApi = mashedUpApi;
        this.name = name;
        this.policies = policies;
    }
}
