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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JWTServiceInput
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
    "claimsSet"
})
@JsonTypeName("JWTServiceInput")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JWTServiceInput {

    /**
     * key value pairs in the form of json map
     */
    @JsonProperty("claimsSet")
    protected Map<String, Object> claimsSet;

    /**
     * Constructs a validated instance of {@link JWTServiceInput}.
     *
     * @param spec the specification to process
     */
    public JWTServiceInput(Consumer<JWTServiceInput> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JWTServiceInput}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JWTServiceInput(Consumer)} instead.
     * @param claimsSet key value pairs in the form of json map
     */
    @ApiStatus.Internal
    public JWTServiceInput(Map<String, Object> claimsSet) {
        this.claimsSet = claimsSet;
    }

}
