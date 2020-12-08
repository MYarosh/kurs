package com.maxyar.kurs.servises;

import com.maxyar.kurs.repository.GadgetsFromCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GadgetsFromService {
    @Autowired
    private GadgetsFromCrudRepository gadgetsFromCrudRepository;

    @Transactional
    public void testRep(){

    }
}
