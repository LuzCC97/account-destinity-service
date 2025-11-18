package com.bootcampJava.account_destinity_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalAccountResponse {
    private String externalAccountId;
    private String currency;
    private String holderName;
    private String bankName;
    private String status;
}
