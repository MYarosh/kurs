package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.ManSee;
import com.maxyar.kurs.repository.ManSeeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManSeeService {
    @Autowired
    private ManSeeCrudRepository manSeeCrudRepository;


    @Transactional
    public String addManSee(ManSee manSee){
        ManSee savedManSee = manSeeCrudRepository.saveAndFlush(manSee);
        return savedManSee.getId().toString();
    }

    @Transactional
    public void delete(ManSee manSee){
        manSeeCrudRepository.delete(manSee);
    }

    @Transactional
    public void editManSee(ManSee manSee){
        ManSee editedManSee = manSeeCrudRepository.saveAndFlush(manSee);
    }

    @Transactional
    public Iterable<ManSee> select(){
        return manSeeCrudRepository.findAll();
    }
}
