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
 * AccessTokensTypeModel
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
    "type"
})
@JsonTypeName("AccessTokensTypeModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccessTokensTypeModel {

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link AccessTokensTypeModel}.
     *
     * @param spec the specification to process
     */
    public AccessTokensTypeModel(Consumer<AccessTokensTypeModel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AccessTokensTypeModel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AccessTokensTypeModel(Consumer)} instead.
     * @param type type
     */
    @ApiStatus.Internal
    public AccessTokensTypeModel(String type) {
        this.type = type;
    }

}
