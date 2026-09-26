package com.example.springboot.postgresql.project.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Borrower {
    @GeneratedValue
    @Id
    private long borrowerID;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(nullable = false)
    private String email;


    protected Borrower(){}

    public Borrower(String first_name, String last_name, String email, List<Loan> loans){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public long getBorrowerID(){return borrowerID;}

    public String getFirstName(){return first_name;}
    public void setFirstName(String firstName){this.first_name = firstName;}

    public String getLastName(){return last_name;}
    public void setLastName(String last_name){this.last_name = last_name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

}
