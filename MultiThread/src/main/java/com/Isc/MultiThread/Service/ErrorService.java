package com.Isc.MultiThread.Service;

import com.Isc.MultiThread.Model.Account;
import com.Isc.MultiThread.Model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class ErrorService {

    public void logError(Account account, String errorMessage) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            
            mapper.writeValue(new File("error_accounts.json"), account);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void logError(Customer customer, String errorMessage) {
		ObjectMapper Cmapper = new ObjectMapper();
        try {
           
            Cmapper.writeValue(new File("error_accounts.json"), customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
