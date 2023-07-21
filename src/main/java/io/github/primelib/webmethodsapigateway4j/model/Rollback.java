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
 * Rollback
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

    /**
     * Constructs a validated instance of {@link Rollback}.
     *
     * @param spec the specification to process
     */
    public Rollback(Consumer<Rollback> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Rollback}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Rollback(Consumer)} instead.
     * @param description Description for the rollback
     * @param id var.name
     * @param lastRollbackTime The time at which the asset promotion was rolled back
     * @param name Name for the rollback
     * @param promotedBy User who initiated the promotion
     * @param promotionId Id of the promotion to map the rollback with the promotion from the source stage
     * @param promotionTime Actual time of the promotion
     * @param sourceStage Source stage of the promotion
     * @param status Overall status of the rollback whether it's success or failure
     */
    @ApiStatus.Internal
    public Rollback(String description, String id, String lastRollbackTime, String name, String promotedBy, String promotionId, String promotionTime, String sourceStage, String status) {
        this.description = description;
        this.id = id;
        this.lastRollbackTime = lastRollbackTime;
        this.name = name;
        this.promotedBy = promotedBy;
        this.promotionId = promotionId;
        this.promotionTime = promotionTime;
        this.sourceStage = sourceStage;
        this.status = status;
    }

}
