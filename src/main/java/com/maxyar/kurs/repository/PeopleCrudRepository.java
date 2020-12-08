package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.*;
import org.springframework.data.repository.CrudRepository;

public interface PeopleCrudRepository extends CrudRepository<People, Integer> {
}
