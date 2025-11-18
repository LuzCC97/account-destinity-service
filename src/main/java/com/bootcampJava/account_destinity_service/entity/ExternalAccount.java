package com.bootcampJava.account_destinity_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "external_accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalAccount {
    
    @Id
    @Column(name = "external_account_id", length = 30, nullable = false)
    private String externalAccountId;
    
    @Column(name = "currency", length = 10, nullable = false)
    private String currency;
    
    @Column(name = "holder_name", length = 100, nullable = false)
    private String holderName;
    
    @Column(name = "bank_name", length = 100, nullable = false)
    private String bankName;
    
    @Column(name = "status", length = 20, columnDefinition = "VARCHAR(20) DEFAULT 'ACTIVE'")
    private String status = "ACTIVE";
}
