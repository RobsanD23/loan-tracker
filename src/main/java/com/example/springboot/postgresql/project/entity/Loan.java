package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Columns;

@Entity
public class Loan {
    @GeneratedValue
    @Id
    private long loanID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrower_borrowerid")
    private Borrower borrower;

    @ManyToOne
    private Lender lender;

    @Column
    private String loan_type;

    @Column
    private float rate;

    @Column
    private float og_balance;

    @Column
    private float curr_balance;

    @Column
    private float min_payment;

    @Column
    private String due_date;

    @Column
    private String status;



    protected Loan(){}

    public long getLoanID() {return loanID;}

    public Borrower getBorrower(){return borrower;}
    public void setBorrower(Borrower borrower){this.borrower = borrower;}

    public Lender getLender(){return lender;}
    public void setLender(Lender lender){this.lender = lender;}

    public String getLoanType(){return loan_type;}
    public void setLoanType(String loan_type){this.loan_type = loan_type;}

    public float getRate(){return rate;}
    public void setRate(float rate){this.rate = rate;}

    public float getCurrBalance(){return curr_balance;}
    public void setCurrBalance(float curr_balance){this.curr_balance = curr_balance;}

    public float getOgBalance(){return og_balance;}
    public void setOgBalance(float og_balance){this.og_balance = og_balance;}

    public float getMinPayment(){return min_payment;}
    public void setMinPayment(float min_payment){this.min_payment = min_payment;}

    public String getDueDate(){return due_date;}
    public void setDueDate(String due_date){this.due_date = due_date;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}
}
