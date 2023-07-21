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

/**
 * Webhook
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
    "active",
    "config",
    "events",
    "id"
})
@JsonTypeName("Webhook")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Webhook {

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
    protected List<EventsEnum> events;

    /**
     * A unique ID for the webhook
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link Webhook}.
     *
     * @param spec the specification to process
     */
    public Webhook(Consumer<Webhook> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Webhook}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Webhook(Consumer)} instead.
     * @param active Specifies whether this webhook is active or not. Default value is false.
     * @param config var.name
     * @param events The list of interested events this webhook is subscribed for
     * @param id A unique ID for the webhook
     */
    @ApiStatus.Internal
    public Webhook(Boolean active, WebhookConfig config, List<EventsEnum> events, String id) {
        this.active = active;
        this.config = config;
        this.events = events;
        this.id = id;
    }

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
