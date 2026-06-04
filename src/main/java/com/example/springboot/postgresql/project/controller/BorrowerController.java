package com.example.springboot.postgresql.project.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.springboot.postgresql.project.entity.Borrower;
import com.example.springboot.postgresql.project.repository.BorrowerRepository;

@RestController
@RequestMapping("/borrowers")
public class BorrowerController {
    private final BorrowerRepository repository;

    BorrowerController(BorrowerRepository repository){
        this.repository = repository;
    }
    //Create POST
    public Borrower addBorrower(@RequestBody Borrower borrower){
        return repository.save(borrower);
    }

    // Read (GET ALL)
    @GetMapping
    public List<Borrower> getAllBorrowers(){
        return repository.findAll();
    }
}
