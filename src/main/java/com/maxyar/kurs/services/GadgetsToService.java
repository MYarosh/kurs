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
    public void testRep(){

    }

    @Transactional
    public void addGadgetsTo(GadgetsTo gadgetsTo){
        GadgetsTo savedGadgetsTo = gadgetsToCrudRepository.save(gadgetsTo);
    }

    @Transactional
    public void deleteGadgetsTo(GadgetsTo gadgetsTo){
        gadgetsToCrudRepository.delete(gadgetsTo);
    }

    @Transactional
    public void editGadgetsTo(GadgetsTo gadgetsTo){
        GadgetsTo editedGadgetsTo = gadgetsToCrudRepository.save(gadgetsTo);
    }
}
