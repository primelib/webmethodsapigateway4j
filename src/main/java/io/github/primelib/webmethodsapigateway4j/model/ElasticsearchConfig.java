package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ElasticsearchConfig
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String password;

    /**
     * The source Elasticsearch instance URL
     */
    @JsonProperty("url")
    private String url;

    /**
     * The user name required to authenticate against if authentication is enabled for the source Elasticsearch instance.
     */
    @JsonProperty("username")
    private String username;


}
