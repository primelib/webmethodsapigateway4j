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
 * InternationalizedString
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "locale",
    "value"
})
@JsonTypeName("InternationalizedString")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InternationalizedString {

    /**
     * Constructs a validated implementation of {@link InternationalizedString}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public InternationalizedString(Consumer<InternationalizedString> spec) {
        spec.accept(this);
    }

    /**
     * This property will have the localization information of the property 'value'.
     */
    @JsonProperty("locale")
    protected String locale;

    /**
     * This property will hold the actual string
     */
    @JsonProperty("value")
    protected String value;


}
