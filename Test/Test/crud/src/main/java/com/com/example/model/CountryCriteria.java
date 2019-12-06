package com.com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CountryCriteria {
	@Id
	 private int countryId;

	 public int getCountryId() {
	  return countryId;
	 }

	 public void setCountryId(int countryId) {
	  this.countryId = countryId;
	 }
	}
