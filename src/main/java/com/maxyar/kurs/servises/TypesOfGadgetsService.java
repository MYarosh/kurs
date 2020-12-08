package com.maxyar.kurs.servises;

import com.maxyar.kurs.repository.TypesOfGadgetsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TypesOfGadgetsService {
    @Autowired
    private TypesOfGadgetsCrudRepository typesOfGadgetsCrudRepository;

    @Transactional
    public void testRep(){

    }
}
