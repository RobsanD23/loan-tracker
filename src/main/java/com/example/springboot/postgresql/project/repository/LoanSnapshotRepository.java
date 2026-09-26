package com.example.springboot.postgresql.project.repository;

import com.example.springboot.postgresql.project.entity.LoanSnapshot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanSnapshotRepository extends JpaRepository<LoanSnapshot, Integer> {

}
