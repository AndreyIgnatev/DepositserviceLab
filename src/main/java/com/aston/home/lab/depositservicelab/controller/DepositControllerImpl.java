package com.aston.home.lab.depositservicelab.controller;


import com.aston.home.lab.depositservicelab.domain.dto.AccountDTO;
import com.aston.home.lab.depositservicelab.domain.dto.DepositDTO;
import com.aston.home.lab.depositservicelab.service.DepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class DepositControllerImpl implements DepositController {

    private final DepositService depositService;

    @Override
    public List<DepositDTO> getAllUsersDeposits(String userId) {
        return depositService.getAllUsersDeposit(userId);
    }

    @Override
    public DepositDTO createUserDeposit(DepositDTO depositDTO) {
        return depositService.createUserDeposit(depositDTO);
    }

    @Override
    public DepositDTO deleteUserDeposit(Long id) {
        return depositService.deleteUserDepositId(id);
    }

    @Override
    public List<AccountDTO> getAllAccountById(UUID userId) {
        return depositService.getAllAccountById(userId);
    }
}