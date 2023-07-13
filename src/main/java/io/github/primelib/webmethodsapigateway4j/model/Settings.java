package io.github.primelib.webmethodsapigateway4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "extendedKeys",
    "wattKeys"
})
@JsonTypeName("Settings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Settings {

    /**
     * A map containing the API Gateway Extended Settings key-value pair.
     */
    @JsonProperty("extendedKeys")
    private Map<String, String> extendedKeys = new HashMap<>();

    /**
     * A map containing the Integration Server Watt properties key-value pair.
     */
    @JsonProperty("wattKeys")
    private Map<String, String> wattKeys = new HashMap<>();


}
