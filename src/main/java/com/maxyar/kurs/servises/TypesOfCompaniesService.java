package com.maxyar.kurs.servises;

import com.maxyar.kurs.repository.TypesOfCompaniesCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TypesOfCompaniesService {
    @Autowired
    private TypesOfCompaniesCrudRepository typesOfCompaniesCrudRepository;

    @Transactional
    public void testRep(){

    }
}
