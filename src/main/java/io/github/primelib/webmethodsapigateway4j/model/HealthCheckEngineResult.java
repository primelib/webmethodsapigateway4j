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
 * HealthCheckEngineResult
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
    "elasticsearch",
    "is",
    "status",
    "terracotta"
})
@JsonTypeName("HealthCheckEngineResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HealthCheckEngineResult {

    /**
     * Various values for the ElasticSearch check
     */
    @JsonProperty("elasticsearch")
    protected Object elasticsearch;

    /**
     * Various values for the Integration Server health check
     */
    @JsonProperty("is")
    protected Object is;

    /**
     * Either green, yellow or red
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Various values for the Terracotta cluster check
     */
    @JsonProperty("terracotta")
    protected Object terracotta;

    /**
     * Constructs a validated instance of {@link HealthCheckEngineResult}.
     *
     * @param spec the specification to process
     */
    public HealthCheckEngineResult(Consumer<HealthCheckEngineResult> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link HealthCheckEngineResult}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #HealthCheckEngineResult(Consumer)} instead.
     * @param elasticsearch Various values for the ElasticSearch check
     * @param is Various values for the Integration Server health check
     * @param status Either green, yellow or red
     * @param terracotta Various values for the Terracotta cluster check
     */
    @ApiStatus.Internal
    public HealthCheckEngineResult(Object elasticsearch, Object is, String status, Object terracotta) {
        this.elasticsearch = elasticsearch;
        this.is = is;
        this.status = status;
        this.terracotta = terracotta;
    }

}
