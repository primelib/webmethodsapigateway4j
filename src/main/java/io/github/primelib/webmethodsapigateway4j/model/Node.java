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
 * Node
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
    "hostId",
    "replica"
})
@JsonTypeName("Node")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Node {

    @JsonProperty("hostId")
    protected String hostId;

    @JsonProperty("replica")
    protected Integer replica;

    /**
     * Constructs a validated instance of {@link Node}.
     *
     * @param spec the specification to process
     */
    public Node(Consumer<Node> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Node}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Node(Consumer)} instead.
     * @param hostId var.name
     * @param replica var.name
     */
    @ApiStatus.Internal
    public Node(String hostId, Integer replica) {
        this.hostId = hostId;
        this.replica = replica;
    }

}
