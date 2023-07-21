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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplicationIdentifier
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
    "key",
    "name",
    "value"
})
@JsonTypeName("ApplicationIdentifier")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ApplicationIdentifier {

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

    /**
     * Constructs a validated instance of {@link ApplicationIdentifier}.
     *
     * @param spec the specification to process
     */
    public ApplicationIdentifier(Consumer<ApplicationIdentifier> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ApplicationIdentifier}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ApplicationIdentifier(Consumer)} instead.
     * @param id unique identifier of the application identifier
     * @param key identifier type
     * @param name name of the identifier
     * @param value list of identifier values
     */
    @ApiStatus.Internal
    public ApplicationIdentifier(String id, String key, String name, List<String> value) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.value = value;
    }

}
