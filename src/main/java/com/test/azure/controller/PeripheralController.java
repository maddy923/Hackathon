package com.test.azure.controller;

import com.test.azure.Domain.Peripherals;
import com.test.azure.Service.PeripheralsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeripheralController {

    private PeripheralsService peripheralsService;

    @Autowired
    public PeripheralController(PeripheralsService peripheralsService) {
        this.peripheralsService = peripheralsService;
    }

    @GetMapping(value="/peripherals",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Peripherals> peripherals(){

        return peripheralsService.getPeripherals();
    }

}
