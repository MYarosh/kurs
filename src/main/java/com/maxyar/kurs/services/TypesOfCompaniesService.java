package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.TypesOfCompanies;
import com.maxyar.kurs.repository.TypesOfCompaniesCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TypesOfCompaniesService {
    @Autowired
    private TypesOfCompaniesCrudRepository typesOfCompaniesCrudRepository;

    @Transactional
    public void testRep(){

    }

    @Transactional
    public void addTypesOfCompanies(TypesOfCompanies type){
        TypesOfCompanies savedType = typesOfCompaniesCrudRepository.saveAndFlush(type);
    }

    @Transactional
    public void deleteTypesOfCompanies(TypesOfCompanies type){
        typesOfCompaniesCrudRepository.delete(type);
    }

    @Transactional
    public void editTypesOfCompanies(TypesOfCompanies type){
        TypesOfCompanies editedType = typesOfCompaniesCrudRepository.saveAndFlush(type);
    }

    @Transactional
    public Iterable<TypesOfCompanies> select(){
        return typesOfCompaniesCrudRepository.findAll();
    }
}
