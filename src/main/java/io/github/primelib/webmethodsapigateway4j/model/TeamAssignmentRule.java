package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TeamAssignmentRule
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "teamsAssigned"
})
@JsonTypeName("TeamAssignmentRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TeamAssignmentRule extends Rule {

    /**
     * List of teams to be assigned, if conditions of rule expression is met
     */
    @JsonProperty("teamsAssigned")
    protected List<String> teamsAssigned;

    /**
     * Constructs a validated instance of {@link TeamAssignmentRule}.
     *
     * @param spec the specification to process
     */
    public TeamAssignmentRule(Consumer<TeamAssignmentRule> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TeamAssignmentRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TeamAssignmentRule(Consumer)} instead.
     * @param teamsAssigned List of teams to be assigned, if conditions of rule expression is met
     */
    @ApiStatus.Internal
    public TeamAssignmentRule(List<String> teamsAssigned) {
        this.teamsAssigned = teamsAssigned;
    }

}
