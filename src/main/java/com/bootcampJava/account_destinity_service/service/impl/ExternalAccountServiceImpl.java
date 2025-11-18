package com.bootcampJava.account_destinity_service.service.impl;

import com.bootcampJava.account_destinity_service.dto.ExternalAccountResponse;
import com.bootcampJava.account_destinity_service.entity.ExternalAccount;
import com.bootcampJava.account_destinity_service.exception.ResourceNotFoundException;
import com.bootcampJava.account_destinity_service.mapper.ExternalAccountMapper;
import com.bootcampJava.account_destinity_service.repository.ExternalAccountRepository;
import com.bootcampJava.account_destinity_service.service.ExternalAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ExternalAccountServiceImpl implements ExternalAccountService {

    private final ExternalAccountRepository externalAccountRepository;
    private final ExternalAccountMapper externalAccountMapper;

    @Override
    @Transactional(readOnly = true)
    public ExternalAccountResponse validateAndGetAccount(String accountId) {
        ExternalAccount externalAccount = externalAccountRepository
                .findByExternalAccountIdAndStatus(accountId, "ACTIVE")
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Cuenta destino no encontrada o inactiva con ID: " + accountId));

        return externalAccountMapper.toExternalAccountResponse(externalAccount);
    }
}
