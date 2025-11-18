package com.bootcampJava.account_destinity_service.controller;

import com.bootcampJava.account_destinity_service.dto.ExternalAccountResponse;
import com.bootcampJava.account_destinity_service.service.ExternalAccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accountDestiny")
public class ExternalAccountController {

    private final ExternalAccountService externalAccountService;

    public ExternalAccountController(ExternalAccountService externalAccountService) {
        this.externalAccountService = externalAccountService;
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<ExternalAccountResponse> validateAccount(
            @PathVariable String accountId) {
        
        ExternalAccountResponse response = externalAccountService.validateAndGetAccount(accountId);
        return ResponseEntity.ok(response);
    }
}
