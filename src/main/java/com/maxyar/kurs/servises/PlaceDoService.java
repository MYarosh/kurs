package com.maxyar.kurs.servises;

import com.maxyar.kurs.repository.PlaceDoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlaceDoService {
    @Autowired
    private PlaceDoCrudRepository placeDoCrudRepository;

    @Transactional
    public void testRep(){

    }
}
