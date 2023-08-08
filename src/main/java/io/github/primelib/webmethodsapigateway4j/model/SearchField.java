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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SearchField
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

    /**
     * Constructs a validated instance of {@link SearchField}.
     *
     * @param spec the specification to process
     */
    public SearchField(Consumer<SearchField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SearchField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SearchField(Consumer)} instead.
     * @param attributeName Field name to be searched for the list of types specified
     * @param keyword Value of the corresponding field to be matched. User can use regular expression to specify the multiple values for single attributeName. For example  to find   1. apiDescription contains "weather" or equals "country" , we can use {"attributeName" : "apiDescription", "keyword" : ".*weather.*|country"}.   2. apiName starts with weather - {"attributeName" : "apiName", "keyword" : "weather.*"}.   3. api type is REST or SOAP - {"attributeName" : "type", "keyword" : "REST|SOAP"}.
     * @param orTokenKey orTokenKey
     * @param range range
     * @param rawFieldKey rawFieldKey
     */
    @ApiStatus.Internal
    public SearchField(String attributeName, String keyword, Boolean orTokenKey, SearchRange range, String rawFieldKey) {
        this.attributeName = attributeName;
        this.keyword = keyword;
        this.orTokenKey = orTokenKey;
        this.range = range;
        this.rawFieldKey = rawFieldKey;
    }

}
