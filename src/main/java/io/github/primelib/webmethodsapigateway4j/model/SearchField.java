package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributeName",
    "keyword",
    "orTokenKey",
    "range",
    "rawFieldKey"
})
@JsonTypeName("SearchField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchField {

    /**
     * Constructs a validated implementation of {@link SearchField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchField(Consumer<SearchField> spec) {
        spec.accept(this);
    }

    /**
     * Field name to be searched for the list of types specified
     */
    @JsonProperty("attributeName")
    protected String attributeName;

    /**
     * Value of the corresponding field to be matched. User can use regular expression to specify the multiple values for single attributeName. For example
     * to find
     *  1. apiDescription contains "weather" or equals "country" , we can use {"attributeName" : "apiDescription", "keyword" : ".*weather.*|country"}.
     *  2. apiName starts with weather - {"attributeName" : "apiName", "keyword" : "weather.*"}.
     *  3. api type is REST or SOAP - {"attributeName" : "type", "keyword" : "REST|SOAP"}.
     */
    @JsonProperty("keyword")
    protected String keyword;

    @JsonProperty("orTokenKey")
    protected Boolean orTokenKey;

    @JsonProperty("range")
    protected SearchRange range;

    @JsonProperty("rawFieldKey")
    protected String rawFieldKey;


}
