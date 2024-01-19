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

import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GroupMapping
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
    "attributeToGroupMap",
    "groupAttributes"
})
@JsonTypeName("GroupMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupMapping {

    /**
     * Specifies list the attribute values from SAML assertion to be used mapping APIGateway group.
     */
    @JsonProperty("attributeToGroupMap")
    protected Map<String, String> attributeToGroupMap;

    /**
     * Specifies list the attribute from SAML assertion.The value of these attributes will be used in mapping the group in APIGateway.
     */
    @JsonProperty("groupAttributes")
    protected Set<String> groupAttributes;

    /**
     * Constructs a validated instance of {@link GroupMapping}.
     *
     * @param spec the specification to process
     */
    public GroupMapping(Consumer<GroupMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GroupMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GroupMapping(Consumer)} instead.
     * @param attributeToGroupMap Specifies list the attribute values from SAML assertion to be used mapping APIGateway group.
     * @param groupAttributes Specifies list the attribute from SAML assertion.The value of these attributes will be used in mapping the group in APIGateway.
     */
    @ApiStatus.Internal
    public GroupMapping(Map<String, String> attributeToGroupMap, Set<String> groupAttributes) {
        this.attributeToGroupMap = attributeToGroupMap;
        this.groupAttributes = groupAttributes;
    }

}
