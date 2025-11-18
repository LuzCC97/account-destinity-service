package com.bootcampJava.account_destinity_service.repository;

import com.bootcampJava.account_destinity_service.entity.ExternalAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExternalAccountRepository extends JpaRepository<ExternalAccount, String> {
    
    Optional<ExternalAccount> findByExternalAccountIdAndStatus(String externalAccountId, String status);
}
