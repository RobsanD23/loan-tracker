package com.example.springboot.postgresql.project.dto;

import java.math.BigDecimal;

public class LoanDTO {
    private Long id;
    private BigDecimal balance;
    private String status;
    private Float rate;

    public LoanDTO(Long id, BigDecimal balance, String status, Float rate){
        this.id = id;
        this.balance = balance;
        this.status = status;
        this.rate = rate;
    }

    public Long getId(){return id;}
    public BigDecimal getBalance(){return balance;}
    public String getStatus(){return status;}
    public Float getRate(){return rate;}
}
