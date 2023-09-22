package com.wanderlog.common.error

import org.springframework.boot.logging.LogLevel
import org.springframework.http.HttpStatus

enum class ErrorType(val status: HttpStatus, val code: ErrorCode, val message: String, val level: LogLevel) {
    COMMON_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, ErrorCode.E5000, "처리 중 오류가 발생했습니다.", LogLevel.ERROR),
}
