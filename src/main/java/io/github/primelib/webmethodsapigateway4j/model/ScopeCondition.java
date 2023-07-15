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
 * ScopeCondition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributes",
    "filterType",
    "logicalConnector"
})
@JsonTypeName("ScopeCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScopeCondition {

    /**
     * Constructs a validated implementation of {@link ScopeCondition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScopeCondition(Consumer<ScopeCondition> spec) {
        spec.accept(this);
    }

    @JsonProperty("attributes")
    protected List<Attribute> attributes = new ArrayList<>();

    /**
     * This property is used to define the type of filter we will be using to define attributes. The allowed values are apis, httpMethod, tags. If API type is specified we can specify the fields of API such as apiName, apiDescription, apiVersion. If httpMethod specified we can specify the httpMethods(GET/POST/PUT/DELETE/POST) of the resource to filter the resource. This filter type is used for REST APIs only. If tag type is specified we can specify the field tags in API to filter api using tags. This is also only applicable for REST APIs.
     */
    @JsonProperty("filterType")
    protected FilterTypeEnum filterType;

    @JsonProperty("logicalConnector")
    protected LogicalConnectorEnum logicalConnector;


    /**
     * This property is used to define the type of filter we will be using to define attributes. The allowed values are apis, httpMethod, tags. If API type is specified we can specify the fields of API such as apiName, apiDescription, apiVersion. If httpMethod specified we can specify the httpMethods(GET/POST/PUT/DELETE/POST) of the resource to filter the resource. This filter type is used for REST APIs only. If tag type is specified we can specify the field tags in API to filter api using tags. This is also only applicable for REST APIs.
     */
    @AllArgsConstructor
    public enum FilterTypeEnum {
        API("API"),
        HTTP_METHOD("HTTP_METHOD");

        private final String value;
    }

    @AllArgsConstructor
    public enum LogicalConnectorEnum {
        AND("AND"),
        OR("OR");

        private final String value;
    }

}
