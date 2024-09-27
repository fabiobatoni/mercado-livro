package com.mercadolivro.controller

import com.mercadolivro.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customers")
class CustomerController {
    @GetMapping
    fun getCustomer(): CustomerModel {
        return CustomerModel("1", "Fabio", "fabio_teste@hotmail.com")
    }
}