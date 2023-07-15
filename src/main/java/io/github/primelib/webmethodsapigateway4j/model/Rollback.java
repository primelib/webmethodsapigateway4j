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
 * Rollback
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "lastRollbackTime",
    "name",
    "promotedBy",
    "promotionId",
    "promotionTime",
    "sourceStage",
    "status"
})
@JsonTypeName("Rollback")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Rollback {

    /**
     * Constructs a validated implementation of {@link Rollback}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Rollback(Consumer<Rollback> spec) {
        spec.accept(this);
    }

    /**
     * Description for the rollback
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("id")
    protected String id;

    /**
     * The time at which the asset promotion was rolled back
     */
    @JsonProperty("lastRollbackTime")
    protected String lastRollbackTime;

    /**
     * Name for the rollback
     */
    @JsonProperty("name")
    protected String name;

    /**
     * User who initiated the promotion
     */
    @JsonProperty("promotedBy")
    protected String promotedBy;

    /**
     * Id of the promotion to map the rollback with the promotion from the source stage
     */
    @JsonProperty("promotionId")
    protected String promotionId;

    /**
     * Actual time of the promotion
     */
    @JsonProperty("promotionTime")
    protected String promotionTime;

    /**
     * Source stage of the promotion
     */
    @JsonProperty("sourceStage")
    protected String sourceStage;

    /**
     * Overall status of the rollback whether it's success or failure
     */
    @JsonProperty("status")
    protected String status;


}
