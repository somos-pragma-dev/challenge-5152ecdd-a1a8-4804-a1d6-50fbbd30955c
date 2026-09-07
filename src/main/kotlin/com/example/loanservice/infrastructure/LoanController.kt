package com.example.loanservice.infrastructure

import com.example.loanservice.application.LoanService
import com.example.loanservice.domain.Loan
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/loans")
class LoanController(private val loanService: LoanService) {

    @PostMapping
    fun createLoan(@RequestBody loan: Loan): ResponseEntity<Loan> {
        val createdLoan = loanService.createLoan(loan)
        return ResponseEntity(createdLoan, HttpStatus.CREATED)
    }
}