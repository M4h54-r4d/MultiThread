package com.Isc.MultiThread.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	    @Id
	    private Long recordNumber;

	    @Column(nullable = false)
	    private Long customerId;

	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private String surname;
	    
	    @Column(nullable = false)
	    private String address;
	    
	    @Column(nullable = false)
	    private String zipCode;

	    @Column(nullable = false)
	    private String nationalId;

	    @Column(nullable = false)
	    private LocalDate birthDate;

	    public Long getRecordNumber() {
	        return recordNumber;
	    }

	    public void setRecordNumber(Long recordNumber) {
	        this.recordNumber = recordNumber;
	    }

	    public Long getCustomerId() {
	        return customerId;
	    }

	    public void setCustomerId(Long customerId) {
	        this.customerId = customerId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getSurname() {
	        return surname;
	    }

	    public void setSurname(String surname) {
	        this.surname = surname;
	    }

	    public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getZipCode() {
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

		public String getNationalId() {
	        return nationalId;
	    }

	    public void setNationalId(String nationalId) {
	        this.nationalId = nationalId;
	    }

	    public LocalDate getBirthDate() {
	        return birthDate;
	    }

	    public void setBirthDate(LocalDate birthDate) {
	        this.birthDate = birthDate;
	    }

}
