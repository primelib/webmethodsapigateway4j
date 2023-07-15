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
 * AccessProfile
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AccessProfile}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AccessProfile(Consumer<AccessProfile> spec) {
        spec.accept(this);
    }

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


}
