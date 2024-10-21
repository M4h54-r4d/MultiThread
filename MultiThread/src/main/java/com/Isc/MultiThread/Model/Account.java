package com.Isc.MultiThread.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id
    private Long recordNumber;

    @Column(nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private AccountType accountType;

    @Column(nullable = false)
    private Long customerId;

    @Column(nullable = false)
    private double accountLimit;

    @Column(nullable = false)
    private LocalDate openDate;

    @Column(nullable = false)
    private double balance;

    public Long getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(Long recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(double accountLimit) {
        this.accountLimit = accountLimit;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
