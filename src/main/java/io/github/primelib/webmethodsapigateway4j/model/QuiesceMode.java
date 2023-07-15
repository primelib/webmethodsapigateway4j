package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QuiesceMode
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "block",
    "enable",
    "failureReason",
    "flush",
    "status"
})
@JsonTypeName("QuiesceMode")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class QuiesceMode {

    /**
     * Specifies the type of blocking for quiesce mode in API Gateway
     */
    @JsonProperty("block")
    private BlockEnum block;

    /**
     * Specifies whether to enable or disable quiesce mode for API Gateway
     */
    @JsonProperty("enable")
    private Boolean enable;

    /**
     * Specifies the failure reason of the last quiesce mode operation if the status is a failure
     */
    @JsonProperty("failureReason")
    private String failureReason;

    /**
     * Specifies the types of data that need to be flushed when quiesce mode for all is enabled in API Gateway
     */
    @JsonProperty("flush")
    private List<FlushEnum> flush;

    /**
     * Specifies the current status of the last quiesce mode operation. A null value means that the quiesce mode action is still in progress and the status is not yet known
     */
    @JsonProperty("status")
    private StatusEnum status;


    /**
     * Specifies the type of blocking for quiesce mode in API Gateway
     */
    @AllArgsConstructor
    public enum BlockEnum {
        DESIGNTIME("designtime"),
        ALL("all");

        private final String value;
    }

    /**
     * Specifies the types of data that need to be flushed when quiesce mode for all is enabled in API Gateway
     */
    @AllArgsConstructor
    public enum FlushEnum {
        LICENSE_METRICS("license_metrics"),
        PERFORMANCE_METRICS("performance_metrics"),
        SUBSCRIPTION_QUOTA("subscription_quota");

        private final String value;
    }

    /**
     * Specifies the current status of the last quiesce mode operation. A null value means that the quiesce mode action is still in progress and the status is not yet known
     */
    @AllArgsConstructor
    public enum StatusEnum {
        SUCCESS("success"),
        FAILURE("failure"),
        IN_PROGRESS("in progress");

        private final String value;
    }

}
