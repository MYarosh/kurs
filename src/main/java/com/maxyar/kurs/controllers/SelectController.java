package com.maxyar.kurs.controllers;

import com.maxyar.kurs.entities.*;
import com.maxyar.kurs.services.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Select")
public class SelectController {

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

    public SelectController(PeopleService peopleService, CompanyService companyService, CountryService countryService, GadgetsFromService gadgetsFromService,
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
    public Iterable<People> people() {
        Iterable<People> list= peopleService.select();

        return list;
    }

    @PostMapping("/Company")
    public Iterable<Company> company() {
        Iterable<Company> list = companyService.select();
        return list;
    }

    @PostMapping("/Country")
    public Iterable<Country> country() {
        Iterable<Country> list = countryService.select();
        return list;
    }

    @PostMapping("/GadgetsFrom")
    public Iterable<GadgetsFrom> gadgetsFrom() {
        Iterable<GadgetsFrom> list = gadgetsFromService.select();
        return list;
    }

    @PostMapping("/GadgetsTo")
    public Iterable<GadgetsTo> gadgetsTo() {
        Iterable<GadgetsTo> list = gadgetsToService.select();
        return list;
    }

    @PostMapping("/ManDo")
    public Iterable<ManDo> manDo() {
        Iterable<ManDo> list = manDoService.select();
        return list;
    }

    @PostMapping("/ManSee")
    public Iterable<ManSee> manSee() {
        Iterable<ManSee> list = manSeeService.select();
        return list;
    }

    @PostMapping("/PlaceCom")
    public Iterable<PlaceCom> placeCom() {
        Iterable<PlaceCom> list = placeComService.select();
        return list;
    }

    @PostMapping("/PlaceDo")
    public Iterable<PlaceDo> placeDo() {
        Iterable<PlaceDo> list = placeDoService.select();
        return list;
    }

    @PostMapping("/TypesOfCompanies")
    public Iterable<TypesOfCompanies> typesOfCompanies() {
        Iterable<TypesOfCompanies> list = typesOfCompaniesService.select();
        return list;
    }

    @PostMapping("/TypesOfGadgets")
    public Iterable<TypesOfGadgets> typesOfGadgets() {
        Iterable<TypesOfGadgets> list = typesOfGadgetsService.select();
        return list;
    }

}
