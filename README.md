# *WebMethodsAPIGateway4J*

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/webmethodsapigateway4j)](https://central.sonatype.com/artifact/io.github.primelib/webmethodsapigateway4j)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/webmethodsapigateway4j/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/webmethodsapigateway4j)

> A java client for the WebMethods API Gateway REST API.

## Installation

```gradle
implementation("io.github.primelib:webmethodsapigateway4j:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/webmethodsapigateway4j).

## Usage

*Consumer Specification Approach*

```java
APIGatewayConsumerApi client = APIGatewayFactory.create(spec -> {
    spec.api(APIGatewayConsumerApi.class);
    spec.baseUrl("http://localhost:5555/rest/apigateway");
    spec.basicAuth(auth -> {
        auth.username("admin");
        auth.password("manage");
    });
});

APIResponsesModel apis = client.getAPIs(spec -> {
    spec.from(0);
    spec.size(100);
});
```

*Parameter Approach*

```java
APIGatewayApi client = APIGatewayFactory.create(spec -> {
    spec.api(APIGatewayApi.class);
    spec.baseUrl("http://localhost:5555/rest/apigateway");
    spec.basicAuth(auth -> {
        auth.username("admin");
        auth.password("manage");
    });
});

APIResponsesModel apis = client.getAPIs(null, 0, 100);
```

**_NOTE:_** The  `Parameter Approach` can break if the API changes. The `Consumer Specification Approach` is more resilient to API changes.

## Links

- [Documentation](https://primelib.github.io)
- [Contribute](https://primelib.github.io/contribution/)

## License

Released under the [MIT License](./LICENSE).
