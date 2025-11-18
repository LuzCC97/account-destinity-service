package com.bootcampJava.account_destinity_service.service;

import com.bootcampJava.account_destinity_service.dto.ExternalAccountResponse;

public interface ExternalAccountService {
    ExternalAccountResponse validateAndGetAccount(String accountId);
}
