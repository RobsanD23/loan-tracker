package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Payment {
    @GeneratedValue
    @Id
    private long paymentID;

    @ManyToOne
    private Loan loan;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private String paid_date;

    @Column
    private String pay_method;

    @Column
    private String status;

    protected Payment(){}

    public Payment(Loan loan, BigDecimal amount, String paid_date, String pay_method, String status){
        this.loan = loan;
        this.amount = amount;
        this.paid_date = paid_date;
        this.pay_method = pay_method;
        this.status = status;
    }
    public Loan getLoan(){return loan;}
    public void setLoan(Loan loan){this.loan = loan;}

    public BigDecimal getAmount(){return amount;}
    public void setAmount(BigDecimal amount){this.amount = amount;}

    public String getPaidDate(){return paid_date;}
    public void setPaidDate(String paid_date){this.paid_date = paid_date;}

    public String getPayMethod(){return pay_method;}
    public void setPayMethod(String pay_method){this.pay_method = pay_method;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}

}
