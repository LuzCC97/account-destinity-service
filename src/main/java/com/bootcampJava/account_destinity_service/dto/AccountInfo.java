package com.bootcampJava.account_destinity_service.dto;

import lombok.Data;

@Data
public class AccountInfo {
    private String accountId;
    private String bankName;
    private String holderName;
    private String currency;
    private String status;
}
