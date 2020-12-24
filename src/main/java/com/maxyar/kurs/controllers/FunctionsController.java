package com.maxyar.kurs.controllers;

import com.google.gson.Gson;
import com.maxyar.kurs.entities.PlaceDo;
import com.maxyar.kurs.services.FunctionsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Func")
public class FunctionsController {

    Gson gson = new Gson();
    private final FunctionsService functionsService;

    public FunctionsController(FunctionsService functionsService){
        this.functionsService = functionsService;
    }




    /*select страна, count(*) as "количество" from
    (select "человек_установщик"."страна", "устройства_передатчики"."id_устройства"
    from устройства_передатчики join человек_установщик on
     "устройства_передатчики"."человек_установщик"="человек_установщик"."id_человека")t1
      group by страна order by количество desc limit 1;
     */
    @PostMapping("/thirst")
    public String whois(){
        return gson.toJson(functionsService.whois());
    }

    @PostMapping("/second")
    public String checkPlace(PlaceDo place){
        double x = place.getX();
        double y = place.getY();
        double z = place.getZ();
        return gson.toJson(functionsService.checkPlace(x,y,z));
    }

    @PostMapping("/third")
    public String checkGadgets(PlaceDo place){
        double x = place.getX();
        double y = place.getY();
        double z = place.getZ();
        return gson.toJson(functionsService.checkGadgets(x,y,z));
    }

}
