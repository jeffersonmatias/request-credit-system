package dev.jefferson.requestcreditsystem.service.impl

import dev.jefferson.requestcreditsystem.entity.Customer
import dev.jefferson.requestcreditsystem.exception.BusinessException
import dev.jefferson.requestcreditsystem.repository.CustomerRepository
import dev.jefferson.requestcreditsystem.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
) : ICustomerService {
    override fun save(customer: Customer): Customer = this.customerRepository.save(customer)

    override fun findById(id: Long): Customer = this.customerRepository.findById(id)
        .orElseThrow { throw BusinessException("Id $id not found") }

    override fun delete(id: Long) {
        val customer: Customer = this.findById(id)
        this.customerRepository.delete(customer)
    }
}