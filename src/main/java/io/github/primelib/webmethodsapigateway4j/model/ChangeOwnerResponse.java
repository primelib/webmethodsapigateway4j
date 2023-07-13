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
 * ChangeOwnerResponse
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "matchingAssets",
    "message",
    "status"
})
@JsonTypeName("ChangeOwnerResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeOwnerResponse {

    @JsonProperty("matchingAssets")
    private Map<String, Object> matchingAssets = new HashMap<>();

    @JsonProperty("message")
    private String message;

    @JsonProperty("status")
    private StatusEnum status;


public enum StatusEnum {
        PENDING_APPROVAL("PENDING_APPROVAL"),
        OK("OK");
    
    private final String text;

    /**
     * @param text
     */
    StatusEnum(final String text) {
        this.text = text;
    }

}
}
