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
 * InputForGatewayEndpoints
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
    "add",
    "remove",
    "update"
})
@JsonTypeName("InputForGatewayEndpoints")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InputForGatewayEndpoints {

    @JsonProperty("add")
    protected InputForAddGatewayEndpoint add;

    @JsonProperty("remove")
    protected InputForRemoveGatewayEndpoint remove;

    @JsonProperty("update")
    protected InputForUpdateGatewayEndpoint update;

    /**
     * Constructs a validated instance of {@link InputForGatewayEndpoints}.
     *
     * @param spec the specification to process
     */
    public InputForGatewayEndpoints(Consumer<InputForGatewayEndpoints> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InputForGatewayEndpoints}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InputForGatewayEndpoints(Consumer)} instead.
     * @param add add
     * @param remove remove
     * @param update update
     */
    @ApiStatus.Internal
    public InputForGatewayEndpoints(InputForAddGatewayEndpoint add, InputForRemoveGatewayEndpoint remove, InputForUpdateGatewayEndpoint update) {
        this.add = add;
        this.remove = remove;
        this.update = update;
    }

}
