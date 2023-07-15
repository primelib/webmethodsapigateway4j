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
 * GatewayCacheConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "autoScale",
    "cacheName",
    "cacheSizeInPercent",
    "cacheableType",
    "collectStatistics",
    "recordCount"
})
@JsonTypeName("GatewayCacheConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GatewayCacheConfig {

    /**
     * Constructs a validated implementation of {@link GatewayCacheConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GatewayCacheConfig(Consumer<GatewayCacheConfig> spec) {
        spec.accept(this);
    }

    /**
     * Specifies whether to auto scale caching dynamically
     */
    @JsonProperty("autoScale")
    protected Boolean autoScale;

    @JsonProperty("cacheName")
    protected String cacheName;

    /**
     * Specifies the caching size in percentage
     */
    @JsonProperty("cacheSizeInPercent")
    protected Integer cacheSizeInPercent;

    @JsonProperty("cacheableType")
    protected CacheableType cacheableType;

    /**
     * Specifies whether to collect statistics for the caching
     */
    @JsonProperty("collectStatistics")
    protected Boolean collectStatistics;

    @JsonProperty("recordCount")
    protected Integer recordCount;


}
