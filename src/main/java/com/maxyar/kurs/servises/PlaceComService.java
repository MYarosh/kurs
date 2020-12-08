package com.maxyar.kurs.servises;

import com.maxyar.kurs.repository.PlaceComCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlaceComService {
    @Autowired
    private PlaceComCrudRepository placeComCrudRepository;

    @Transactional
    public void testRep(){

    }
}
