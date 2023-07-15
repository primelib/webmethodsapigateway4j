package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TeamAdmin
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groupIds",
    "userIds"
})
@JsonTypeName("TeamAdmin")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TeamAdmin {

    /**
     * Constructs a validated implementation of {@link TeamAdmin}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TeamAdmin(Consumer<TeamAdmin> spec) {
        spec.accept(this);
    }

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


}
