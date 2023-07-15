package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TeamAssignmentRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "teamsAssigned"
})
@JsonTypeName("TeamAssignmentRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TeamAssignmentRule extends Rule {

    /**
     * Constructs a validated implementation of {@link TeamAssignmentRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TeamAssignmentRule(Consumer<TeamAssignmentRule> spec) {
        spec.accept(this);
    }

    /**
     * List of teams to be assigned, if conditions of rule expression is met
     */
    @JsonProperty("teamsAssigned")
    protected List<String> teamsAssigned;


}
