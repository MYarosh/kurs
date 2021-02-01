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
    public String addTypesOfGadgets(TypesOfGadgets type){
        TypesOfGadgets savedType = typesOfGadgetsCrudRepository.saveAndFlush(type);
        return savedType.getType();
    }

    @Transactional
    public void deleteTypesOfGadgets(TypesOfGadgets type){
        typesOfGadgetsCrudRepository.delete(type);
    }

    @Transactional
    public void editTypesOfGadgets(TypesOfGadgets type){
        TypesOfGadgets editedType = typesOfGadgetsCrudRepository.saveAndFlush(type);
    }

    @Transactional
    public Iterable<TypesOfGadgets> select(){
        return typesOfGadgetsCrudRepository.findAll();
    }
}
