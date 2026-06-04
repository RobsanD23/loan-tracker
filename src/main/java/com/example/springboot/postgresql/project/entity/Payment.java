package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

@Entity
public class Payment {
    @GeneratedValue
    @Id
    private long paymentID;

    protected Payment(){}
}
