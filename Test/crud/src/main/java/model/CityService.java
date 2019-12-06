package model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.CityDao;



@Service
public class CityService {
 
 @Autowired
 private CityDao cityDao;

 public List<City> getCitiesByCountry(int countryId) {
  return cityDao.getCitiesByCountry(countryId);
 }
}