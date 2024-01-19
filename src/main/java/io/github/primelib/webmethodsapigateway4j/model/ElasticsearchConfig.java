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
 * ElasticsearchConfig
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
    "password",
    "url",
    "username"
})
@JsonTypeName("ElasticsearchConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ElasticsearchConfig {

    /**
     * The password required to authenticate if authentication is enabled for the source Elasticsearch instance.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * The source Elasticsearch instance URL
     */
    @JsonProperty("url")
    protected String url;

    /**
     * The user name required to authenticate against if authentication is enabled for the source Elasticsearch instance.
     */
    @JsonProperty("username")
    protected String username;

    /**
     * Constructs a validated instance of {@link ElasticsearchConfig}.
     *
     * @param spec the specification to process
     */
    public ElasticsearchConfig(Consumer<ElasticsearchConfig> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ElasticsearchConfig}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ElasticsearchConfig(Consumer)} instead.
     * @param password The password required to authenticate if authentication is enabled for the source Elasticsearch instance.
     * @param url The source Elasticsearch instance URL
     * @param username The user name required to authenticate against if authentication is enabled for the source Elasticsearch instance.
     */
    @ApiStatus.Internal
    public ElasticsearchConfig(String password, String url, String username) {
        this.password = password;
        this.url = url;
        this.username = username;
    }

}
