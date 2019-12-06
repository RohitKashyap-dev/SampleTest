package com.com.example.model;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.example.dao1.CountryDao;

@Entity

@Service
public class CountryService {

 @Autowired
 private CountryDao countryDao;

 public List<Country> getCountriesList() {
  return countryDao.getCountriesList();
 }
}