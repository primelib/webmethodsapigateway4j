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
 * MockService
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
    "enableMock",
    "runAsUser",
    "service"
})
@JsonTypeName("MockService")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MockService {

    @JsonProperty("enableMock")
    protected Boolean enableMock;

    @JsonProperty("runAsUser")
    protected String runAsUser;

    @JsonProperty("service")
    protected String service;

    /**
     * Constructs a validated instance of {@link MockService}.
     *
     * @param spec the specification to process
     */
    public MockService(Consumer<MockService> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MockService}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MockService(Consumer)} instead.
     * @param enableMock enableMock
     * @param runAsUser runAsUser
     * @param service service
     */
    @ApiStatus.Internal
    public MockService(Boolean enableMock, String runAsUser, String service) {
        this.enableMock = enableMock;
        this.runAsUser = runAsUser;
        this.service = service;
    }

}
