package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MigrationConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "action",
    "indicesType",
    "properties",
    "sourceElasticsearch"
})
@JsonTypeName("MigrationConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MigrationConfig {

    /**
     * The type of migration action to be performed
     */
    @JsonProperty("action")
    private ActionEnum action;

    /**
     * The type of indices to be reindexed for reindex action
     */
    @JsonProperty("indicesType")
    private IndicesTypeEnum indicesType;

    /**
     * Migration properties for reindex action. Default values are taken from migration.properties file. Any value passed in here would overwrite the default value.
     */
    @JsonProperty("properties")
    private Map<String, String> properties = new HashMap<>();

    @JsonProperty("sourceElasticsearch")
    private ElasticsearchConfig sourceElasticsearch;


    /**
     * The type of migration action to be performed
     */
    @AllArgsConstructor
    public enum ActionEnum {
        CLEAN("clean"),
        REINDEX("reindex"),
        TRANSFORM("transform"),
        BACKUP("backup");

        private final String value;
    }

    /**
     * The type of indices to be reindexed for reindex action
     */
    @AllArgsConstructor
    public enum IndicesTypeEnum {
        CORE("core"),
        ANALYTICSANDLOGS("analyticsandlogs");

        private final String value;
    }

}
