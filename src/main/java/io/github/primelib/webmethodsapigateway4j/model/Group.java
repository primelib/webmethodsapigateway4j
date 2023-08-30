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
 * Group
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
    "name",
    "userIds"
})
@JsonTypeName("Group")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Group {

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

    /**
     * Constructs a validated instance of {@link Group}.
     *
     * @param spec the specification to process
     */
    public Group(Consumer<Group> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Group}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Group(Consumer)} instead.
     * @param description description of the group
     * @param id Group ID
     * @param name name of the group
     * @param userIds list of user's Ids assigned to the group
     */
    @ApiStatus.Internal
    public Group(String description, String id, String name, List<String> userIds) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.userIds = userIds;
    }

}
