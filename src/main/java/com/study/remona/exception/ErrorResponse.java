package com.study.remona.exception;

import org.springframework.http.HttpStatus;

public record ErrorResponse(
        String code,
        String message,
        HttpStatus httpStatus
) {

    public static ErrorResponse fromErrorCode(ErrorCode errorCode) {
        return new ErrorResponse(errorCode.getCode(), errorCode.getMessage(), errorCode.getHttpStatus());
    }
}
