package com.aston.home.lab.depositservicelab.service;

import com.aston.home.lab.depositservicelab.domain.dto.AccountDTO;
import com.aston.home.lab.depositservicelab.domain.dto.DepositDTO;
import com.aston.home.lab.depositservicelab.domain.entity.Deposit;
import com.aston.home.lab.depositservicelab.domain.mapper.DepositMapper;
import com.aston.home.lab.depositservicelab.integration.BillServiceFeignClient;
import com.aston.home.lab.depositservicelab.repository.DepositRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DepositServiceImpl implements DepositService {

    private final DepositMapper depositMapper;
    private final DepositRepository depositRepository;
    private final BillServiceFeignClient billServiceFeignClient;


    @Override
    public List<DepositDTO> getAllUsersDeposit(String userId) {

        return depositRepository.
                findAll().
                stream().
                filter(a -> a.getUserId().toString().equals(userId)).
                toList().
                stream().
                map(depositMapper::depositToDepositDto).
                toList();
    }

    @Override
    public DepositDTO createUserDeposit(DepositDTO accountDTO) {
        Deposit deposit = depositRepository.save(depositMapper.depositDTOToDeposit(accountDTO));
        return depositMapper.depositToDepositDto(deposit);
    }

    @Override
    public DepositDTO deleteUserDepositId(Long id) {
        Deposit deposit = depositRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));
        depositRepository.deleteById(id);
        return depositMapper.depositToDepositDto(deposit);
    }

    @Override
    public List<AccountDTO> getAllAccountById(UUID userId) {
        System.out.println("!!!!!!!!! "+userId);
        return billServiceFeignClient.getUserAccountsById(userId.toString()) ;
    }
}