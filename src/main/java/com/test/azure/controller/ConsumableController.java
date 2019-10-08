package com.test.azure.controller;


import com.test.azure.Domain.Consumables;
import com.test.azure.Service.ConsumableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumableController {
    private  final ConsumableService consumableService;

    @Autowired
    public ConsumableController(ConsumableService consumableService) {
        this.consumableService = consumableService;
    }


    @GetMapping(value="/consumables",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Consumables> consumables(){

        return consumableService.getConsumables();
    }


}
