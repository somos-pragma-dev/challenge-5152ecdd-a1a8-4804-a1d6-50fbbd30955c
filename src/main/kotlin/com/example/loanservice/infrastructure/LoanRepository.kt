package com.example.loanservice.infrastructure

import com.example.loanservice.domain.Loan
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LoanRepository : CrudRepository<Loan, Long> {
}