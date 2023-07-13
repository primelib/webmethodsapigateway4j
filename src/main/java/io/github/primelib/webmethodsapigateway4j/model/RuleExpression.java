package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleExpression
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "attributeName",
    "attributeValue",
    "operator"
})
@JsonTypeName("RuleExpression")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RuleExpression {

    @JsonProperty("attributeName")
    private String attributeName;

    @JsonProperty("attributeValue")
    private String attributeValue;

    @JsonProperty("operator")
    private String operator;


}
