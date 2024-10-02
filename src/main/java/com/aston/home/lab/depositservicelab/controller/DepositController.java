package com.aston.home.lab.depositservicelab.controller;

import com.aston.home.lab.depositservicelab.domain.dto.AccountDTO;
import com.aston.home.lab.depositservicelab.domain.dto.DepositDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@RequestMapping("/app/v1/deposit")
public interface DepositController {

    @GetMapping("/user/{userId}")
    public List<DepositDTO> getAllUsersDeposits(@PathVariable String userId);

    @PostMapping
    public DepositDTO createUserDeposit(@RequestBody DepositDTO depositDTO);

    @DeleteMapping("/user/{id}")
    public DepositDTO deleteUserDeposit(@PathVariable Long id);

    @GetMapping("/{userId}/accounts")
    List<AccountDTO> getAllAccountById(@PathVariable UUID userId);
}