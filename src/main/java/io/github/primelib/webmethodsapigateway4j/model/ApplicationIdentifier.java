package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplicationIdentifier
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "key",
    "name",
    "value"
})
@JsonTypeName("ApplicationIdentifier")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApplicationIdentifier {

    /**
     * Constructs a validated implementation of {@link ApplicationIdentifier}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApplicationIdentifier(Consumer<ApplicationIdentifier> spec) {
        spec.accept(this);
    }

    /**
     * unique identifier of the application identifier
     */
    @JsonProperty("id")
    protected String id;

    /**
     * identifier type
     */
    @JsonProperty("key")
    protected String key;

    /**
     * name of the identifier
     */
    @JsonProperty("name")
    protected String name;

    /**
     * list of identifier values
     */
    @JsonProperty("value")
    protected List<String> value;


}
