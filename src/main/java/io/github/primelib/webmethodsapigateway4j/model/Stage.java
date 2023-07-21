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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Stage
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

    /**
     * Constructs a validated instance of {@link Stage}.
     *
     * @param spec the specification to process
     */
    public Stage(Consumer<Stage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Stage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Stage(Consumer)} instead.
     * @param description Description for the stage
     * @param id var.name
     * @param keyAlias The alias of the private key that is stored in the keystore specified by the keystore alias. The Key alias field contains a list of the available aliases in the selected keystore. If there are no configured keystores, this field is empty
     * @param keystoreAlias The alias of the keystore containing the private key that is used for performing asset promotion from one (source) stage to another (target) stage. The Keystore alias field contains a list of the available keystore aliases in API Gateway. If there are no configured keystore aliases, this field lists the default Integration Server keystore, DEFAULT_IS_KEYSTORE .
     * @param name Unique name for the stage
     * @param password A valid password of the API Gateway user identified by the attribute Username
     * @param url The URL of the host machine where the stage is deployed on an API Gateway installation
     * @param username The username of a registered API Gateway user who has the Manage promotions functional privilege in the target API Gateway instance
     */
    @ApiStatus.Internal
    public Stage(String description, String id, String keyAlias, String keystoreAlias, String name, String password, String url, String username) {
        this.description = description;
        this.id = id;
        this.keyAlias = keyAlias;
        this.keystoreAlias = keystoreAlias;
        this.name = name;
        this.password = password;
        this.url = url;
        this.username = username;
    }

}
