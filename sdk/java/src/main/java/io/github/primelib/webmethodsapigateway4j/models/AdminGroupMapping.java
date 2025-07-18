// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
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
 * AdminGroupMapping
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AdminGroupMapping")
@JsonPropertyOrder({
    "attributeToGroupMap",
    "groupAttributes"
})
@Generated(value = "io.github.primelib.primecodegen")
public class AdminGroupMapping {

    /**
     * Specifies list the attribute values from SAML assertion to be used mapping APIGateway group.
     */
    @JsonProperty("attributeToGroupMap")
    protected Map<String, String> attributeToGroupMap;

    /**
     * Specifies list the attribute from SAML assertion.The value of these attributes will be used in mapping the group in APIGateway.
     */
    @JsonProperty("groupAttributes")
    protected List<String> groupAttributes;

    /**
     * Constructs a validated instance of {@link AdminGroupMapping}.
     *
     * @param spec the specification to process
     */
    public AdminGroupMapping(Consumer<AdminGroupMapping> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AdminGroupMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AdminGroupMapping(Consumer)} instead.
     * @param attributeToGroupMap Specifies list the attribute values from SAML assertion to be used mapping APIGateway group.
     * @param groupAttributes Specifies list the attribute from SAML assertion.The value of these attributes will be used in mapping the group in APIGateway.
     */
    @ApiStatus.Internal
    public AdminGroupMapping(Map<String, String> attributeToGroupMap, List<String> groupAttributes) {
        this.attributeToGroupMap = attributeToGroupMap;
        this.groupAttributes = groupAttributes;
    }
}
