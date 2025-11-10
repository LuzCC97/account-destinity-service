package com.bootcampJava.account_destinity_service.service;

import com.bootcampJava.account_destinity_service.dto.AccountInfo;
import org.springframework.stereotype.Service;

@Service
public class AccountDestinyService {

    //AccountInfo: tipo del metodo
    //validateAccount: metodo
    //accountId: parametro
    public AccountInfo validateAccount(String accountId) {

        // MOCK en duro:
        if ("001-123456".equals(accountId)) {
            AccountInfo info = new AccountInfo();
            info.setAccountId(accountId);
            info.setBankName("Banco X");
            info.setHolderName("Juan Pérez");
            info.setCurrency("PEN");
            info.setStatus("ACTIVE");
            return info;
        }

        if ("001-999999".equals(accountId)) {
            AccountInfo info = new AccountInfo();
            info.setAccountId(accountId);
            info.setBankName("Banco Y");
            info.setHolderName("Maria Lopez");
            info.setCurrency("USD");
            info.setStatus("ACTIVE");
            return info;
        }

        // si no está en el mock, simulamos que la API externa dijo "no existe"
        return null;
    }
}
