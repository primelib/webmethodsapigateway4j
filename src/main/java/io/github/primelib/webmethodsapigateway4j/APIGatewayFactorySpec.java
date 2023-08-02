package io.github.primelib.webmethodsapigateway4j;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;

import io.github.primelib.webmethodsapigateway4j.api.APIGatewayApi;
import io.github.primelib.webmethodsapigateway4j.auth.BasicAuthSpec;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;

import io.github.primelib.primecodegenlib.java.feign.common.api.AuthMethod;
import io.github.primelib.primecodegenlib.java.feign.common.config.FeignModuleSpec;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * A specification to construct a {@link APIGatewayApi} instance.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public final class APIGatewayFactorySpec<T> extends FeignModuleSpec<APIGatewayFactorySpec<T>> {

    /**
     * The name of the backend to use
     */
    @NotNull
    private String backendName = "webmethodsapigateway4j";

    /**
     * The API interface to use
     */
    @NotNull
    private Class<T> api;

    /**
     * The api base URL
     */
    @NotNull
    private String baseUrl = "http://localhost:5555/rest/apigateway";

    /**
     * The authentication methods to use
     */
    @Nullable
    private List<AuthMethod> auth = new ArrayList<>(5);

    /**
     * MeterRegistry to use for metrics
     */
    @NotNull
    private MeterRegistry meterRegistry = new CompositeMeterRegistry();

    /**
     * the feign log level
     * <p>
     * Defaults to {@code none}.
     * Allowed values are: {@code none}, {@code basic}, {@code headers}, {@code full}
     */
    @NotNull
    private String logLevel = "none";

    /**
     * Constructs a validated implementation of {@link APIGatewayApi}.
     *
     * @param spec the specification to process
     */
    @NotNull
    public APIGatewayFactorySpec(@NotNull Consumer<APIGatewayFactorySpec<T>> spec) {
        spec.accept(this);
        validate();
    }

    /**
     * Ensures the configured specification is valid.
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(backendName, "backendName must not be null");
        Objects.requireNonNull(api, "api must not be null");
        Objects.requireNonNull(baseUrl, "baseUrl must not be null");
        if (baseUrl.isEmpty()) {
            throw new IllegalArgumentException("baseUrl must not be empty");
        }
        Objects.requireNonNull(logLevel, "logLevel must not be null");
    }

    public BasicAuthSpec basicAuth(Consumer<BasicAuthSpec> spec) {
        BasicAuthSpec method = new BasicAuthSpec(spec);
        auth.add(method);
        return method;
    }

    public void applySpec(APIGatewayFactorySpec<?> spec) {
        backendName(spec.backendName());
        baseUrl(spec.baseUrl());
        auth(spec.auth());
        proxy = spec.proxy();
        meterRegistry(spec.meterRegistry());
    }
}
