package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JWTServiceInput
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "claimsSet"
})
@JsonTypeName("JWTServiceInput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JWTServiceInput {

    /**
     * Constructs a validated implementation of {@link JWTServiceInput}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JWTServiceInput(Consumer<JWTServiceInput> spec) {
        spec.accept(this);
    }

    /**
     * key value pairs in the form of json map
     */
    @JsonProperty("claimsSet")
    protected Map<String, Object> claimsSet = new HashMap<>();


}
