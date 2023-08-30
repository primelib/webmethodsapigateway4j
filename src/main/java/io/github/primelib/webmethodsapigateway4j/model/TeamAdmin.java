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
 * TeamAdmin
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
@JsonTypeName("TeamAdmin")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TeamAdmin {

    /**
     * List of groupIds to be assigned as the team administrator. All users in the group will become team administrator.
     */
    @JsonProperty("groupIds")
    protected List<String> groupIds;

    /**
     * List of userIds to be assigned as the team administrator.
     */
    @JsonProperty("userIds")
    protected List<String> userIds;

    /**
     * Constructs a validated instance of {@link TeamAdmin}.
     *
     * @param spec the specification to process
     */
    public TeamAdmin(Consumer<TeamAdmin> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TeamAdmin}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TeamAdmin(Consumer)} instead.
     * @param groupIds List of groupIds to be assigned as the team administrator. All users in the group will become team administrator.
     * @param userIds List of userIds to be assigned as the team administrator.
     */
    @ApiStatus.Internal
    public TeamAdmin(List<String> groupIds, List<String> userIds) {
        this.groupIds = groupIds;
        this.userIds = userIds;
    }

}
