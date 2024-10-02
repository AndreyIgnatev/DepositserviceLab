package com.aston.home.lab.depositservicelab.repository;

import com.aston.home.lab.depositservicelab.domain.entity.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, Long> {
}