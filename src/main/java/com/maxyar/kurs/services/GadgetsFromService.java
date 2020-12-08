package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.GadgetsFrom;
import com.maxyar.kurs.repository.GadgetsFromCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GadgetsFromService {
    @Autowired
    private GadgetsFromCrudRepository gadgetsFromCrudRepository;

    @Transactional
    public void testRep(){

    }

    @Transactional
    public void addGadgetsFrom(GadgetsFrom gadgetsFrom){
        GadgetsFrom savedGadgetsFrom = gadgetsFromCrudRepository.save(gadgetsFrom);
    }

    @Transactional
    public void deleteGadgetsFrom(GadgetsFrom gadgetsFrom){
        gadgetsFromCrudRepository.delete(gadgetsFrom);
    }

    @Transactional
    public void editGadgetsFrom(GadgetsFrom gadgetsFrom){
        GadgetsFrom editedGadgetsFrom = gadgetsFromCrudRepository.save(gadgetsFrom);
    }
}
