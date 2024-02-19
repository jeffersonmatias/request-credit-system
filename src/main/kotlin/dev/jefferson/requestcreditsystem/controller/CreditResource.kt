package dev.jefferson.requestcreditsystem.controller

import dev.jefferson.requestcreditsystem.dto.CreditDto
import dev.jefferson.requestcreditsystem.dto.CreditViewList
import dev.jefferson.requestcreditsystem.dto.CreditsView
import dev.jefferson.requestcreditsystem.entity.Credit
import dev.jefferson.requestcreditsystem.service.impl.CreditService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID
import java.util.stream.Collectors

@RestController
@RequestMapping("/api/credits")
class CreditResource(
    private val creditsService: CreditService
) {
    @PostMapping
    fun saveCredit(@RequestBody @Valid creditDto: CreditDto): ResponseEntity<String> {
        val credit: Credit = this.creditsService.save(creditDto.toEntity())
        return ResponseEntity.status(HttpStatus.CREATED)
            .body("credit ${credit.creditCode} - Customer ${credit.customer?.firstName} ${credit.customer?.lastName} saved!")
    }

    @GetMapping
    fun findAllByCustomerId(@RequestParam(value = "customerId") customerId: Long): ResponseEntity<List<CreditViewList>> {
        val creditViewList: List<CreditViewList> = this.creditsService.findAllByCustomer(customerId).stream()
            .map { credit: Credit -> CreditViewList(credit) }.collect(Collectors.toList())
        return ResponseEntity.status(HttpStatus.OK).body(creditViewList)
    }

    @GetMapping("/{creditCode}")
    fun findByCreditCode(
        @RequestParam(value = "customerId") customerId: Long,
        @PathVariable creditCode: UUID
    ): ResponseEntity<CreditsView> {
        val credit: Credit = this.creditsService.findByCreditCode(customerId, creditCode)
        return ResponseEntity.status(HttpStatus.OK).body(CreditsView(credit))
    }


}