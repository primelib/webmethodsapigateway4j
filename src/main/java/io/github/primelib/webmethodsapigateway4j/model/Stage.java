package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Stage
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "keyAlias",
    "keystoreAlias",
    "name",
    "password",
    "url",
    "username"
})
@JsonTypeName("Stage")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Stage {

    /**
     * Constructs a validated implementation of {@link Stage}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Stage(Consumer<Stage> spec) {
        spec.accept(this);
    }

    /**
     * Description for the stage
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("id")
    protected String id;

    /**
     * The alias of the private key that is stored in the keystore specified by the keystore alias. The Key alias field contains a list of the available aliases in the selected keystore. If there are no configured keystores, this field is empty
     */
    @JsonProperty("keyAlias")
    protected String keyAlias;

    /**
     * The alias of the keystore containing the private key that is used for performing asset promotion from one (source) stage to another (target) stage. The Keystore alias field contains a list of the available keystore aliases in API Gateway. If there are no configured keystore aliases, this field lists the default Integration Server keystore, DEFAULT_IS_KEYSTORE .
     */
    @JsonProperty("keystoreAlias")
    protected String keystoreAlias;

    /**
     * Unique name for the stage
     */
    @JsonProperty("name")
    protected String name;

    /**
     * A valid password of the API Gateway user identified by the attribute Username
     */
    @JsonProperty("password")
    protected String password;

    /**
     * The URL of the host machine where the stage is deployed on an API Gateway installation
     */
    @JsonProperty("url")
    protected String url;

    /**
     * The username of a registered API Gateway user who has the Manage promotions functional privilege in the target API Gateway instance
     */
    @JsonProperty("username")
    protected String username;


}
