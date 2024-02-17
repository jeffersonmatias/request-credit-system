package dev.jefferson.requestcreditsystem.service.impl

import dev.jefferson.requestcreditsystem.entity.Customer
import dev.jefferson.requestcreditsystem.repository.CustomerRepository
import dev.jefferson.requestcreditsystem.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {
    override fun save(customer: Customer): Customer = this.customerRepository.save(customer)

    override fun findById(id: Long): Customer = this.customerRepository.findById(id)
        .orElseThrow { throw RuntimeException("Id $id not found") }

    override fun delete(id: Long) = this.customerRepository.deleteById(id)

}