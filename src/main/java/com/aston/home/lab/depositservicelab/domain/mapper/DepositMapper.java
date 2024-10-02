package com.aston.home.lab.depositservicelab.domain.mapper;


import com.aston.home.lab.depositservicelab.domain.dto.DepositDTO;
import com.aston.home.lab.depositservicelab.domain.entity.Deposit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepositMapper {

    @Mapping(target = "id", source = "deposit.id")
    @Mapping(target = "userId", expression = "java(deposit.getUserId().toString())") // Исправляем доступ к userId
    @Mapping(target = "cashAccount", source = "deposit.cashAccount")
    @Mapping(target = "status", source = "deposit.status")
    DepositDTO depositToDepositDto(Deposit deposit);

    @Mapping(target = "id", source = "depositDTO.id")
    @Mapping(target = "userId", expression = "java(java.util.UUID.fromString(depositDTO.getUserId()))") // Исправляем доступ к userId
    @Mapping(target = "cashAccount", source = "depositDTO.cashAccount")
    @Mapping(target = "status", source = "depositDTO.status")
    Deposit depositDTOToDeposit(DepositDTO depositDTO);
}
