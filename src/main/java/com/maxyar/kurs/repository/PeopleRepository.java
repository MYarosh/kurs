package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Integer> {
}
