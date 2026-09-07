package com.example.loanservice

import com.example.loanservice.application.LoanService
import com.example.loanservice.domain.Loan
import com.example.loanservice.infrastructure.LoanRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
class LoanServiceTest {

    @MockBean
    lateinit var loanRepository: LoanRepository

    @Autowired
    lateinit var loanService: LoanService

    @Test
    fun `createLoan should save loan and return it`() {
        val loan = Loan(1, BigDecimal(1000), 5.0, LocalDate.now(), LocalDate.now().plusYears(1))
        `when`(loanRepository.save(loan)).thenReturn(loan)
        val savedLoan = loanService.createLoan(loan)
        assertEquals(loan, savedLoan)
    }
}