package dev.jefferson.requestcreditsystem.service

import dev.jefferson.requestcreditsystem.entity.Customer

interface ICustomerService {

    fun save(customer: Customer): Customer

    fun findById(id: Long): Customer

    fun delete(id: Long)
}