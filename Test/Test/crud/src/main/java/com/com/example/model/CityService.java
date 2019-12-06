package com.com.example.model;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.example.dao1.CityDao;

@Entity

@Service
public class CityService {
 
 @Autowired
 private CityDao cityDao;

 public List<City> getCitiesByCountry(int countryId) {
  return cityDao.getCitiesByCountry(countryId);
 }
}