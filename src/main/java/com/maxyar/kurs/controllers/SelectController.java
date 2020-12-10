package com.maxyar.kurs.controllers;

import com.google.gson.Gson;
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
    private Gson gson = new Gson();

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
    public String people() {
        return gson.toJson(peopleService.select());
    }

    @PostMapping("/Company")
    public String company() {
        return gson.toJson(companyService.select());
    }

    @PostMapping("/Country")
    public String country() {
        return gson.toJson(countryService.select());
    }

    @PostMapping("/GadgetsFrom")
    public String gadgetsFrom() {
        return gson.toJson(gadgetsFromService.select());
    }

    @PostMapping("/GadgetsTo")
    public String gadgetsTo() {
        return gson.toJson(gadgetsToService.select());
    }

    @PostMapping("/ManDo")
    public String manDo() {
        return gson.toJson(manDoService.select());
    }

    @PostMapping("/ManSee")
    public String manSee() {
        return gson.toJson(manSeeService.select());
    }

    @PostMapping("/PlaceCom")
    public String placeCom() {
        return gson.toJson(placeComService.select());
    }

    @PostMapping("/PlaceDo")
    public String placeDo() {
        return gson.toJson(placeDoService.select());
    }

    @PostMapping("/TypesOfCompanies")
    public String typesOfCompanies() {
        return gson.toJson(typesOfCompaniesService.select());
    }

    @PostMapping("/TypesOfGadgets")
    public String typesOfGadgets() {
        return gson.toJson(typesOfGadgetsService.select());
    }

}
