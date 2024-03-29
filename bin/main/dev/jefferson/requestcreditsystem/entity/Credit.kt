package dev.jefferson.requestcreditsystem.entity

import dev.jefferson.requestcreditsystem.enummeration.Status
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

@Entity
//@Table(name = "Credito")
data class Credit(
    @Column(nullable = false, unique = true) val creditCode: UUID = UUID.randomUUID(),
    @Column(nullable = false) val creditValue: BigDecimal = BigDecimal.ZERO,
    @Column(nullable = false) val dayFirstInstallment: LocalDate,
    @Column(nullable = false) val numberOfInstallments: Int = 0,
    @Enumerated val status: Status = Status.IN_OPROGRESS,
    @ManyToOne val customer: Customer? = null,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null
)
