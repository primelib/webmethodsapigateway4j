# WebMethods API Gateway Client

A java http client library for WebMethods API Gateway Client.

## Installation

```
implementation("io.github.primelib:webmethodsapigateway4j:<version>")
```

## Usage

**Create client instances using the factory, you can choose different interfaces by changing the `api` parameter.**

```java
WebMethodsAPIGatewayClientApi client = WebMethodsAPIGatewayClientFactory.create(spec -> {
    spec.api(WebMethodsAPIGatewayClientApi.class);
    spec.baseUrl("http://localhost:5555/rest/apigateway");
    spec.basicAuth(auth -> {
        auth.username("<admin>");
        auth.password("<password>");
    });
    //spec.meterRegistry(meterRegistry);
    //spec.logLevel("FULL");
});
```


## License

This project is licensed under the [MIT](https://github.com/primelib/webmethods-api-gateway-client/blob/main/LICENSE) license.
