package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.TypesOfGadgets;
import com.maxyar.kurs.repository.TypesOfGadgetsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TypesOfGadgetsService {
    @Autowired
    private TypesOfGadgetsCrudRepository typesOfGadgetsCrudRepository;

    @Transactional
    public void testRep(){

    }

    @Transactional
    public void addTypesOfGadgets(TypesOfGadgets type){
        TypesOfGadgets savedType = typesOfGadgetsCrudRepository.save(type);
    }

    @Transactional
    public void deleteTypesOfGadgets(TypesOfGadgets type){
        typesOfGadgetsCrudRepository.delete(type);
    }

    @Transactional
    public void editTypesOfGadgets(TypesOfGadgets type){
        TypesOfGadgets editedType = typesOfGadgetsCrudRepository.save(type);
    }

    @Transactional
    public Iterable<TypesOfGadgets> select(){
        return typesOfGadgetsCrudRepository.findAll();
    }
}
