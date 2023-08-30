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
 * AuthorizationValue
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
    "keyName",
    "type",
    "urlMatcher",
    "value"
})
@JsonTypeName("AuthorizationValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuthorizationValue {

    @JsonProperty("keyName")
    protected String keyName;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("urlMatcher")
    protected Object urlMatcher;

    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link AuthorizationValue}.
     *
     * @param spec the specification to process
     */
    public AuthorizationValue(Consumer<AuthorizationValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuthorizationValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuthorizationValue(Consumer)} instead.
     * @param keyName keyName
     * @param type type
     * @param urlMatcher urlMatcher
     * @param value value
     */
    @ApiStatus.Internal
    public AuthorizationValue(String keyName, String type, Object urlMatcher, String value) {
        this.keyName = keyName;
        this.type = type;
        this.urlMatcher = urlMatcher;
        this.value = value;
    }

}
