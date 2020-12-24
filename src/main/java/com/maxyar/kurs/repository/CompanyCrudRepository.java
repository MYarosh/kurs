package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyCrudRepository extends JpaRepository<Company, Integer> {
}
