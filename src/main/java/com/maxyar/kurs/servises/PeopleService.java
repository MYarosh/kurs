package com.maxyar.kurs.servises;

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
}
