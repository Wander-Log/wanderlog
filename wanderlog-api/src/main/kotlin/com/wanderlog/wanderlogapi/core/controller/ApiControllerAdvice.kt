package com.wanderlog.wanderlogapi.core.controller

import com.wanderlog.common.error.ErrorType
import com.wanderlog.common.response.ApiResponse
import jakarta.servlet.http.HttpServletRequest
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiControllerAdvice {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @ExceptionHandler(Exception::class)
    fun handleException(
        e: Exception,
        request: HttpServletRequest,
    ): ResponseEntity<ApiResponse<Any>> {
        val errorType = ErrorType.COMMON_ERROR
        log.error("Exception : {}", e.message, e)
        return ResponseEntity(ApiResponse.error(errorType, e.message), errorType.status)
    }
}
