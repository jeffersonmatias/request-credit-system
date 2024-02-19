package dev.jefferson.requestcreditsystem.dto

import dev.jefferson.requestcreditsystem.entity.Credit
import dev.jefferson.requestcreditsystem.enummeration.Status
import java.math.BigDecimal
import java.util.UUID

data class CreditsView(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfInstallment: Int,
    val status: Status,
    val emailCustomer: String?,
    val incomeCustomer: BigDecimal?
) {

    constructor(credit: Credit) : this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallment = credit.numberOfInstallments,
        status = credit.status,
        emailCustomer = credit.customer?.email,
        incomeCustomer = credit.customer?.income
    )
}
