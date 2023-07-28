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
 * APIResponseGatewayEndpoint
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
    "endpoint",
    "endpointDisplayName",
    "endpointName",
    "endpointType",
    "endpointUrls"
})
@JsonTypeName("APIResponseGatewayEndpoint")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class APIResponseGatewayEndpoint {

    @JsonProperty("endpoint")
    protected String endpoint;

    @JsonProperty("endpointDisplayName")
    protected String endpointDisplayName;

    @JsonProperty("endpointName")
    protected String endpointName;

    @JsonProperty("endpointType")
    protected EndpointTypeEnum endpointType;

    @JsonProperty("endpointUrls")
    protected List<String> endpointUrls;

    /**
     * Constructs a validated instance of {@link APIResponseGatewayEndpoint}.
     *
     * @param spec the specification to process
     */
    public APIResponseGatewayEndpoint(Consumer<APIResponseGatewayEndpoint> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link APIResponseGatewayEndpoint}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #APIResponseGatewayEndpoint(Consumer)} instead.
     * @param endpoint var.name
     * @param endpointDisplayName var.name
     * @param endpointName var.name
     * @param endpointType var.name
     * @param endpointUrls var.name
     */
    @ApiStatus.Internal
    public APIResponseGatewayEndpoint(String endpoint, String endpointDisplayName, String endpointName, EndpointTypeEnum endpointType, List<String> endpointUrls) {
        this.endpoint = endpoint;
        this.endpointDisplayName = endpointDisplayName;
        this.endpointName = endpointName;
        this.endpointType = endpointType;
        this.endpointUrls = endpointUrls;
    }

    @AllArgsConstructor
    public enum EndpointTypeEnum {
        DEFAULT("DEFAULT"),
        GLOBAL("GLOBAL"),
        API_LEVEL("API_LEVEL"),
        MICRO_GATEWAY("MICRO_GATEWAY");

        private static final EndpointTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static EndpointTypeEnum of(String input) {
            if (input != null) {
                for (EndpointTypeEnum v : VALUES) {
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
