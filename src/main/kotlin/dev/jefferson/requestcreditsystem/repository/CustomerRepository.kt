package dev.jefferson.requestcreditsystem.repository

import dev.jefferson.requestcreditsystem.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long>