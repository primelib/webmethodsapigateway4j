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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TeamApprovers
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
    "groupIds",
    "userIds"
})
@JsonTypeName("TeamApprovers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TeamApprovers {

    /**
     * List of groupIds to be assigned as the team approvers. All users in the group will become team approvers.
     */
    @JsonProperty("groupIds")
    protected List<String> groupIds;

    /**
     * List of userIds to be assigned as the team approvers.
     */
    @JsonProperty("userIds")
    protected List<String> userIds;

    /**
     * Constructs a validated instance of {@link TeamApprovers}.
     *
     * @param spec the specification to process
     */
    public TeamApprovers(Consumer<TeamApprovers> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TeamApprovers}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TeamApprovers(Consumer)} instead.
     * @param groupIds List of groupIds to be assigned as the team approvers. All users in the group will become team approvers.
     * @param userIds List of userIds to be assigned as the team approvers.
     */
    @ApiStatus.Internal
    public TeamApprovers(List<String> groupIds, List<String> userIds) {
        this.groupIds = groupIds;
        this.userIds = userIds;
    }

}
