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
 * InternationalizedString
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
    "locale",
    "value"
})
@JsonTypeName("InternationalizedString")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class InternationalizedString {

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

    /**
     * Constructs a validated instance of {@link InternationalizedString}.
     *
     * @param spec the specification to process
     */
    public InternationalizedString(Consumer<InternationalizedString> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link InternationalizedString}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #InternationalizedString(Consumer)} instead.
     * @param locale This property will have the localization information of the property 'value'.
     * @param value This property will hold the actual string
     */
    @ApiStatus.Internal
    public InternationalizedString(String locale, String value) {
        this.locale = locale;
        this.value = value;
    }

}
