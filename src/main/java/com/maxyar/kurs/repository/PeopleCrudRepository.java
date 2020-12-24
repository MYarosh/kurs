package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleCrudRepository extends JpaRepository<People, Integer> {
}
