package com.maxyar.kurs.services;

import com.maxyar.kurs.repository.GadgetsFromCrudRepository;
import com.maxyar.kurs.repository.PlaceDoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FunctionsService {

    @Autowired
    private GadgetsFromCrudRepository gadgetsFromCrudRepository;

    @Autowired
    private PlaceDoCrudRepository placeDoCrudRepository;

    @Transactional
    public Page<String> whois(){
        return gadgetsFromCrudRepository.findcountry(PageRequest.of(0,1, Sort.unsorted()));
    }

    @Transactional
    public String checkPlace(double x, double y, double z){
        return placeDoCrudRepository.check(x,y,z);
    }

    @Transactional
    public Iterable<String> checkGadgets(double x, double y, double z){
        return placeDoCrudRepository.checkGadgets(x,y,z);
    }
}
