package io.github.primelib.webmethodsapigateway4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
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
 * TransformationAlias
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "content",
    "fileName"
})
@JsonTypeName("TransformationAlias")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TransformationAlias extends Alias {

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

    /**
     * Constructs a validated instance of {@link TransformationAlias}.
     *
     * @param spec the specification to process
     */
    public TransformationAlias(Consumer<TransformationAlias> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TransformationAlias}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TransformationAlias(Consumer)} instead.
     * @param content content of the file
     * @param fileName the name of the file
     */
    @ApiStatus.Internal
    public TransformationAlias(String content, String fileName) {
        this.content = content;
        this.fileName = fileName;
    }

}
