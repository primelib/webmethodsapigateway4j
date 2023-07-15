package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GroupMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributeToGroupMap",
    "groupAttributes"
})
@JsonTypeName("GroupMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupMapping {

    /**
     * Constructs a validated implementation of {@link GroupMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GroupMapping(Consumer<GroupMapping> spec) {
        spec.accept(this);
    }

    /**
     * Specifies list the attribute values from SAML assertion to be used mapping APIGateway group.
     */
    @JsonProperty("attributeToGroupMap")
    protected Map<String, String> attributeToGroupMap = new HashMap<>();

    /**
     * Specifies list the attribute from SAML assertion.The value of these attributes will be used in mapping the group in APIGateway.
     */
    @JsonProperty("groupAttributes")
    protected Set<String> groupAttributes;


}
