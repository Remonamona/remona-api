package com.study.remona.exception;

import lombok.Getter;

@Getter
public class RemonaException extends RuntimeException {

    private final ErrorCode errorCode;

    public RemonaException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
