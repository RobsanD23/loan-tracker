package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

@Entity
public class Loan {
    @GeneratedValue
    @Id
    private long loanID;

    protected Loan(){}


}
