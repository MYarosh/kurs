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
    public String addGadgetsFrom(GadgetsFrom gadgetsFrom){
        GadgetsFrom savedGadgetsFrom = gadgetsFromCrudRepository.saveAndFlush(gadgetsFrom);
        return savedGadgetsFrom.getId().toString();
    }

    @Transactional
    public void deleteGadgetsFrom(GadgetsFrom gadgetsFrom){
        gadgetsFromCrudRepository.delete(gadgetsFrom);
    }

    @Transactional
    public void editGadgetsFrom(GadgetsFrom gadgetsFrom){
        GadgetsFrom editedGadgetsFrom = gadgetsFromCrudRepository.saveAndFlush(gadgetsFrom);
    }

    @Transactional
    public Iterable<GadgetsFrom> select(){
        return gadgetsFromCrudRepository.findAll();
    }
}
