package com.maxyar.kurs.repository;

import com.maxyar.kurs.entities.TypesOfGadgets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypesOfGadgetsCrudRepository extends JpaRepository<TypesOfGadgets, String> {
}
