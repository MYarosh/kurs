package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryCrudRepository extends CrudRepository<Country, String> {
}
