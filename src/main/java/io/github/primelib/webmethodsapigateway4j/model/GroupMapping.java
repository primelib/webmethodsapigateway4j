package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private Map<String, String> attributeToGroupMap = new HashMap<>();

    /**
     * Specifies list the attribute from SAML assertion.The value of these attributes will be used in mapping the group in APIGateway.
     */
    @JsonProperty("groupAttributes")
    private Set<String> groupAttributes;


}
