package com.study.remona.dto;

import jakarta.annotation.Nullable;

public record ApiResult<T>(
        @Nullable T result
) {
    public static <T> ApiResult<T> from(T result) {
        return new ApiResult<>(result);
    }
}
