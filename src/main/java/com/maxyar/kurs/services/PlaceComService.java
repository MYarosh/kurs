package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.PlaceCom;
import com.maxyar.kurs.repository.PlaceComCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlaceComService {
    @Autowired
    private PlaceComCrudRepository placeComCrudRepository;

    @Transactional
    public void testRep(){

    }

    @Transactional
    public void addPlaceCom(PlaceCom placeCom){
        PlaceCom savedPlaceCom = placeComCrudRepository.save(placeCom);
    }

    @Transactional
    public void deletePlaceCom(PlaceCom placeCom){
        placeComCrudRepository.delete(placeCom);
    }

    @Transactional
    public void editPlaceCom(PlaceCom placeCom){
        PlaceCom editedPlaceCom = placeComCrudRepository.save(placeCom);
    }

    @Transactional
    public Iterable<PlaceCom> select(){
        return placeComCrudRepository.findAll();
    }
}
