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
 * MockService
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enableMock",
    "runAsUser",
    "service"
})
@JsonTypeName("MockService")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MockService {

    /**
     * Constructs a validated implementation of {@link MockService}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MockService(Consumer<MockService> spec) {
        spec.accept(this);
    }

    @JsonProperty("enableMock")
    protected Boolean enableMock;

    @JsonProperty("runAsUser")
    protected String runAsUser;

    @JsonProperty("service")
    protected String service;


}
