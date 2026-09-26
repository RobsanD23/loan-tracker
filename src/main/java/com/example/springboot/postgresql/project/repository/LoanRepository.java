package com.example.springboot.postgresql.project.repository;

import com.example.springboot.postgresql.project.entity.Borrower;
import com.example.springboot.postgresql.project.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.ArrayList;
import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
