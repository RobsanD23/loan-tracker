package com.example.springboot.postgresql.project.repository;

import com.example.springboot.postgresql.project.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
