package dev.jefferson.requestcreditsystem.dto

import dev.jefferson.requestcreditsystem.entity.Credit
import dev.jefferson.requestcreditsystem.entity.Customer
import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "Invalid creditValue") val creditValue: BigDecimal,
    @field:Future val dayFirstOfInstallment: LocalDate,
    @field:Max(value = 48, message = "This numberOfInstallment invalid") val numberOfInstallment: Int,
    @field:NotNull(message = "Invalid customerId") val customerId: Long
) {


    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallment,
        customer = Customer(id = this.customerId)
    )
}
