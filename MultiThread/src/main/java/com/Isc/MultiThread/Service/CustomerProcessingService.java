package com.Isc.MultiThread.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.Isc.MultiThread.Model.Customer;
import com.Isc.MultiThread.Repository.CustomerRepository;

@Service
public class CustomerProcessingService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ValidationService validationService;

    @Autowired
    private ErrorService errorService;

    @Async
    public void processCustomers(List<Customer> customers) {
        for (Customer customer : customers) {
            if (validationService.validateCustomer(customer)) {
                customerRepository.save(customer);
            } else {
                errorService.logError(customer, "Invalid customer data");
            }
        }
    }
}
