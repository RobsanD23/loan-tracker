package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class LoanSnapshot {
    @Id
    @GeneratedValue
    private long snapshotID;

    @ManyToOne
    private Loan loan;

    @Column
    private BigDecimal balance;

    @Column
    private String snapshot_date;


    protected LoanSnapshot(){}

    public LoanSnapshot(Loan loan, BigDecimal balance, String snapshot_date){
        this.loan = loan;
        this.balance = balance;
        this.snapshot_date = snapshot_date;
    }

    public Loan getLoan(){return loan;}
    public void setLoan(Loan loan){this.loan = loan;}

    public BigDecimal getBalance(){return balance;}
    public void setBalance(BigDecimal balance){this.balance = balance;}

    public String getDate(){return snapshot_date;}
    public void setDate(String date){this.snapshot_date = date;}

}
