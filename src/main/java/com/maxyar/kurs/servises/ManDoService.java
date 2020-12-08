package com.maxyar.kurs.servises;

import com.maxyar.kurs.repository.ManDoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManDoService {
    @Autowired
    private ManDoCrudRepository manDoCrudRepository;

    @Transactional
    public void testRep(){

    }
}
