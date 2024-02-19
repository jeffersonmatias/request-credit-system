package dev.jefferson.requestcreditsystem.dto

import dev.jefferson.requestcreditsystem.entity.Customer
import dev.jefferson.requestcreditsystem.entity.Address
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDto(
    @field:NotEmpty(message = "Invalid firstName") val firstName: String,
    @field:NotEmpty(message = "Invalid lastName") val lastName: String,
    @field:NotEmpty(message = "Invalid input")
    @field:CPF(message = "This invalid CPF") val cpf: String,
    @field:NotNull(message = "Invalid income") val income: BigDecimal,
    @field:Email(message = "Invalid Email")
    @field:NotEmpty(message = "Invalid input") val email: String,
    @field:NotEmpty(message = "Invalid password") val password: String,
    @field:NotEmpty(message = "Invalid zipCode") val zipCode: String,
    @field:NotEmpty(message = "Invalid street") val street: String
) {


    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipCode, street = this.street
        )


    )
}
