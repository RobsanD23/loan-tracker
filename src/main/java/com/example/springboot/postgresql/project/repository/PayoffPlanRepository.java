package com.example.springboot.postgresql.project.repository;

import com.example.springboot.postgresql.project.entity.PayoffPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayoffPlanRepository extends JpaRepository<PayoffPlan, Integer> {

}
