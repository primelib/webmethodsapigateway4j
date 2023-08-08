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
 * AccessProfile
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
    "groupIds",
    "id",
    "includeTeamAdminsAsApprovers",
    "name",
    "privilege",
    "teamAdmin",
    "teamApprovers"
})
@JsonTypeName("AccessProfile")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccessProfile {

    /**
     * description of the accessprofile
     */
    @JsonProperty("description")
    protected String description;

    /**
     * list of groupIds assigned to the accessprofile
     */
    @JsonProperty("groupIds")
    protected List<String> groupIds;

    /**
     * AccessProfile ID
     */
    @JsonProperty("id")
    protected String id;

    /**
     * When the property is set to true, all the team administrators becomes approvers. The default value is false
     */
    @JsonProperty("includeTeamAdminsAsApprovers")
    protected Boolean includeTeamAdminsAsApprovers;

    /**
     * name of the accessprofile
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("privilege")
    protected BitSet privilege;

    @JsonProperty("teamAdmin")
    protected TeamAdmin teamAdmin;

    @JsonProperty("teamApprovers")
    protected TeamApprovers teamApprovers;

    /**
     * Constructs a validated instance of {@link AccessProfile}.
     *
     * @param spec the specification to process
     */
    public AccessProfile(Consumer<AccessProfile> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AccessProfile}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AccessProfile(Consumer)} instead.
     * @param description description of the accessprofile
     * @param groupIds list of groupIds assigned to the accessprofile
     * @param id AccessProfile ID
     * @param includeTeamAdminsAsApprovers When the property is set to true, all the team administrators becomes approvers. The default value is false
     * @param name name of the accessprofile
     * @param privilege privilege
     * @param teamAdmin teamAdmin
     * @param teamApprovers teamApprovers
     */
    @ApiStatus.Internal
    public AccessProfile(String description, List<String> groupIds, String id, Boolean includeTeamAdminsAsApprovers, String name, BitSet privilege, TeamAdmin teamAdmin, TeamApprovers teamApprovers) {
        this.description = description;
        this.groupIds = groupIds;
        this.id = id;
        this.includeTeamAdminsAsApprovers = includeTeamAdminsAsApprovers;
        this.name = name;
        this.privilege = privilege;
        this.teamAdmin = teamAdmin;
        this.teamApprovers = teamApprovers;
    }

}
