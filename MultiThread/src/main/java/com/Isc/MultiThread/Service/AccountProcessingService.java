package com.Isc.MultiThread.Service;

import com.Isc.MultiThread.Model.Account;
import com.Isc.MultiThread.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountProcessingService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ValidationService validationService;

    @Autowired
    private ErrorService errorService;
    
    @Async
    public void processAccounts(List<Account> accounts) {
        for (Account account : accounts) {
            if (validationService.validateAccount(account)) {
                accountRepository.save(account);
            } else {
                errorService.logError(account, "Invalid account data");
            }
        }
    }
}
