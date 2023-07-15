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
 * Group
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "userIds"
})
@JsonTypeName("Group")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Group {

    /**
     * Constructs a validated implementation of {@link Group}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Group(Consumer<Group> spec) {
        spec.accept(this);
    }

    /**
     * description of the group
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Group ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * name of the group
     */
    @JsonProperty("name")
    protected String name;

    /**
     * list of user's Ids assigned to the group
     */
    @JsonProperty("userIds")
    protected List<String> userIds;


}
