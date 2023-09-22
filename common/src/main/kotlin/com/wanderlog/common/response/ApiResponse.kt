package com.wanderlog.common.response

import com.wanderlog.common.error.ErrorMessage
import com.wanderlog.common.error.ErrorType

data class ApiResponse<S> private constructor(
    val result: ResultType,
    val data: S?,
    val error: ErrorMessage? = null
) {
    companion object {
        fun <S> success(data: S): ApiResponse<S> {
            return ApiResponse(ResultType.SUCCESS, data, null)
        }

        fun <S> error(error: ErrorType, errorData: Any? = null): ApiResponse<S> {
            return ApiResponse(ResultType.ERROR, null, ErrorMessage(error, errorData))
        }
    }
}
