package com.wanderlog.clientexample

import com.wanderlog.clientexample.model.ExampleSomeRequest
import com.wanderlog.clientexample.model.ExampleSomeResponse
import org.springframework.stereotype.Component

@Component
class ExampleClient internal constructor(
    private val exampleApi: ExampleApi,
) {
    fun someRequest(someField: String): ExampleSomeResponse {
        val request = ExampleSomeRequest(someField)
        return exampleApi.someEndpoint(request)
    }
}
