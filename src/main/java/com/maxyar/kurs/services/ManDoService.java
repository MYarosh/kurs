package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.ManDo;
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

    @Transactional
    public void addManDo(ManDo manDo){
        ManDo savedManDo = manDoCrudRepository.save(manDo);
    }

    @Transactional
    public void deleteManDo(ManDo manDo){
        manDoCrudRepository.delete(manDo);
    }

    @Transactional
    public void editManDo(ManDo manDo){
        ManDo editedManDo = manDoCrudRepository.save(manDo);
    }
}
