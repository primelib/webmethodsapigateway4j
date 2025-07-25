// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.webmethodsapigateway4j.enums;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.processing.Generated;

/**
 * ResponseStatusEnum
 * <p>
 * Response status
 *
 */
@JsonTypeName("ResponseStatusEnum")
@Generated(value = "io.github.primelib.primecodegen")
public enum ResponseStatusEnum {
    ACTIVATED("ACTIVATED"),
    CREATED("CREATED"),
    DEACTIVATED("DEACTIVATED"),
    ERROR("ERROR"),
    LOCKED("LOCKED"),
    NOT_FOUND("NOT_FOUND"),
    NO_CONTENT("NO_CONTENT"),
    PUBLISHED("PUBLISHED"),
    SUCCESS("SUCCESS"),
    UNEXPECTED_ERROR("UNEXPECTED_ERROR"),
    UNPUBLISHED("UNPUBLISHED"),
    UPDATED("UPDATED"),
    ;

    private final String value;

    ResponseStatusEnum(String value) {
        this.value = value;
    }
}
