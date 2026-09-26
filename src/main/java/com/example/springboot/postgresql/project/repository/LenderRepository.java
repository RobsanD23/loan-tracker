package com.example.springboot.postgresql.project.repository;

import com.example.springboot.postgresql.project.entity.Lender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LenderRepository extends JpaRepository<Lender, Integer> {

}
