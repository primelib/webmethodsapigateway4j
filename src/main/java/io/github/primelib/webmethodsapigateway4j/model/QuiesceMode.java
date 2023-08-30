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
 * QuiesceMode
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
    protected BlockEnum block;

    /**
     * Specifies whether to enable or disable quiesce mode for API Gateway
     */
    @JsonProperty("enable")
    protected Boolean enable;

    /**
     * Specifies the failure reason of the last quiesce mode operation if the status is a failure
     */
    @JsonProperty("failureReason")
    protected String failureReason;

    /**
     * Specifies the types of data that need to be flushed when quiesce mode for all is enabled in API Gateway
     */
    @JsonProperty("flush")
    protected List<FlushEnum> flush;

    /**
     * Specifies the current status of the last quiesce mode operation. A null value means that the quiesce mode action is still in progress and the status is not yet known
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * Constructs a validated instance of {@link QuiesceMode}.
     *
     * @param spec the specification to process
     */
    public QuiesceMode(Consumer<QuiesceMode> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link QuiesceMode}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #QuiesceMode(Consumer)} instead.
     * @param block Specifies the type of blocking for quiesce mode in API Gateway
     * @param enable Specifies whether to enable or disable quiesce mode for API Gateway
     * @param failureReason Specifies the failure reason of the last quiesce mode operation if the status is a failure
     * @param flush Specifies the types of data that need to be flushed when quiesce mode for all is enabled in API Gateway
     * @param status Specifies the current status of the last quiesce mode operation. A null value means that the quiesce mode action is still in progress and the status is not yet known
     */
    @ApiStatus.Internal
    public QuiesceMode(BlockEnum block, Boolean enable, String failureReason, List<FlushEnum> flush, StatusEnum status) {
        this.block = block;
        this.enable = enable;
        this.failureReason = failureReason;
        this.flush = flush;
        this.status = status;
    }

    /**
     * Specifies the type of blocking for quiesce mode in API Gateway
     */
    @AllArgsConstructor
    public enum BlockEnum {
        DESIGNTIME("designtime"),
        ALL("all");

        private static final BlockEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static BlockEnum of(String input) {
            if (input != null) {
                for (BlockEnum v : VALUES) {
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

    /**
     * Specifies the types of data that need to be flushed when quiesce mode for all is enabled in API Gateway
     */
    @AllArgsConstructor
    public enum FlushEnum {
        LICENSE_METRICS("license_metrics"),
        PERFORMANCE_METRICS("performance_metrics"),
        SUBSCRIPTION_QUOTA("subscription_quota");

        private static final FlushEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static FlushEnum of(String input) {
            if (input != null) {
                for (FlushEnum v : VALUES) {
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

    /**
     * Specifies the current status of the last quiesce mode operation. A null value means that the quiesce mode action is still in progress and the status is not yet known
     */
    @AllArgsConstructor
    public enum StatusEnum {
        SUCCESS("success"),
        FAILURE("failure"),
        IN_PROGRESS("in progress");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
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
