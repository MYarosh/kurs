package com.maxyar.kurs.servises;

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
}
