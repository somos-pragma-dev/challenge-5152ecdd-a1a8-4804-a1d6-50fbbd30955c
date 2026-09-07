package com.example.loanservice.domain

import java.math.BigDecimal
import java.time.LocalDate

data class Loan(
    val id: Long,
    val amount: BigDecimal,
    val interestRate: Double,
    val startDate: LocalDate,
    val endDate: LocalDate
)