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
 * ElasticsearchConfig
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "password",
    "url",
    "username"
})
@JsonTypeName("ElasticsearchConfig")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ElasticsearchConfig {

    /**
     * Constructs a validated implementation of {@link ElasticsearchConfig}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ElasticsearchConfig(Consumer<ElasticsearchConfig> spec) {
        spec.accept(this);
    }

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


}
