package com.example.springboot.postgresql.project.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.springboot.postgresql.project.entity.Borrower;
import com.example.springboot.postgresql.project.repository.BorrowerRepository;
import com.example.springboot.postgresql.project.repository.LoanRepository;

@RestController
@RequestMapping("/api/borrowers")
public class BorrowerController {
    private final BorrowerRepository repository;

    BorrowerController(BorrowerRepository repository){
        this.repository = repository;
    }
    //Create POST
    @PostMapping
    public Borrower addBorrower(@RequestBody Borrower borrower){
        return repository.save(borrower);
    }

    // Read (GET ALL) JUST FOR TESTING
    @GetMapping
    public List<Borrower> getAllBorrowers(){
        return repository.findAll();
    }

}
