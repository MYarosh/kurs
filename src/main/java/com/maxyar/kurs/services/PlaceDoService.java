package com.maxyar.kurs.services;

import com.maxyar.kurs.entities.PlaceDo;
import com.maxyar.kurs.repository.PlaceDoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlaceDoService {
    @Autowired
    private PlaceDoCrudRepository placeDoCrudRepository;

    @Transactional
    public String addPlaceDo(PlaceDo placeDo){
        PlaceDo savedPlaceDo = placeDoCrudRepository.saveAndFlush(placeDo);
        return savedPlaceDo.getId().toString();
    }

    @Transactional
    public void deletePlaceDo(PlaceDo placeDo){
        placeDoCrudRepository.delete(placeDo);
    }

    @Transactional
    public void editPlaceDo(PlaceDo placeDo){
        PlaceDo editedPlaceDo = placeDoCrudRepository.saveAndFlush(placeDo);
    }

    @Transactional
    public Iterable<PlaceDo> select(){
        return placeDoCrudRepository.findAll();
    }
}
