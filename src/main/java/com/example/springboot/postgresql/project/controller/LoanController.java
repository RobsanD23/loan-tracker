package com.example.springboot.postgresql.project.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.springboot.postgresql.project.entity.Loan;
import com.example.springboot.postgresql.project.repository.LoanRepository;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    private final LoanRepository repository;

    LoanController(LoanRepository repository){
        this.repository = repository;
    }

    //Create POST
    @PostMapping
    public Loan addLoan(@RequestBody Loan loan){
        return repository.save(loan);
    }
    @GetMapping
    public List<Loan> getLoans(){return repository.findAll();}


}
