package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Webhook
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "active",
    "config",
    "events",
    "id"
})
@JsonTypeName("Webhook")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Webhook {

    /**
     * Constructs a validated implementation of {@link Webhook}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Webhook(Consumer<Webhook> spec) {
        spec.accept(this);
    }

    /**
     * Specifies whether this webhook is active or not. Default value is false.
     */
    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("config")
    protected WebhookConfig config;

    /**
     * The list of interested events this webhook is subscribed for
     */
    @JsonProperty("events")
    protected List<EventsEnum> events = new ArrayList<>();

    /**
     * A unique ID for the webhook
     */
    @JsonProperty("id")
    protected String id;


    /**
     * The list of interested events this webhook is subscribed for
     */
    @AllArgsConstructor
    public enum EventsEnum {
        MIGRATION_QUIESCE_DESIGNTIME_COMPLETED("migration:quiesce:designtime:completed"),
        MIGRATION_QUIESCE_ALL_COMPLETED("migration:quiesce:all:completed"),
        MIGRATION_REINDEX_CORE_COMPLETED("migration:reindex:core:completed"),
        MIGRATION_REINDEX_LOGSEVENTS_COMPLETED("migration:reindex:logsevents:completed"),
        MIGRATION_REINDEX_ANALYTICSANDLOGS_COMPLETED("migration:reindex:analyticsandlogs:completed"),
        MIGRATION_REINDEX_ALL_COMPLETED("migration:reindex:all:completed"),
        MIGRATION_TRANSFORM_ASSETS_COMPETED("migration:transform:assets:competed"),
        MIGRATION_CLEAN_DATASTORE_COMPLETED("migration:clean:datastore:completed"),
        APIGATEWAY_SERVER_STARTED("apigateway:server:started");

        private final String value;
    }

}
