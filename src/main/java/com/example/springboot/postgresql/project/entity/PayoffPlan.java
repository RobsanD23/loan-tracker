package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class PayoffPlan {
    @GeneratedValue
    @Id
    private long payplanID;

    @OneToOne
    private Loan loan;

    @Column
    private String est_payoff_date;

    @Column
    private BigDecimal projected_interest;

    protected PayoffPlan() {}

    public PayoffPlan(Loan loan, String est_payoff_date, BigDecimal projected_interest){
        this.loan = loan;
        this.est_payoff_date = est_payoff_date;
        this.projected_interest = projected_interest;
    }
    public Loan getLoan(){return loan;}
    public void setLoan(Loan loan){this.loan = loan;}

    public String getEstPayoffDate(){return est_payoff_date;}
    public void setEstPayoffDate(String est_payoff_date){this.est_payoff_date = est_payoff_date;}

    public BigDecimal getProjectedInterest(){return projected_interest;}
    public void setProjectedInterest(BigDecimal projected_interest){this.projected_interest = projected_interest;}
}
