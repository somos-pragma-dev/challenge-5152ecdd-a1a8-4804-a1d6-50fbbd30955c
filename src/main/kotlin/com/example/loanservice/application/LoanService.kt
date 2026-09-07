package com.example.loanservice.application

import com.example.loanservice.domain.Loan
import com.example.loanservice.infrastructure.LoanRepository
import org.springframework.stereotype.Service

@Service
class LoanService(private val loanRepository: LoanRepository) {

    fun createLoan(loan: Loan): Loan {
        if (loan.amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw IllegalArgumentException("Loan amount must be positive")
        }
        if (loan.startDate.isAfter(loan.endDate)) {
            throw IllegalArgumentException("Start date must be before end date")
        }
        return loanRepository.save(loan)
    }
}