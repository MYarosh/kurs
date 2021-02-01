package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.GadgetsTo;
import com.maxyar.kurs.repository.GadgetsToCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GadgetsToService {
    @Autowired
    private GadgetsToCrudRepository gadgetsToCrudRepository;

    @Transactional
    public String addGadgetsTo(GadgetsTo gadgetsTo){
        GadgetsTo savedGadgetsTo = gadgetsToCrudRepository.saveAndFlush(gadgetsTo);
        return savedGadgetsTo.getId().toString();
    }

    @Transactional
    public void deleteGadgetsTo(GadgetsTo gadgetsTo){
        gadgetsToCrudRepository.delete(gadgetsTo);
    }

    @Transactional
    public void editGadgetsTo(GadgetsTo gadgetsTo){
        GadgetsTo editedGadgetsTo = gadgetsToCrudRepository.saveAndFlush(gadgetsTo);
    }

    @Transactional
    public Iterable<GadgetsTo> select(){
        return gadgetsToCrudRepository.findAll();
    }
}
