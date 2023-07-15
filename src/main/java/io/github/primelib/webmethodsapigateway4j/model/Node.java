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
 * Node
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "hostId",
    "replica"
})
@JsonTypeName("Node")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Node {

    /**
     * Constructs a validated implementation of {@link Node}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Node(Consumer<Node> spec) {
        spec.accept(this);
    }

    @JsonProperty("hostId")
    protected String hostId;

    @JsonProperty("replica")
    protected Integer replica;


}
