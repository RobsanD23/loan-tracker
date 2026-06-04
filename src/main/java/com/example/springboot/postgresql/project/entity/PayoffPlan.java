package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

@Entity
public class PayoffPlan {
    @GeneratedValue
    @Id
    private long payplanID;

    protected PayoffPlan() {}
}
