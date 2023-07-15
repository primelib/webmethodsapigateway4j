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
 * MobileApplicationConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "mobileAppDeviceTypes",
    "mobileApplications"
})
@JsonTypeName("MobileApplicationConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MobileApplicationConfiguration {

    /**
     * Constructs a validated implementation of {@link MobileApplicationConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MobileApplicationConfiguration(Consumer<MobileApplicationConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Configure Device Types to be filtered when Threat protection 'Mobile App Filter' Rule enforced
     */
    @JsonProperty("mobileAppDeviceTypes")
    protected List<String> mobileAppDeviceTypes;

    /**
     * Configure Mobile Application names to be filtered when Threat protection 'Mobile App Filter' Rule enforced
     */
    @JsonProperty("mobileApplications")
    protected List<String> mobileApplications;


}
