package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewayCacheConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Boolean autoScale;

    @JsonProperty("cacheName")
    private String cacheName;

    /**
     * Specifies the caching size in percentage
     */
    @JsonProperty("cacheSizeInPercent")
    private Integer cacheSizeInPercent;

    @JsonProperty("cacheableType")
    private CacheableType cacheableType;

    /**
     * Specifies whether to collect statistics for the caching
     */
    @JsonProperty("collectStatistics")
    private Boolean collectStatistics;

    @JsonProperty("recordCount")
    private Integer recordCount;


}
