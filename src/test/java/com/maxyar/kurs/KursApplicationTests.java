package com.maxyar.kurs;

import com.maxyar.kurs.entities.People;
import com.maxyar.kurs.repository.PeopleCrudRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootTest
class KursApplicationTests {

    @Autowired
    private PeopleCrudRepository peopleCrudRepository;

    @Test
    @Transactional
    public void testRep(){
        Optional<People> people = peopleCrudRepository.findById(1);
        System.out.println(people.map(e -> e.getName()));
    }

}
