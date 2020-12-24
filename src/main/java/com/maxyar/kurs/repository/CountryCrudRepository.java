package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryCrudRepository extends JpaRepository<Country, String> {
}
