package com.Isc.MultiThread.Controller;

import com.Isc.MultiThread.Model.Account;
import com.Isc.MultiThread.Model.Customer;
import com.Isc.MultiThread.Service.AccountProcessingService;
import com.Isc.MultiThread.Service.CsvService;
import com.Isc.MultiThread.Service.CustomerProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/process")
public class FileProcessingController {

    @Autowired
    private CsvService csvService;

    @Autowired
    private AccountProcessingService accountProcessingService;

    @Autowired
    private CustomerProcessingService customerProcessingService;

    @PostMapping("/accounts")
    public String processAccounts(@RequestParam String file) {
        List<Account> accounts = csvService.readAccountsFromCsv();
        accountProcessingService.processAccounts(accounts);
        return "Account processing started!";
    }

    @PostMapping("/customers")
    public String processCustomers(@RequestParam String file) {
        List<Customer> customers = csvService.readCustomersFromCsv();
        customerProcessingService.processCustomers(customers);
        return "Customer processing started!";
    }
}
