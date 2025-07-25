// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.micrometer.MicrometerCapability;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import io.github.primelib.primecodegenlib.java.feign.common.capabilities.PrimeCapability;
import io.github.primelib.primecodegenlib.java.feign.common.interceptor.AuthInterceptor;
import io.github.primelib.webmethodsapigateway4j.client.WebMethodsAPIGatewayClientApi;
import io.github.primelib.webmethodsapigateway4j.client.WebMethodsAPIGatewayClientConsumerApi;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Credentials;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Slf4j
@Generated(value = "io.github.primelib.primecodegen")
public class WebMethodsAPIGatewayClientFactory {
    public static <T> T create(Consumer<WebMethodsAPIGatewayClientFactorySpec<T>> spec) {
        WebMethodsAPIGatewayClientFactorySpec<T> config = new WebMethodsAPIGatewayClientFactorySpec<>(spec);

        if (config.api().isInterface()) {
            return buildClient(spec);
        }
        if (config.api() == WebMethodsAPIGatewayClientConsumerApi.class) {
            return (T) WebMethodsAPIGatewayClientFactory.buildConsumerClient(WebMethodsAPIGatewayClientConsumerApi.class, WebMethodsAPIGatewayClientApi.class, (WebMethodsAPIGatewayClientFactorySpec<WebMethodsAPIGatewayClientConsumerApi>) config);
        }

        throw new IllegalArgumentException("api must be an compatible interface or consumer class");
    }

    public static WebMethodsAPIGatewayClientApi create() {
        return create(spec -> spec.api(WebMethodsAPIGatewayClientApi.class));
    }

    private static <T, U> T buildConsumerClient(Class<T> consumerApiClass, Class<U> apiClass, WebMethodsAPIGatewayClientFactorySpec<T> config) {
        try {
            U api = buildClient(s -> {
                s.api(apiClass);
                s.applySpec(config);
            });
            return consumerApiClass.getConstructor(apiClass).newInstance(api);
        } catch (Exception ex) {
            throw new IllegalArgumentException("API must have a constructor with one parameter of type " + apiClass.getSimpleName(), ex);
        }
    }

    private static <T> T buildClient(Consumer<WebMethodsAPIGatewayClientFactorySpec<T>> spec) {
        WebMethodsAPIGatewayClientFactorySpec<T> config = new WebMethodsAPIGatewayClientFactorySpec<>(spec);

        // http client
        okhttp3.OkHttpClient.Builder clientBuilder = new okhttp3.OkHttpClient.Builder();
        if (config.proxy() != null && config.proxy().type() != Proxy.Type.DIRECT) {
            clientBuilder.proxy(new Proxy(config.proxy().type(), new InetSocketAddress(config.proxy().host(), config.proxy().port())));
            if (config.proxy().username() != null || config.proxy().password() != null) {
                clientBuilder.proxyAuthenticator((route, response) -> {
                    return response.request().newBuilder()
                            .header("Proxy-Authorization", Credentials.basic(config.proxy().username(), new String(config.proxy().password())))
                            .build();
                });
            }
        }

        // insecure
        if (config.insecure()) {
            try {
                TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {}

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {}

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
                };

                SSLContext sslContext = SSLContext.getInstance("SSL");
                sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

                clientBuilder.hostnameVerifier((hostname, session) -> true);
                clientBuilder.sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustAllCerts[0]);
            } catch (Exception ex) {
                throw new RuntimeException("failed to configure insecure mode", ex);
            }
        }

        // objectMapper
        JsonMapper.Builder objectMapperBuilder = JsonMapper.builder()
                .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
                .enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .propertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .addModule(new JavaTimeModule());
        config.extensions().forEach(extension -> extension.customizeObjectMapper(objectMapperBuilder));
        ObjectMapper objectMapper = objectMapperBuilder.build();

        // builder
        return Feign.builder()
                .client(new OkHttpClient(clientBuilder.build()))
                .encoder(new JacksonEncoder(objectMapper))
                .decoder(new JacksonDecoder(objectMapper))
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.valueOf(config.logLevel().toUpperCase()))
                .addCapability(new MicrometerCapability(config.meterRegistry()))
                .addCapability(new PrimeCapability(config.backendName(), config.extensions()))
                .requestInterceptor(new AuthInterceptor(config.auth()))
                .decodeVoid()
                .target(config.api(), config.baseUrl());
    }
}
