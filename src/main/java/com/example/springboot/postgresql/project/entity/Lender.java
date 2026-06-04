package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

@Entity
public class Lender {
    @GeneratedValue
    @Id
    private long lenderID;

    @Column(nullable = false)
    private String name;

    protected Lender(){}

    public Lender(String name){
        this.name = name;
    }

    public long getLenderID(){return lenderID;}

    public String getLenderName(){return name;}
    public void setLenderName(String name){this.name = name;}
}
