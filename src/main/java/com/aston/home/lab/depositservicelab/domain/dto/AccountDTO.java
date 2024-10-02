package com.aston.home.lab.depositservicelab.domain.dto;

public record AccountDTO(
        Long id,
        String userId,
        Long cashAccount,
        Boolean status) {
}
