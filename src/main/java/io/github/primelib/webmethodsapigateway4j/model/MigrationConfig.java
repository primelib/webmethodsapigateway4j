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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MigrationConfig
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
    protected ActionEnum action;

    /**
     * The type of indices to be reindexed for reindex action
     */
    @JsonProperty("indicesType")
    protected IndicesTypeEnum indicesType;

    /**
     * Migration properties for reindex action. Default values are taken from migration.properties file. Any value passed in here would overwrite the default value.
     */
    @JsonProperty("properties")
    protected Map<String, String> properties;

    @JsonProperty("sourceElasticsearch")
    protected ElasticsearchConfig sourceElasticsearch;

    /**
     * Constructs a validated instance of {@link MigrationConfig}.
     *
     * @param spec the specification to process
     */
    public MigrationConfig(Consumer<MigrationConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MigrationConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MigrationConfig(Consumer)} instead.
     * @param action The type of migration action to be performed
     * @param indicesType The type of indices to be reindexed for reindex action
     * @param properties Migration properties for reindex action. Default values are taken from migration.properties file. Any value passed in here would overwrite the default value.
     * @param sourceElasticsearch sourceElasticsearch
     */
    @ApiStatus.Internal
    public MigrationConfig(ActionEnum action, IndicesTypeEnum indicesType, Map<String, String> properties, ElasticsearchConfig sourceElasticsearch) {
        this.action = action;
        this.indicesType = indicesType;
        this.properties = properties;
        this.sourceElasticsearch = sourceElasticsearch;
    }

    /**
     * The type of migration action to be performed
     */
    @AllArgsConstructor
    public enum ActionEnum {
        CLEAN("clean"),
        REINDEX("reindex"),
        TRANSFORM("transform"),
        BACKUP("backup");

        private static final ActionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ActionEnum of(String input) {
            if (input != null) {
                for (ActionEnum v : VALUES) {
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
     * The type of indices to be reindexed for reindex action
     */
    @AllArgsConstructor
    public enum IndicesTypeEnum {
        CORE("core"),
        ANALYTICSANDLOGS("analyticsandlogs");

        private static final IndicesTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static IndicesTypeEnum of(String input) {
            if (input != null) {
                for (IndicesTypeEnum v : VALUES) {
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
