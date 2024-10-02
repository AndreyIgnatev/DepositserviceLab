package com.aston.home.lab.depositservicelab.domain.dto;

import lombok.Data;

@Data
public class DepositDTO {
    private Long id;
    private String userId;
    private Long cashAccount;
    private Boolean status;
}