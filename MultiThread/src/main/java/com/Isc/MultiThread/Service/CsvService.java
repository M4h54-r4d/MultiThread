package com.Isc.MultiThread.Service;

import com.Isc.MultiThread.Model.Account;
import com.Isc.MultiThread.Model.AccountType;
import com.Isc.MultiThread.Model.Customer;
import org.springframework.stereotype.Service;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvService {

    public List<Account> readAccountsFromCsv() {
        List<Account> accounts = new ArrayList<>();
        try {
        	ClassLoader classLoader = getClass().getClassLoader();
                File file = new File(classLoader.getResource("accounts_plain.csv").getFile());
        		try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                try {
            	Account account = new Account();
                account.setRecordNumber(Long.parseLong(line[0]));
                account.setAccountNumber(line[1]);
                account.setAccountType(AccountType.valueOf(line[2].toUpperCase()));
                account.setCustomerId(Long.parseLong(line[3]));
                account.setAccountLimit(Double.parseDouble(line[4]));
                account.setOpenDate(LocalDate.parse(line[5]));
                account.setBalance(Double.parseDouble(line[6]));
                accounts.add(account);
                } catch (Exception e) {
                    System.err.println("Error in information processing: " + e.getMessage());
                	}
            	}
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public List<Customer> readCustomersFromCsv() {
        List<Customer> customers = new ArrayList<>();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("customers_plain.csv").getFile());
        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                Customer customer = new Customer();
                customer.setRecordNumber(Long.parseLong(line[0]));
                customer.setCustomerId(Long.parseLong(line[1]));
                customer.setName(line[2]);
                customer.setSurname(line[3]);
                customer.setAddress(line[4]);
                customer.setZipCode(line[5]);
                customer.setNationalId(line[6]);
                customer.setBirthDate(LocalDate.parse(line[7]));
                customers.add(customer);
            	}
            }
        } catch (IOException | CsvValidationException | NumberFormatException e) {
            e.printStackTrace();
        }
        return customers;
    }
}

