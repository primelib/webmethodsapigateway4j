// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.enums;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.processing.Generated;

/**
 * AttributeNameEnum
 * <p>
 * The field name on which needs to be satisfied by the APIs.
 *
 */
@JsonTypeName("AttributeNameEnum")
@Generated(value = "io.github.primelib.primecodegen")
public enum AttributeNameEnum {
    API_DESCRIPTION("API_DESCRIPTION"),
    API_NAME("API_NAME"),
    API_TAG("API_TAG"),
    API_VERSION("API_VERSION"),
    DELETE("DELETE"),
    GET("GET"),
    HEAD("HEAD"),
    METHOD_TAG("METHOD_TAG"),
    PATCH("PATCH"),
    POST("POST"),
    PUT("PUT"),
    RESOURCE_OPERATION_TAG("RESOURCE_OPERATION_TAG"),
    ;

    private final String value;

    AttributeNameEnum(String value) {
        this.value = value;
    }
}
