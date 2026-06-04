package com.example.springboot.postgresql.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot.postgresql.project.entity.Borrower;

public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {

}
