package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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
    private Boolean active;

    @JsonProperty("config")
    private WebhookConfig config;

    /**
     * The list of interested events this webhook is subscribed for
     */
    @JsonProperty("events")
    private List<EventsEnum> events = new ArrayList<>();

    /**
     * A unique ID for the webhook
     */
    @JsonProperty("id")
    private String id;


public enum EventsEnum {
        MIGRATION_QUIESCE_DESIGNTIME_COMPLETED("migration:quiesce:designtime:completed"), // The list of interested events this webhook is subscribed for
        MIGRATION_QUIESCE_ALL_COMPLETED("migration:quiesce:all:completed"), // The list of interested events this webhook is subscribed for
        MIGRATION_REINDEX_CORE_COMPLETED("migration:reindex:core:completed"), // The list of interested events this webhook is subscribed for
        MIGRATION_REINDEX_LOGSEVENTS_COMPLETED("migration:reindex:logsevents:completed"), // The list of interested events this webhook is subscribed for
        MIGRATION_REINDEX_ANALYTICSANDLOGS_COMPLETED("migration:reindex:analyticsandlogs:completed"), // The list of interested events this webhook is subscribed for
        MIGRATION_REINDEX_ALL_COMPLETED("migration:reindex:all:completed"), // The list of interested events this webhook is subscribed for
        MIGRATION_TRANSFORM_ASSETS_COMPETED("migration:transform:assets:competed"), // The list of interested events this webhook is subscribed for
        MIGRATION_CLEAN_DATASTORE_COMPLETED("migration:clean:datastore:completed"), // The list of interested events this webhook is subscribed for
        APIGATEWAY_SERVER_STARTED("apigateway:server:started"); // The list of interested events this webhook is subscribed for
    
    private final String text;

    /**
     * @param text
     */
    EventsEnum(final String text) {
        this.text = text;
    }

}
}
