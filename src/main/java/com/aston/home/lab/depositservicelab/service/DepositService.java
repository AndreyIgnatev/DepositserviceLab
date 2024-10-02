package com.aston.home.lab.depositservicelab.service;

import com.aston.home.lab.depositservicelab.domain.dto.AccountDTO;
import com.aston.home.lab.depositservicelab.domain.dto.DepositDTO;

import java.util.List;
import java.util.UUID;

public interface DepositService {

    List<DepositDTO> getAllUsersDeposit(String userId);

    DepositDTO createUserDeposit(DepositDTO accountDTO);

    DepositDTO deleteUserDepositId(Long id);

    List<AccountDTO> getAllAccountById(UUID userId);
}
