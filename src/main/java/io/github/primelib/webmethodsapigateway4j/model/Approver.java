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
 * Approver
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
    "id",
    "name"
})
@JsonTypeName("Approver")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Approver {

    @JsonProperty("id")
    protected String id;

    /**
     * Email of the approver
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link Approver}.
     *
     * @param spec the specification to process
     */
    public Approver(Consumer<Approver> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Approver}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Approver(Consumer)} instead.
     * @param id id
     * @param name Email of the approver
     */
    @ApiStatus.Internal
    public Approver(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
