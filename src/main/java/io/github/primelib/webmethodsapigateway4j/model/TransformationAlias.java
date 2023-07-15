package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TransformationAlias
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "content",
    "fileName"
})
@JsonTypeName("TransformationAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TransformationAlias extends Alias {

    /**
     * Constructs a validated implementation of {@link TransformationAlias}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public TransformationAlias(Consumer<TransformationAlias> spec) {
        spec.accept(this);
    }

    /**
     * content of the file
     */
    @JsonProperty("content")
    protected String content;

    /**
     * the name of the file
     */
    @JsonProperty("fileName")
    protected String fileName;


}
