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
 * Approver
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name"
})
@JsonTypeName("Approver")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Approver {

    /**
     * Constructs a validated implementation of {@link Approver}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Approver(Consumer<Approver> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * Email of the approver
     */
    @JsonProperty("name")
    protected String name;


}
