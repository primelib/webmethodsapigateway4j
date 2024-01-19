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
 * GatewayCacheConfig
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

    /**
     * Constructs a validated instance of {@link GatewayCacheConfig}.
     *
     * @param spec the specification to process
     */
    public GatewayCacheConfig(Consumer<GatewayCacheConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GatewayCacheConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GatewayCacheConfig(Consumer)} instead.
     * @param autoScale Specifies whether to auto scale caching dynamically
     * @param cacheName cacheName
     * @param cacheSizeInPercent Specifies the caching size in percentage
     * @param cacheableType cacheableType
     * @param collectStatistics Specifies whether to collect statistics for the caching
     * @param recordCount recordCount
     */
    @ApiStatus.Internal
    public GatewayCacheConfig(Boolean autoScale, String cacheName, Integer cacheSizeInPercent, CacheableType cacheableType, Boolean collectStatistics, Integer recordCount) {
        this.autoScale = autoScale;
        this.cacheName = cacheName;
        this.cacheSizeInPercent = cacheSizeInPercent;
        this.cacheableType = cacheableType;
        this.collectStatistics = collectStatistics;
        this.recordCount = recordCount;
    }

}
