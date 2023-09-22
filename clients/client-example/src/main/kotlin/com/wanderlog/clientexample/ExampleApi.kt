package com.wanderlog.clientexample

import com.wanderlog.clientexample.model.ExampleSomeRequest
import com.wanderlog.clientexample.model.ExampleSomeResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "example-api", url = "https://example.com")
internal interface ExampleApi {
    @GetMapping(
        value = ["/some-endpoint"],
        produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun someEndpoint(exampleSomeRequest: ExampleSomeRequest): ExampleSomeResponse
}
