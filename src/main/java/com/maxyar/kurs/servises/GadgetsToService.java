package com.maxyar.kurs.servises;

import com.maxyar.kurs.repository.GadgetsToCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GadgetsToService {
    @Autowired
    private GadgetsToCrudRepository gadgetsToCrudRepository;

    @Transactional
    public void testRep(){

    }
}
