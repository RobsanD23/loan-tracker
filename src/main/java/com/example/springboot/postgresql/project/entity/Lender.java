package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;

@Entity
public class Lender {
    @GeneratedValue
    @Id
    private long lenderID;

    @Column(nullable = false)
    private String name;

    @Column
    private String website;

    @Column
    private String phone;

    protected Lender(){}

    public Lender(String name, String website, String phone) {
        this.name = name;
        this.website = website;
        this.phone = phone;
    }

    public long getLenderID(){return lenderID;}

    public String getLenderName(){return name;}
    public void setLenderName(String name){this.name = name;}

    public String getWebsite(){return website;}
    public void setWebsite(){this.website = website;}

    public String getPhone(){return phone;}
    public void setPhone(String phone){this.phone = phone;}
}
