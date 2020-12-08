package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyCrudRepository extends CrudRepository<Company, Integer> {
}
