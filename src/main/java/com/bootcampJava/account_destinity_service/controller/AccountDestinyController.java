package com.bootcampJava.account_destinity_service.controller;

import com.bootcampJava.account_destinity_service.dto.AccountInfo;
import com.bootcampJava.account_destinity_service.service.AccountDestinyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accountDestinity")
public class AccountDestinyController {

    private final AccountDestinyService accountDestinyService;

    public AccountDestinyController(AccountDestinyService accountDestinyService) {
        this.accountDestinyService = accountDestinyService;
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<AccountInfo> getAccountDestiny(@PathVariable String accountId) {

        AccountInfo info = accountDestinyService.validateAccount(accountId);

        if (info == null) {
            // equivale al 404 que pusiste en el swagger
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(info);
    }
}

