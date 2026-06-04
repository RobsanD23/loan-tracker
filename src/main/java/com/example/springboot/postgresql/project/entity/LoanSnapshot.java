package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

@Entity
public class LoanSnapshot {
    @Id
    @GeneratedValue
    private long snapShotID;

    protected LoanSnapshot(){}
}
