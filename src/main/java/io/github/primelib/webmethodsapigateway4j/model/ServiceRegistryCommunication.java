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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ServiceRegistryCommunication
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
    "httpMethod",
    "path"
})
@JsonTypeName("ServiceRegistryCommunication")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryCommunication {

    /**
     * HttpMethod that is used while communicating with the service registry
     */
    @JsonProperty("httpMethod")
    protected HttpMethodEnum httpMethod;

    /**
     * Resource path that will be appened with base endpoint while communicating with service registry
     */
    @JsonProperty("path")
    protected String path;

    /**
     * Constructs a validated instance of {@link ServiceRegistryCommunication}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryCommunication(Consumer<ServiceRegistryCommunication> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryCommunication}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryCommunication(Consumer)} instead.
     * @param httpMethod HttpMethod that is used while communicating with the service registry
     * @param path Resource path that will be appened with base endpoint while communicating with service registry
     */
    @ApiStatus.Internal
    public ServiceRegistryCommunication(HttpMethodEnum httpMethod, String path) {
        this.httpMethod = httpMethod;
        this.path = path;
    }

    /**
     * HttpMethod that is used while communicating with the service registry
     */
    @AllArgsConstructor
    public enum HttpMethodEnum {
        GET("GET"),
        POST("POST"),
        PUT("PUT"),
        DELETE("DELETE"),
        HEAD("HEAD"),
        PATCH("PATCH"),
        OPTIONS("OPTIONS"),
        TRACE("TRACE"),
        CUSTOM("CUSTOM");

        private static final HttpMethodEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static HttpMethodEnum of(String input) {
            if (input != null) {
                for (HttpMethodEnum v : VALUES) {
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
