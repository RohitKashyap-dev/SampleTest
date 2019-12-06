package com.com.example.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.example.dao1.CountryDao;



@Service
public class CountryService {

 @Autowired
 private CountryDao countryDao;

 public List<Country> getCountriesList() {
  return countryDao.getCountriesList();
 }
}