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
 * MobileApplicationConfiguration
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
    "mobileAppDeviceTypes",
    "mobileApplications"
})
@JsonTypeName("MobileApplicationConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MobileApplicationConfiguration {

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

    /**
     * Constructs a validated instance of {@link MobileApplicationConfiguration}.
     *
     * @param spec the specification to process
     */
    public MobileApplicationConfiguration(Consumer<MobileApplicationConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MobileApplicationConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MobileApplicationConfiguration(Consumer)} instead.
     * @param mobileAppDeviceTypes Configure Device Types to be filtered when Threat protection 'Mobile App Filter' Rule enforced
     * @param mobileApplications Configure Mobile Application names to be filtered when Threat protection 'Mobile App Filter' Rule enforced
     */
    @ApiStatus.Internal
    public MobileApplicationConfiguration(List<String> mobileAppDeviceTypes, List<String> mobileApplications) {
        this.mobileAppDeviceTypes = mobileAppDeviceTypes;
        this.mobileApplications = mobileApplications;
    }

}
