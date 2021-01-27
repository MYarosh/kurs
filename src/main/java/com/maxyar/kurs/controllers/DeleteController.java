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
@RequestMapping("/Delete")
public class DeleteController {

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

    public DeleteController(PeopleService peopleService, CompanyService companyService, CountryService countryService, GadgetsFromService gadgetsFromService,
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
        peopleService.deletePeople(people);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/Company")
    public ResponseEntity<String> company(@RequestBody Company company) {
        companyService.deleteCompany(company);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/Country")
    public ResponseEntity<String> country(@RequestBody Country country) {
        countryService.deleteCountry(country);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/GadgetsFrom")
    public ResponseEntity<String> gadgetsFrom(@RequestBody GadgetsFrom gadgetsFrom) {
        gadgetsFromService.deleteGadgetsFrom(gadgetsFrom);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/GadgetsTo")
    public ResponseEntity<String> gadgetsTo(@RequestBody GadgetsTo gadgetsTo) {
        gadgetsToService.deleteGadgetsTo(gadgetsTo);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/ManDo")
    public ResponseEntity<String> manDo(@RequestBody ManDo manDo) {
        manDoService.deleteManDo(manDo);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/ManSee")
    public ResponseEntity<String> manSee(@RequestBody ManSee manSee) {
        manSeeService.delete(manSee);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/PlaceCom")
    public ResponseEntity<String> placeCom(@RequestBody PlaceCom placeCom) {
        placeComService.deletePlaceCom( placeCom);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/PlaceDo")
    public ResponseEntity<String> placeDo(@RequestBody PlaceDo placeDo) {
        placeDoService.deletePlaceDo(placeDo);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/TypesOfCompanies")
    public ResponseEntity<String> typesOfCompanies(@RequestBody TypesOfCompanies type) {
        typesOfCompaniesService.deleteTypesOfCompanies(type);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/TypesOfGadgets")
    public ResponseEntity<String> typesOfGadgets(@RequestBody TypesOfGadgets type) {
        typesOfGadgetsService.deleteTypesOfGadgets(type);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }

}
