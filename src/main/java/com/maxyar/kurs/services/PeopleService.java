package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.People;
import com.maxyar.kurs.repository.PeopleCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PeopleService {
    @Autowired
    private PeopleCrudRepository peopleCrudRepository;

    @Transactional
    public void testRep(){
        Optional<People> people = peopleCrudRepository.findById(1);
    }

    @Transactional
    public String addPeople(People people){
        People savedpeople = peopleCrudRepository.saveAndFlush(people);
        return savedpeople.getId().toString();
    }

    @Transactional
    public void deletePeople(People people){
        peopleCrudRepository.delete(people);
    }

    @Transactional
    public void editPeople(People people){
        People updatedPeople = peopleCrudRepository.saveAndFlush(people);
    }

    @Transactional
    public Iterable<People> select(){
        return peopleCrudRepository.findAll();
    }
}
