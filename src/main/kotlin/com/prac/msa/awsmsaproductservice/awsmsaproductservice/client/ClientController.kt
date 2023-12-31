package com.prac.msa.awsmsaproductservice.awsmsaproductservice.client

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientController(
    private val clientService: ClientService
) {

    @GetMapping("/products/{productId}/exists")
    fun isProductExists(
        @PathVariable productId: Long
    ): Boolean {
        return clientService.isProductExists(productId)
    }

    @GetMapping("/products/name")
    fun getProductNamesByProductIds(
        @RequestParam productIds: List<Long>
    ): List<Pair<Long, String>> {
        return clientService.getProductNamesByProductIds(productIds)
    }
}