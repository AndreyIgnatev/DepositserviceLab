package com.aston.home.lab.depositservicelab.integration;

import com.aston.home.lab.depositservicelab.domain.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "bill-service-client")
public interface BillServiceFeignClient {

    @GetMapping("/app/v1/account/user/{userId}")
    List<AccountDTO> getUserAccountsById(@PathVariable("userId") String id);
}
