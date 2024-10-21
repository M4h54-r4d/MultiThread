package com.Isc.MultiThread.Service;


import com.Isc.MultiThread.Model.Account;
import com.Isc.MultiThread.Model.Customer;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    public boolean validateAccount(Account account) {
        return account.getBalance() <= account.getAccountLimit() && 
               account.getAccountNumber().length() == 22;
    }

    public boolean validateCustomer(Customer customer) {
        return customer.getBirthDate().isAfter(LocalDate.of(1995, 1, 1)) &&
               customer.getNationalId().length() == 10;
    }
}
