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
 * AccessTokensTypeModel
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type"
})
@JsonTypeName("AccessTokensTypeModel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AccessTokensTypeModel {

    /**
     * Constructs a validated implementation of {@link AccessTokensTypeModel}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AccessTokensTypeModel(Consumer<AccessTokensTypeModel> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected String type;


}
