package com.maxyar.kurs.servises;

import com.maxyar.kurs.repository.CompanyCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanyService {
    @Autowired
    private CompanyCrudRepository companyCrudRepository;

    @Transactional
    public void testRep(){

    }
}
