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
 * PortalGatewayCommunitiesData
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
    "communities",
    "provider"
})
@JsonTypeName("PortalGatewayCommunitiesData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PortalGatewayCommunitiesData {

    @JsonProperty("communities")
    protected PortalGatewayData communities;

    /**
     * The API Portal destination configuration name
     */
    @JsonProperty("provider")
    protected String provider;

    /**
     * Constructs a validated instance of {@link PortalGatewayCommunitiesData}.
     *
     * @param spec the specification to process
     */
    public PortalGatewayCommunitiesData(Consumer<PortalGatewayCommunitiesData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PortalGatewayCommunitiesData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PortalGatewayCommunitiesData(Consumer)} instead.
     * @param communities var.name
     * @param provider The API Portal destination configuration name
     */
    @ApiStatus.Internal
    public PortalGatewayCommunitiesData(PortalGatewayData communities, String provider) {
        this.communities = communities;
        this.provider = provider;
    }

}
