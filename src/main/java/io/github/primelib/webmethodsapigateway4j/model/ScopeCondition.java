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
 * ScopeCondition
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
    "attributes",
    "filterType",
    "logicalConnector"
})
@JsonTypeName("ScopeCondition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScopeCondition {

    @JsonProperty("attributes")
    protected List<Attribute> attributes;

    /**
     * This property is used to define the type of filter we will be using to define attributes. The allowed values are apis, httpMethod, tags. If API type is specified we can specify the fields of API such as apiName, apiDescription, apiVersion. If httpMethod specified we can specify the httpMethods(GET/POST/PUT/DELETE/POST) of the resource to filter the resource. This filter type is used for REST APIs only. If tag type is specified we can specify the field tags in API to filter api using tags. This is also only applicable for REST APIs.
     */
    @JsonProperty("filterType")
    protected FilterTypeEnum filterType;

    @JsonProperty("logicalConnector")
    protected LogicalConnectorEnum logicalConnector;

    /**
     * Constructs a validated instance of {@link ScopeCondition}.
     *
     * @param spec the specification to process
     */
    public ScopeCondition(Consumer<ScopeCondition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScopeCondition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScopeCondition(Consumer)} instead.
     * @param attributes var.name
     * @param filterType This property is used to define the type of filter we will be using to define attributes. The allowed values are apis, httpMethod, tags. If API type is specified we can specify the fields of API such as apiName, apiDescription, apiVersion. If httpMethod specified we can specify the httpMethods(GET/POST/PUT/DELETE/POST) of the resource to filter the resource. This filter type is used for REST APIs only. If tag type is specified we can specify the field tags in API to filter api using tags. This is also only applicable for REST APIs.
     * @param logicalConnector var.name
     */
    @ApiStatus.Internal
    public ScopeCondition(List<Attribute> attributes, FilterTypeEnum filterType, LogicalConnectorEnum logicalConnector) {
        this.attributes = attributes;
        this.filterType = filterType;
        this.logicalConnector = logicalConnector;
    }

    /**
     * This property is used to define the type of filter we will be using to define attributes. The allowed values are apis, httpMethod, tags. If API type is specified we can specify the fields of API such as apiName, apiDescription, apiVersion. If httpMethod specified we can specify the httpMethods(GET/POST/PUT/DELETE/POST) of the resource to filter the resource. This filter type is used for REST APIs only. If tag type is specified we can specify the field tags in API to filter api using tags. This is also only applicable for REST APIs.
     */
    @AllArgsConstructor
    public enum FilterTypeEnum {
        API("API"),
        HTTP_METHOD("HTTP_METHOD");

        private static final FilterTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static FilterTypeEnum of(String input) {
            if (input != null) {
                for (FilterTypeEnum v : VALUES) {
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
