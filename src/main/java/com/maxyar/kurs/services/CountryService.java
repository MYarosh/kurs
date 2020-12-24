package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.Country;
import com.maxyar.kurs.repository.CountryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryService {
    @Autowired
    private CountryCrudRepository countryCrudRepository;

    @Transactional
    public void testRep(){

    }

    @Transactional
    public void addCountry(Country country){
        Country savedCountry = countryCrudRepository.saveAndFlush(country);
    }

    @Transactional
    public void deleteCountry(Country country){
        countryCrudRepository.delete(country);
    }

    @Transactional
    public void editCountry(Country country){
        Country editedCountry = countryCrudRepository.saveAndFlush(country);
    }

    @Transactional
    public Iterable<Country> select(){
        return countryCrudRepository.findAll();
    }
}
