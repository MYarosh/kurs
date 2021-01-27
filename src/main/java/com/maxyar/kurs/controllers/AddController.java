package com.maxyar.kurs.controllers;

import com.maxyar.kurs.entities.*;
import com.maxyar.kurs.services.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Add")
public class AddController {

    private final PeopleService peopleService;
    private final CompanyService companyService;
    private final CountryService countryService;
    private final GadgetsFromService gadgetsFromService;
    private final GadgetsToService gadgetsToService;
    private final ManDoService manDoService;
    private final ManSeeService manSeeService;
    private final PlaceComService placeComService;
    private final PlaceDoService placeDoService;
    private final TypesOfCompaniesService typesOfCompaniesService;
    private final TypesOfGadgetsService typesOfGadgetsService;

    public AddController(PeopleService peopleService, CompanyService companyService, CountryService countryService, GadgetsFromService gadgetsFromService,
                         GadgetsToService gadgetsToService, ManDoService manDoService, ManSeeService manSeeService, PlaceComService placeComService,
                         PlaceDoService placeDoService, TypesOfCompaniesService typesOfCompaniesService, TypesOfGadgetsService typesOfGadgetsService){
        this.peopleService = peopleService;
        this.companyService = companyService;
        this.countryService = countryService;
        this.gadgetsFromService = gadgetsFromService;
        this.gadgetsToService = gadgetsToService;
        this.manDoService = manDoService;
        this.manSeeService = manSeeService;
        this.placeComService = placeComService;
        this.placeDoService = placeDoService;
        this.typesOfCompaniesService = typesOfCompaniesService;
        this.typesOfGadgetsService = typesOfGadgetsService;
    }

    @PostMapping("/People")
    public ResponseEntity<String> people(@RequestBody People people) {
        System.out.println(people.toString());
        peopleService.addPeople(people);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/Company")
    public ResponseEntity<String> company(@RequestBody Company company) {
        companyService.addCompany(company);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/Country")
    public ResponseEntity<String> country(@RequestBody Country country) {
        countryService.addCountry(country);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/GadgetsFrom")
    public ResponseEntity<String> gadgetsFrom(@RequestBody GadgetsFrom gadgetsFrom) {
        gadgetsFromService.addGadgetsFrom(gadgetsFrom);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/GadgetsTo")
    public ResponseEntity<String> gadgetsTo(@RequestBody GadgetsTo gadgetsTo) {
        gadgetsToService.addGadgetsTo(gadgetsTo);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/ManDo")
    public ResponseEntity<String> manDo(@RequestBody ManDo manDo) {
        manDoService.addManDo(manDo);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/ManSee")
    public ResponseEntity<String> manSee(@RequestBody ManSee manSee) {
        manSeeService.addManSee(manSee);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/PlaceCom")
    public ResponseEntity<String> placeCom(@RequestBody PlaceCom placeCom) {
        placeComService.addPlaceCom(placeCom);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/PlaceDo")
    public ResponseEntity<String> placeDo(@RequestBody PlaceDo placeDo) {
        placeDoService.addPlaceDo(placeDo);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/TypesOfCompanies")
    public ResponseEntity<String> typesOfCompanies(@RequestBody TypesOfCompanies type) {
        typesOfCompaniesService.addTypesOfCompanies(type);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

    @PostMapping("/TypesOfGadgets")
    public ResponseEntity<String> typesOfGadgets(@RequestBody TypesOfGadgets type) {
        typesOfGadgetsService.addTypesOfGadgets(type);
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }

}
