package com.com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomForm {
	
	@Id
	private int countryId;
	private int cityId;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}
